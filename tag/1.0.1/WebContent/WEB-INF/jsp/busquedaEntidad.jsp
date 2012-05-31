<%@page import="java.util.ArrayList"%>
<%@ include file="/WEB-INF/includes/taglibs.jsp"%>

<html>
	<head>
		<title>Busqueda de Entidad</title>
		<link href="<spring:url value="/estilos/displaytag.css"/>"
			rel="stylesheet" type="text/css">
		<script src="<spring:url value="/scripts/jquery.min.js"/>"></script>
		<script type="text/javascript">
			$(document).ready(function(){
				
				//Flechas del displaytag
				$('.primero').each(function () {
		    		this.title='Ir a la primera página';
		    		this.alt=this.title;
		    		this.src='<spring:url value="/imagenes/boton_primero.gif"/>';
		    	});
		    	$('.anterior').each(function () {
		            this.title='Ir a la página anterior';
		            this.alt=this.title;
		            this.src='<spring:url value="/imagenes/boton_anterior.gif"/>';
		        });
		    	$('.siguiente').each(function () {
		            this.title='Ir a la página siguiente';
		            this.alt=this.title;
		            this.src='<spring:url value="/imagenes/boton_siguiente.gif"/>';
		        });
		    	$('.ultimo').each(function () {
		            this.title='Ir a la última página';
		            this.alt=this.title;
		            this.src='<spring:url value="/imagenes/boton_ultimo.gif"/>';
		        });
				
				$('.buscarEntidad').each(function(){
					$(this).css('cursor','pointer');
					$(this).attr({
						src: '<spring:url value = "/imagenes/boton_buscar.png"/>',
						title: 'Buscar'
					});
					$(this).click(function(){
						$(this).parents('form').submit();
					});
				});
				
				$('#entidades .enviarId').each(function(){
					$(this).css('cursor', 'pointer');
					$(this).attr({
						src : '<spring:url value="/imagenes/boton_seleccionar.png"/>',
						title : 'Seleccionar'
					});
					$(this).click(function(){
						var id = $(this).attr('id').split('_')[1];
						var nombre = $(this).attr('id').split('_')[2];
						var cif = $(this).attr('id').split('_')[3];
						var nproveedor = window.opener.jQuery('#proveedor');
						var proveedor = window.opener.jQuery('#idEntidad');
						
						var contrato = window.opener.jQuery('#idContrato');
						var ncontrato = window.opener.jQuery('#contrato');
						contrato.val("");
						ncontrato.val("");
						
						nproveedor.val("("+cif+") - "+nombre);
						proveedor.val(id);
						window.close();
					});
				});
				
				$('.limpiar').each(function(){
					$(this).css('cursor','pointer');
					$(this).attr({
						src: '<spring:url value = "/imagenes/boton_limpiar.png"/>',
						title: 'Limpiar'
					});
					$(this).click(function(){
						var form = $(this).parents('form');
						$(':input:not([type="submit"]):not([type="hidden"])', form).val('');
					});
				});
				
				$('.volver').each(function(){
					$(this).css('cursor','pointer');
					$(this).attr({
						src: '<spring:url value="/imagenes/boton_volver22.png"/>',
						title : 'Cancelar'
					});
					$(this).click(function(){
						window.close();
					});
				});
				
				$("form input,select").keyup(function(event) {
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
		<form:form action="${context}/documentos/busquedaEntidad/buscar" commandName="busquedaEntidad">
			<input type="hidden" name="accion" value="buscar"/>
			<table width="100%" height="100%" style="background-color: #FFFBE6;">
				<tr>
					<td>
						<table style="width: 90%; border: 2px solid grey; background-color: white; font-size: 12px; font-family: verdana" 
								border="0" align="center" cellpadding="2" cellspacing="3">
							<tr>
								<th colspan="2" style="background-image: url('/Ciceron/imagenes/fondo_degradado_gris.png'); background-repeat: repeat-x;">Busqueda de Entidad</th>
							</tr>
							<tr>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td valign="middle">
									<table style="width: 100%; border: 2px solid grey; background-color: white; font-size: 12px; font-family: verdana" 
										border="0" align="center" cellpadding="2" cellspacing="3">
										<tr>
											<td>CIF: </td>
											<td width="50px">
												<form:input path="cif"/>
											</td>
											<td>Nombre: </td>
											<td>
												<form:input path="nombre"  style="width: 350px"/>
											</td>
										</tr>
										<tr align="right">
											<td colspan="4">
												<img class="volver">
												<img class="limpiar"/>
												<img class="buscarEntidad"/>
											</td>
										</tr>
									</table>
								</td>
							</tr>
							<c:if test="${!empty busquedaEntidad.accion}">
							<tr align="center">
								<td>
									<display:table name="listaEntidades" uid="entidades" pagesize="12" requestURI="${context}/documentos/busquedaEntidad/buscar"
			              							decorator="es.ise.ciceron.displaytag.decorators.ListaEntidadesDecorator">
										<display:column property="cif" value="CIF" sortable="true" style="width: 100px;"/>
										<display:column property="nombre" value="Nombre" sortable="true"/>
										<display:column class="acciones" style="width: 16px;">
											<img class="enviarId" id="id_${entidades.id}_${entidades.nombre}_${entidades.cif}"/>
										</display:column>
									</display:table>
								</td>
							</tr>
							</c:if>
						</table>
					</td>
				</tr>
			</table>
		</form:form>
	</body>
</html>