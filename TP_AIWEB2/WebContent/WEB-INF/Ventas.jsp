<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ventas</title>
</head>
<body>
	<h1>Ventas:</h1>
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
</body>
</html>