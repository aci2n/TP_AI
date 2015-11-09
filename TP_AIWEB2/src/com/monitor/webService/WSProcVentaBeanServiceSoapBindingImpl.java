/**
 * WSProcVentaBeanServiceSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.monitor.webService;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;

import bean.VentasBean;
import exception.PersistException;
import view.ArticuloView;
import view.CoordenadaView;
import view.ItemArticuloView;
import view.UsuarioView;
import view.VentaView;

public class WSProcVentaBeanServiceSoapBindingImpl implements com.monitor.webService.WSProcVentaBean {

	@EJB
	private VentasBean ventasBean;
	
	public java.lang.String procesarCarrito(VoCarrito carrito) throws RemoteException {
		return null;
	}

	public java.lang.String procesarVenta(VoVenta venta) throws RemoteException {
		if (venta == null) {
			throw new RemoteException("La venta no puede ser null");
		}
		
		try {
			VentaView view = new VentaView();
			view.setCodigo(String.valueOf(venta.getCodigoVenta()));
			view.setFecha(venta.getFecha().toGregorianCalendar().getTime());
			
			Cliente cliente = venta.getCliente();
			UsuarioView usuario = new UsuarioView();
			usuario.setDni(String.valueOf(cliente.getDni()));
			usuario.setNombre(cliente.getNombre());
			usuario.setApellido(cliente.getApelido());
			
			CoordenadaView coordenada = new CoordenadaView();
			
			//	Asumiendo que la latitud viene como 99.99,99.99
			String[] coordStrings = cliente.getCoordenada().split(",");
			coordenada.setLatitud(Double.parseDouble(coordStrings[0]));
			coordenada.setLongitud(Double.parseDouble(coordStrings[1]));
			usuario.setCoordenada(coordenada);
			view.setUsuario(usuario);
			
			List<ItemArticuloView> items = new ArrayList<ItemArticuloView>();
			for (VoItemVenta iv: venta.getCollectionItems()) {
				ItemArticuloView ia = new ItemArticuloView();
				ia.setCantidad(iv.getCantidad());
				
				ArticuloView a = new ArticuloView();
				a.setPrecio(iv.getProducto().getPrecio());
				a.setCodigo(Long.valueOf(iv.getProducto().getCodigo()).intValue());
				ia.setArticulo(a);
				
				items.add(ia);
			}
			
			view.setArticulos(items);
			
			ventasBean.guardarVenta(view);
		} catch (PersistException e) {
			throw new RemoteException("Problema al persistir la venta");
		} catch (Exception e) {
			throw new RemoteException("Parámetros inválidos: " + e.getMessage());
		}
		
		return "SUCCESS";
	}

}
