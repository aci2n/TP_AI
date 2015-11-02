$("#menu-toggle").click(function(e) {
	e.preventDefault();
	$("#wrapper").toggleClass("toggled");
});

$("#menu_principal").click(function() {
	$("#myTable").empty();
});

$('#linkBestSellers').click(function() {
	cargarContenido('Ventas');
});

$('#linkReporte').click(function() {
	cargarContenido('Reporte');
});

function cargarContenido(url) {
	var loading = $('#loading');
	loading.show();
	$('#contenido').load(url, function() {
		loading.hide();
	});
}