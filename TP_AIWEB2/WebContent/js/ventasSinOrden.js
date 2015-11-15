var ventasSinOrden = {
	despachosCargados : false
};

(function() {
	initCambiarDespacho();
	initEnviarOrdenes();
})();

function initCambiarDespacho() {
	var cambiarDespachoForm = $('#cambiar-despacho-form');
	var loading = $('#cambiar-despacho-loading');

	cambiarDespachoForm.submit(function(e) {
		loading.show();
		e.preventDefault();
		$.post('rest/ventas', cambiarDespachoForm.serialize()).always(
				function(response) {
					loading.hide();
					$('#modal-cambiar-despacho-msg').text(
							response.responseText || response);
					$('#venta-' + $('#cambiar-despacho-id-venta').val())
							.remove();
				});
	});
}

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

function initEnviarOrdenes() {
	var enviarOrdenesForm = $('#enviar-ordenes-form');
	var loading = $('#enviar-ordenes-loading');

	enviarOrdenesForm.submit(function(e) {
		loading.show();
		e.preventDefault();
		$.post('rest/OrdenDeDespacho/enviar', function(response) {
			loading.hide();

			var mensajeModal = $('#modal-enviar-ordenes-msg');
			mensajeModal.append($('<h4>').text(response.mensaje));

			var listaOrdenes = $('<ul>');
			var ordenes = $.parseJSON(response.ordenes);
			for(var i = 0; i < ordenes.length; i++) {
				var orden = ordenes[i];
				listaOrdenes
					.append($('<li>').text('ID Orden Despacho: ' + orden.id)
						.append($('<ul>')
							.append($('<li>').text('Codigo venta: ' + orden.venta.codigo))
							.append($('<li>').text('Despacho: ' + orden.despacho.nombre))
						)
					);
			}
			mensajeModal.append(listaOrdenes);

			$('#modal-enviar-ordenes').modal('show');
		});
	});
}