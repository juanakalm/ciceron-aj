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
	<link href="<spring:url value="/estilos/ui-lightness/jquery-ui-1.8.12.custom.css"/>"
	rel="stylesheet" type="text/css">
<script src="<spring:url value="/scripts/jquery.min.js"/>"></script>
<script src="<spring:url value="/scripts/jquery-ui-1.8.12.custom.min.js"/>"></script>
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
		
		$('.guardar').each(function() {
			$(this).css('cursor', 'pointer');
			$(this).attr({
				src : '<spring:url value="/imagenes/boton_guardar.png"/>',
				title : 'Guardar'
			});
			$(this).click(function() {
				$(this).parents('form').submit();
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
		
		$('table.displaytag tr').hover(function() {
			$(this).addClass('hover');
		}, function() {
			$(this).removeClass('hover');
		});
	});
		
</script>
<decorator:head />
</head>
<body leftmargin="0" topmargin="0" rightmargin="0" bottommargin="0">
<center>
	<div class="contenedor">
	<div class="cabecera" >
		<table width="1000px" height="150px">
			<tr>
				<td >&nbsp;</td>
			</tr>
			<tr>
				<td >&nbsp;</td>
			</tr>
			<tr>
				<td style="width: 630px">&nbsp;</td>
				<td>
					<table style="border: white 2px solid; font-size: 11px; width: 200px" align="left">
						<tr>
			
							<td><script
								type="text/javascript">MostrarFechaActual();</script>
							</td>
							<td align="right"> <img class="salir"/>
							</td>
						</tr>
						<tr>
							<td colspan="2">
								<c:out value="${sessionScope.usuario.nombre}"/>
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</div>
	<br/>
	<div>
	<decorator:body />
	</div>
	<br/>
	<div class="pie" align="center">
		<div class="piedatos">
			C/ Judería 1. Edificio Vega del Rey 1<br> 
			41900 - Camas -	Sevilla | Tlf.: 955 625 600
		</div>
	</div>
	</div>
	</center>
</body>

</html>