<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<a href="#"><strong><i class="glyphicon glyphicon-list"></i>
		Listado de Ventas</strong></a>
<hr>


<div>
	<h4>Listado de Ventas</h4>
	<table id="table_conf" class="table">
		<tr>
			<th>Codigo</th>
			<th>Fecha</th>
			<th>Total</th>
			<th>Portal</th>
			<th>Coodenadas Cliente</th>
			<th>Orden de Despacho</th>
			<th>Estado Orden</th>
			<th>Detalles</th>
		</tr>
		<tbody id="tbody_conf">
			<tr>
				<c:forEach var="venta" items="${actual}">
					<tr>
						<td>${venta.codigo}</td>
						<td>${venta.fecha}</td>
						<td>${venta.total}</td>
						<td>${venta.portal}</td>
						<td>[${venta.usuario.coordenada.latitud},
							${venta.usuario.coordenada.longitud}]</td>
						<c:if test="${venta.orden != null}">
							<td>${venta.orden.despacho.id}</td>
							<td>${venta.orden.estado}</td>
						</c:if>
						<c:if test="${venta.orden == null}">
							<td>-</td>
							<td>-</td>
						</c:if>
						<td><button class="btn btn-primary detalles"
								id="${venta.codigo}">Ver Detalles</button></td>
					</tr>
				</c:forEach>
			</tr>
		</tbody>
	</table>

	<button id="volver" class="btn btn-primary">Volver</button>

</div>

<script type="text/javascript">
	$(document).ready(function() {
		
		// AGREGA UNA NUEVA CONFIGURACION DE EMAIL 
		$(".detalles").click(function(){
			
				$.ajax({
					type : "GET",
					data : {"codigo" : $(this).attr("id")},
					url : "verDetalles",
					success : function(data) {

						$("contenido").load('verDetalles');
					}		
				});
			});
			
		

	$("#volver").click(function(){
		
		$.ajax({
			type : "GET",
			data : {"codigo" : $(this).attr("id")},
			url : "verDetalles",
			success : function(data) {

				$("contenido").load('verDetalles');
			}		
		});
	});
});
</script>
