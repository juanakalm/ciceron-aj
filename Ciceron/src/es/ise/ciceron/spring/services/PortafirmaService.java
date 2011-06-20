package es.ise.ciceron.spring.services;

import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import javax.xml.rpc.ServiceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import es.ise.ciceron.model.Documentos;
import es.ise.ciceron.model.Usuario;
import es.ise.ciceron.spring.repositories.GenericDAO;
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
	
	@Autowired
	private GenericDAO genericDAO;

	
	@Autowired
	public PortafirmaService(@Qualifier("appProperties")Properties props) throws MalformedURLException, ServiceException
	{
		PfServicioWSServiceLocator locator = new PfServicioWSServiceLocator();
		servicio = locator.getPfServicioWS(new URL(props.getProperty("pfirma.url")));
		idAplicacion = props.getProperty("pfirma.aplicacion");
		diasParaFirmar = Integer.parseInt(props.getProperty("pfirma.caducidad"));
		prioridad = new BigDecimal(props.getProperty("pfirma.prioridad"));
		urlInforme = props.getProperty("pfirma.informe");
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
	
	public boolean comprobarEstado(Documentos doc) throws RemoteException
	{
		boolean modified = false;
		EntregaWS[] entregas = servicio.consultarEntregasPeticion(doc.getHashPeticion());
		for(EntregaWS entrega: entregas)
		{
			if(entrega.getDOCCHASH().equals(doc.getDochash()))
			{
				String dni = entrega.getDESTCDNI();
				Usuario usuario = genericDAO.select(Usuario.class, "dni", dni);
				if(entrega.getCESTADO().equals("DEVUELTO"))
				{
					doc.setFechaDevuelto(entrega.getFESTADO().getTime());
					doc.setFichero(servicio.descargarDocumento(doc.getDochash()));
					doc.setActualizacion(new Date(), usuario);
					modified = true;
				}
				else if(entrega.getCESTADO().equals("FIRMADO"))
				{
					doc.setFechaFirma(entrega.getFESTADO().getTime());
					doc.setFichero(servicio.descargarDocumento(doc.getDochash()));
					doc.setActualizacion(new Date(), usuario);
					modified = true;
				}
			}
		}
		return modified;
	}
}
