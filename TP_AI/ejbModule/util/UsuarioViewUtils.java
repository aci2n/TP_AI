package util;

import entity.Coordenada;
import entity.Usuario;
import view.CoordenadaView;
import view.UsuarioView;

public class UsuarioViewUtils implements ViewUtils<Usuario, UsuarioView> {

	@Override
	public Usuario fromView(UsuarioView view) {
		Usuario usuario = new Usuario();
		usuario.setDni(view.getDni());
		
		CoordenadaView cView = view.getCoordenada();
		if (cView != null) {
			CoordenadaViewUtils utils = new CoordenadaViewUtils();
			Coordenada coordenada = utils.fromView(cView);
			usuario.setCoordenada(coordenada);
		}
		
		return usuario;
	}

}
