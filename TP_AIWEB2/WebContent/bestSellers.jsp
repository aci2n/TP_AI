<%@ page import="java.util.*" %>
<%@ page import="view.*" %>

<a href="#"><strong><i class="glyphicon glyphicon-signal"></i>
		Ranking Best Sellers</strong></a>
		<hr>
<%
	List<BestSellerView> ranking = (List<BestSellerView>) request.getAttribute("bestSellers");
%>
<div>

	<h4>Lista de Best Sellers</h4>
	<table id="table_conf" class="table">
		<thead>
			<tr>
				<th>Ranking</th>
				<th>Id Artículo</th>
			</tr>
		</thead>
		<tbody id="tbody_conf">	
			<%if(ranking.size() > 0) {
				for(BestSellerView b : ranking){%>
				<tr>
					<td><%= b.getRanking() %></td>
					<td><%= b.getIdArticulo() %></td>
				<tr>
			<% }
			}%>
		</tbody>
	</table>
	
	<button id="enviar_ranking" type="button" class="btn btn-primary">Enviar Ranking</button>

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
