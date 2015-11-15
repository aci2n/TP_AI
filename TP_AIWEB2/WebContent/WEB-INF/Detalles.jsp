<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<a href="#"><strong><i class="glyphicon glyphicon-list"></i>
		Listado de Ventas</strong></a>
<hr>


<div>
	<h4>Detalles de la compra</h4>
	<table id="table_conf" class="table">
		<tr>
			<th>Codigo</th>
			<th>Nombre</th>
			<th>Descripcion</th>
			<th>Marca</th>
			<th>Precio</th>
			<th>Origen</th>
			<th>Cantidad</th>
		</tr>
		<tbody id="tbody_conf">
			<tr>
				<c:forEach var="venta" items="${actual}">
					<tr>
						<td>${venta.articulos.articulo.codigo}</td>
						<td>${venta.articulos.articulo.nombre}</td>
						<td>${venta.articulos.articulo.descripcion}</td>
						<td>${venta.articulos.articulo.marca}</td>
						<td>${venta.articulos.articulo.precio}</td>
						<td>${venta.articulos.articulo.origen}</td>
						<td>${venta.articulos.articulo.cantidad}</td>
					</tr>
				</c:forEach>
			</tr>
		</tbody>
	</table>

	<button id="volver" class="btn btn-primary">Volver</button>

</div>

<script type="text/javascript">
	$(document).ready(function() {
		
		$("#volver").click(function(){
			
				$.ajax({
					type : "POST",
					url : "verDetalles",
					success : function(data) {

						$("contenido").load('Ventas');
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
