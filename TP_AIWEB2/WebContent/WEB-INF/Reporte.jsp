<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Reportes:</h1>
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
</body>
</html>