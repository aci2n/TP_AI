$(function() {
	var enviarRankingForm = $('#enviar-ranking');
	
	enviarRankingForm.submit(function(e) {
		var loading = $('#enviar-ranking-loading').show();
		e.preventDefault();
		$.post('rest/articulos', enviarRankingForm.serialize())
			.always(function(response) {
				loading.hide();
				$('#modal-enviar-ranking-text').text(response.responseText || response);
				$('#modal-enviar-ranking').modal('show');
			});
	});
});