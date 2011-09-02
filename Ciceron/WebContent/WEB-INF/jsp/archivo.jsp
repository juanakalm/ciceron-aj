<%@page import="java.util.ArrayList"%>
<%@ include file="/WEB-INF/includes/taglibs.jsp"%>
<%
    response.setHeader("Cache-Control", "no-cache");
    response.setHeader("Pragma", "no-cache");
    response.setDateHeader("Expires", -1);
    response.setHeader("Cache-Control", "no-store"); //HTTP 1.1
%>

<html>
	<head>
		<title>Archivos</title>
		
<!-- 		<style type="text/css"> -->
<!-- 			table.displaytag tbody tr.hover { -->
<!-- 				background-color: #EFF5FB; -->
<!-- 				cursor: pointer; -->
<!-- 			} -->
<!-- 		</style> -->

		<style type="text/css">
			div.ui-datepicker{ 
 				font-size:12px; 
			} 
		</style>
		
		
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">	
			<link href="<spring:url value="/estilos/ui-lightness/jquery-ui-1.8.14.custom.css"/>"
				rel="stylesheet" type="text/css">
			<link href="<spring:url value="/estilos/displaytag.css"/>"
				rel="stylesheet" type="text/css">
		<script src="<spring:url value="/scripts/jquery.min.js"/>"></script>
		<script src="<spring:url value="/scripts/jquery-ui-1.8.14.custom.min.js"/>"></script>
		<script type="text/javascript" src="<spring:url value="/scripts/horaActual.js"/>"></script>
		
		<script type="text/javascript">
		
			
			//configuración para el calendario
		jQuery(function($){
	        $.datepicker.regional['es'] = {
	            closeText: 'Cerrar',
	            prevText: '&#x3c;Ant',
	            nextText: 'Sig&#x3e;',
	            currentText: 'Hoy',
	            monthNames: ['Enero','Febrero','Marzo','Abril','Mayo','Junio',
	            'Julio','Agosto','Septiembre','Octubre','Noviembre','Diciembre'],
	            monthNamesShort: ['Ene','Feb','Mar','Abr','May','Jun',
	            'Jul','Ago','Sep','Oct','Nov','Dic'],
	            dayNames: ['Domingo','Lunes','Martes','Mi&eacute;rcoles','Jueves','Viernes','S&aacute;bado'],
	            dayNamesShort: ['Dom','Lun','Mar','Mi&eacute;','Juv','Vie','S&aacute;b'],
	            dayNamesMin: ['Do','Lu','Ma','Mi','Ju','Vi','S&aacute;'],
	            weekHeader: 'Sm',
	            dateFormat: 'dd/mm/yy',
	            firstDay: 1,
	            isRTL: false,
	            showMonthAfterYear: false,
	            showOn: "button",
	            buttonImageOnly: true,
	            buttonImage: '<spring:url value="/imagenes/boton_calendar.png"/>',
	            yearSuffix: ''};
	        $.datepicker.setDefaults($.datepicker.regional['es']);
	    });
			
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
	    	
			
			$( "#datepicker" ).datepicker({
				showButtonPanel: true
			});

			$('table.displaytag tr').hover(function() {
				$(this).addClass('hover');
			}, function() {
				$(this).removeClass('hover');
			});
			
			$(".subirArchivo").each(function(){
				$(this).css('cursor', 'pointer');
				$(this).attr({
					src : '<spring:url value="/imagenes/boton_guardar.png"/>',
					title : 'Guardar'
				});
				$(this).click(function() {
					if($("#descripcion").val()!= ""){
						if($("#file").val()!= ""){
							$(this).parents('form').submit();
						}else
							alert("Seleccione un documento");
					}else
						alert("El campo descripción no puede estar vacio");
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
							<th colspan="2" style="background-image: url('/Ciceron/imagenes/fondo_degradado_gris.png'); background-repeat: repeat-x;">Archivo</th>
						</tr>
						<tr>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td valign="middle">
								<table style="width: 100%; border: 2px solid grey; background-color: white; font-size: 11px; font-family: verdana;" 
									border="0" align="center" cellpadding="2" cellspacing="3">
									<tr>
										<td align="center">
											<form action="${context}/archivo/subir/${idESDocumento}" method="POST" enctype="multipart/form-data">
												<input type="hidden" name="id" class="id"/>
												<table style="font-size:12px; font-family: verdana;">	
													<tr>
														<td>Descripción: </td>
														<td colspan="3">
															<input type="text" name="descripcion" size="70" id="descripcion"/>
														</td>
													</tr>
													<tr>
														<td>Tipo: </td>
														<td>
															<input type="radio" name="tipo" class="tipo tipoE" value="E"/>Entrada
															<input type="radio" name="tipo" class="tipo tipoS" value="S"/>Salida
														</td>
														<td>Fecha: </td>
														<td>
															<input type="text" id="datepicker" class="fecha" style="width: 135px;" name="fecha">
														</td>
													</tr>
													<tr>
														<td>&nbsp;</td>
													</tr>
													<tr>
														<td>Nuevo documento:</td>
														<td> 
															<input type="file" name="file" id="file"/>
														</td>
														<td width="15px">&nbsp;</td>
														<td align="right">
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
								<display:table name="listaArchivos" uid="archivos" style="width: 100%;" pagesize="5" requestURI="${context}/archivo/${idESDocumento}"
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
									<display:column property="nombre" title="Documento"/>
									<display:column property="descripcion" title="Descripción Tarea"/>
									<display:column property="fecha" title="Fecha" decorator="es.ise.ciceron.displaytag.decorators.ShortDateDecorator"/>
									<display:column title="E" style="width: 16px; text-align: center;">
										<c:choose>
											<c:when test="${archivos.tipo == 'E'}">
												<img src="<spring:url value="/imagenes/boton_tick.png"/>"/>
											</c:when>
										</c:choose>
									</display:column>
									<display:column title="S" style="width: 16px; text-align: center;">
										<c:choose>
											<c:when test="${archivos.tipo == 'S'}">
												<img src="<spring:url value="/imagenes/boton_tick.png"/>"/>
											</c:when>
										</c:choose>
									</display:column>
									<display:column property="uCreacion" title="Creador" style="text-align: center;"/>
									<display:column property="fCreacion" title="Fecha Creación" decorator="es.ise.ciceron.displaytag.decorators.ShortDateDecorator"/>
									<display:column class="acciones" style="width: 16px; text-align: center;">
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