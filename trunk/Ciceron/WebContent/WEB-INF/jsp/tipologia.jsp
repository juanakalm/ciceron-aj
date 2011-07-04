<%@ include file="/WEB-INF/includes/taglibs.jsp"%>

<html>
<head>
<title>Busqueda</title>
<script>
	$(document).ready(function() {
		
		$('#tabla_edita_bloque').hide();
		$('#tabla_edita_punto').hide();
		
		$('#bloques img.eliminarPunto').each(function() {
			$(this).css('cursor', 'pointer');
			$(this).attr({
				src : '<spring:url value="/imagenes/boton_eliminar.png"/>',
				title : 'Eliminar punto'
			});
			$(this).click(function() {
				var id = $(this).attr('id').split('_')[1];
				var url = '<spring:url value="/app/informes/ajax/comprobarPunto/"/>'+id;
				if (confirm('¿Desea realmente eliminar este punto?')) {
					$.getJSON(url, function(data) {
						if(data.comprobarPunto) {
							alert(data.comprobarPunto);
						}
						else
							location.href = '<spring:url value="/app/tipologia/puntos/eliminar/"/>'+ id;
				
					});
				}
			});
		});

		$('#bloques img.editarPunto').each(function() {
			$(this).css('cursor', 'pointer');
			$(this).attr({
				src : '<spring:url value="/imagenes/boton_editar_punto.png"/>',
				title : 'Editar punto'
			});
		});
		
		$('.editarPunto').click(function(){
			var id = $(this).attr("id");
			var arrayId = id.split("_");
			var idBloque = arrayId[1];
			var idPunto = arrayId[2];
			var orden = $('#ordenPunto_'+idBloque+"_"+idPunto).val();
			var bloque = $('#bloque_'+idBloque+"_"+idPunto).val();
			var descripcionCorta = $('#descripcionCorta_'+idBloque+"_"+idPunto).val();
			var descripcionLarga = $('#descripcionLarga_'+idBloque+"_"+idPunto).val();
			$("#editaBloque").val(bloque);
			$("#editaOrdenPunto").val(orden);
			$("#editaDescripcionCorta").val(descripcionCorta);
			$("#editaDescripcionLarga").val(descripcionLarga);
			$('#editaIdPunto').val(idPunto);
			$('#tabla_edita_punto').show();
		});

		$('#bloques img.editarBloque').each(function() {
			$(this).css('cursor', 'pointer');
			$(this).attr({
				src : '<spring:url value="/imagenes/boton_editar_bloque.png"/>',
				title : 'Editar bloque'
			});
		});
		
		$('.editarBloque').click(function(){
			var id = $(this).attr("id");
			var arrayId = id.split("_");
			var idBloque = arrayId[1];
			var idPunto = arrayId[2];
			var orden = $('#orden_'+idBloque+"_"+idPunto).val();
			var tipo = $('#tipo_'+idBloque+"_"+idPunto).val();
			var descripcion = $('#descripcion_'+idBloque+"_"+idPunto).val();
			$("#editaTipologia").val(tipo);
			$("#editaOrden").val(orden);
			$("#editaDescripcion").val(descripcion);
			$('#editaIdBloque').val(idBloque);
			$('#tabla_edita_bloque').show();
		});
		
		$('#bloques img.eliminarBloque').each(function() {
			$(this).css('cursor', 'pointer');
			$(this).attr({
				src : '<spring:url value="/imagenes/boton_eliminar.png"/>',
				title : 'Eliminar bloque'
			});
			$(this).click(function() {
				var idb = $(this).attr('id').split('_')[1];		
				var url = '<spring:url value="/app/informes/ajax/comprobarBloqueConPunto/"/>'+idb;
				if (confirm('¿Desea realmente eliminar este bloque y todos sus puntos?')) {
					$.getJSON(url, function(data) {
						if(data.comprobarBloqueConPunto) {
							alert(data.comprobarBloqueConPunto);
						}
						else
							location.href = '<spring:url value = "/app/tipologia/bloques/eliminar/"/>'+ idb;
					});
				}
			});
		});

		$('.anadirBloque').each(function() {
			$(this).css('cursor','pointer');
			$(this).attr({
				src: '<spring:url value = "/imagenes/boton_nuevo_bloque1.png"/>',
				title: 'Nuevo bloque'
			});
			$(this).click(function(){
				$('#tabla_edita_bloque').show();
			});
		});
	
		$('.anadirPunto').each(function() {
			$(this).css('cursor','pointer');
			$(this).attr({
				src: '<spring:url value = "/imagenes/boton_nuevo_punto1.png"/>',
				title: 'Nuevo punto'
			});
			$(this).click(function(){
				$('#tabla_edita_punto').show();
			});
		});

		$('.volverTipologia').each(function() {
			$(this).css('cursor', 'pointer');
			$(this).attr({
				src : '<spring:url value="/imagenes/boton_atras.png"/>',
				title : 'Volver sin guardar'
			});
			$(this).click(function() {
				location.href = '<spring:url value="/app/tipologia"/>';
			});
		});

		$('.volverMenu').each(function() {
			$(this).css('cursor', 'pointer');
			$(this).attr({
				src : '<spring:url value="/imagenes/boton_atras.png"/>',
				title : 'Volver'
			});
			$(this).click(function() {
				location.href = '<spring:url value="/app/menu"/>';
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
	<form:form commandName="tipologia" action="${context}/tipologia">
	
		<table class="tabla_busqueda" width="100%">
			<thead>
				<tr>
					<th colspan="4">Busqueda</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td width="100px">Tipología: </td>
					<td width="190px">
						<form:select path="id">
							<form:option value="">-- Seleccione tipología</form:option>
							<form:options items="${listaTipo}" itemLabel="descripcion"
								itemValue="id" />
						</form:select></td>
					<td align="left">
						<img class="buscar" />
					</td>
					<td align="right"> <img class="volverMenu"/> <img class="anadirBloque"/> <img class="anadirPunto"/> </td>			
				</tr>
			</tbody>
		</table>
		</form:form>
	</div>

<!-- TABLA OCULTA PARA EDITAR LOS BLOQUES -->

<form action="${context}/tipologia/bloques/guardar" method="POST">
	<input type="hidden" name="id" id="editaIdBloque"/>
	<table class="tabla_borde" align="center" id="tabla_edita_bloque">
		<tr>
			<th align="center" colspan="6" style="color: #B404AE">Edición de bloques</th>
		</tr>
		<tr>
			<td align="right">Tipología:</td>
			<td>
				<select name="idTipologia" id="editaTipologia" >
					<option value="">-- Seleccione Tipologia</option>
					<c:forEach items="${listaTipo}" var="tipo">
						<option value="${tipo.id}">${tipo.descripcion}</option>
					</c:forEach>
				</select>
			<td align="right">Descripción del bloque:</td>
			<td><input type="text" id="editaDescripcion" name="descripcion"/> 
			</td>
			<td align="right">Orden del bloque:</td>
			<td><input type="text" id="editaOrden" name="orden"/> 
			</td>
		</tr>
		<tr>
			<td></td>
			<td colspan="4">&nbsp;</td>
			<td align="right"> <img class="volverTipologia" /> <img class="limpiar"/> <img class="guardar" /></td>
		</tr>
	</table>
</form>


<!-- TABLA OCULTA PARA EDITAR LOS PUNTOS -->

<form action="${context}/tipologia/puntos/guardar" method="POST">
	<input type="hidden" name="id" id="editaIdPunto"/>
	<table class="tabla_borde" align="center" id="tabla_edita_punto">
		<tr>
			<th align="center" colspan="6" style="color: #B404AE">Edición de puntos</th>
		</tr>
		<tr>
			<td align="right">Bloque:</td>
			<td>
				<select name="idBloque"
					id="editaBloque">
					<option value="">-- Seleccione bloque</option>
					<c:forEach items="${listaB}" var="bloque">
						<option value="${bloque.id}">${bloque.descripcion}</option>
					</c:forEach>
				</select>
			<td align="right" style="width: 120px;">Descripción corta:</td>
			<td><input type="text" id="editaDescripcionCorta" name="descripcionCorta" style="width: 190px;"/> </td>
			<td align="right" style="width: 110px;">Orden del punto:</td>
			<td><input type="text" id="editaOrdenPunto" name="orden" style="width: 80px;"/> </td>
		</tr>
		<tr>
			<td align="right">Descripción larga:</td>
<!-- 			<td><input type="text" id="editaDescripcionLarga"/></td> -->
			<td colspan="5"><textarea rows="3" cols="95%" id="editaDescripcionLarga" name="descripcionLarga"></textarea></td>
		</tr>
		<tr>
			<td colspan="5">&nbsp;</td>
			<td align="right"><img class="volverTipologia" /> <img class="limpiar"/> <img class="guardar" /></td>
		</tr>
	</table>
</form>

<!--  TABLA OCULTA DE LA CONSULTA SOBRE LAS TIPOLOGÍAS --> 

	<c:if test="${not empty listaBloques}">
		<div align="center">
			<display:table name="listaBloques" uid="bloques" pagesize="5"  requestURI="${context}/tipologia">
				<display:column style="width:12px;"> 
					<img class="eliminarBloque" id="eliminarBloque_${bloques.idBloque}" />
				</display:column>
				<display:column style="width:12px;">
					<img class="editarBloque" id="editarBloque_${bloques.idBloque}_${bloques.idPunto}" />
				</display:column>
				<display:column title="Bloque" sortable="true" style="width:400px;">
					<c:out value="${bloques.descripcionBloque}" />
					<input id="descripcion_${bloques.idBloque}_${bloques.idPunto}" type="hidden" value="${bloques.descripcionBloque}" />
					<input id="orden_${bloques.idBloque}_${bloques.idPunto}" type="hidden" value="${bloques.ordenBloque}" />
					<input id="tipo_${bloques.idBloque}_${bloques.idPunto}" type="hidden" value="${bloques.idTipo}" />
				</display:column>
				<display:column title="Punto" sortable="true">
					<c:out value="${bloques.descripcionCorta}" />
					<input id="descripcionLarga_${bloques.idBloque}_${bloques.idPunto}" type="hidden" value="${bloques.descripcionLarga}" />
					<input id="descripcionCorta_${bloques.idBloque}_${bloques.idPunto}" type="hidden" value="${bloques.descripcionCorta}" />
					<input id="ordenPunto_${bloques.idBloque}_${bloques.idPunto}" type="hidden" value="${bloques.ordenPunto}" />
					<input id="bloque_${bloques.idBloque}_${bloques.idPunto}" type="hidden" value="${bloques.idBloque}" />
				</display:column>
				<display:column style="width:12px;">
					<c:if test="${bloques.idPunto != null}">
						<img class="editarPunto" id="editarPunto_${bloques.idBloque}_${bloques.idPunto}" />
					</c:if>
				</display:column>
				<display:column style="width:12px;">
					<c:if test="${bloques.idPunto != null}">
						<img class="eliminarPunto" id="eliminarPunto_${bloques.idPunto}" />
					</c:if>
				</display:column>
			</display:table>
		</div>
	</c:if>
		
	
</body>
</html>