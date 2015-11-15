$(function() {
	var enviarRankingForm = $('#enviar-ranking');

	enviarRankingForm.submit(function(e) {
		e.preventDefault();
		$.post('rest/articulos', enviarRankingForm.serialize())
			.always(function(response) {
				var text = response.responseText || response;
				$('#modal-enviar-ranking-text').text(text);
				$('#modal-enviar-ranking').modal('show');
			});
	});
});