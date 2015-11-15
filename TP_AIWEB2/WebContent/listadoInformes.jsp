<%@ page import="java.util.*" %>
<%@ page import="view.*" %>

<a href="#"><strong><i class="glyphicon glyphicon-signal"></i>
		Listado de Informes</strong></a>
		<hr>

<div>

	<h4>Lista de Informes de Auditor�a</h4>
	<table id="table_conf" class="table">
		<tr>
			<th>M�dulo</th>
			<th>Descripci�n</th>
			<th>Fecha</th>
			<th>Hora</th>
		</tr>
		<tbody id="tbody_conf">	
				
		</tbody>
	</table>
	
	<button id="enviar_ranking" type="button" class="btn btn-primary">Enviar Infomes</button>
</div>


<script type="text/javascript">
	$(document).ready(function() {
			
		// ENVIAR RANKING
		$("#enviar_ranking").click(function(){
			
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
