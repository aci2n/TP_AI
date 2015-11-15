<%@ page import="java.util.*" %>
<%@ page import="view.*" %>

<a href="#"><strong><i class="glyphicon glyphicon-signal"></i>
		Listado de Informes</strong></a>
		<hr>

<div>

	<h4>Lista de Informes de Auditoría</h4>
	<table id="table_conf" class="table">
		<tr>
			<th>Módulo</th>
			<th>Descripción</th>
			<th>Fecha</th>
			<th>Hora</th>
		</tr>
		<tbody id="tbody_conf">	
				
		</tbody>
	</table>
	
	<button id="enviar_informes" type="button" class="btn btn-primary">Enviar Informes</button>
</div>


<script type="text/javascript">
	$(document).ready(function() {
			
		// ENVIAR INFORMES
		$("#enviar_informes").click(function(){
			
				$.ajax({
					type : "POST",
					data : {"ranking" : ranking},
					url : "enviarRanking",
					success : function(data) {
						alert("Ranking enviado");
					}		
				});
			});
			
		});
	
</script>
