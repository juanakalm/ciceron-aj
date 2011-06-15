<%@ include file="/WEB-INF/includes/taglibs.jsp"%>

<html>
	<head>
		<title>Informes Jurídicos</title>
		<script>
			$(document).ready(function() {

				$("form input,select").keyup(function(event) {
					if(event.keyCode == '13') {
						$(this).parents('form').submit();
					}
				});
				
				$('#informes tbody tr td:not(.acciones)').add('#informesMod tbody tr td:not(.acciones)').click(function() {
					var id = $(this).parent().attr('id').split('_')[1];
					var url = '<spring:url value="/app/informes/expediente/abrir/"/>'+id;
					window.open(url,'exp'+id,'toolbar=0,location=0,directories=0,status=1,menubar=1,scrollbars=1,resizable=1,top=5,left=0,width='+(screen.width-10)+',height='+(screen.height-120));
				});
				
				$('#informes tbody tr button, #informesMod tbody tr button').click(function(event) {
					var id = $(this).parents('tr').attr('id').split('_')[1];
 					var url = '<spring:url value="/app/informes/elaborarInforme/"/>'+id;
					location.href = url;
				});
				
				
			});
		</script>
	</head>
	<body>
		<c:set var="context">
			<spring:url value="/app" />
		</c:set>
		<div align="center">
		<form:form commandName="busqueda" action="${context}/informes">
			<input type="hidden" name="accion" value="buscar"/>
			<table class="tabla_busqueda">
				<thead>
					<tr>
						<th colspan="7">Busqueda </th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td align="right" width="200px">Secuencia: </td>
						<td width="15px">&nbsp;</td>
						<td width="50px"><form:input path="secuencia" cssStyle="width: 50px;"/></td>
					</tr>
					<tr>
						<td align="right">Código: </td>
						<td>&nbsp;</td>
						<td> <form:input path="codigoExpediente" /></td>
						<td width="30px">&nbsp;</td>
						<td align="right">Descripción: </td>
						<td width="15px">&nbsp;</td>
						<td> <form:input path="descripcionExpediente" cssStyle="width: 300px;"/></td>
					</tr>
					<tr>
						<td align="right">Unidades de Contratación: </td>
						<td>&nbsp;</td>
						<td colspan="5"> 
							<form:select path="idUnidadContratacion">
								<form:option value=""></form:option>
								<form:options items="${listaUniOrg}" itemLabel="descripcion"
									itemValue="id" />
							</form:select>
						</td>
					</tr>
					<tr>
						<td colspan="7" align="right">
							<img class="volver"/> <img class="limpiar"/><img class="buscar">
						</td>
					</tr>
				</tbody>
			</table>
		</form:form>
		
<!-- TABLA OCULTA DE LA CONSULTA SOBRE LOS INFORMES -->
		<c:if test="${!empty busqueda.accion}">
		<div align="center">
			<display:table name="listaInformes" uid="informes" pagesize="5" requestURI="${context}/informes"
			               decorator="es.ise.ciceron.displaytag.decorators.ListaInformesDecorator">
				<display:column property="codigoExpediente" title="Código" sortable="true"/>
				<display:column property="descripcionExpediente" title="Descripción" sortable="true" maxLength="100"/>
				<display:column property="presupuestoTotalExpediente" title="Presupuesto Total" sortable="true" decorator="es.ise.ciceron.displaytag.decorators.ImporteSinDivisaDecorator" style="text-align: right;"/>
				<display:column property="fechaAutorizacionGastoExpediente" title="Fecha Autorización Gastos" sortable="true" decorator="es.ise.ciceron.displaytag.decorators.ShortDateDecorator"/>
				<display:column class="acciones">
					<button style="width: 90px">Informe</button>
				</display:column>
				<display:caption style="color: purple">Informes</display:caption>
			</display:table>
		</div>
		
<!-- TABLA OCULTA DE LA CONSULTA SOBRE LOS INFORMES MODIFICADOS -->
		<div align="center">
			<display:table name="listaInformesMod" uid="informesMod" pagesize="5" requestURI="${context}/informes"
							decorator="es.ise.ciceron.displaytag.decorators.ListaInformesModificadosDecorator">
				<display:column property="codigoExpediente" title="Código" sortable="true"/>
				<display:column property="descripcionContrato" title="Descripción" sortable="true" maxLength="80"/>
				<display:column property="presupuestoTotalContrato" title="Presupuesto Total" sortable="true" decorator="es.ise.ciceron.displaytag.decorators.ImporteSinDivisaDecorator" style="text-align: right;"/>
				<display:column property="fechaAutorizacionGastoExpediente" title="Fecha Autorización Gastos" sortable="true" decorator="es.ise.ciceron.displaytag.decorators.ShortDateDecorator"/>
				<display:column property="proveedor" title="Proveedor" sortable="true"/>
				<display:column class="acciones">
					<button style="width: 95px">Informe</button>
				</display:column>
				<display:caption style="color: purple">Informes Modificados</display:caption>
			</display:table>
		</div>
		</c:if>
		
		</div>
	</body>	
</html>