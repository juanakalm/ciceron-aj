<%@ include file="/WEB-INF/includes/taglibs.jsp"%>

<html>
	<head>
		<title>Entrada/Salida Documentos</title>
		<script>
		
		$(document).ready(function() {
			
			$('#sustituirDocumento').hide();
			$('#tabla_nuevo_documento').hide();
			
			$('#documentos .visualizarDocumentoLinea').each(function(){
				$(this).css('cursor', 'pointer');
				$(this).attr({
					src : '<spring:url value="/imagenes/boton_abrir.png"/>',
					title : 'Abrir documento'
				});
				$(this).click(function(){
					var id = $(this).attr('id').split('_')[1];
					var url = '<spring:url value="/app/documentos/visualizar/"/>'+id;
					showPdf(url);
				});
			});
			
			$('#documentos .borrarDocumento').each(function(){
				$(this).css('cursor', 'pointer');
				$(this).attr({
					src : '<spring:url value="/imagenes/boton_eliminar_doc.png"/>',
					title : 'Eliminar documento'
				});
				$(this).click(function(){
					var id = $(this).attr('id').split('_')[1];
					if (confirm('¿Desea realmente eliminar este Documento?')) {
						var url = '<spring:url value = "/app/documentos/eliminar/"/>'+id;
						location.href = url;
					}
				});
			});
			
			$('#documentos .sustituirDocumentoLinea').each(function(){
				$(this).css('cursor', 'pointer');
				$(this).attr({
					src : '<spring:url value="/imagenes/boton_subir.png"/>',
					title : 'Sustituir documento'
				});
				$(this).click(function(){
					var id = $(this).attr('id').split('_')[1];
					$('#sustituirDocumento .id').val(id);
					$('#sustituirDocumento').show();
				});
			});
			
			$('.nuevo_documento').each(function(){
				$(this).css('cursor','pointer');
				$(this).attr({
					src : '<spring:url value="/imagenes/boton_nuevo.png"/>',
					title : 'Nuevo'
				});
				$(this).click(function(){
					$('#tabla_nuevo_documento').show();
				});
			});
			
			$('.limpiar').click(function(){
				$('#tabla_nuevo_documento').hide();
			});
			
		});
		</script>
	</head>
	<body>
		<c:set var="context">
			<spring:url value="/app" />
		</c:set>
		<div align="right">
				<img class="volver">
				<img class="nuevo_documento">
				<img class="limpiar">
		</div>
		<div>
			<table class="tabla_busqueda" id="tabla_nuevo_documento">
				<thead>
					<tr>
						<th>Nuevo</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>&nbsp;</td>
					</tr>
				</tbody>
			</table>
		</div>
		<div>
			<display:table name="listaDocumentos" uid="documentos" pagesize="5" requestURI="${context}/documentos">
				<display:column title="Descripción" property="descripcion"/>
				<display:column title="Expediente" property="codigoExpediente"/>
				<display:column title="Proveedor" property="nombreEntidad"/>
				<display:column title="Operacion" property="descripcionTipoOperacion"/>
				<display:column title="Fecha" property="fecha" decorator="es.ise.ciceron.displaytag.decorators.ShortDateDecorator"/>
				<display:column title="Unidad" property="descUnidadContratacion"/>
				<display:column>
					<img class="visualizarDocumentoLinea" id="visualizarDocumento_${documentos.idEsDocumento}"/>
				</display:column>
				<display:column>
					<img class="sustituirDocumentoLinea" id="sustituirDocumento_${documentos.idEsDocumento}"/>
				</display:column>
				<display:column>
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