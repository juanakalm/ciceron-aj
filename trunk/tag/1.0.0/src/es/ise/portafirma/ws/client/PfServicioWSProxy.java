package es.ise.portafirma.ws.client;

public class PfServicioWSProxy implements es.ise.portafirma.ws.client.PfServicioWS
{
	private String _endpoint = null;
	private es.ise.portafirma.ws.client.PfServicioWS pfServicioWS = null;

	public PfServicioWSProxy()
	{
		_initPfServicioWSProxy();
	}

	public PfServicioWSProxy(String endpoint)
	{
		_endpoint = endpoint;
		_initPfServicioWSProxy();
	}

	private void _initPfServicioWSProxy()
	{
		try
		{
			pfServicioWS = (new es.ise.portafirma.ws.client.PfServicioWSServiceLocator()).getPfServicioWS();
			if (pfServicioWS != null)
			{
				if (_endpoint != null)
					((javax.xml.rpc.Stub) pfServicioWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
				else
					_endpoint = (String) ((javax.xml.rpc.Stub) pfServicioWS)._getProperty("javax.xml.rpc.service.endpoint.address");
			}

		} catch (javax.xml.rpc.ServiceException serviceException)
		{
		}
	}

	public String getEndpoint()
	{
		return _endpoint;
	}

	public void setEndpoint(String endpoint)
	{
		_endpoint = endpoint;
		if (pfServicioWS != null)
			((javax.xml.rpc.Stub) pfServicioWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);

	}

	public es.ise.portafirma.ws.client.PfServicioWS getPfServicioWS()
	{
		if (pfServicioWS == null)
			_initPfServicioWSProxy();
		return pfServicioWS;
	}

	public long actualizarPeticion(java.lang.String chash, java.lang.String aplicacion, boolean firmaCascada, boolean firmaOrdenada, boolean notificaEmail, boolean notificaMovil, boolean notificaAviso, java.util.Calendar fInicio, java.util.Calendar fCaducidad, java.lang.String remitenteNombre,
			java.lang.String remitenteEmail, java.lang.String remitenteMovil, java.lang.String dReferencia, java.lang.String dAsunto, java.math.BigDecimal nPrioridad, java.lang.String usuario, java.lang.String petChash, java.lang.String tTexto) throws java.rmi.RemoteException
	{
		if (pfServicioWS == null)
			_initPfServicioWSProxy();
		return pfServicioWS.actualizarPeticion(chash, aplicacion, firmaCascada, firmaOrdenada, notificaEmail, notificaMovil, notificaAviso, fInicio, fCaducidad, remitenteNombre, remitenteEmail, remitenteMovil, dReferencia, dAsunto, nPrioridad, usuario, petChash, tTexto);
	}

	public es.ise.portafirma.ws.UsuarioWS[] consultarDestinatariosPeticion(java.lang.String peticion) throws java.rmi.RemoteException
	{
		if (pfServicioWS == null)
			_initPfServicioWSProxy();
		return pfServicioWS.consultarDestinatariosPeticion(peticion);
	}

	public es.ise.portafirma.ws.DocumentoWS[] consultarDocumentosPeticion(java.lang.String peticion) throws java.rmi.RemoteException
	{
		if (pfServicioWS == null)
			_initPfServicioWSProxy();
		return pfServicioWS.consultarDocumentosPeticion(peticion);
	}

	public es.ise.portafirma.ws.EntregaWS[] consultarEntregasPeticion(java.lang.String peticion) throws java.rmi.RemoteException
	{
		if (pfServicioWS == null)
			_initPfServicioWSProxy();
		return pfServicioWS.consultarEntregasPeticion(peticion);
	}

	public java.lang.String[] consultarNotificacionesPeticion(java.lang.String peticion) throws java.rmi.RemoteException
	{
		if (pfServicioWS == null)
			_initPfServicioWSProxy();
		return pfServicioWS.consultarNotificacionesPeticion(peticion);
	}

	public es.ise.portafirma.ws.PeticionWS consultarPeticion(java.lang.String peticion) throws java.rmi.RemoteException
	{
		if (pfServicioWS == null)
			_initPfServicioWSProxy();
		return pfServicioWS.consultarPeticion(peticion);
	}

	public es.ise.portafirma.ws.UsuarioWS consultarUsuario(java.lang.String dni) throws java.rmi.RemoteException
	{
		if (pfServicioWS == null)
			_initPfServicioWSProxy();
		return pfServicioWS.consultarUsuario(dni);
	}

	public byte[] descargarDocumento(java.lang.String documento) throws java.rmi.RemoteException
	{
		if (pfServicioWS == null)
			_initPfServicioWSProxy();
		return pfServicioWS.descargarDocumento(documento);
	}

	public byte[] descargarPKCS7(java.lang.String documento, java.lang.String idTransaccion) throws java.rmi.RemoteException
	{
		if (pfServicioWS == null)
			_initPfServicioWSProxy();
		return pfServicioWS.descargarPKCS7(documento, idTransaccion);
	}

	public long eliminarDestinatarioPeticion(java.lang.String dni, java.lang.String peticion) throws java.rmi.RemoteException
	{
		if (pfServicioWS == null)
			_initPfServicioWSProxy();
		return pfServicioWS.eliminarDestinatarioPeticion(dni, peticion);
	}

	public long eliminarDocumentoPeticion(java.lang.String documento) throws java.rmi.RemoteException
	{
		if (pfServicioWS == null)
			_initPfServicioWSProxy();
		return pfServicioWS.eliminarDocumentoPeticion(documento);
	}

	public long eliminarNotificacionPeticion(java.lang.String peticion, java.lang.String estado) throws java.rmi.RemoteException
	{
		if (pfServicioWS == null)
			_initPfServicioWSProxy();
		return pfServicioWS.eliminarNotificacionPeticion(peticion, estado);
	}

	public boolean entregadaPeticion(java.lang.String peticion) throws java.rmi.RemoteException
	{
		if (pfServicioWS == null)
			_initPfServicioWSProxy();
		return pfServicioWS.entregadaPeticion(peticion);
	}

	public long entregarPeticion(java.lang.String peticion) throws java.rmi.RemoteException
	{
		if (pfServicioWS == null)
			_initPfServicioWSProxy();
		return pfServicioWS.entregarPeticion(peticion);
	}

	public long insertarDestinatarioPeticion(java.lang.String dni, java.lang.String peticion) throws java.rmi.RemoteException
	{
		if (pfServicioWS == null)
			_initPfServicioWSProxy();
		return pfServicioWS.insertarDestinatarioPeticion(dni, peticion);
	}

	public java.lang.String insertarDocumentoPeticion(java.lang.String peticion, java.lang.String tipoDoc, java.lang.String nombreDoc, java.lang.String tipoMime, byte[] documento) throws java.rmi.RemoteException
	{
		if (pfServicioWS == null)
			_initPfServicioWSProxy();
		return pfServicioWS.insertarDocumentoPeticion(peticion, tipoDoc, nombreDoc, tipoMime, documento);
	}

	public long insertarNotificacionPeticion(java.lang.String peticion, java.lang.String estado) throws java.rmi.RemoteException
	{
		if (pfServicioWS == null)
			_initPfServicioWSProxy();
		return pfServicioWS.insertarNotificacionPeticion(peticion, estado);
	}

	public java.lang.String insertarPeticion(java.lang.String usuario) throws java.rmi.RemoteException
	{
		if (pfServicioWS == null)
			_initPfServicioWSProxy();
		return pfServicioWS.insertarPeticion(usuario);
	}

	public java.lang.String[] valoresEstados() throws java.rmi.RemoteException
	{
		if (pfServicioWS == null)
			_initPfServicioWSProxy();
		return pfServicioWS.valoresEstados();
	}

	public java.lang.String[] valoresTiposDocumento() throws java.rmi.RemoteException
	{
		if (pfServicioWS == null)
			_initPfServicioWSProxy();
		return pfServicioWS.valoresTiposDocumento();
	}

	public long documentoAccion(java.lang.String hashDoc, java.lang.String estado, java.lang.String accion, java.lang.String tipo) throws java.rmi.RemoteException
	{
		if (pfServicioWS == null)
			_initPfServicioWSProxy();
		return pfServicioWS.documentoAccion(hashDoc, estado, accion, tipo);
	}

	public long cambiarDestinatario(java.lang.String hashPeticion, java.lang.String dniOrigen, java.lang.String dniDestino, java.lang.String nombre, java.lang.String apellido1, java.lang.String apellido2, java.lang.String nuevo) throws java.rmi.RemoteException
	{
		if (pfServicioWS == null)
			_initPfServicioWSProxy();
		return pfServicioWS.cambiarDestinatario(hashPeticion, dniOrigen, dniDestino, nombre, apellido1, apellido2, nuevo);
	}

	public java.lang.String consultarObservacionesEntrega(java.lang.String hashDoc, java.lang.String dni) throws java.rmi.RemoteException
	{
		if (pfServicioWS == null)
			_initPfServicioWSProxy();
		return pfServicioWS.consultarObservacionesEntrega(hashDoc, dni);
	}

	public long insertarDestinatarioPet(es.ise.portafirma.ws.UsuarioWS usuario, java.lang.String peticion) throws java.rmi.RemoteException
	{
		if (pfServicioWS == null)
			_initPfServicioWSProxy();
		return pfServicioWS.insertarDestinatarioPet(usuario, peticion);
	}

	public long eliminarDestinatarioPet(es.ise.portafirma.ws.UsuarioWS usuario, java.lang.String peticion) throws java.rmi.RemoteException
	{
		if (pfServicioWS == null)
			_initPfServicioWSProxy();
		return pfServicioWS.eliminarDestinatarioPet(usuario, peticion);
	}

	public long cambiarDestinatarioPet(java.lang.String hashPeticion, es.ise.portafirma.ws.UsuarioWS usuarioOrigen, es.ise.portafirma.ws.UsuarioWS usuarioDestino, java.lang.String nuevo) throws java.rmi.RemoteException
	{
		if (pfServicioWS == null)
			_initPfServicioWSProxy();
		return pfServicioWS.cambiarDestinatarioPet(hashPeticion, usuarioOrigen, usuarioDestino, nuevo);
	}

	public long eliminarPeticion(java.lang.String peticion) throws java.rmi.RemoteException
	{
		if (pfServicioWS == null)
			_initPfServicioWSProxy();
		return pfServicioWS.eliminarPeticion(peticion);
	}

	public double obtenerIdTransaccion(java.lang.String documento) throws java.rmi.RemoteException
	{
		if (pfServicioWS == null)
			_initPfServicioWSProxy();
		return pfServicioWS.obtenerIdTransaccion(documento);
	}

}