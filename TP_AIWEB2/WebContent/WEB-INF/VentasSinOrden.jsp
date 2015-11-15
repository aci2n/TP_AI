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
			<td colspan="3">Despacho</td>
		</tr>
		<tr>
			<td>Codigo</td>
			<td>Usuario</td>
			<td>Portal</td>
			<td>Fecha</td>
			<td>Total</td>
			<td>Coordenada</td>
			<td>Nombre</td>
			<td>Coordenada</td>
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
<div id="modal-cambiar-despacho" class="modal fade">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h4 class="modal-title">Cambiar despacho</h4>
      </div>
      <div class="modal-body">
	      <form id="cambiar-despacho-form" class="form-inline">
	      	<label>
	      		ID venta:
	        	<input id="cambiar-despacho-id-venta" readonly type="number" name="idVenta"></input>
	        </label>
	        <label>
	      		Despacho:
	        	<select id="cambiar-despacho-dropdown-despachos" name="idDespacho"></select>
	        </label>
	        <img id="cambiar-despacho-loading" src="img/loading.gif">
	        <button id="cambiar-despacho-submit" type="submit" class="btn btn-primary" disabled>Asignar</button>
	      </form>
	      <div id="modal-cambiar-despacho-msg" class="alert"></div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
      </div>
    </div>
  </div>
</div>

<script src="js/ventasSinOrden.js"></script>
