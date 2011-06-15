<%@ include file="/WEB-INF/includes/taglibs.jsp"%>

<html>
	<head>
		<title>Informes Jurídicos</title>
		<script type="text/javascript">
		$(document).ready(function() {
			
			$('#sustituirInforme').hide();
			
			$('.tabla_busqueda .tipologia').change(function() {
				if($(this).val() != '') {
					$('.tabla_busqueda .bloque').daoSelect({
						url: '<spring:url value="/app/ajax/daolist/Bloque/idTipologia/"/>'+$(this).val(),
						blank: '-- Seleccione bloque',
						list: 'bloqueList',
						label: 'descripcion',
						value: 'id',
						finish: function() {
							$('.tabla_busqueda .bloque').change();
						}
					});
				} else {
					$('.tabla_busqueda .bloque option:not(:first)').remove();
					$('.tabla_busqueda .punto option:not(:first)').remove();
					$('.texto').val('');
					$('.descripcionPunto').val('');
					$('.ordenPunto').val('');
					$('.id').val('');
				}
			});
			
			$('.tabla_busqueda .bloque').change(function() {
				if($(this).val() != '') {
					$('.tabla_busqueda .punto').daoSelect({
						url: '<spring:url value="/app/ajax/daolist/Punto/idBloque/"/>'+$(this).val(),
						blank: '-- Seleccione punto',
						list: 'puntoList',
						label: 'descripcionCorta',
						value: 'id',
						finish: function() {
							$('.tabla_busqueda .punto').change();
						}
					});
				} else {
					$('.tabla_busqueda .punto option:not(:first)').remove();
					$('.texto').val('');
					$('.descripcionPunto').val('');
					$('.ordenPunto').val('');
					$('.id').val('');
				}
			});
			
			$('.tabla_busqueda .punto').change(function() {
				if($(this).val() != '') {
					var url = '<spring:url value="/app/ajax/dao/Punto/"/>'+$(this).val();
					$.getJSON(url, function(data) {
						$('.texto').val(data.punto.descripcionLarga);
						$('.descripcionPunto').val(data.punto.descripcionCorta);
						$('.ordenPunto').val(data.punto.orden);
					});
				} else {
					$('.texto').val('');
					$('.descripcionPunto').val('');
					$('.ordenPunto').val('');
					$('.id').val('');
				}
			});

			$('#informes tbody tr td:not(.acciones)').click(function() {
				var id = $(this).parent().attr('id').split('_')[1];
				alert(id);
				var url = '<spring:url value="/app/ajax/dao/PuntosEditados/idTextoInforme/"/>'+id;
				$.getJSON(url, function(data) {
					$('.id').val(data.puntosEditados.idTextoInforme);
					$('.tipologia').val(data.puntosEditados.idTipologia);
					$('.tabla_busqueda .bloque').daoSelect({
						url: '<spring:url value="/app/ajax/daolist/Bloque/idTipologia/"/>'+data.puntosEditados.idTipologia,
						blank: '-- Seleccione bloque',
						list: 'bloqueList',
						label: 'descripcion',
						value: 'id',
						selected: data.puntosEditados.idBloque
					});
					$('.tabla_busqueda .punto').daoSelect({
						url: '<spring:url value="/app/ajax/daolist/Punto/idBloque/"/>'+data.puntosEditados.idBloque,
						blank: '-- Seleccione punto',
						list: 'puntoList',
						label: 'descripcionCorta',
						value: 'id',
						selected: data.puntosEditados.idPunto
					});
					$('.descripcionPunto').val(data.puntosEditados.descripcion);
					$('.ordenPunto').val(data.puntosEditados.ordenPunto);
					$('.texto').val(data.puntosEditados.texto);
				});
				alert(url);
				$("#tabla_elabora_informe th").text('Modificar informe');
				$('#tabla_elabora_informe').show();
			});
			
			$('.tabla_busqueda .tipologia').change();
			
			$('#nuevo').click(function(){
				$('.limpiar').click();
				$('.tabla_busqueda .tipologia').change();
				$("#tabla_elabora_informe th").text('Elaborar informe');
				$('#tabla_elabora_informe').show();
			});
			
			$('#informes img.eliminarLineaInforme').each(function() {
				$(this).css('cursor', 'pointer');
				$(this).attr({
					src : '<spring:url value="/imagenes/boton_eliminar.png"/>',
					title : 'Eliminar'
				});
				$(this).click(function() {
					var id = $(this).attr('id').split('_')[1];
					if (confirm('¿Desea realmente eliminar este bloque y todos sus puntos?')) {
						location.href = '<spring:url value = "/app/informes/elaborarInforme/eliminar/"/>'+id;
					}
				});
			});
			
			$('.volverElaborarInforme').each(function() {
				$(this).css('cursor', 'pointer');
				$(this).attr({
					src : '<spring:url value="/imagenes/boton_atras.png"/>',
					title : 'Volver sin guardar'
				});
				$(this).click(function() {
					var id = $(this).attr('id').split('_')[1];
					location.href = '<spring:url value="/app/informes/elaborarInforme/${informe.idExpediente}/"/>';
				});
			});
			
			$('#borrador').each(function(){
				$(this).css('cursor','pointer');
				$(this).attr({
					title : 'Generar borrador'
				});
				$(this).click(function(){
					var url = '<spring:url value="/app/informes/elaborarInforme/generarBorrador/${informe.id}/"/>';
					showPdf(url);
				});
			});
			
			$('#report').each(function(){
				$(this).css('cursor','pointer');
				$(this).attr({
					title : 'Generar report'
				});
				$(this).click(function(){
					var url = '<spring:url value="/app/informes/elaborarInforme/generarReport/${informe.id}/"/>';
					location.href= url ;
				});
			});
			
			$('#visualizar').each(function(){
				$(this).css('cursor','pointer');
				$(this).attr({
					title : 'Ver documento'
			});
				$(this).click(function(){
					var url = '<spring:url value="/app/informes/elaborarInforme/visualizar/${informe.idDocumento}/"/>';
					showPdf(url);
					alert(url);
				});
			});
			
			$('#sustituir').each(function(){
				$(this).css('cursor','pointer');
				$(this).attr({
					title : 'Sustituir documento'
				});
				$(this).click(function(){
					$('#sustituirInforme').show();
				});
			});
			
			$('#enviar').each(function(){
				$(this).css('cursor','pointer');
				$(this).attr({
					title : 'Enviar a Portafirma'
				});
				$(this).click(function(){
					
				});
			});
			
		});
		</script>
	</head>
	<body>
	<c:set var="context">
		<spring:url value="/app" />
	</c:set>
		<div>
			<table class="tabla_busqueda">
				<thead>
					<tr>
						<th colspan="2">
							Informes
						</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td align="right">
							<img class="volver">
							<button id="nuevo"> Nuevo</button>
						</td>
					</tr>
				</tbody>
			</table>
		</div>
		<br>
		<div>
		<form action="${context}/informes/elaborarInforme/guardar" method="POST">
			<input type="hidden" name="id" class="id" />
			<input type="hidden" name="idInforme" value="${informe.id}"/>
			<table class="tabla_busqueda" id="tabla_elabora_informe" style="display: none;">
				<thead>
					<tr>
						<th colspan="13">
							Elaborar informe
						</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td width="10px">&nbsp;</td>
						<td width="80px" align="right">
							Tipología:
						</td>
						<td width="10px">&nbsp;</td>
						<td width="100px">
							<select class="tipologia">
								<option value="">-- Seleccione tipología</option>
								<c:forEach var="tipologia" items="${tipologias}">
								<option value="${tipologia.id}">${tipologia.descripcion}</option>
								</c:forEach>	
							</select>
						</td>
						<td width="20px">&nbsp;</td>
						<td width="80px" align="right">
							Bloque:
						</td>
						<td width="10px">&nbsp;</td>
						<td width="100px">
							<select class="bloque">
								<option value="">-- Seleccione bloque</option>
							</select>
						</td>
						<td width="20px">&nbsp;</td>
						<td width="80px" align="right">
							Punto:
						</td>
						<td width="10px">&nbsp;</td>
						<td width="100px">
							<select class="punto" name="idPunto" style="width: 200px;">
								<option value="">-- Seleccione punto</option>
							</select>
						</td>
						<td width="10px">&nbsp;</td>
					</tr>
					<tr>
						<td>&nbsp;</td>
						<td align="right">
							Detalle: 
						</td>
						<td>&nbsp;</td>
						<td colspan="5" rowspan="5">
							<textarea name="texto" rows="6" cols="60" class="texto"></textarea>
						</td>
						<td>&nbsp;</td>
						<td align="right">
							Nombre: 
						</td>
						<td>&nbsp;</td>
						<td rowspan="2">
							<textarea rows="2" cols="25" class="descripcionPunto" name="descripcionPunto"></textarea>
						</td>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<td colspan="10" align="right">Orden:</td>
						<td>&nbsp;</td>
						<td>
							<textarea rows="1" class="ordenPunto" name="ordenPunto" style="width: 80px"></textarea>
					</tr>
					
					<tr>
						<td colspan="12" align="right">
							<img class="volverElaborarInforme"/> <img class="limpiar"/> <img class="guardar"> 
						</td>
					</tr>
										
				</tbody>
			</table>
		</form>
		</div>
<!-- TABLA OCULTA DE LA CONSULTA SOBRE LOS PUNTOS DEL INFORME -->
		<div>
			<display:table name="listaPuntosInforme" uid="informes" pagesize="4" requestURI="${context}/informes/elaborarInforme/${informe.idExpediente}"
							decorator="es.ise.ciceron.displaytag.decorators.ListaPuntosInformeDecorator">>
				<display:column property="descripcionTipologia" title="Tipología" sortable="true"/>
				<display:column property="descripcionBloque" title="Bloque" sortable="true"/>
				<display:column property="descripcionPunto" title="Punto" sortable="true"/>
				<display:column property="descripcion" title="Nombre del punto" sortable="true"/>
				<display:column property="ordenPunto" title="Orden del punto" sortable="true" style="width: 120px"/>
				<display:column style="width:12px;" class="acciones">
						<img class="eliminarLineaInforme" id="eliminarLinea_${informes.idTextoInforme}" />
				</display:column>
				<display:caption style="color: purple">Puntos del informe</display:caption>
			</display:table>		
		</div>
		<br>
		<div>
			<table class="tabla_busqueda">
				<thead>
					<tr>
						<th colspan="2">
							Informe
							<c:choose>
								<c:when test="${estado=='NO_GENERADO'}">no generado</c:when>
								<c:when test="${estado=='PENDIENTE_ENVIO'}">pendiente de envio a Portafirma</c:when>
								<c:when test="${estado=='ENVIADO'}">enviado a portafirma</c:when>
								<c:when test="${estado=='FIRMADO'}">firmado</c:when>
								<c:when test="${estado=='DEVUELTO'}">devuelto</c:when>
							</c:choose>
						</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td align="right">
							<c:choose>
								<c:when test="${estado=='NO_GENERADO'}">
									<button id="borrador">Borrador</button>
									<button id="report">Generar</button>
								</c:when>
								<c:when test="${estado=='PENDIENTE_ENVIO'}">
									<button id="visualizar">Visualizar</button>
									<button id="sustituir">Sustituir</button>
									<button id="enviar">Enviar a P.F.</button>
									<button id="eliminar">Eliminar</button>
								</c:when>
								<c:when test="${estado=='ENVIADO'}">
									<button id="visualizar">Visualizar</button>
								</c:when>
								<c:when test="${estado=='FIRMADO'}">
									<button id="visualizar">Visualizar</button>
								</c:when>
								<c:when test="${estado=='DEVUELTO'}">
									<button id="visualizar">Visualizar</button>
									<button id="eliminar">Eliminar</button>
								</c:when>
							</c:choose>
						</td>
					</tr>
				</tbody>
			</table>
		</div>
 <!-- Sustuir informe -->
        <div id="sustituirInforme" title="Sustituir Informe" >
             <form action="${context}/informes/elaborarInforme/sustituir/${informe.id}" method="post" enctype="multipart/form-data">
                <table style="border: 0px;">
                    <tbody>
                        <tr>
                            <td>Nuevo archivo:</td>
                            <td>
                                <input type="file" name="fichero"/>
                            </td>
                            <td width="15px">&nbsp;</td>
                            <td>
                            	<img class="guardar"/>
                            </td>
                        </tr>
                        <tr>
		 					<td align="center" colspan="4" style="color:red">
			 					<c:if test="${not empty mensaje}">
			 						<c:out value="${mensaje}"/>
			 					</c:if>
			 				</td>
		 				</tr>
                    </tbody>
                 </table>
             </form>
             <br/>
        </div>
	</body>
</html>