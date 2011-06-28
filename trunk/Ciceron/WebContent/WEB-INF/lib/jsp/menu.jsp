<%@ include file="/WEB-INF/includes/taglibs.jsp"  %>

<html>
	<head>
		<title>	Menus </title>
		<script>
		$(document).ready(function() {
			$('#tablaMenus tbody tr').hover(function() {
				$(this).css('background-color','#FFFFFF');
			}, function() {
				$(this).css('background-color','');
			});
		});
		</script>
	</head>
	<body>
		<div align="center">
			<table id="tablaMenus">
				<thead>
					<tr>
						<th align="center" colspan="2">Menus</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="menus"	items="${listaMenus}" >
					<tr>
						 <td style="width: 40px;">
						 	
						 </td>
						 <td>
			    			<a href="<spring:url value="/app/${menus.ejecutableMenu}"/>"><c:out value="${menus.descripcionMenu}" /></a>
						 </td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			<br>
		</div>	
	</body>
</html>

