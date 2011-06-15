<%@ include file="/WEB-INF/includes/taglibs.jsp" %>
<html>
	<head>
		<title>
			Inicio
		</title>
		<link href="<spring:url value="/estilos/principal.css"/>"
			rel="stylesheet" type="text/css">
		<script src="<spring:url value="/scripts/jquery.min.js"/>"></script>
		<script type="text/javascript">
		function cerrar(){
			window.close();
		}
		</script>
	</head>
	<body>
		<table width="100%" height="100%" >
			<tr>
				<td>
					<table width="600px" align="center">
						<tr>
							<td align="center">
								<c:set var="context"><spring:url value="/app"/></c:set>
									<table id="tablaLogin" align="center">
										<tr>
						 					<td colspan="5">&nbsp;</td>
						 				</tr>
						 				<tr>
						 					<th align="center" colspan="5" style="color:#c50101">SU SESIÓN HA CADUCADO</th>
						 				</tr>
						 				<tr>
											<td align="center" colspan="5">
												<table style="width: 95%; background-image: url('/Ciceron/imagenes/logo.png'); background-repeat: no-repeat;">
													<tr>
														<td>&nbsp;</td>
													</tr>
													<tr>
														<td>&nbsp;</td>
													</tr>
													<tr>
														<td>&nbsp;</td>
													</tr>
													<tr>
														<td>&nbsp;</td>
													</tr>
													<tr>
														<td>&nbsp;</td>
													</tr>
													<tr>
														<td>&nbsp;</td>
													</tr>
													<tr>
														<td>&nbsp;</td>
													</tr>
													<tr>
														<td>&nbsp;</td>
													</tr>
													<tr>
														<td>
															<a style="color: green" title="Volver a conectar" href="/Ciceron/index.jsp">Volver a conectar</a>
														</td>
														<td>
															<a style="color: green" title="Salir" onclick="cerrar();">Salir</a>
														</td>
													</tr>
									
												</table>
							
											
											</td>
										</tr>
									</table>
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</body>
</html>