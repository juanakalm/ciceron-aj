<%@ include file="/WEB-INF/includes/taglibs.jsp" %>

<html>
	<head>
		<title>
			Login
		</title>
		<link href="<spring:url value="/estilos/principal.css"/>"
			rel="stylesheet" type="text/css">
		<script src="<spring:url value="/scripts/jquery.min.js"/>"></script>
		<script>
		$(document).ready(function() {
			$('.volver').each(function() {
				$(this).css('cursor', 'pointer');
				$(this).attr({
					src : '<spring:url value="/imagenes/boton_volver.png"/>',
					title : 'Volver'
				});
				$(this).click(function() {
					history.back();
				});
			});
	
			$('.entrar').each(function() {
				$(this).css('cursor', 'pointer');
				$(this).attr({
					src : '<spring:url value="/imagenes/enter.png"/>',
					title : 'Entrar'
				});
				$(this).click(function() {
					$(this).parents('form').submit();
				});
			});
			
			$("form input:last").keyup(function(event) {
				if(event.keyCode == '13') {
					$(this).parents('form').submit();
				}
			});

			$('.volverAtras').each(function() {
				$(this).css('cursor', 'pointer');
				$(this).attr({
					src : '<spring:url value="/imagenes/boton_volver.png"/>',
					title : 'Volver'
				});
				$(this).click(function() {
					location.href = '<spring:url value="/index.jsp"/>';
				});
			});

			$("form input:last").keyup(function(event) {
				if(event.keyCode == '13') {
					$(this).parents('form').submit();
				}
			});
		});
			
	</script>
	</head>
	<body>
		<table width="100%" height="100%" >
			<tr>
				<td>
					 <table width="600px" align="center">
					 	<tr>
					 		<td align="center">
					 			<img src="<spring:url value="/imagenes/cabecera_inicio.gif"/>"/>
					 		</td>
					 	</tr>
					 	<tr>
					 		<td>
					 			<c:set var="context"><spring:url value="/app"/></c:set>
								<form:form commandName="usuario" action="${context}/inicio" method="post">
						 			<table id="tablaLogin" align="center">
						 				<tr>
						 					<td colspan="2">&nbsp;</td>
						 				</tr>
						 				<tr>
						 					<th align="center" colspan="2" style="color:#c50101">BIENVENIDO A CICERÓN</th>
						 				</tr>
						 				<tr>
											<td colspan="2"> &nbsp;	</td>
										</tr>
						 				<tr>
						 					<td align="right" width="40%">Usuario: </td>
						 					<td align="left">
						 						<form:input path="identificador" cssStyle="width: 140px;"/>
						 					</td>
						 				</tr>
						 				<tr>
						 					<td style="text-align: right;">
						 						Contraseña:
						 					</td>
						 					<td class="intro" style="text-align: left;">
						 						<form:password path="clave"  cssStyle="width: 140px;"/>
						 					</td>
						 				</tr>
						 				<tr>
						 					<td colspan="2">&nbsp;</td>
						 				</tr>
						 				<tr>
						 					<td align="center" colspan="2" style="color:red">
							 					<c:if test="${not empty mensaje}">
							 						<c:out value="${mensaje}"/>
							 					</c:if>
							 					&nbsp;
							 				</td>
						 				</tr>
						 				<tr>
						 					<td colspan="2">&nbsp;</td>
						 				</tr>
						 				<tr>
						 					<td style="padding-left: 15px;">
						 						<img class="volverAtras"/>
						 					</td>
						 					<td style="padding-right: 15px;" align="right">
						 						<img class="entrar"/>
						 					</td>
						 				</tr>
						 				<tr>
						 					<td colspan="2">&nbsp;</td>
						 				</tr>
						 			</table>
						 		</form:form>
						 	</td>
					 	</tr>
					 </table>
				</td>
			</tr>		
		</table>
		
	</body>
</html>