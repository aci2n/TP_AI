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
			<c:forEach var="articulo" items="${actual.articulos}">
				<tr>
						<td>${articulo.articulo.codigo}</td>
						<td>${articulo.articulo.nombre}</td>
						<td>${articulo.articulo.descripcion}</td>
						<td>${articulo.articulo.marca}</td>
						<td>$${articulo.articulo.precio}</td>
						<td>${articulo.articulo.origen}</td>
						<td>${articulo.cantidad}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	<button id="volver" class="btn btn-primary">Volver</button>

</div>

<script type="text/javascript">
	$(function() {
		$("#volver").click(function(){
			cargarContenido('Ventas');
		});
	});
</script>
