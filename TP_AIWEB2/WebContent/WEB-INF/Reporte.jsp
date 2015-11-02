<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<a href="#"><strong><i class="glyphicon glyphicon-stats"></i> Reportes</strong></a>
<hr>
<ul>
	<c:forEach var="portal" items="${portales}">
		<li>
			<h4>${portal.nombre}</h4>
			<ul>
				<c:forEach var="venta" items="${portal.ventas}">
					<li>Codigo: ${venta.codigo} - Total: ${venta.total}</li>
				</c:forEach>
			</ul>
		</li>
	</c:forEach>
</ul>
