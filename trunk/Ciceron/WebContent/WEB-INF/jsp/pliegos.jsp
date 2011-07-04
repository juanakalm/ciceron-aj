<%@ include file="/WEB-INF/includes/taglibs.jsp"%>

<html>
	<head>
		<title>Versiones de los pliegos</title>
		<script>
		$(document).ready(function() {
			
			$('.tabla_busqueda').hide();
			
			$('.limpiar').click(function(){				
				$('.tabla_busqueda').hide();
			});
			
			$('.tabla_busqueda .naturaleza').change(function(){
				if($(this).val() == 5 || $(this).val() == 8){
					$('.tabla_busqueda .tipoServicio').removeAttr("disabled");
				}
			});
			
			$('.nuevo').each(function(){
				$(this).css('cursor', 'pointer');
				$(this).attr({
					src : '<spring:url value="/imagenes/boton_nuevo.png"/>',
					title : 'Nuevo'
				});
				$(this).click(function() {
					$('.tabla_busqueda').show();
				});
			});
			
		});
		</script>
	</head>
	<body>
	<c:set var="context">
		<spring:url value="/app" />
	</c:set>
	<div>
		<form  action="${context}/pliegos/guardar" method="POST" enctype="multipart/form-data">
			<div align="right">
				<img class="volver">
				<img class="nuevo">
				<img class="limpiar">
			</div>
			<div>
				<input type="hidden" name="id" class="id" />
				<table class="tabla_busqueda" id="tabla_elaborar_pliego">
					<thead>
						<tr>
							<th colspan="6">Editar</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>Nombre: </td>
							<td colspan="3">
								<input type="text" class="nombre" size="80"/>
							</td>
							<td align="right">Versión: </td>
							<td align="right">
								<input type="text" class="version" size="2"/>
							</td>
						</tr>
						<tr>
							<td>Normativa: </td>
							<td>
								<select class="normativa" style="width: 300px">
									<option value="">-- Seleccione normativa</option>
									<c:forEach var="normativa" items="${normativas}">
										<option value="${normativa.id}">${normativa.descripcion}</option>
									</c:forEach>	
								</select>
							</td>
							<td>Tipo contractual: </td>
							<td colspan="3">
								<select class="naturaleza" style="width: 300px">
									<option value="">-- Seleccione tipo</option>
									<c:forEach var="naturaleza" items="${naturalezas}">
										<option value="${naturaleza.id}">${naturaleza.descripcion}</option>									
									</c:forEach>
								</select>
							</td>
						</tr>
						<tr>
							<td>Procedimiento: </td>
							<td>
								<select class="procedimiento" style="width: 300px">
									<option value="">-- Seleccione procedimiento</option>
									<c:forEach var="procedimiento" items="${procedimientos}">
										<option value="${procedimiento.id}">${procedimiento.descripcion}</option>
									</c:forEach>
								</select>
							</td>
							<td>Tipo servicio: </td>
							<td colspan="3">
								<select class="tipoServicio" style="width: 300px" disabled="disabled">
									<option value="">-- Seleccione servicio</option>
									<c:forEach var="tipoServicio" items="${tipoServicios}">
										<option value="${tipoServicio.id}">${tipoServicio.descripcion}</option>
									</c:forEach>
								</select>
							</td>
						</tr>
						<tr>
							<td>Documento: </td>
							<td>
                                <input type="file" name="file"/>
                            </td>
							<td>Activo: </td>
							<td>
								<input type="checkbox" name="activo">
							</td>
							<td>&nbsp;</td>
							<td align="right">
								<img class="guardar">
							</td>
						</tr>
					</tbody>
				</table>			
			</div>
			</form>
		</div>
			<div align="center">
				<display:table name="listaPliegos" uid="pliegos" pagesize="5" requestURI="${context}/pliegos">
					<display:column property="nombre" title="Nombre"/>
					<display:column property="normativa" title="Normativa"/>
					<display:column property="naturaleza" title="Naturaleza"/>
					<display:column property="procedimiento" title="Procedimiento"/>
					<display:column property="version" title="Ver."/>
					<display:column property="lActivo" title="Válido" decorator="es.ise.ciceron.displaytag.decorators.CheckBoxDecorator"/>
					<display:column title="Doc."/>
					<display:column title="Sust."/>
					<display:column title="Borrar"/>
					<display:caption style="color: purple">Versiones de Pliegos</display:caption>			
				</display:table>		
			</div>
		
	</body>
</html>