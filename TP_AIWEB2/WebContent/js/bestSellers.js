$(function() {
	var enviarRankingForm = $('#enviar-ranking');

	enviarRankingForm.submit(function(e) {
		e.preventDefault();
		$.post('rest/articulos', enviarRankingForm.serialize())
			.always(function(response) {
				$('#modal-enviar-ranking-text').text(response.responseText || response);
				$('#modal-enviar-ranking').modal('show');
			});
	});
});