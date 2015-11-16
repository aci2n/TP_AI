<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link href="css/ventasSinOrden.css" rel="stylesheet">

<a href="#"><strong><i class="glyphicon glyphicon-list"></i> Listado de Ventas sin Orden</strong></a>
<hr>

<table id="ventas-sin-orden" class="table table-striped">
	<thead>
		<tr id="ventas-sin-orden-head" >
			<th colspan="6">Venta</th>
			<th colspan="3">Despacho más cercano</th>
		</tr>
		<tr>
			<th>Codigo</th>
			<th>Usuario</th>
			<th>Portal</th>
			<th>Fecha</th>
			<th>Total</th>
			<th>Destino</th>
			<th>Nombre</th>
			<th>Ubicación</th>
			<th></th>
		</tr>
	</thead>
	<tbody id="ventas-sin-orden-body">
		<c:forEach var="vdr" items="${ventasDespachoRecomendado}">
			<tr id="venta-${vdr.venta.id}">
				<td>${vdr.venta.codigo}</td>
				<td>${vdr.venta.usuario.apellido}, ${vdr.venta.usuario.nombre}</td>
				<td>${vdr.venta.portal}</td>
				<td>${vdr.venta.fecha}</td>
				<td>${vdr.venta.total}</td>
				<td>${vdr.venta.destino.latitud}, ${vdr.venta.destino.longitud}</td>
				<td>${vdr.despacho.nombre}</td>
				<td>${vdr.despacho.coordenada.latitud}, ${vdr.despacho.coordenada.longitud}</td>
				<td class="btn-asignar-despacho">
					<button class="btn btn-primary" data-venta="${vdr.venta.id}" data-despacho="${vdr.despacho.id}">Asignar</button>
				</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<div id="modal-asignar-despacho" class="modal fade">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h4 class="modal-title">Asignar despacho</h4>
        <img id="asignar-despacho-loading" src="img/loading.gif">
      </div>
      <div class="modal-body">
	      <form id="asignar-despacho-form" class="form-inline">
	      	<label>
	      		ID venta:
	        	<input id="asignar-despacho-id-venta" readonly type="number" name="idVenta"></input>
	        </label>
	        <label>
	      		Despacho:
	        	<select id="asignar-despacho-dropdown-despachos" name="idDespacho"></select>
	        </label>
	        <button id="asignar-despacho-submit" type="submit" class="btn btn-primary" disabled>Asignar</button>
	      </form>
	      <p id="modal-asignar-despacho-msg"></p>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
      </div>
    </div>
  </div>
</div>

<script src="js/ventasSinOrden.js"></script>
