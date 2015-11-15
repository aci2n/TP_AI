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
			<th>Coordenadas del cliente</th>
			<th>Orden de Despacho</th>
			<th>Estado Orden</th>
			<th>Detalles</th>
		</tr>
		<tbody id="tbody_conf">
			<tr>
				<c:forEach var="venta" items="${ventas}">
					<tr>
						<td>${venta.codigo}</td>
						<td>${venta.fecha}</td>
						<td>${venta.total}</td>
						<td>${venta.portal}</td>
						<td>[${venta.usuario.coordenada.latitud}, ${venta.usuario.coordenada.longitud}]</td>
						<c:if test="${venta.orden != null}">
							<td>${venta.orden.despacho.id}</td>
							<td>${venta.orden.estado}</td>
						</c:if>
						<c:if test="${venta.orden == null}">
							<td>-</td>
							<td>-</td>
						</c:if>
						<td><button class="btn btn-primary detalles" id="${venta.codigo}">Ver Detalles</button></td>
					</tr>
				</c:forEach>
			</tr>
		</tbody>
	</table>

</div>

<script type="text/javascript">
	$(document).ready(function() {
		
		// AGREGA UNA NUEVA CONFIGURACION DE EMAIL 
		$(".detalles").click(function(){
			
				$.ajax({
					type : "POST",
					data : {"codigo" : $(this).attr("id")},
					url : "configuracion",
					success : function(data) {

						$('#tbody_conf').append('<tr><td>'+$("#ip_dir").val()+'</td><td>'+$("#puerto").val()+'</td><td>'+$("#cola").val()+'</td>'+
								'<td>'+$("#modulo").val()+'<td>Si</td><td><input type="checkbox"/></td></tr>');
					}		
				});
			});
			
		});
	
</script>
