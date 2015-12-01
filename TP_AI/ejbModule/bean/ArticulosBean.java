package bean;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import entity.Articulo;
import view.BestSellerView;

@Stateless
@SuppressWarnings("unchecked")
public class ArticulosBean extends GenericBean<Articulo> {

	public ArticulosBean() {
		super(Articulo.class);
	}

	public List<BestSellerView> getBestSellers() {
		List<String> cantidadesVendidas = (List<String>) em
				.createQuery(
						"select a.codigo from ItemArticulo iv inner join iv.articulo a group by a.codigo order by sum(iv.cantidad) desc")
				.getResultList();

		List<BestSellerView> bestSellers = new ArrayList<>();
		for (int i = 0; i < cantidadesVendidas.size(); i++) {
			bestSellers.add(new BestSellerView(cantidadesVendidas.get(i), i + 1));
		}

		return bestSellers;
	}

}
