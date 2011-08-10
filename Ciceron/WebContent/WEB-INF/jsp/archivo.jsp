<%@page import="java.util.ArrayList"%>
<%@ include file="/WEB-INF/includes/taglibs.jsp"%>

<html>
	<head>
		<title>Archivos</title>
		
<!-- 		<style type="text/css"> -->
<!-- 			table.displaytag tbody tr.hover { -->
<!-- 				background-color: #EFF5FB; -->
<!-- 				cursor: pointer; -->
<!-- 			} -->
<!-- 		</style> -->

		<link href="<spring:url value="/estilos/displaytag.css"/>"
			rel="stylesheet" type="text/css">
		<script src="<spring:url value="/scripts/jquery.min.js"/>"></script>
		<script type="text/javascript">
		$(document).ready(function(){
			
			$('table.displaytag tr').hover(function() {
				$(this).addClass('hover');
			}, function() {
				$(this).removeClass('hover');
			});
			
			$(".subirArchivo").each(function(){
				$(this).css('cursor', 'pointer');
				$(this).attr({
					src : '<spring:url value="/imagenes/boton_update.png"/>',
					title : 'Guardar'
				});
				$(this).click(function() {
					$(this).parents('form').submit();
				});
			});
			
// 			$('table.displaytag tbody tr').hover(function() {
//				$(this).addClass('hover');
//			}, function() {
//				$(this).removeClass('hover');
//			}).click(function() {
//				alert("hola");
//			});

			$('#archivos tbody tr td:not(.acciones)').click(function(){
				var id = $(this).parent().attr('id').split('_')[1];
				url = '<spring:url value = "/app/archivo/abrir/"/>'+id;
				window.open(url,'_blank','toolbar=0,location=0,directories=0,status=1,menubar=1,scrollbars=1,resizable=1,top=5,left=0,width='+(screen.width-10)+',height='+(screen.height-120));
			});
			
			$('#archivos .eliminarArchivo').each(function(){
				$(this).css('cursor', 'pointer');
				$(this).attr({
					src : '<spring:url value="/imagenes/boton_eliminar.png"/>',
					title : 'Eliminar'
				});
				$(this).click(function(){
					var id = $(this).attr('id').split('_')[1];
					if (confirm('¿Desea realmente eliminar este Archivo?')) {
						var url = '<spring:url value = "/app/archivo/eliminar/"/>'+id;
						location.href = url;
					}
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
				<td>
					<table style="width: 90%; border: 2px solid grey; background-color: white; font-size: 12px; font-family: verdana" 
							border="0" align="center" cellpadding="2" cellspacing="3">
						<tr>
							<th colspan="2" style="background-image: url('/Ciceron/imagenes/fondo_degradado_gris.png'); background-repeat: repeat-x;">Archivos</th>
						</tr>
						<tr>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td valign="middle">
								<table style="width: 100%; border: 2px solid grey; background-color: white; font-size: 12px; font-family: verdana" 
									border="0" align="center" cellpadding="2" cellspacing="3">
									<tr>
										<td align="center">
											<form action="${context}/archivo/subir/${idESDocumento}" method="POST" enctype="multipart/form-data">
												<input type="hidden" name="id" class="id"/>
												<table>	
													<tr>
														<td>Nuevo documento:</td>
														<td> 
															<input type="file" name="file" id="file"/>
														</td>
														<td width="15px">&nbsp;</td>
														<td>
															<img class="subirArchivo" >
														</td>
													</tr>				
												</table>
											</form>	
										</td>
									</tr>
								</table>
							</td>
						</tr>
						<tr align="center">
							<td>
								<display:table name="listaArchivos" uid="archivos" style="width: 70%;" 
								decorator="es.ise.ciceron.displaytag.decorators.ListaArchivosDecorator">
									<display:column style="width: 34px;">
										<c:choose>
											<c:when test="${archivos.extension == 'pdf'}">	
												<img src="<spring:url value="/imagenes/icono_pdf.png"/>" />
											</c:when>
											<c:when test="${archivos.extension == 'PDF'}">	
												<img src="<spring:url value="/imagenes/icono_pdf.png"/>" />
											</c:when>
											<c:when test="${archivos.extension == 'doc'}">
												<img src="<spring:url value="/imagenes/boton_docx.png"/>"/>
											</c:when>
											<c:when test="${archivos.extension == 'docx'}">
												<img src="<spring:url value="/imagenes/icono_docx.png"/>"/>
											</c:when>
											<c:when test="${archivos.extension == 'zip'}">
												<img src="<spring:url value="/imagenes/icono_zip.png"/>"/>
											</c:when>
											<c:when test="${archivos.extension == 'rar'}">
												<img src="<spring:url value="/imagenes/icono_rar.png"/>"/>
											</c:when>
											<c:when test="${archivos.extension == 'xls'}">
												<img src="<spring:url value="/imagenes/icono_xlsx.png"/>"/>
											</c:when>
											<c:when test="${archivos.extension == 'xlsx'}">
												<img src="<spring:url value="/imagenes/icono_xlsx.png"/>"/>
											</c:when>
											<c:when test="${archivos.extension == 'jpg'}">
												<img src="<spring:url value="/imagenes/icono_jpg.png"/>" />
											</c:when>
											<c:otherwise>
												<img src="<spring:url value="/imagenes/icono_text.png"/>"/>
											</c:otherwise>
										</c:choose>
									</display:column>
									<display:column property="nombre" title="Documento" style="width: 260px;"/>
									<display:column property="uCreacion" title="Creador" style="text-align: center;"/>
									<display:column property="fCreacion" title="Fecha" decorator="es.ise.ciceron.displaytag.decorators.ShortDateDecorator"/>
									<display:column class="acciones">
										<img class="eliminarArchivo" id="borrarArchivo_${archivos.id}"/>
									</display:column>
								</display:table>
							</td>
						</tr>
					</table>
				</td>
			</tr>
			
		</table>
	</body>
</html>