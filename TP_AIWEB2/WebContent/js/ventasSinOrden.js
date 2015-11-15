var ventasSinOrden = {
	despachosCargados : false
};

(function() {
	var cambiarDespachoForm = $('#cambiar-despacho-form');
	var loading = $('#cambiar-despacho-loading');
	loading.show();
	
	cambiarDespachoForm.submit(function(e) {
		e.preventDefault();
		$.post('rest/ventas', cambiarDespachoForm.serialize()).always(
				function(response) {
					loading.hide();
					$('#modal-cambiar-despacho-msg').text(response.responseText || response);
					$('#venta-' + $('#cambiar-despacho-id-venta').val()).remove();
				});
	});
})();

function asignarDespacho(idVenta, idDespacho) {
	$('#modal-cambiar-despacho').modal('show');
	$('#modal-cambiar-despacho-msg').text('');
	$('#cambiar-despacho-id-venta').val(idVenta);
	var despachosDropdown = $('#cambiar-despacho-dropdown-despachos');
	
	if (!ventasSinOrden.despachosCargados) {
		var loading = $('#cambiar-despacho-loading');
		loading.show();
		despachosDropdown.empty();
		
		$.get('rest/despachos', function(response) {
			ventasSinOrden.despachosCargados = true;
			despachosDropdown.val(idDespacho);
			$('#cambiar-despacho-submit').removeAttr('disabled');
			loading.hide();
			response.forEach(function(despacho) {
				despachosDropdown.append($('<option>', {
					value : despacho.id,
					text : despacho.nombre
				}));
			});
		});
	} else {
		despachosDropdown.val(idDespacho);
	}
}