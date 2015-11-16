$(function() {
	cargarDropdownDespachos();
	$('.btn-asignar-despacho > button').click(asignarDespachoClick);
	$('#asignar-despacho-form').submit(asignarDespachoSubmit);
});

function asignarDespachoClick(e) {
	var target = $(e.target);
	var idVenta = target.attr('data-venta');
	var idDespachoRecomendado = target.attr('data-despacho');
	
	$('#modal-asignar-despacho-msg').text('');
	$('#asignar-despacho-id-venta').val(idVenta);
	$('#asignar-despacho-dropdown-despachos').val(idDespachoRecomendado);
	$('#modal-asignar-despacho').modal('show');
}

function asignarDespachoSubmit(e) {
	var loading = $('#asignar-despacho-loading').show();
	e.preventDefault();
	$.post('rest/OrdenDeDespacho/enviar', $('#asignar-despacho-form').serialize())
		.done(function() {
			$('#venta-' + $('#asignar-despacho-id-venta').val()).remove();
		})
		.always(function(response) {
			loading.hide();
			$('#modal-asignar-despacho-msg').text(response.estado ? response.estado + ' - ' + response.mensaje : response.responseText);
		});
}

function cargarDropdownDespachos() {
	var loading = $('#asignar-despacho-loading').show();
	var despachosDropdown = $('#asignar-despacho-dropdown-despachos');
	$.get('rest/despachos', function(response) {
		$('#asignar-despacho-submit').removeAttr('disabled');
		loading.hide();
		response.forEach(function(despacho) {
			despachosDropdown.append($('<option>', {
				value : despacho.id,
				text : despacho.nombre + ' (' + despacho.id + ')'
			}));
		});
	});
}
