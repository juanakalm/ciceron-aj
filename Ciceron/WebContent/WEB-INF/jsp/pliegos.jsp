<%@ include file="/WEB-INF/includes/taglibs.jsp"%>

<html>
	<head>
		<title>Versiones de los pliegos</title>
		<script>
		$(document).ready(function() {
			
			$('.tabla_busqueda').hide();
			$('#sustituirPliego').hide();
			
			$('.limpiarTabla').each(function(){
				$(this).css('cursor','pointer');
				$(this).attr({
					src: '<spring:url value = "/imagenes/boton_limpiar.png"/>',
					title: 'Limpiar'
				});
				$(this).click(function(){
					var form = $(this).parents('form');
					$('input[type="text"],select,textarea', form).val('');
					$('input[type="hidden"]', form).val('');
					$('input[type="checkbox"]',form).attr('checked',false);
					$('.normativa').attr('disabled',false);
					$('.naturaleza').attr('disabled',false);
					$('.procedimiento').attr('disabled',false);
					$('.tipoServicio').attr('disabled',true);
				});
			});		
// 				$('.tabla_busqueda').hide();
			
			
			$('.tabla_busqueda .naturaleza').change(function(){
				$('.tabla_busqueda .tipoServicio').attr("disabled", !($(this).val() == 5 || $(this).val() == 8));
			});
			
			$('.nuevo').each(function(){
				$(this).css('cursor', 'pointer');
				$(this).attr({
					src : '<spring:url value="/imagenes/boton_nuevo.png"/>',
					title : 'Nuevo'
				});
				$(this).click(function() {
					$('.limpiarTabla').click();
					$('#tabla_elaborar_pliego th').text('Nuevo');
					$('#tabla_elaborar_pliego .fichero').show();
					$('.tabla_busqueda').show();
					$('#tabla_elaborar_pliego .nombre').focus();
				});
			});
			
			$('#pliegos .visualizarPliegoLinea').each(function(){
				$(this).css('cursor', 'pointer');
				$(this).attr({
					src : '<spring:url value="/imagenes/boton_abrir.png"/>',
					title : 'Abrir documento'
				});
				$(this).click(function(){
					$('.formularioOculto').hide();
					var id = $(this).attr('id').split('_')[1];
					var url = '<spring:url value="/app/pliegos/visualizar/"/>'+id;
					showPdf(url);
				});
			});
			
			$('#pliegos .sustituirPliegoLinea').each(function(){
				$(this).css('cursor', 'pointer');
				$(this).attr({
					src : '<spring:url value="/imagenes/boton_subir.png"/>',
					title : 'Sustituir documento'
				});
				$(this).click(function(){
					var id = $(this).attr('id').split('_')[1];
					$('#sustituirPliego .id').val(id);
					$('#sustituirPliego').show();
				});
			});
			
			$('#pliegos .borrarPliego').each(function(){
				$(this).css('cursor', 'pointer');
				$(this).attr({
					src : '<spring:url value="/imagenes/boton_eliminar_doc.png"/>',
					title : 'Eliminar documento'
				});
				$(this).click(function(){
					var id = $(this).attr('id').split('_')[1];
					if (confirm('¿Desea realmente eliminar este Documento?')) {
						var url = '<spring:url value = "/app/pliegos/eliminar/"/>'+id;
						location.href = url;
					}
				});
			});
			
			$('#pliegos tbody tr td:not(.acciones)').click(function(){
				var id = $(this).parent().attr('id').split('_')[1];
				var url = '<spring:url value="/app/ajax/dao/VersionesPliegos/id/"/>'+id;
				var urljson = '<spring:url value="/app/pliegos/editar/"/>'+id;
				$.getJSON(url, function(data){
					$('.id').val(data.versionesPliegos.id);
					$('.nombre').val(data.versionesPliegos.nombre);
					$('.version').val(data.versionesPliegos.version);
					$('.normativa').daoSelect({
						url: '<spring:url value="/app/ajax/daolist/Normativa/"/>',
						blank: '-- Seleccione normativa',
						list: 'normativaList',
						label: 'descripcion',
						value: 'id',
						selected: data.versionesPliegos.idNormativa
					});
					$('.naturaleza').daoSelect({
						url: '<spring:url value="/app/ajax/daolist/Naturaleza/"/>',
						blank: '-- Seleccione tipo',
						list: 'naturalezaList',
						label: 'descripcion',
						value: 'id',
						selected: data.versionesPliegos.idNaturaleza,
						finish: function() {
							$('.naturaleza').change();
						}
					});
					$('.procedimiento').daoSelect({
						url: '<spring:url value="/app/ajax/daolist/Procedimiento"/>',
						blank: '-- Seleccione procedimiento',
						list: 'procedimientoList',
						label: 'descripcion',
						value: 'id',
						selected: data.versionesPliegos.idProcedimiento
					});
					$('.tipoServicio').daoSelect({
						url: '<spring:url value="/app/ajax/daolist/TipoServicio"/>',
						blank: '-- Seleccione servicio',
						list: 'tipoServicioList',
						label: 'descripcion',
						value: 'id',
						selected: data.versionesPliegos.idTiposServicios
					});
					$('.activo').attr('checked',data.versionesPliegos.activo == 'S');
				});
				$.getJSON(urljson, function(data){
					if(data.elimina == 'N'){
						$('.normativa').attr('disabled',true);
						$('.naturaleza').attr('disabled',true);
						$('.procedimiento').attr('disabled',true);
						$('.tipoServicio').attr('disabled',true);
					}else{
						$('.normativa').attr('disabled',false);
						$('.naturaleza').attr('disabled',false);
						$('.procedimiento').attr('disabled',false);
						$('.tipoServicio').attr('disabled',false);
					}
				});
				$('#tabla_elaborar_pliego th').text('Editar pliego');
				$('#tabla_elaborar_pliego .fichero').hide();
				$('#tabla_elaborar_pliego').show();
			});
			
			$('.guardar').each(function() {
				$(this).css('cursor', 'pointer');
				$(this).attr({
					src : '<spring:url value="/imagenes/boton_guardar.png"/>',
					title : 'Guardar'
				});
				$(this).click(function() {
					$('#tabla_elaborar_pliego .fichero').show();
					$('#tabla_elaborar_pliego :disabled').attr("disabled",false);
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
	<div>
		<form  action="${context}/pliegos/guardar" method="POST" enctype="multipart/form-data">
			<div align="right">
				<img class="volver">
				<img class="nuevo">
				<img class="limpiarTabla">
			</div>
			<div id="elimina_${elimina}">
				<input type="hidden" name="id" class="id" />
				<table class="tabla_busqueda" id="tabla_elaborar_pliego">
					<thead>
						<tr>
							<th colspan="6">Nuevo</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>Nombre: </td>
							<td colspan="3">
								<input type="text" class="nombre" name="nombre" size="80"/>
							</td>
							<td align="right">Versión: </td>
							<td align="right">
								<input type="text" class="version" name="version" size="2"/>
							</td>
						</tr>
						<tr>
							<td>Normativa: </td>
							<td>
								<select class="normativa" name="idNormativa" style="width: 300px">
									<option value="">-- Seleccione normativa</option>
									<c:forEach var="normativa" items="${normativas}">
										<option value="${normativa.id}">${normativa.descripcion}</option>
									</c:forEach>	
								</select>
							</td>
							<td>Tipo contractual: </td>
							<td colspan="3">
								<select class="naturaleza" name="idNaturaleza" style="width: 300px">
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
								<select class="procedimiento" name="idProcedimiento" style="width: 300px">
									<option value="">-- Seleccione procedimiento</option>
									<c:forEach var="procedimiento" items="${procedimientos}">
										<option value="${procedimiento.id}">${procedimiento.descripcion}</option>
									</c:forEach>
								</select>
							</td>
							<td>Tipo servicio: </td>
							<td colspan="3">
								<select class="tipoServicio" name="idTiposServicios" style="width: 300px" disabled="disabled">
									<option value="">-- Seleccione servicio</option>
									<c:forEach var="tipoServicio" items="${tipoServicios}">
										<option value="${tipoServicio.id}">${tipoServicio.descripcion}</option>
									</c:forEach>
								</select>
							</td>
						</tr>
						<tr>
							<td width="80px"><span class="fichero">Documento:</span></td>
							<td width="150px">
                                <input type="file" name="file" class="fichero"/>
                            </td>
							<td>Activo: </td>
							<td>
								<input type="checkbox" name="activo" class="activo" value="S">
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
			<display:table name="listaPliegos" uid="pliegos" pagesize="5" requestURI="${context}/pliegos"
							decorator="es.ise.ciceron.displaytag.decorators.ListaPliegosDecorator">
				<display:column property="nombre" title="Nombre"/>
				<display:column property="normativa" title="Normativa"/>
				<display:column property="naturaleza" title="Naturaleza"/>
				<display:column property="procedimiento" title="Procedimiento"/>
				<display:column property="version" title="Ver."/>
				<display:column property="lActivo" title="Válido" decorator="es.ise.ciceron.displaytag.decorators.CheckBoxDecorator"/>
				<display:column class="acciones">
					<img class="visualizarPliegoLinea" id="visualizarPliego_${pliegos.id}"/>
				</display:column>
				<display:column class="acciones">
					<img class="sustituirPliegoLinea" id="sustituirPliego_${pliegos.id}"/>
				</display:column>
				<display:column class="acciones">
					<img class="borrarPliego" id="borrarPliego_${pliegos.id}"/>
				</display:column>
				<display:caption style="color: purple">Versiones de Pliegos</display:caption>			
			</display:table>		
		</div>
		
<!-- SUSTITUIR PLIEGO		 -->
		<div id="sustituirPliego" title="Sustituir Documento" class="formularioOculto" align="center">
			<form action="${context}/pliegos/sustituir" method="POST" enctype="multipart/form-data">
				<input type="hidden" name="id" class="id"/>
				<table>	
					<tr>
						<td>Nuevo pliego:</td>
						<td> 
							<input type="file" name="file"/>
						</td>
						<td width="15px">&nbsp;</td>
						<td>
							<img class="guardar">
						</td>
					</tr>				
				</table>
			</form>	
		</div>		
		
	</body>
</html>