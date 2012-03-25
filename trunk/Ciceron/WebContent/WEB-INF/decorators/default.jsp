<%@ include file="/WEB-INF/includes/taglibs.jsp"%>
<%
    response.setHeader("Cache-Control", "no-cache");
    response.setHeader("Pragma", "no-cache");
    response.setDateHeader("Expires", -1);
    response.setHeader("Cache-Control", "no-store"); //HTTP 1.1
%>
<html>
<head>
<title>Ciceron - <decorator:title />
</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link href="<spring:url value="/estilos/principal.css"/>"
		rel="stylesheet" type="text/css">
	<link href="<spring:url value="/estilos/displaytag.css"/>"
		rel="stylesheet" type="text/css">
	<link href="<spring:url value="/estilos/ui-lightness/jquery-ui-1.8.14.custom.css"/>"
		rel="stylesheet" type="text/css">
<script src="<spring:url value="/scripts/jquery.min.js"/>"></script>
<script src="<spring:url value="/scripts/jquery-ui-1.8.14.custom.min.js"/>"></script>
<script type="text/javascript" src="<spring:url value="/scripts/horaActual.js"/>"></script>
<script>
	$.fn.extend({
		"daoSelect": function(params) {
    		var $this = $(this);
    		$this.html("<option value=''>Cargando...</option>");
    		$.getJSON(params.url,
    			function(data) {
    				$this.html("");
    				if(params.blank) {
    					$this.append("<option value=''>"+params.blank+"</option>");
    				}
    				var elems = data[params.list];
    				for(var i=0; i < elems.length; i++) {
    					var value = (typeof params.value == 'function') ? params.value(elems[i], i) : elems[i][params.value];
    					var label = (typeof params.label == 'function') ? params.label(elems[i], i) : elems[i][params.label];
    					if(params.selected && value==params.selected) {
    						$this.append("<option value='"+value+"' selected='selected'>"+label+"</option>");
    					} else {
    						$this.append("<option value='"+value+"'>"+label+"</option>");
    					}
    				}
    				if(params.finish && typeof params.finish == 'function') {
    					params.finish();
    				}
    				$this.trigger('reload');
    			}
    		);
    	}
	});
	
	function showPdf(url) {
     	window.open(url,'_blank','toolbar=0,location=0,directories=0,status=1,menubar=1,scrollbars=1,resizable=1,top=5,left=0,width='+(screen.width-10)+',height='+(screen.height-120));
	}; 	
	
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
	
	$(document).ready(function() {
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
		
// 		$('.guardar').each(function() {
// 			$(this).css('cursor', 'pointer');
// 			$(this).attr({
// 				src : '<spring:url value="/imagenes/boton_guardar.png"/>',
// 				title : 'Guardar'
// 			});
// 			$(this).click(function() {
// 				$(this).parents('form').submit();
// 			});
// 		});
		
		$('.volver').each(function() {
			$(this).css('cursor', 'pointer');
			$(this).attr({
				src : '<spring:url value="/imagenes/boton_volver22.png"/>',
				title : 'Volver'
			});
			$(this).click(function() {
				history.back();
			});
		});

		$('.entrar').each(function() {
			$(this).css('cursor', 'pointer');
			$(this).attr({
				src : '<spring:url value="/imagenes/enter.png"/>',
				title : 'Entrar'
			});
			$(this).click(function() {
				$(this).parents('form').submit();
			});
		});
		
		$('.salir').each(function(){
			$(this).css('cursor','pointer');
			$(this).attr({
				src : '<spring:url value="/imagenes/salir.gif"/>',
				title : 'Cerrar sesión'
			});
			$(this).click(function(){
				location.href='<spring:url value="/app/salir/"/>';
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
		
		$('table.displaytag tr').hover(function() {
			$(this).addClass('hover');
		}, function() {
			$(this).removeClass('hover');
		});
		
		$('.buscar').each(function(){
			$(this).css('cursor','pointer');
			$(this).attr({
				src: '<spring:url value = "/imagenes/boton_buscar.png"/>',
				title: 'Buscar'
			});
			$(this).click(function(){
				$(this).parents('form').submit();
			});
		});
		
		$('.volverMenu').each(function() {
			$(this).css('cursor', 'pointer');
			$(this).attr({
				src : '<spring:url value="/imagenes/boton_volver22.png"/>',
				title : 'Volver'
			});
			$(this).click(function() {
				location.href = '<spring:url value="/app/menu"/>';
			});
		});
		
	});
		
</script>
<decorator:head />
</head>
<body leftmargin="0" topmargin="0" rightmargin="0" bottommargin="0">
<center>
	<div class="contenedor" id="wrapper">
		<div class="cabecera" >
			<table width="1000px" height="150px">
				<tr>
					<td >&nbsp;</td>
				</tr>
				<tr>
					<td >&nbsp;</td>
				</tr>
				<tr>
					<td style="width: 615px">&nbsp;</td>
					<td>
						<table style="font-size: 11px; width: 235px; " align="left">
							<tr>
								<td style="padding-left: 5px;">
									<c:out value="${sessionScope.usuario.nombre}"/>
								</td>
								<td align="right" > 
									<img class="salir"/>
								</td>
							</tr>
							<tr>
								<td colspan="2" style="padding-left: 5px;">
									<script	type="text/javascript">
										MostrarFechaActual();
									</script>
								</td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
		</div>
		<br/>
		<div class="wrapper">
			<decorator:body />
		</div>
		<br/>
	</div>
	<div class="pie" align="center">
		<div class="piedatos">
			C/ Judería 1. Edificio Vega del Rey 1<br> 
			41900 - Camas -	Sevilla | Tlf.: 955 625 600
		</div>
	</div>
	</center>
</body>

</html>