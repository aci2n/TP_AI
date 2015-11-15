package bean;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import entity.Coordenada;
import entity.Despacho;
import entity.ExceptionLog;
import entity.OrdenDespacho;
import entity.Reporte;
import entity.Usuario;
import entity.Venta;
import exception.NoExisteException;
import exception.PersistException;
import exception.VentaException;
import view.OrdenDespachoView;
import view.PortalView;
import view.ReporteView;
import view.VentaDespachoRecomendadoView;
import view.VentaView;

@Stateless
@SuppressWarnings("unchecked")
public class VentasBean extends GenericBean<Venta> {

	@EJB
	private DespachosBean despachosBean;
	@EJB
	private OrdenesDespachoBean ordenesBean;

	public VentasBean() {
		super(Venta.class);
	}

	public Integer guardarVenta(VentaView view) throws PersistException {
		Venta venta = new Venta();
		venta.setPortal(view.getPortal());
		venta.setTotal(view.getTotal());
		venta.setCodigo(view.getCodigo());
		venta.setFecha(view.getFecha());
		venta.setUsuario(view.getUsuario() != null ? new Usuario(view.getUsuario()) : null);
		venta.setDestino(view.getDestino() != null ? new Coordenada(view.getDestino()) : null);
		venta.setOrden(view.getOrden() != null ? new OrdenDespacho(view.getOrden()) : null);

		save(venta);
		return venta.getId();
	}

	public Venta obtenerVenta(Integer idVenta) throws NoExisteException {
		return null;
	}

	public VentaView asignarDespachoAVenta(Integer idVenta, Integer idDespacho)
			throws NoExisteException, PersistException, VentaException {
		Venta venta = get(idVenta);
		Despacho despacho = despachosBean.get(idDespacho);

		if (venta.getOrden() != null) {
			if (venta.getOrden().getDespacho().equals(despacho)) {
				throw new VentaException("La venta ya esta asignada al despacho ingresado.");
			} else {
				ordenesBean.actualizarOrden(venta.getOrden(), despacho);
			}
		} else {
			venta.setOrden(ordenesBean.generarOrdenDespacho(despacho));
			em.merge(venta);
		}
		
		return venta.getView();
	}

	public List<VentaDespachoRecomendadoView> obtenerVentasSinOrdenDespacho() {
		return despachosBean.getVentasDespachoRecomendado(
				executeQuery("select v from Venta v left join v.orden od where od is null and v.destino is not null"));
	}

	public List<VentaView> getAllViews() {
		List<VentaView> ventasView = new ArrayList<>();
		for (Venta v : getAll()) {
			ventasView.add(v.getView());
		}

		return ventasView;
	}

	public List<PortalView> getReportePortales() {
		Reporte reporte = new Reporte();
		for (Venta v : getAll()) {
			reporte.agregarVenta(v);
		}
		reporte.ordenar();

		return reporte.getPortales();
	}

	public List<ReporteView> getReportes() {

		List<ReporteView> reportes = null;
		try {
			List<Object[]> lista = em.createQuery("select sum(v.total), v.portal from Venta v group by v.portal")
					.getResultList();
			reportes = new ArrayList<ReporteView>();

			for (int i = 0; i < lista.size(); i++) {
				reportes.add(new ReporteView((String) lista.get(i)[0], (double) lista.get(i)[1]));
			}

		} catch (Exception e) {
			em.persist(new ExceptionLog(e));
		}
		return reportes;
	}
}
