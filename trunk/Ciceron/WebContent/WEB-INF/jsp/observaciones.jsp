<%@page import="java.util.ArrayList"%>
<%@ include file="/WEB-INF/includes/taglibs.jsp"%>

<%
    response.setHeader("Cache-Control", "no-cache");
    response.setHeader("Pragma", "no-cache");
    response.setDateHeader("Expires", -1);
    response.setHeader("Cache-Control", "no-store"); //HTTP 1.1
%>

<html>
	<head>
		<title>Observaciones</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">	
			<link href="<spring:url value="/estilos/ui-lightness/jquery-ui-1.8.14.custom.css"/>"
				rel="stylesheet" type="text/css">
			<link href="<spring:url value="/estilos/displaytag.css"/>"
				rel="stylesheet" type="text/css">
		<script src="<spring:url value="/scripts/jquery.min.js"/>"></script>
		<script src="<spring:url value="/scripts/jquery-ui-1.8.14.custom.min.js"/>"></script>
		<script type="text/javascript" src="<spring:url value="/scripts/horaActual.js"/>"></script>
		<script type="text/javascript">
			$(document).ready(function(){
				
				$('#observaciones').hide();
				
				$('.ocultar').each(function(){
					$(this).css('cursor','pointer');
					$(this).attr({
						src: '<spring:url value = "/imagenes/boton_eliminar.png"/>',
						title: 'Cancelar'
					});
					$(this).click(function(){
						window.close();			
					});
				});
				
				
// 				$('#cancel').each(function(){
// 					$(this).css('cursor','pointer');
// 					$(this).attr({
// 						title : 'Cancelar'
// 					});
// 					$(this).click(function(){
// 						window.close();
// 					});
// 				});
				
				$('.guardar').each(function(){
					$(this).css('cursor','pointer');
					$(this).attr({
						title : 'Guardar'
					});
					$(this).click(function(){
						$(this).parents('form').submit();
					});
				});
				
				$('.validar').each(function(){
					$(this).css('cursor','pointer');
					$(this).attr({
						title : 'Enviar'
					});
					$(this).click(function(){
						$('#comentarioObs').val($('#comentario').val());
						if($('.correos').val() != ""){
							$(this).parents('form').submit();
							alert("El correo se ha enviado correctamente.");
							window.close();
						}else
							alert('Seleccione un destinatario');
						
// 						var id = $(this).attr('id').split('_')[1];
// 						location.href = '<spring:url value="/app/informes/observaciones/validar/"/>'+id;
					});
				});
				
// 				$('#historico').click(function(){
// 					$('#observaciones').show( 'blind');
// 				});

			});
		
		</script>
	</head>
	<body>
		<c:set var="context">
			<spring:url value="/app" />
		</c:set>
		<table width="100%" height="100%" style="background-color: #FFFBE6;">
			<tr>
				<td valign="middle">
					<table style="width: 90%; border: 2px solid grey; background-color: white; font-size: 12px; font-family: verdana" 
							border="0" align="center" cellpadding="2" cellspacing="3">
						<tr>
							<th colspan="2" style="background-image: url('/Ciceron/imagenes/fondo_degradado_gris.png'); background-repeat: repeat-x;">Observaciones</th>
<!-- 							<td align="right" width="16px" style="background-image: url('/Ciceron/imagenes/fondo_degradado_gris.png'); background-repeat: repeat-x;" > -->
<!-- 								<img class="ocultar"> -->
<!-- 							</td> -->
						</tr>
						<tr><td colspan="2">&nbsp;</td></tr>
						<tr>
							<td colspan="2">
								<table style="width: 100%; border: 2px solid grey; background-color: white; font-size: 11px; font-family: verdana;" 
									border="0" align="center" cellpadding="2" cellspacing="3">
									<tr>
										<td colspan="2">
											<form name="formulario" action="${context}/informes/observaciones/guardar/${expediente.id}" method="POST">
											<input type="hidden" name="id" value="${expediente.id}">
											<table style="width: 100%; font-size: 12px; font-family: verdana">
												<tr>
													<td width="85px">Comentario: </td>
													<td align="center" rowspan="9" colspan="2">
														<textarea rows="7" cols="70" style="font-family: verdana" name="comentarioAj" id="comentario" >${exp.comentarioAj}</textarea>
													</td>
													<td width="85px">
														<button class="guardar">Guardar</button>
													</td>
												</tr>
												<tr><td>&nbsp;</td></tr>
												<tr><td>&nbsp;</td></tr>
												<tr><td>&nbsp;</td></tr>
												<tr><td>&nbsp;</td></tr>
												<tr><td>&nbsp;</td></tr>
											</table>
											</form>
											<form action="${context}/informes/observaciones/validar/${expediente.id}" method="POST">
											<input type="hidden" name="comentario" id="comentarioObs" >
											<table style="width: 100%; font-size: 12px; font-family: verdana">
												<tr>
													<td width="85px">&nbsp;</td>
													<td align="center">
														<select class="correos" name="email" style="width: 380px">
															<option value="">-- Seleccione destinatario</option>
															<c:forEach var="correo" items="${correos}">
																<option value="${correo.email}">${correo.nombre}</option>
															</c:forEach>	
														</select>
													</td>
													<td >
														<button class="validar" id="validar_${expediente.id}">Enviar</button>
													</td>
													<td width="85px">&nbsp;</td>
												</tr>
											</table>
											</form>
											<table style="width: 100%; font-size: 12px; font-family: verdana">
												<c:if test="${!empty observacion.respuesta}">
													<tr>
														<td>&nbsp;</td>
													</tr>
													<tr>
														<td width="85px">Respuesta: </td>
														<td align="center" rowspan="9" colspan="2">
															<textarea rows="7" cols="70" style="font-family: verdana" name="respuestaAj" id="respuesta" readonly="readonly">${observacion.respuesta}</textarea>
														</td>
														<td width="85px">&nbsp;</td>
													</tr>
													<tr><td>&nbsp;</td></tr>
													<tr><td>&nbsp;</td></tr>
													<tr><td>&nbsp;</td></tr>
													<tr><td>&nbsp;</td></tr>
													<tr><td>&nbsp;</td></tr>
												</c:if>
											</table>
										</td>
									</tr>
								</table>
							</td>
						</tr>
						<tr>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td valign="middle" colspan="2" align="center">
								<button id="historico" onclick='$("#observaciones").toggle();'>Histórico</button>
							</td>
						</tr>
						<tr>
							<td colspan="2">
								<display:table name="listaObservaciones" uid="observaciones" style="width: 100%;">
									<display:column title="Remitente" property="uRemitente"/>
									<display:column title="Fecha" property="fEnvio" decorator="es.ise.ciceron.displaytag.decorators.ShortDateDecorator"/>
									<display:column title="Comentario" property="comentario"/>
									<display:column title="Respuesta" property="respuesta"/>
									<display:column title="Fecha" property="fRespuesta" decorator="es.ise.ciceron.displaytag.decorators.ShortDateDecorator"/>
									<display:column title="Destinatario" property="uDestinatario"/>
								</display:table>
							</td>
						</tr>	
<!-- 						<tr> -->
<!-- 							<td> -->
<!-- 								<button id="cancel">Cancelar</button> -->
<!-- 							</td> -->
<!-- 						</tr> -->
					</table>
					
				</td>
			</tr>
			<tr>
				
			</tr>
		</table>
	</body>
</html>