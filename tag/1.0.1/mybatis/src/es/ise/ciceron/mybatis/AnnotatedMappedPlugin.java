package es.ise.ciceron.mybatis;

import java.util.List;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.JavaVisibility;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.api.dom.java.TopLevelClass;

public class AnnotatedMappedPlugin extends PluginAdapter
{
	@Override
	public boolean validate(List<String> arg0)
	{
		return true;
	}

	@Override
	public boolean clientGenerated(Interface interfaze, TopLevelClass topLevelClass, IntrospectedTable introspectedTable)
	{
		interfaze.addImportedType(new FullyQualifiedJavaType("org.mybatis.spring.annotation.Mapper"));
		interfaze.addAnnotation("@Mapper");
		interfaze.addSuperInterface(new FullyQualifiedJavaType("es.ise.ciceron.mapper.CiceronMapper"));
		return true;
	}

	@Override
	public boolean modelBaseRecordClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable)
	{
		//añadir funciones de utilidad para modelos con campos de auditorias
		for(Field field: topLevelClass.getFields())
		{
			if(field.getName().equals("fActu") && !introspectedTable.getTableConfiguration().getTableName().equals("VERSIONES_PLIEGOS_V"))
			{
				Method methodActualizacion = new Method();
				methodActualizacion.setName("setActualizacion");
				methodActualizacion.setReturnType(new FullyQualifiedJavaType("void"));
				methodActualizacion.setVisibility(JavaVisibility.PUBLIC);
				methodActualizacion.addParameter(new Parameter(new FullyQualifiedJavaType("java.util.Date"), "fecha"));
				methodActualizacion.addParameter(new Parameter(new FullyQualifiedJavaType("es.ise.ciceron.model.Usuario"), "usuario"));
				methodActualizacion.addBodyLine(String.format("this.fActu = fecha;"));
				methodActualizacion.addBodyLine(String.format("this.uActu = usuario.getIdentificador();"));
				topLevelClass.addMethod(methodActualizacion);
				
				Method methodCreacion = new Method();
				methodCreacion.setName("setCreacion");
				methodCreacion.setReturnType(new FullyQualifiedJavaType("void"));
				methodCreacion.setVisibility(JavaVisibility.PUBLIC);
				methodCreacion.addParameter(new Parameter(new FullyQualifiedJavaType("java.util.Date"), "fecha"));
				methodCreacion.addParameter(new Parameter(new FullyQualifiedJavaType("es.ise.ciceron.model.Usuario"), "usuario"));
				methodCreacion.addBodyLine(String.format("this.fCreacion = fecha;"));
				methodCreacion.addBodyLine(String.format("this.uCreacion = usuario.getIdentificador();"));
				methodCreacion.addBodyLine(String.format("this.fActu = fecha;"));
				methodCreacion.addBodyLine(String.format("this.uActu = usuario.getIdentificador();"));
				topLevelClass.addMethod(methodCreacion);
				
				Method methodCopyCreacion = new Method();
				methodCopyCreacion.setName("copyCreacion");
				methodCopyCreacion.setReturnType(new FullyQualifiedJavaType("void"));
				methodCopyCreacion.setVisibility(JavaVisibility.PUBLIC);
				methodCopyCreacion.addParameter(new Parameter(topLevelClass.getType(), "source"));
				methodCopyCreacion.addBodyLine(String.format("this.fCreacion = source.fCreacion;"));
				methodCopyCreacion.addBodyLine(String.format("this.uCreacion = source.uCreacion;"));
				methodCopyCreacion.addBodyLine(String.format("this.fActu = source.fActu;"));
				methodCopyCreacion.addBodyLine(String.format("this.uActu = source.uActu;"));
				topLevelClass.addMethod(methodCopyCreacion);
				
				Method methodCopyActualizacion = new Method();
				methodCopyActualizacion.setName("copyActualizacion");
				methodCopyActualizacion.setReturnType(new FullyQualifiedJavaType("void"));
				methodCopyActualizacion.setVisibility(JavaVisibility.PUBLIC);
				methodCopyActualizacion.addParameter(new Parameter(topLevelClass.getType(), "source"));
				methodCopyActualizacion.addBodyLine(String.format("this.fActu = source.fActu;"));
				methodCopyActualizacion.addBodyLine(String.format("this.uActu = source.uActu;"));
				topLevelClass.addMethod(methodCopyActualizacion);
				
				break;
			}
		}
		
		return true;
	}

}
