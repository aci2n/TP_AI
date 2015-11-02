<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<a href="#"><strong><i class="glyphicon glyphicon-list"></i> Listado de Ventas</strong></a>
<hr>

<ul>
	<c:forEach var="venta" items="${ventas}">
		<li>
			<h4>${venta.codigo}</h4>
			<ul>
				<li>${venta.fecha}</li>
				<li>${venta.total}</li>
				<li>${venta.portal}</li>
				<li>${venta.usuario.coordenada.latitud}</li>
				<li>${venta.usuario.coordenada.longitud}</li>
				<li>${venta.orden.estado}</li>
			</ul>
		</li>
	</c:forEach>
</ul>
