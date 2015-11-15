$("#menu-toggle").click(function(e) {
	e.preventDefault();
	$("#wrapper").toggleClass("toggled");
});

$("#menu_principal").click(function() {
	$("#myTable").empty();
});

$('#linkVentas').click(function() {
	cargarContenido('Ventas');
});

$('#linkReporte').click(function() {
	cargarContenido('Reporte');
});

$('#configuracion').click(function() {
	cargarContenido('configuracion');
});

$('#linkBestSellers').click(function() {
	cargarContenido('BestSellers');
});

$('#linkListadoInformes').click(function() {
	cargarContenido('informes');
});

function cargarContenido(url) {
	var loading = $('#loading');
	loading.show();
	var contenido = $('#contenido');
	contenido.html('');
	contenido.load(url, function() {
		loading.hide();
	});
}