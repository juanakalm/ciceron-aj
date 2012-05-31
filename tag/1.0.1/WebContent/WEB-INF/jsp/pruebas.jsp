
	<style>
		.prueba1 td{
			border: 1px solid black;
			border-collapse: collapse;
			font-family: Verdana;
		}
	</style>
		
		
		
	<div style="width: 1000px; background-color: #FFDD33">
		<table style="color:#B404AE; font-weight: bold;" class="prueba1" style="width:100%;">
			<tr>
				<td rowspan="5" width="120px">
					<img src="<spring:url value='/imagenes/logo-Junta-de-Andalucia.jpg'/>"/>
				</td>
				<td colspan="2" style="font-size: 5px;">
					&nbsp;
				</td>
				<td rowspan="5" width="120px">
					<img src="<spring:url value='/imagenes/logo-Junta-de-Andalucia.jpg'/>"/>
				</td>
			</tr>
			<tr>
				<td colspan="2" style=" font-size: 40px;">
					Cicerón
				</td>
			</tr>
			<tr>
				<td colspan="2" style="font-size: 5px;">
					&nbsp;
				</td>
			</tr>
			<tr>
				<td>
					Asesoría Jurídica
				</td>
				<td rowspan="2">
					<table style="border: white 2px solid; font-size: 11px; width: 200px" align="right">
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
			<tr>
				<td>
					Junta de Andalucía
				</td>
				
			</tr>
		</table>
	</div>