package bean;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import entity.Articulo;
import view.BestSellerView;

@Stateless
public class ArticulosBean extends GenericBean<Articulo> {

	public ArticulosBean() {
		super(Articulo.class);
	}

	public List<BestSellerView> getBestSellers() {
		List<Object[]> cantidadesVendidas = executeTypelessQuery(
				"select a.id from ItemArticulo iv inner join iv.articulo a group by a.id order by sum(iv.cantidad) desc");
		
		List<BestSellerView> bestSellers = new ArrayList<>();
		for (int i = 0; i < cantidadesVendidas.size(); i++) {
			bestSellers.add(new BestSellerView(i, (Integer) cantidadesVendidas.get(i)[0]));
		}
		
		return bestSellers;
	}

}
