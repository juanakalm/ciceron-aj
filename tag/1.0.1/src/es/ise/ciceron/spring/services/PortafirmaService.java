package es.ise.ciceron.spring.services;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.xml.rpc.ServiceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import es.ise.ciceron.mapper.UsuarioMapper;
import es.ise.ciceron.model.Documentos;
import es.ise.ciceron.model.Usuario;
import es.ise.ciceron.model.UsuarioExample;
import es.ise.portafirma.ws.EntregaWS;
import es.ise.portafirma.ws.client.PfServicioWS;
import es.ise.portafirma.ws.client.PfServicioWSServiceLocator;

@Service
public class PortafirmaService
{
	private PfServicioWS servicio = null;
	private String idAplicacion = "PORTAFIRMA";
	private int diasParaFirmar = 15;
	private BigDecimal prioridad = new BigDecimal(3);
	private String urlInforme = "";
	
	private UsuarioMapper usuarioMapper;
	
	@Autowired
	public void setProperties(@Qualifier("appProperties")Properties props) throws MalformedURLException, ServiceException
	{
		PfServicioWSServiceLocator locator = new PfServicioWSServiceLocator();
		servicio = locator.getPfServicioWS(new URL(props.getProperty("pfirma.url")));
		idAplicacion = props.getProperty("pfirma.aplicacion");
		diasParaFirmar = Integer.parseInt(props.getProperty("pfirma.caducidad"));
		prioridad = new BigDecimal(props.getProperty("pfirma.prioridad"));
		urlInforme = props.getProperty("pfirma.informe");
	}
	
	@Autowired
	public void setUsuarioMapper(UsuarioMapper usuarioMapper)
	{
		this.usuarioMapper = usuarioMapper;
	}

	public void enviarDocumentoAPortafirma(Documentos doc, String asunto, Usuario remitente, String... destinatarios)
	{
		try
		{
			doc.setHashPeticion(servicio.insertarPeticion(remitente.getDni()));
			for(String destinatario: destinatarios)
			{
				servicio.insertarDestinatarioPeticion(destinatario, doc.getHashPeticion());
			}
			doc.setDochash(servicio.insertarDocumentoPeticion(doc.getHashPeticion(), "GENERICO", String.format("%s.%s", doc.getNombreFichero(),doc.getExtension()), "application/pdf", doc.getFichero()));
			
			Calendar fechaCaducidad = Calendar.getInstance();
			fechaCaducidad.add(Calendar.DATE, diasParaFirmar);
			long error = servicio.actualizarPeticion(doc.getHashPeticion(),
					idAplicacion,
					true, false,
					false, false, false,
					null, fechaCaducidad,
					remitente.getNombre(), null, null,
					doc.getNombreFichero(), asunto,
					prioridad,
					null, null,
					asunto);
			
			if(error !=0)
				throw new IllegalArgumentException(String.format("Error actualizando la petición de Port@firma (error %d).", error));
			
			error = servicio.entregarPeticion(doc.getHashPeticion());
			
			if(error == -1)
				throw new IllegalArgumentException("Error al entregar la petición de Port@firma");
		} 
		catch (RemoteException e)
		{
			e.printStackTrace();
		}
	}
	
	public Map<String,String> comprobarEstado(Documentos doc) throws RemoteException
	{
		Map <String,String> map = new HashMap<String,String>() ;
		EntregaWS[] entregas = servicio.consultarEntregasPeticion(doc.getHashPeticion());
		for(EntregaWS entrega: entregas)
		{
			if(entrega.getDOCCHASH().equals(doc.getDochash()))
			{
				String dni = entrega.getDESTCDNI();
				UsuarioExample example = new UsuarioExample();
				example.or().andDniEqualTo(dni);
				Usuario usuario = usuarioMapper.selectByExample(example).get(0);
				if(entrega.getCESTADO().equals("DEVUELTO"))
				{
					doc.setFechaDevuelto(entrega.getFESTADO().getTime());
					doc.setActualizacion(new Date(), usuario);
					map.put("estado", entrega.getCESTADO());
					map.put("dni", dni);
				}
				else if(entrega.getCESTADO().equals("FIRMADO"))
				{
					doc.setFechaFirma(entrega.getFESTADO().getTime());
					doc.setActualizacion(new Date(), usuario);
					map.put("estado", entrega.getCESTADO());
					map.put("dni", dni);
				}
			}
		}
		return map;
	}

	public BufferedInputStream getDocInputStream(Documentos documento) throws IOException
	{
		BufferedInputStream buf = null;
		if(documento.getFechaFirma() != null && documento.getDochash() != null && documento.getHashPeticion() != null)
		{
			URL url = new URL(getUrlInforme(documento));
			URLConnection conn = url.openConnection();
			buf = new BufferedInputStream(conn.getInputStream());
		}
		else
		{
			buf = new BufferedInputStream(new ByteArrayInputStream(documento.getFichero()));
		}
		return buf;
	}

	private String getUrlInforme(Documentos documento)
	{
		return this.getUrlInforme(documento.getDochash(),documento.getHashPeticion());
	}

	private String getUrlInforme(String dochash, String hashPeticion)
	{
		return String.format(urlInforme + "?docHASH=%s&petHASH=%s", dochash, hashPeticion);
	}
}
