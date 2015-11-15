var ventasSinOrden = {
	despachosCargados : false
};

(function() {
	initAsignarDespacho();
	initEnviarOrdenes();
})();

function initAsignarDespacho() {
	var asignarDespachoForm = $('#asignar-despacho-form');
	var loading = $('#asignar-despacho-loading');

	asignarDespachoForm.submit(function(e) {
		loading.show();
		e.preventDefault();
		$.post('rest/ventas', asignarDespachoForm.serialize()).always(
				function(response) {
					loading.hide();
					$('#modal-asignar-despacho-msg').text(
							response.responseText || response);
					$('#venta-' + $('#asignar-despacho-id-venta').val())
							.remove();
				});
	});
}

function asignarDespacho(idVenta, idDespacho) {
	$('#modal-asignar-despacho').modal('show');
	$('#modal-asignar-despacho-msg').text('');
	$('#asignar-despacho-id-venta').val(idVenta);
	var despachosDropdown = $('#asignar-despacho-dropdown-despachos');

	if (!ventasSinOrden.despachosCargados) {
		var loading = $('#asignar-despacho-loading');
		loading.show();
		despachosDropdown.empty();

		$.get('rest/despachos', function(response) {
			ventasSinOrden.despachosCargados = true;
			despachosDropdown.val(idDespacho);
			$('#asignar-despacho-submit').removeAttr('disabled');
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

			var mensajeModal = $('#modal-enviar-ordenes-msg').html('');
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