<%@page import="java.util.ArrayList"%>
<%@ include file="/WEB-INF/includes/taglibs.jsp"%>

<html>
	<head>
		<title>Observaciones</title>
		<script src="<spring:url value="/scripts/jquery.min.js"/>"></script>
		<script type="text/javascript">
			$(document).ready(function(){
				
				$('#cancelar').each(function(){
					$(this).css('cursor','pointer');
					$(this).attr({
						title : 'Cancelar'
					});
					$(this).click(function(){
						window.close();
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
					<form action="${context}/informes/observaciones/guardar/${expediente.expId}" method="POST">
					<table style="width: 90%; border: 2px solid grey; background-color: white; font-size: 12px; font-family: verdana" 
							border="0" align="center" cellpadding="2" cellspacing="3">
						<tr>
							<th colspan="2" style="background-image: url('/Ciceron/imagenes/fondo_degradado_gris.png'); background-repeat: repeat-x;">Observaciones</th>
						</tr>
						<tr>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td align="center">
								<textarea rows="10" cols="75" style="font-family: verdana"></textarea>
							</td>
						</tr>
						<tr>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td align="right">
								<button id="cancelar">Cancelar</button>
								<button>Guardar</button>
								<button>Validar</button>
							</td>
						</tr>
					</table>
					</form>
				</td>
			</tr>
			<tr>
				
			</tr>
		</table>
	</body>
</html>