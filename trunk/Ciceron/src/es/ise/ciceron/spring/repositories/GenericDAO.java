package es.ise.ciceron.spring.repositories;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import es.ise.ciceron.mapper.CiceronMapper;

@Repository
public class GenericDAO
{
	private Map<String, CiceronMapper> mappers = new HashMap<String, CiceronMapper>();
	
	/**
	 * @deprecated usar new Property(nombre, Operator.NULL)
	 */
	public final static Object NULL = new Object();
	
	/**
	 * @deprecated usar new Property(nombre, Operator.NOT_NULL)
	 */
	public final static Object NOT_NULL = new Object();
	
	public static class Property
	{
		public enum Operator {
			NULL("IsNull",0), NOT_NULL("IsNotNull",0),
			EQUAL("EqualTo", 1), NOT_EQUAL("NotEqualTo", 1),
			LIKE("Like", 1), NOT_LIKE("NotLike", 1),
			GREATER("GreaterThan",1), GREATER_EQUAL("GreaterThanOrEqualTo", 1),
			LESS("LessThan", 1), LESS_EQUAL("LessThanOrEqualTo", 1),
			IN("In", 1), NOT_IN("NotIn", 1),
			BETWEEN("Between", 2), NOT_BETWEEN("NotBetween", 2);
			String desc;
			int args;
			private Operator(String desc, int args)
			{
				this.desc = desc;
				this.args = args;
			}
			public int getArgs()
			{
				return args;
			}
			public String toString()
			{
				return desc;
			}
		}
		private String name;
		private Object value = null;
		private Object value2 = null;
		private Operator operator = Operator.EQUAL;
		
		public String toString()
		{
			return String.format("Property[%s %s %s]", name, operator, value);
		}
		public Property(String name, Object value)
		{
			this.name = name;
			this.value = value;
		}
		public Property(String name, Object value, Operator operator)
		{
			this.name = name;
			this.value = value;
			this.operator = operator;
		}
		public Property(String name, Object value, Operator operator, Object value2)
		{
			this.name = name;
			this.value = value;
			this.operator = operator;
			this.value2 = value2;
		}
		public Property(String name, Operator operator)
		{
			this.name = name;
			this.operator = operator;
		}
		public String getName()
		{
			return name;
		}
		public String getUpperName()
		{
			return name.substring(0, 1).toUpperCase() + name.substring(1);
		}
		public Object getValue()
		{
			return value;
		}
		public Operator getOperator()
		{
			return operator;
		}
		public Object getValue2()
		{
			return value2;
		}
	}
	
	public static class PropertySort
	{
		public enum SortOrder {
			ASC, DESC
		}
		private String name;
		private SortOrder order;
		public String getName()
		{
			return name;
		}
		public String getUpperName()
		{
			return name.substring(0, 1).toUpperCase() + name.substring(1);
		}
		public SortOrder getOrder()
		{
			return order;
		}
		public PropertySort(String name)
		{
			this(name, SortOrder.ASC);
		}
		public PropertySort(String name, SortOrder order)
		{
			this.name = name;
			this.order = order;
		}
	}
	
	public static class Sort<T> implements Comparator<T>
	{
		List<PropertySort> properties = new ArrayList<PropertySort>();
		
		public Sort(PropertySort... properties)
		{
			this.properties.addAll(Arrays.asList(properties));
		}
		
		public Sort(String... properties)
		{
			for(String property: properties)
			{
				String[] parts = property.split(" ");
				if(parts.length == 1)
					this.properties.add(new PropertySort(property));
				else
					this.properties.add(new PropertySort(parts[0], PropertySort.SortOrder.valueOf(parts[1].toUpperCase())));
			}
		}
		@Override
		public int compare(T o1, T o2)
		{
			try
			{
				for(PropertySort property: properties)
				{
					Method getter = o1.getClass().getMethod("get"+property.getUpperName());
					Object v1 = getter.invoke(o1);
					if(v1 instanceof Comparable)
					{
						Method compare = v1.getClass().getMethod("compareTo", v1.getClass());
						int result = ((Integer)compare.invoke(v1, getter.invoke(o2))).intValue();
						if(result != 0)
						{
							return result * (property.order==PropertySort.SortOrder.ASC ? 1 : -1);
						}
					}
					else
					{
						return 0;
					}
				}
				return 0;
			}
			catch(Exception e)
			{
				return 0;
			}
		}
	}
	
	@Autowired
	public void setMappers(Map<String, CiceronMapper> mappers)
	{
		for(String key: mappers.keySet())
		{
			String[] path = key.split("\\.");
			String daoName = path[path.length-1].replaceAll("Mapper", "");
			this.mappers.put(daoName, mappers.get(key));
		}
	}
	
	@SuppressWarnings("unchecked")
	private <E extends Object> E selectOne(Collection<E> collection)
	{
		if(collection.size() > 0)
			return (E)collection.toArray()[0];
		else
			return null;
	}
	
	@SuppressWarnings("unchecked")
	private <T> T executeSigleBigDecimalParam(Class<T> daoClass, String methodName, BigDecimal id)
	{
		try
		{
			String daoName = daoClass.getSimpleName();
			CiceronMapper mapper = mappers.get(daoName);
			if(mapper != null)
			{
				Method method = mapper.getClass().getMethod(methodName, BigDecimal.class);
				if(method != null)
				{
					return (T)method.invoke(mapper, id);
				}
			}
		} 
		catch (Exception e)
		{
			throw new RuntimeException(e);
		}
		return null;
	}
	
	public <T> T get(Class<T> daoClass, BigDecimal id)
	{
		return executeSigleBigDecimalParam(daoClass, "selectByPrimaryKey", id);
	}
	
	public <T> T getWithBlob(Class<T> daoClass, BigDecimal id)
	{
		return selectWithBlob(daoClass, "id", id);
	}
	
	public <T> T delete(Class<T> daoClass, BigDecimal id)
	{
		return executeSigleBigDecimalParam(daoClass, "deleteByPrimaryKey", id);
	}
	
	@SuppressWarnings("unchecked")
	private <T> List<T> list(String methodName, Class<T> daoClass, Property... properties)
	{
		String daoName = daoClass.getSimpleName();
		CiceronMapper mapper = mappers.get(daoName);
		try
		{
			Object example = Class.forName(String.format("es.ise.ciceron.model.%sExample", daoName)).newInstance();
			Object criteria = example.getClass().getMethod("or").invoke(example);
			for(Property property: properties)
			{
				if(property.getValue() == NULL)
					criteria.getClass().getMethod(String.format("and%sIsNull", property.getUpperName())).invoke(criteria);
				else if(property.getValue()==NOT_NULL)
					criteria.getClass().getMethod(String.format("and%sIsNotNull", property.getUpperName())).invoke(criteria);
				else if(property.getOperator().getArgs() == 0)
				{
					//operators without arguments
					criteria.getClass().getMethod(String.format("and%s%s", property.getUpperName(), property.getOperator())).invoke(criteria);
				}
				else if(property.getOperator()==Property.Operator.IN || property.getOperator()==Property.Operator.NOT_IN)
				{
					criteria.getClass().getMethod(String.format("and%s%s", property.getUpperName(), property.getOperator()), List.class).invoke(criteria, property.getValue());
				}
				else if(property.getOperator().getArgs() == 1)
				{
					criteria.getClass().getMethod(String.format("and%s%s", property.getUpperName(), property.getOperator()), property.getValue().getClass()).invoke(criteria, property.getValue());
				}
				else if(property.getOperator().getArgs() == 2)
				{
					criteria.getClass().getMethod(String.format("and%s%s", property.getUpperName(), property.getOperator()), property.getValue().getClass(), property.getValue2().getClass()).invoke(criteria, property.getValue(), property.getValue2());
				}
			}
			return (List<T>)mapper.getClass().getMethod(methodName, example.getClass()).invoke(mapper, example);
		} 
		catch (Exception e)
		{
			throw new RuntimeException(e);
		}
	}
	
	public <T> List<T> list(Class<T> daoClass, Property... properties)
	{
		return list("selectByExample", daoClass, properties);
	}
	
	public <T> List<T> list(Class<T> daoClass, Comparator<T> orden, Property... properties)
	{
		List<T> list = list(daoClass, properties);
		Collections.sort(list, orden);
		return list;
	}
	
	public <T> List<T> list(Class<T> daoClass, String property, Object value)
	{
		return list(daoClass, new Property(property, value));
	}
	
	public <T> List<T> list(Class<T> daoClass, String property, Object value, Property.Operator operator)
	{
		return list(daoClass, new Property(property, value, operator));
	}
	
	public <T> List<T> list(Class<T> daoClass, Comparator<T> orden, String property, Object value)
	{
		return list(daoClass, orden, new Property(property, value));
	}
	
	public <T> List<T> list(Class<T> daoClass, Comparator<T> orden, String property, Object value, Property.Operator operator)
	{
		return list(daoClass, orden, new Property(property, value, operator));
	}
	
	public <T> List<T> listWithBlob(Class<T> daoClass, Property... properties)
	{
		return list("selectByExampleWithBLOBs", daoClass, properties);
	}
	
	public <T> List<T> listWithBlob(Class<T> daoClass, Comparator<T> orden, Property... properties)
	{
		List<T> list = listWithBlob(daoClass, properties);
		Collections.sort(list, orden);
		return list;
	}
	
	public <T> List<T> listWithBlob(Class<T> daoClass, String property, Object value)
	{
		return listWithBlob(daoClass, new Property(property, value));
	}
	
	public <T> List<T> listWithBlob(Class<T> daoClass, String property, Object value, Property.Operator operator)
	{
		return listWithBlob(daoClass, new Property(property, value, operator));
	}
	
	public <T> List<T> listWithBlob(Class<T> daoClass, Comparator<T> orden, String property, Object value)
	{
		return listWithBlob(daoClass, orden, new Property(property, value));
	}
	
	public <T> List<T> listWithBlob(Class<T> daoClass, Comparator<T> orden, String property, Object value, Property.Operator operator)
	{
		return listWithBlob(daoClass, orden, new Property(property, value, operator));
	}
	
	public <T> T select(Class<T> daoClass, String property, Object value)
	{
		return selectOne(list(daoClass, new Property(property, value)));
	}
	
	public <T> T select(Class<T> daoClass, String property, Object value, Property.Operator operator)
	{
		return selectOne(list(daoClass, new Property(property, value, operator)));
	}
	
	public <T> T select(Class<T> daoClass, Comparator<T> orden, String property, Object value)
	{
		return selectOne(list(daoClass, orden, new Property(property, value)));
	}
	
	public <T> T select(Class<T> daoClass, Comparator<T> orden, String property, Object value, Property.Operator operator)
	{
		return selectOne(list(daoClass, orden, new Property(property, value, operator)));
	}
	
	public <T> T select(Class<T> daoClass, Property... properties)
	{
		return selectOne(list(daoClass, properties));
	}
	
	public <T> T select(Class<T> daoClass, Comparator<T> orden, Property... properties)
	{
		return selectOne(list(daoClass, orden, properties));
	}
	
	public <T> T selectWithBlob(Class<T> daoClass, String property, Object value)
	{
		return selectOne(listWithBlob(daoClass, new Property(property, value)));
	}
	
	public <T> T selectWithBlob(Class<T> daoClass, String property, Object value, Property.Operator operator)
	{
		return selectOne(listWithBlob(daoClass, new Property(property, value, operator)));
	}
	
	public <T> T selectWithBlob(Class<T> daoClass, Comparator<T> orden, String property, Object value)
	{
		return selectOne(listWithBlob(daoClass, orden, new Property(property, value)));
	}
	
	public <T> T selectWithBlob(Class<T> daoClass, Comparator<T> orden, String property, Object value, Property.Operator operator)
	{
		return selectOne(listWithBlob(daoClass, orden, new Property(property, value, operator)));
	}
	
	public <T> T selectWithBlob(Class<T> daoClass, Property... properties)
	{
		return selectOne(listWithBlob(daoClass, properties));
	}
	
	public <T> T selectWithBlob(Class<T> daoClass, Comparator<T> orden, Property... properties)
	{
		return selectOne(listWithBlob(daoClass, orden, properties));
	}
	
	public <T> void insert(T dao)
	{
		String daoName = dao.getClass().getSimpleName().replaceAll("Command","");
		CiceronMapper mapper = mappers.get(daoName);
		try
		{
			mapper.getClass().getMethod("insertSelective", dao.getClass()).invoke(mapper, dao);
		} 
		catch (Exception e)
		{
			throw new RuntimeException(e);
		}
	}
	
	public <T> void insertOrUpdate(Class<T> daoClass, T dao)
	{
		String daoName = daoClass.getSimpleName().replaceAll("Command","");
		CiceronMapper mapper = mappers.get(daoName);
		try
		{
			BigDecimal id = (BigDecimal)dao.getClass().getMethod("getId").invoke(dao);
			if(id == null || id.intValue() == -1)
				mapper.getClass().getMethod("insertSelective", daoClass).invoke(mapper, dao);
			else
				mapper.getClass().getMethod("updateByPrimaryKey", daoClass).invoke(mapper, dao);
		} 
		catch (Exception e)
		{
			throw new RuntimeException(e);
		}
	}
	
	public <T> void insertOrUpdateWithBlob(Class<T> daoClass, T dao)
	{
		String daoName = daoClass.getSimpleName();
		CiceronMapper mapper = mappers.get(daoName);
		try
		{
			BigDecimal id = (BigDecimal)dao.getClass().getMethod("getId").invoke(dao);
			if(id == null || id.intValue() == -1)
				mapper.getClass().getMethod("insertSelective", daoClass).invoke(mapper, dao);
			else
				mapper.getClass().getMethod("updateByPrimaryKeyWithBLOBs", daoClass).invoke(mapper, dao);
		} 
		catch (Exception e)
		{
			throw new RuntimeException(e);
		}
	}
	
	public interface NumericExpression<T>
	{
		public BigDecimal evaluate(T object);
	}
	
	private static class SimpleFieldNumericExpression<T> implements NumericExpression<T>
	{
		private String field;
		
		private SimpleFieldNumericExpression(String field)
		{
			this.field = field;
		}

		public BigDecimal evaluate(T object)
		{
			try
			{
				Method getter = object.getClass().getMethod(String.format("get%s%s", field.substring(0,1).toUpperCase(), field.substring(1)));
				Object value = getter.invoke(object);
				if(value instanceof BigDecimal)
				{
					return (BigDecimal) value;
				}
				else if(value instanceof Integer)
				{
					return new BigDecimal(((Integer) value).intValue());
				}
				else if(value instanceof Long)
				{
					return new BigDecimal(((Long) value).doubleValue());
				}
				else if(value instanceof Float)
				{
					return new BigDecimal(((Float) value).doubleValue());
				}
				else if(value instanceof Double)
				{
					return new BigDecimal(((Double) value).doubleValue());
				}
				else
				{
					throw new IllegalArgumentException("La propiedad "+field+" no es de tipo numérico");
				}
			} 
			catch (Exception e)
			{
				throw new RuntimeException(e);
			}
		}
	}
	
	public <T> BigDecimal sum(List<T> daos, NumericExpression<T> expression)
	{
		double sum = 0;
		for(T dao: daos)
		{
			sum += expression.evaluate(dao).doubleValue();
		}
		return new BigDecimal(sum);
	}
	
	public <T> BigDecimal sum(List<T> daos, String field)
	{
		return sum(daos, new SimpleFieldNumericExpression<T>(field));
	}
}
