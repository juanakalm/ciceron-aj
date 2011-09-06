<%@ include file="/WEB-INF/includes/taglibs.jsp"%>

<html>
	<head>
		<title>Listados</title>
		<script>
			$(document).ready(function(){
				
				$('#solicitudes .pdf').each(function(){
					$(this).css('cursor', 'pointer');
					$(this).attr({
						src : '<spring:url value="/imagenes/boton_abrir.png"/>',
						title : 'Report'
					});
					$(this).click(function(){
						var id = $(this).attr('id').split('_')[1];
						window.open('<spring:url value = "/app/listados/parametros/"/>'+id, 'incorporardocumentos', 'status=yes,scrollbars=no,width=700,height=400,top=150,left=270');
					});
				});
				
				$('#solicitudes .excel').each(function(){
					$(this).css('cursor', 'pointer');
					$(this).attr({
						src : '<spring:url value="/imagenes/boton_abrir_excel.png"/>',
						title : 'Exportar a Excel'
					});
					$(this).click(function(){
						var id = $(this).attr('id').split('_')[1];
						location.href = '<spring:url value = "/app/excel/"/>'+id;
					});
				});
				
				$('.volverMenu').each(function() {
					$(this).css('cursor', 'pointer');
					$(this).attr({
						src : '<spring:url value="/imagenes/boton_volver22.png"/>',
						title : 'Volver sin guardar'
					});
					$(this).click(function() {
						var id = $(this).attr('id').split('_')[1];
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
		<div align="right">
				<img class="volverMenu">
		</div>
		<display:table name="listaSolicitudes" uid="solicitudes" pagesize="14" requestURI="${context}/listados">
			<display:column title="Listados" property="descripcion"/>
			<display:column title="pdf" style="width: 25px; text-align: center; " >
				<c:choose>
					<c:when test="${solicitudes.tipo == 1}">	
						<img class="pdf" id="pdf_${solicitudes.id}"/>
					</c:when>
				</c:choose>
			</display:column>	
			<display:column title="excel" style="width: 28px; text-align: center;">
				<c:choose>
					<c:when test="${solicitudes.tipo == 2}">	
						<img class="excel" id="excel_${solicitudes.id}"/>
					</c:when>
				</c:choose>
			</display:column>	
		</display:table>
	</body>
</html>