<%@page import="java.util.ArrayList"%>
<%@ include file="/WEB-INF/includes/taglibs.jsp"%>

<html>
	<head>
		<title>Editar parametros</title>
		<script src="<spring:url value="/scripts/jquery.min.js"/>"></script>
		<script type="text/javascript">
		$(document).ready(function() {
			
			$('#cancelar').each(function(){
				$(this).css('cursor','pointer');
				$(this).attr({
					title : 'Cancelar'
				});
				$(this).click(function(){
					window.close();
				});
			});
			
			$('.aceptar').each(function(){
				$(this).css('cursor','pointer');
				$(this).attr({
					title : 'Aceptar'
				});
				$(this).click(function(){
					$(this).parents('form').submit();
				});
			});
			
			$('.eliminar').each(function(){
				$(this).css('cursor','pointer');
				$(this).attr({
					src : '<spring:url value="/imagenes/boton_eliminar.png"/>',
					title : 'Cancelar'
				});
				$(this).click(function(){
					alert ('Implementar');
				});
			});
			
			$('.buscarEntidad').each(function(){
				$(this).css('cursor','pointer');
				$(this).attr({
					src : '<spring:url value="/imagenes/boton_buscar_doc.png"/>',
					title : 'Buscar'
				});
				$(this).click(function(){
					alert ('Implementar');
				});
			});
			
			$('.buscarExpediente').each(function(){
				$(this).css('cursor','pointer');
				$(this).attr({
					src : '<spring:url value="/imagenes/boton_buscar_doc.png"/>',
					title : 'Buscar'
				});
				$(this).click(function(){
					alert ('Implementar');
				});
			});
			
			$('.buscarCentro').each(function(){
				$(this).css('cursor','pointer');
				$(this).attr({
					src : '<spring:url value="/imagenes/boton_buscar_doc.png"/>',
					title : 'Buscar'
				});
				$(this).click(function(){
					alert ('Implementar');
				});
			});
			
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
				<form action="${context}/listados/parametros/generarBorrador/${solicitud.id}" method="POST">
					<table style="width: 90%; border: 2px solid grey; background-color: white; font-size: 12px; font-family: verdana" 
							border="0" align="center" cellpadding="2" cellspacing="3">
						<thead>
							<tr>
								<th colspan="2" style="background-image: url('/Ciceron/imagenes/fondo_degradado_gris.png'); background-repeat: repeat-x;">Parámetros</th>
							</tr>
							<tr>
								<td>&nbsp;</td>
							</tr>
							<c:forEach var="parametro" items="${listaParametros}">
								<tr>
									<c:if test="${parametro.visto == 'S'}">
										<td width="25%">${parametro.nombre}</td>	
										<td>
											<c:if test="${parametro.lEntidad == 'N'}">
												<c:if test="${parametro.lExpediente == 'N'}">
													<c:if test="${parametro.lCentro == 'N'}">
														
														
														<c:if test="${!empty parametro.lvSelectWeb}">
															<select name="${parametro.paramReport}">
																<c:forEach var="valor" items="${mapaValores[parametro.id]}">
																	<option value="${valor.id}">${valor.descripcion}</option>
																</c:forEach>
															</select>
														</c:if>
														
														
														<c:if test="${empty parametro.lvSelectWeb}">
															<c:if test="${empty parametro.valorDefecto}">
																<input name="${parametro.paramReport}" type="text" size="${parametro.longitud}"/>
															</c:if>
															<c:if test="${!empty parametro.valorDefecto}">
																<input name="${parametro.paramReport}" type="text" value="${parametro.valorDefecto}" size="${parametro.longitud}"/>
															</c:if>
														</c:if>
													</c:if>
												</c:if>
											</c:if>
											<c:if test="${parametro.lEntidad == 'S'}">
												<input name="${parametro.paramReport}" type="text" readonly="readonly" size="${parametro.longitud}"/>
												<img class="buscarEntidad"/>
												<img class="eliminar"/>
											</c:if>
											<c:if test="${parametro.lExpediente == 'S'}">
												<input name="${parametro.paramReport}" type="text" readonly="readonly" size="${parametro.longitud}"/>
												<img class="buscarExpediente"/>
												<img class="eliminar"/>
											</c:if>
											<c:if test="${parametro.lCentro == 'S'}">
												<input name="${parametro.paramReport}" type="text" readonly="readonly" size="${parametro.longitud}"/>
												<img class="buscarCentro"/>
												<img class="eliminar"/>
											</c:if>
										</td>
									</c:if>
									<c:if test="${parametro.visto == 'N'}">
										<input name="${parametro.paramReport}" type="hidden" readonly="readonly" value="${parametro.valorDefecto}"/>
<%-- 										<input name="${parametro.paramReport}" type="hidden" readonly="readonly" value="${parametro.paramReport}"/> --%>
									</c:if>	
								</tr>
							</c:forEach>
							<tr>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td colspan="2" align="right" >
									<button id="cancelar">Cancelar</button><button class="aceptar" id="aceptar_${solicitud.id}">Aceptar</button>
								</td>
							</tr>
						</thead>			
					</table>
				</form>
				</td>
			</tr>
		</table>		
	</body>
</html>