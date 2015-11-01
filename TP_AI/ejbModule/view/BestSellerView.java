package view;

public class BestSellerView {
	private Integer idArticulo;
	private Integer ranking;
	private Integer cantidad;

	public BestSellerView(Integer idArticulo, Integer ranking, Integer cantidad) {
		this.idArticulo = idArticulo;
		this.ranking = ranking;
		this.cantidad = cantidad;
	}

	public Integer getIdArticulo() {
		return idArticulo;
	}

	public void setIdArticulo(Integer idArticulo) {
		this.idArticulo = idArticulo;
	}

	public Integer getRanking() {
		return ranking;
	}

	public void setRanking(Integer ranking) {
		this.ranking = ranking;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

}
