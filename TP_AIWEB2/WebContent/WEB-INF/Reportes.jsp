<%@ page import="java.util.*" %>
<%@ page import="view.*" %>

<a href="#"><strong><i class="glyphicon glyphicon-stats"></i>
		Reportes</strong></a>
		<hr>
<%
	List<ReporteView> reportes = (List<ReporteView>) request.getAttribute("reportes");
%>
<div>

	<h4>Listado de Reportes</h4>
	<table id="table_conf" class="table">
		<tr>
			<th>Portal</th>
			<th>Monto total</th>
		</tr>
		<tbody id="tbody_conf">
			<tr>
				<%if(reportes.size() > 0) {
					for(ReporteView r : reportes){%>
					<tr>
					<td><%= r.getPortal() %></td>
					<td><%= r.getTotal() %></td>
					<tr>
				<% }
				}%>
			</tr>
		</tbody>
	</table>
</div>


<script type="text/javascript">
	$(document).ready(function() {
		
	})
	
</script>
