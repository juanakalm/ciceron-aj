<%@ include file="/WEB-INF/includes/taglibs.jsp"%>

<html>
	<head>
		<title>Entrada/Salida Documentos</title>
		<style type="text/css">
			div.ui-datepicker{ 
 				font-size:12px; 
			} 
		</style>
		<script>
		$(document).ready(function() {
			
			$('#sustituirDocumento').hide();
			$('#tabla_nuevo_documento').hide();
			
// 			$('#documentos .visualizarDocumentoLinea').each(function(){
// 				$(this).css('cursor', 'pointer');
// 				$(this).attr({
// 					src : '<spring:url value="/imagenes/boton_abrir.png"/>',
// 					title : 'Abrir documento'
// 				});
// 				$(this).click(function(){
// 					var id = $(this).attr('id').split('_')[1];
// 					var url = '<spring:url value="/app/documentos/visualizar/"/>'+id;
// 					showPdf(url);
// 				});
// 			});
			
			$('#documentos .borrarDocumento').each(function(){
				$(this).css('cursor', 'pointer');
				$(this).attr({
					src : '<spring:url value="/imagenes/boton_eliminar_doc.png"/>',
					title : 'Eliminar registro'
				});
				$(this).click(function(){
					var id = $(this).attr('id').split('_')[1];
					if (confirm('¿Desea realmente eliminar este Registro y sus Archivos asociados?')) {
						var url = '<spring:url value = "/app/documentos/eliminar/"/>'+id;
						location.href = url;
					}
				});
			});
			
// 			$('#documentos .sustituirDocumentoLinea').each(function(){
// 				$(this).css('cursor', 'pointer');
// 				$(this).attr({
// 					src : '<spring:url value="/imagenes/boton_subir.png"/>',
// 					title : 'Sustituir documento'
// 				});
// 				$(this).click(function(){
// 					var id = $(this).attr('id').split('_')[1];
// 					$('#sustituirDocumento .id').val(id);
// 					$('#sustituirDocumento').show();
// 				});
// 			});

			$('#documentos .sustituirDocumentoLinea').each(function(){
				$(this).css('cursor', 'pointer');
				$(this).attr({
					src : '<spring:url value="/imagenes/boton_subir.png"/>',
					title : 'Documentos asociados'
				});
				$(this).click(function(){
					var id = $(this).attr('id').split('_')[1];
					window.open('<spring:url value="/app/archivo/"/>'+id, 'incorporardocumentos', 'status=yes,scrollbars=no,width=800,height=600,top=150,left=270');
				});
			});
			
			$('.limpiarTabla').each(function(){
				$(this).css('cursor','pointer');
				$(this).attr({
					src: '<spring:url value = "/imagenes/boton_limpiar.png"/>',
					title: 'Limpiar'
				});
				$(this).click(function(){
					$('input[type="text"]',$(this).parents('form')).val('');
					$('select',$(this).parents('form')).val('');
					$('input[type="radio"]').attr('checked',false);
				});
			});
			
			$('.nuevo_documento').each(function(){
				$(this).css('cursor','pointer');
				$(this).attr({
					src : '<spring:url value="/imagenes/boton_nuevo.png"/>',
					title : 'Nuevo'
				});
				$(this).click(function(){
					$('#tabla_nuevo_documento th').text('Nuevo');
					$('#tabla_nuevo_documento').show();
					$('.limpiarTabla').click();
				});
			});
			
			$('.limpiar').click(function(){
				$('#sustituirDocumento').hide();
				$('input[type="radio"]').attr('checked',false);
			});
			
			$('#documentos tbody tr td:not(.acciones)').click(function(){
				var id = $(this).parent().attr('id').split('_')[1];
				var url = '<spring:url value="/app/ajax/dao/DocumentosES/idEsDocumento/"/>'+id;
				$.getJSON(url, function(data){
					$('.idEsDocumento').val(data.documentosES.idEsDocumento);
					$('.descripcion').val(data.documentosES.descripcion);
					$('#idContrato').val(data.documentosES.idContrato);
					$('#contrato').val(data.documentosES.codigodescripcion);
					$('#idEntidad').val(data.documentosES.idEntidad);
					$('#proveedor').val(data.documentosES.cifnombre);
					$('.operaciones').val(data.documentosES.idTipoOperacion);
					$('.aries').val(data.documentosES.aries);
					$('.unidades').val(data.documentosES.idUnidadContratacion);
					$('.fecha').val(data.documentosES.fecha);
					$('.otrasUnidades').val(data.documentosES.idOtraUnidad);
					$('.observacion').val(data.documentosES.observacion);
					if(data.documentosES.tipoEntradaSalida == 'E'){
						$('.tipoE').attr('checked',true);
					}else if(data.documentosES.tipoEntradaSalida == 'S'){
						$('.tipoS').attr('checked',true);
					}else{
						$('.tipoE').attr('checked',false);
						$('.tipoS').attr('checked',false);
					}
						
				});
				$('#tabla_nuevo_documento th').text('Editar');
				$('#tabla_nuevo_documento').show();
			});

			$('.subirDocumento').each(function() {
				$(this).css('cursor', 'pointer');
				$(this).attr({
					src : '<spring:url value="/imagenes/boton_guardar.png"/>',
					title : 'Guardar'
				});
				$(this).click(function() {
					if($("#file").val()!= ""){
						$(this).parents('form').submit();
						$('#sustituirDocumento').hide();
					} else 
						alert("Debe seleccionar un Documento");
				});
			});
			
			$( "#datepicker" ).datepicker({
				showButtonPanel: true
			});
			
			$(".buscarEntidad").each(function(){
				$(this).css('cursor', 'pointer');
				$(this).attr({
					src : '<spring:url value="/imagenes/boton_buscar_doc.png"/>',
					title : 'Buscar proveedor'
				});
				$(this).click(function(){
					window.open('<spring:url value="/app/documentos/busquedaEntidad/buscar"/>', 'incorporardocumentos', 'status=yes,scrollbars=no,width=800,height=600,top=150,left=270');
				});
			});
			
			$(".buscarContrato").each(function(){
				$(this).css('cursor', 'pointer');
				$(this).attr({
					src : '<spring:url value="/imagenes/boton_buscar_doc.png"/>',
					title : 'Buscar proveedor'
				});
				$(this).click(function(){
					window.open('<spring:url value="/app/documentos/busquedaContrato/buscar"/>', 'incorporardocumentos', 'status=yes,scrollbars=no,width=800,height=600,top=150,left=270');
				});
			});
			
			$('.limpiarFila').each(function(){
				$(this).css('cursor', 'pointer');
				$(this).attr({
					src : '<spring:url value="/imagenes/boton_limpiar_fila.png"/>',
					title : 'Borrar'
				});
				$(this).click(function(){
					$("#contrato").val("");
					$("#idContrato").val("");
					$("#proveedor").val("");
					$("#idEntidad").val("");
				});
			});
			
			$('.guardarDocumento').each(function() {
				$(this).css('cursor', 'pointer');
				$(this).attr({
					src : '<spring:url value="/imagenes/boton_guardar.png"/>',
					title : 'Guardar'
				});
				$(this).click(function(){
					if($(".descripcion").val()!="" ){
							if($(".operaciones").val()!=""){
								if($(".tipo:checked").length > 0){
									$(this).parents('form').submit();
								}else
									alert("Debe selecionar Entrada o Salida");
							}else
								alert("El campo Operación no puede estar vacio");
					}else
						alert("El campo Descripción no pueden estar vacio");
				});
			});
			
			$('.buscarDocumento').each(function(){
				$(this).css('cursor','pointer');
				$(this).attr({
					src: '<spring:url value = "/imagenes/boton_buscar.png"/>',
					title: 'Buscar'
				});
				$(this).click(function(){
					if(/^\d*\.?\d+$/.test($("#secuencia").val()) || $("#secuencia").val()== "" ){
						$(this).parents('form').submit();
					}else
						alert("El campo Secuencia debe ser numérico");
				});
			});
			
			$('.ocultar').each(function(){
				$(this).css('cursor','pointer');
				$(this).attr({
					src: '<spring:url value = "/imagenes/boton_eliminar.png"/>',
					title: 'Cerrar'
				});
				$(this).click(function(){
					$('#tabla_nuevo_documento').hide();					
				});
			});
			
			$(".busquedaDoc form input,select").keyup(function(event) {
				if(event.keyCode == '13') {
					$(this).parents('form').submit();
				}
			});
			
			$("form input,select,radiobutton").keyup(function(event) {
				if(event.keyCode == '13') {
					$(this).parents('form').submit();
				}
			});
			
		});
		</script>
	</head>
	<body>
		<c:set var="context">
			<spring:url value="/app" />
		</c:set>
		<div align="center" class="busquedaDoc">
			<form:form commandName="busquedaDocumento" action="${context}/documentos">
				<input type="hidden" name="accion" value="buscar"/>
				<table class="tabla_busqueda">
					<tr>
						<th colspan="4">Busqueda </th>
					</tr>
					<tr>
						<td>Descripción: </td>
						<td colspan="3">
							<form:input path="descripcionFormato" size="118"/>
						</td>
					</tr>
					<tr>
						<td>Proveedor: </td>
						<td colspan="3">
							<form:input path="entidad" size="118"/>
						</td>
					</tr>
					<tr>
						<td>Operación: </td>
						<td> 
							<form:select path="idOperacion" cssStyle="width: 400px;">
								<form:option value=""></form:option>
								<form:options items="${tiposOperacion}" itemLabel="descripcion"
									itemValue="id" />
							</form:select>
						</td>
						<td>Expediente: </td>
						<td>
							<form:input path="codigo"/>
						</td>
					</tr>
					<tr>
						<td>Unidad Interna: </td>
						<td>
							<form:select path="idUniInterna" cssStyle="width: 400px;">
								<form:option value=""></form:option>
								<form:options items="${listaUnidades}" itemLabel="descripcion" itemValue="id"/>
							</form:select>
						</td>
						<td>Secuencia: </td>
						<td>
							<form:input path="secuencia" cssStyle="width: 50px;"/>
						</td>
					</tr>
					<tr>
						<td>Unidad Externa: </td>
						<td>
							<form:select path="idUniExterna" cssStyle="width: 400px;">
								<form:option value=""></form:option>
								<form:options items="${listaOtrasUnidades}" itemLabel="descripcion" itemValue="id"/>
							</form:select>
						</td>
						<td>Tipo: </td>
						<td>
							<form:radiobutton path="tipoEntradaSalida" value="E" title="Entrada"/>Entrada
							<form:radiobutton path="tipoEntradaSalida" value="S" title="Salida"/>Salida
						</td>
					</tr>
					<tr>
						<td colspan="4" align="right">
							<img class="volverMenu"/> <img class="nuevo_documento"><img class="limpiar"/><img class="buscarDocumento">
						</td>
					</tr>
				</table>
			</form:form>
		</div>
		<div>
			<form action="${context}/documentos/guardar" name="formulario" method="POST" enctype="multipart/form-data">
				<div>
					<input type="hidden" name="id" class="idEsDocumento" />
					<table class="tabla_busqueda" id="tabla_nuevo_documento">
						<thead>
							<tr>
								<th colspan="5">Nuevo</th>
								<td style="width: rigth; background-color: #E5DFFF;" >
									<img class="ocultar">
								</td>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td style="width: 50px">Descripción: </td>
								<td colspan="5">
									<input type="text" class="descripcion" name="descripcion" size="112"/>
								</td>
							</tr>
							<tr>
								<td>Contrato: </td>
								<td colspan="4">
									<input type="text" id="contrato" name="contrato" size="112" />
									<img class="buscarContrato"/>
									<img class="limpiarFila"/>
								</td>
								<td align="left">
									<input type="hidden" name="idContrato" id="idContrato"/>
								</td>
							</tr>
							<tr>
								<td>Proveedor: </td>
								<td colspan="4">
									<input type="text" id="proveedor" name="proveedor" size="112"/>
									<img class="buscarEntidad"/>
									<img class="limpiarFila"/>
								</td>
								<td align="left">
									<input type="hidden" name="idEntidad" id="idEntidad"/>
								</td>
							</tr>
							<tr>
								<td>Operación: </td>
								<td>
									<select class="operaciones" name="idTipoOperacion" style="width: 380px">
										<option value="">-- Seleccione operación</option>
										<c:forEach var="operaciones" items="${tiposOperacion}">
											<option value="${operaciones.id}">${operaciones.descripcion}</option>
										</c:forEach>	
									</select>
								</td>
								<td>&nbsp;</td>
								<td>Tipo: </td>
								<td>
									<input type="radio" name="tipo" class="tipo tipoE" value="E"/>Entrada
									<input type="radio" name="tipo" class="tipo tipoS" value="S"/>Salida
								</td>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td>Unidad interna: </td>
								<td>
									<select class="unidades" name="idUnidadContratacion" style="width: 380px">
										<option value="">-- Seleccione unidad</option>
										<c:forEach var="unidades" items="${listaUnidades}">
											<option value="${unidades.id}">${unidades.descripcion}</option>
										</c:forEach>	
									</select>
								</td>
								<td>&nbsp;</td>
								<td>Fecha registro: </td>
								<td>
									<input type="text" id="datepicker" class="fecha" style="width: 135px;" name="fecha">
								</td>
								<td>&nbsp;</td>							
							</tr>
							<tr>
								<td>Unidad externa: </td>
								<td>
									<select class="otrasUnidades" name="idOtrasUnidades" style="width: 380px">
										<option value="">-- Seleccione unidad</option>
										<c:forEach var="otrasUnidades" items="${listaOtrasUnidades}">
											<option value="${otrasUnidades.id}">${otrasUnidades.descripcion}</option>
										</c:forEach>	
									</select>
								</td>
								<td>&nbsp;</td>
								<td>ARIES: </td>
                           		<td>
                           			<input type="text" name="aries" class="aries" size="17"/>
                           		</td>	
                           		<td>&nbsp;</td>
							</tr>
							<tr>
								<td>Observaciones</td>
								<td colspan="5" rowspan="4">
									<textarea rows="4" cols="90" style="font-family: verdana;" name="observacion" class="observacion"></textarea>
								</td>
							</tr>
							<tr>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td colspan="6" align="right">
									<img class="limpiarTabla"><img class="guardarDocumento"/>
								</td>
							</tr>
						</tbody>
					</table>
				</div>
			</form>
		</div>
		<div>
			<display:table name="listaDocumentos" uid="documentos" pagesize="5" requestURI="${context}/documentos"
					decorator="es.ise.ciceron.displaytag.decorators.ListaDocumentosDecorator">
				<display:column title="Descripción" property="descripcion"/>
				<display:column title="Secuencia" property="acronimoNumero" style="text-align: center;"/>
				<display:column title="Expediente" property="codigoExpediente"/>
				<display:column title="Proveedor" property="cifnombre"/>
				<display:column title="Operacion" property="descripcionTipoOperacion"/>
				<display:column title="Fecha" property="fecha" decorator="es.ise.ciceron.displaytag.decorators.ShortDateDecorator"/>
				<display:column title="Unidad" property="descUnidadContratacion"/>
				<display:column class="acciones">
					<img class="sustituirDocumentoLinea" id="sustituirDocumento_${documentos.idEsDocumento}"/>
				</display:column>
				<display:column class="acciones">
					<img class="borrarDocumento" id="borrarDocumento_${documentos.idEsDocumento}"/>
				</display:column>
				<display:caption style="color: purple">Documentos</display:caption>
			</display:table>
		</div>
		
<!-- SUSTITUIR DOCUMENTO		 -->
		<div id="sustituirDocumento" title="Sustituir Documento" class="formularioOculto" align="center">
			<form action="${context}/documentos/sustituir" method="POST" enctype="multipart/form-data">
				<input type="hidden" name="id" class="id"/>
				<table>	
					<tr>
						<td>Nuevo documento:</td>
						<td> 
							<input type="file" name="file" id="file"/>
						</td>
						<td width="15px">&nbsp;</td>
						<td>
							<img class="subirDocumento">
						</td>
					</tr>				
				</table>
			</form>	
		</div>		
		
	</body>
</html>