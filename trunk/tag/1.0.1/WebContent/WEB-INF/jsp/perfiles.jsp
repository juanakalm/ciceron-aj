<%@ include file="/WEB-INF/includes/taglibs.jsp"%>

<html>
	<head>
		<title>Informes </title>
		<script>
			$(document).ready(function() {
				
				$('.buscarInforme').each(function(){
					$(this).css('cursor','pointer');
					$(this).attr({
						src: '<spring:url value = "/imagenes/boton_buscar.png"/>',
						title: 'Buscar'
					});
					$(this).click(function(){
							$(this).parents('form').submit();
					});
				});
				
			});	
		</script>
	</head>
	<body>
		<c:set var="context">
			<spring:url value="/app" />
		</c:set>
		<div align="center">
			<form:form commandName="busquedaUsuario" action="${context}/perfiles">
				<input type="hidden" name="accion" value="buscar"/>
				<table class="tabla_busqueda">
					<thead>
						<tr>
							<th colspan="7">Busqueda </th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td align="right" width="200px">Nombre: </td>
							<td width="15px">&nbsp;</td>
							<td width="50px"><form:input path="nombre" cssStyle="width: 50px;"/></td>
							<td colspan="4">&nbsp;</td>
						</tr>
					</tbody>
				</table>
			</form:form>
		</div>
	
	</body>
</html>