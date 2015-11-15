package view;

public class BestSellerView {
	private Integer idArticulo;
	private Integer ranking;

	public BestSellerView(Integer idArticulo, Integer ranking) {
		this.idArticulo = idArticulo;
		this.ranking = ranking;
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

}
