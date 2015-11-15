<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link href="css/ventasSinOrden.css" rel="stylesheet">

<a href="#"><strong><i class="glyphicon glyphicon-list"></i> Listado de Ventas sin Orden</strong></a>
<hr>

<table id="ventas-sin-orden" class="table table-striped">
	<thead>
		<tr id="ventas-sin-orden-head" >
			<td colspan="6">Venta</td>
			<td colspan="3">Despacho más cercano</td>
		</tr>
		<tr>
			<td>Codigo</td>
			<td>Usuario</td>
			<td>Portal</td>
			<td>Fecha</td>
			<td>Total</td>
			<td>Destino</td>
			<td>Nombre</td>
			<td>Ubicación</td>
			<td></td>
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
					<button class="btn btn-primary" onclick="asignarDespacho(${vdr.venta.id}, ${vdr.despacho.id})">Asignar</button>
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
	        <img id="asignar-despacho-loading" src="img/loading.gif">
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

<div id="enviar-ordenes">
	<h4>Ordenes Activas</h4>
	<img id="ordenes-activas-loading" src="img/loading.gif">
	<table id="ordenes-activas" class="table table-striped">
		<thead>
			<tr>
				<td>Orden Despacho</td>
				<td>Venta</td>
				<td>Despacho</td>
			</tr>
		</thead>
		<tbody id="ordenes-activas-body"></tbody>
	</table>
	<form id='enviar-ordenes-form' class="form-inline">
		<button type="submit" class="btn btn-default">Enviar</button>
		<img id="enviar-ordenes-loading" src="img/loading.gif">
	</form>
</div>

<div id="modal-enviar-ordenes" class="modal fade">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h4 class="modal-title">Enviar ordenes</h4>
      </div>
      <div class="modal-body">
	      <div id="modal-enviar-ordenes-msg"></div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
      </div>
    </div>
  </div>
</div>

<script src="js/ventasSinOrden.js"></script>
