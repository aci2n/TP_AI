<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<a href="#"><strong><i class="glyphicon glyphicon-list"></i>
		Listado de Ventas</strong></a>
<hr>


<div>
	<h4>Detalles de la compra</h4>
	<table id="table_conf" class="table">
		<thead>
			<tr>
				<th>Codigo</th>
				<th>Nombre</th>
				<th>Descripcion</th>
				<th>Marca</th>
				<th>Precio</th>
				<th>Origen</th>
				<th>Cantidad</th>
			</tr>
		</thead>
		<tbody id="tbody_conf">
			<tr>
				<td>${actual.articulos.articulo.codigo}</td>
				<td>${actual.articulos.articulo.nombre}</td>
				<td>${actual.articulos.articulo.descripcion}</td>
				<td>${actual.articulos.articulo.marca}</td>
				<td>${actual.articulos.articulo.precio}</td>
				<td>${actual.articulos.articulo.origen}</td>
				<td>${actual.articulos.articulo.cantidad}</td>
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
	});
</script>
