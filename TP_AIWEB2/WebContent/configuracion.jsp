<%@ page import="java.util.*" %>
<%@ page import="entity.*" %>

<a href="#"><strong><i class="glyphicon glyphicon-stats"></i>
		Configuración de Modulos</strong></a>
		<hr>
<%
	List<Modulo> modulos = (List<Modulo>) request.getAttribute("modulos");
%>
<div>

	<h4>Mi configuración</h4>
	<table id="table_conf" class="table">
		<tr>
			<th>Ip</th>
			<th>Puerto</th>
			<th>Cola</th>
			<th>Modulo</th>
			<th>Activo</th>
			<th>Check</th>
		</tr>
		<tbody id="tbody_conf">
			<tr>
				<%if(modulos.size() > 0) {
					for(Modulo m : modulos){%>
					<tr>
					<td id="ip"><%= m.getIp() %></td>
					<td id="port"><%= m.getPort() %></td>
					<td><%= m.getCola() %></td>
					<td><%= m.getmodulo().toString() %></td>
					<td><%= m.isActivo() %></td>
					<td><input type="checkbox" class="check_sel" name="sel"/></td><tr>
				<% }
				}%>
			</tr>
		</tbody>
	</table>

	<button id="agregar_conf" type="button" class="btn btn-primary" data-toggle="modal"
		data-target="#exampleModal" data-whatever="@mdo">Agregar Configuración</button>
	
	<button id="eliminar_conf" type="button" class="btn btn-danger">Eliminar Configuración</button>

	<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="exampleModalLabel">Mi Configuración</h4>
				</div>
				<div class="modal-body">
					<form>
						<div class="form-group">
							<label for="ip" class="control-label">Dirección IP:</label>
							<input type="text" class="form-control" id="ip_dir">
						</div>
						<div class="form-group">
							<label for="puerto" class="control-label">Puerto:</label>
							<input type="text" class="form-control" id="puerto">
						</div>
						<div class="form-group">
							<label for="ip" class="control-label">Cola:</label>
							<input type="text" class="form-control" id="cola">
						</div>
						<div class="form-group">
							<label for="ip" class="control-label">Modulo:</label>
							<select class="form-control" id="modulo">
								<option>Portal</option>
								<option>Despacho</option>
								<option>Deposito</option>
							</select>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
					<button id="guardar_conf" type="button" class="btn btn-primary" data-dismiss="modal">Guardar</button>
				</div>
			</div>
		</div>
	</div>
</div>


<script type="text/javascript">
	$(document).ready(function() {
		
		$('input.check_sel').on('change', function() {
		    $('input.check_sel').not(this).prop('checked', false);  
		});
		
		// ELIMINA LA CONFIGURACION ACTUAL
		$("#eliminar_conf").click(function(){
			$('#tbody_conf tr').filter(':has(:checkbox:checked)').find('#ip').each(function(){
				var ipSelected = ($(this).html());

				$.ajax({
					type : "POST",
					data : {"ip" : ipSelected},
					//dataType : "json",
					url : "eliminarConfiguracion",
					success : function(data) {

						$("#tbody_conf tr").has('input[name="sel"]:checked').remove()
					
					}		
				});
			});
			
		});

		// AGREGA UNA NUEVA CONFIGURACION DE EMAIL 
		$("#guardar_conf").click(function(){
			
				$.ajax({
					type : "POST",
					data : {"ip_dir" : $("#ip_dir").val(), "puerto": $("#puerto").val(), "cola": $("#cola").val(), "modulo": $("#modulo").val()},
					//dataType : "json",
					url : "configuracion",
					success : function(data) {

						$('#tbody_conf').append('<tr><td>'+$("#ip_dir").val()+'</td><td>'+$("#puerto").val()+'</td><td>'+$("#cola").val()+'</td>'+
								'<td>'+$("#modulo").val()+'<td>Si</td><td><input type="checkbox"/></td></tr>');
					}		
				});
			});
			
		});
	
</script>
