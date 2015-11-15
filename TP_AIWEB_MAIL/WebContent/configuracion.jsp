

<a href="#"><strong><i class="glyphicon glyphicon-cog"></i>
		Configuración de Modulos</strong></a>
		<hr>

<div>

	<h4>Mi configuración</h4>
	<table id="table_conf" class="table">
		<tr>
			<th>Ip</th>
			<th>Puerto</th>
			<th>Cola</th>
			<th>Modulo</th>
			<th>Activo</th>
		</tr>
		<tbody id="tbody_conf">
			
		</tbody>
	</table>

</div>


<script type="text/javascript">
	$(document).ready(function() {
		var ip = "locahost"
		var puerto = "8080"
		
		$("#tbody_conf").append("<tr><td>"+ip+"</td><td>"+puerto+"</td><td>-</td><td>Email</td><td>Si</td></tr>")
		
		// ELIMINA LA CONFIGURACION ACTUAL
		/* $("#eliminar_conf").click(function(){
			$('#tbody_conf tr').filter(':has(:checkbox:checked)').find('#ip').each(function(){
				var ipSelected = ($(this).html());

				$.ajax({
					type : "POST",
					data : {"ip" : ipSelected },
					//dataType : "json",
					url : "eliminarConfiguracion",
					success : function(data) {

						$("#tbody_conf").empty();
						$("#agregar_conf").removeClass("disabled");			
					}		
				});
			});
			
		});

		// AGREGA UNA NUEVA CONFIGURACION DE EMAIL 
		$("#guardar_conf").click(function(){
			
				$.ajax({
					type : "POST",
					data : {"ip_dir" : $("#ip_dir").val(), "puerto": $("#puerto").val(), "cola": $("#cola").val()},
					//dataType : "json",
					url : "agregarConfiguracion",
					success : function(data) {

						$('#table_conf > tbody:last-child').append('<tr><td>'+ip_dir+'</td><td>'+puerto+'</td><td>'+cola+'</td>'+
								'<td>Email<td>'+Si+'</td><td><input type="checkbox"/></td></tr>');
						$("#agregar_conf").addClass("disabled");
					}		
				});
			}); */
			
		});
	
</script>
