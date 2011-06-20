package es.ise.ciceron.demonios;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import es.ise.ciceron.model.Documentos;
import es.ise.ciceron.spring.repositories.GenericDAO;
import es.ise.ciceron.spring.repositories.GenericDAO.Property;
import es.ise.ciceron.spring.services.PortafirmaService;
import es.ise.ciceron.spring.services.ProceduresService;

public class DemonioPortafirma
{
	private static Logger log = LoggerFactory.getLogger(DemonioPortafirma.class);
	public static void main(String args[])
	{
		String contextPath = "WEB-INF/context/applicationContext.xml";
		log.info(String.format("Cargando contexto desde %s...", contextPath));
		ApplicationContext context = new FileSystemXmlApplicationContext(contextPath);
		AutowireCapableBeanFactory beanFactory = context.getAutowireCapableBeanFactory();
		GenericDAO genericDao = (GenericDAO)beanFactory.createBean(GenericDAO.class,AutowireCapableBeanFactory.AUTOWIRE_CONSTRUCTOR, false);
		PortafirmaService portafirmaService = (PortafirmaService)beanFactory.createBean(PortafirmaService.class, AutowireCapableBeanFactory.AUTOWIRE_CONSTRUCTOR, false);
		ProceduresService proceduresService = (ProceduresService)beanFactory.createBean(ProceduresService.class, AutowireCapableBeanFactory.AUTOWIRE_BY_TYPE, false);
		log.info("Contexto cargado. Comprobando documentos...");
		int contador = 0;
		List<Documentos> documentos = genericDao.list(Documentos.class, new Property("fechaEnvio", Property.Operator.NOT_NULL), new Property("fechaFirma", Property.Operator.NULL), new Property("fechaDevuelto", Property.Operator.NULL));
		for(Documentos doc: documentos)
		{
			try
			{
				boolean modified = portafirmaService.comprobarEstado(doc);
				if(modified)
				{
					genericDao.actualizarDocumentoConBLOB(doc);
					contador++;
				}
			}
			catch (Exception e)
			{
				log.error(String.format("Error actualizando el documento con ID %s: %s", doc.getId(), e));
				e.printStackTrace();
			}
		}
		log.info(String.format("%d documentos comprobados, %d actualizados", documentos.size(), contador));
	}
}
