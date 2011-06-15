<%@ include file="/WEB-INF/includes/taglibs.jsp" %>
<html>
	<head>
		<title>
			Inicio
		</title>
		<link href="<spring:url value="/estilos/principal.css"/>"
			rel="stylesheet" type="text/css">
		<script src="<spring:url value="/scripts/jquery.min.js"/>"></script>
		<script>
		$(document).ready(function() {
			$('.sinCertificado').each(function() {
				$(this).css('cursor', 'pointer');
				$(this).attr({
					src : '<spring:url value="/imagenes/sin_certificado2.png"/>',
					title : 'Acceso SIN Cetificado Digital'
				});
				$(this).click(function() {
					location.href = '<spring:url value="/app/inicio"/>';
				});
			});
	
			$('.conCertificado').each(function() {
				$(this).css('cursor', 'pointer');
				$(this).attr({
					src : '<spring:url value="/imagenes/con_certificado2.png"/>',
					title : 'Acceso CON Cetificado Digital'
				});
				$(this).click(function() {
					
				});
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
						 			<table id="tablaLogin" align="center">
						 				<tr>
						 					<td colspan="5">&nbsp;</td>
						 				</tr>
						 				<tr>
						 					<th align="center" colspan="5" style="color:#c50101">BIENVENIDO A CICERÓN</th>
						 				</tr>
						 				<tr>
											<td colspan="5">&nbsp;</td>
										</tr>
						 				<tr>
						 					<td align="center" colspan="5">Seleccione el modo de acceso</td>
						 				</tr>
						 				<tr>
						 					<td colspan="5">&nbsp;</td>
						 				</tr>
						 				<tr>
						 					<td width="100px">&nbsp;</td>
						 					<td width="50px">
						 						<img class="sinCertificado"/>
						 					</td>
						 					<td width="100px">&nbsp;</td>
						 					<td width="50px">
						 						<img class="conCertificado"/>
						 					</td>
						 					<td width="100px">&nbsp;</td>
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