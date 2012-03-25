package es.ise.ciceron.spring.repositories;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SqlDAO
{
	private NamedParameterJdbcTemplate template;
	
	@Autowired
	public void setDataSource(DataSource source)
	{
		template = new NamedParameterJdbcTemplate(source);
	}
	
	public static class Param
	{
		private String name;
		private Object value;
		public Param(String name, Object value)
		{
			this.name = name;
			this.value = value;
		}
		public String getName()
		{
			return name;
		}
		public void setName(String name)
		{
			this.name = name;
		}
		public Object getValue()
		{
			return value;
		}
		public void setValue(Object value)
		{
			this.value = value;
		}
	}
	
	public List<Map<String,Object>> query(String sql, Param... params)
	{
		MapSqlParameterSource paramsSource = new MapSqlParameterSource();
		for(Param param: params)
		{
			paramsSource.addValue(param.getName(), param.getValue());
		}
		return template.queryForList(sql, paramsSource);
	}
}
