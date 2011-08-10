<%@page import="java.util.ArrayList"%>
<%@ include file="/WEB-INF/includes/taglibs.jsp"%>

<html>
	<head>
		<title>Busqueda de Contrato</title>
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
		    	
		    	$('.buscarContrato').each(function(){
					$(this).css('cursor','pointer');
					$(this).attr({
						src: '<spring:url value = "/imagenes/boton_buscar.png"/>',
						title: 'Buscar'
					});
					$(this).click(function(){
						$(this).parents('form').submit();
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
				
				$('#contratos .enviarId').each(function(){
					$(this).css('cursor', 'pointer');
					$(this).attr({
						src : '<spring:url value="/imagenes/boton_seleccionar.png"/>',
						title : 'Seleccionar'
					});
					$(this).click(function(){
						var idContrato = $(this).attr('id').split('_')[1];
						var codigo = $(this).attr('id').split('_')[2];
						var descripcion = $(this).attr('id').split('_')[3];
						var idEntidad = $(this).attr('id').split('_')[4];
						var cif = $(this).attr('id').split('_')[5];
						var nombre = $(this).attr('id').split('_')[6];
						var contrato = window.opener.jQuery('#idContrato');
						var ncontrato = window.opener.jQuery('#contrato');
						var nproveedor = window.opener.jQuery('#proveedor');
						var proveedor = window.opener.jQuery('#idEntidad');
						ncontrato.val ("("+codigo+") - "+descripcion);
						contrato.val(idContrato);
						nproveedor.val("("+cif+") - "+nombre);
						proveedor.val(idEntidad);
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
		<form:form action="${context}/documentos/busquedaContrato/buscar" commandName="busquedaContrato">
			<input type="hidden" name="accion" value="buscar"/>
			<table width="100%" height="100%" style="background-color: #FFFBE6;">
				<tr>
					<td>
						<table style="width: 90%; border: 2px solid grey; background-color: white; font-size: 12px; font-family: verdana" 
								border="0" align="center" cellpadding="2" cellspacing="3">
							<tr>
								<th colspan="2" style="background-image: url('/Ciceron/imagenes/fondo_degradado_gris.png'); background-repeat: repeat-x;">Busqueda de Contrato</th>
							</tr>
							<tr>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td valign="middle">
									<table style="width: 100%; border: 2px solid grey; background-color: white; font-size: 12px; font-family: verdana" 
										border="0" align="center" cellpadding="2" cellspacing="3">
										<tr>
											<td width="50px">Secuencia: </td>
											<td>
												<form:input path="secuencia"/>
											</td>
											<td>Código: </td>
											<td>
												<form:input path="codigo"  />
											</td>
										</tr>
										<tr>
											<td>Descripción: </td>
											<td colspan="3" >
												<form:input path="descripcion" style="width: 486px;"/>
											</td>
										</tr>
										<tr align="right">
											<td colspan="4">
												<img class="volver">
												<img class="limpiar"/>
												<img class="buscarContrato"/>
											</td>
										</tr>
									</table>
								</td>
							</tr>
							<c:if test="${!empty busquedaContrato.accion}">
							<tr align="center">
								<td>
									<display:table name="listaContratos" uid="contratos" pagesize="10" requestURI="${context}/documentos/busquedaContrato/buscar">
										<display:column property="codigo" value="Expediente" sortable="true"/>
										<display:column property="descripcion" value="Descripción" sortable="true" maxLength="25"/>
										<display:column property="cif" value="CIF" sortable="true" />
										<display:column property="nombre" value="Proveedor" sortable="true" maxLength="15" style="width: 130px "/>
										<display:column class="acciones" style="width: 16px;">
											<img class="enviarId" id="id_${contratos.idContrato}_${contratos.codigo}_${contratos.descripcion}_${contratos.idEntidad}_${contratos.cif}_${contratos.nombre}"/>
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