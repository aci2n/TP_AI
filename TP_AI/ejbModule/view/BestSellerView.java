package view;

public class BestSellerView {
	private String idArticulo;
	private Integer ranking;

	public BestSellerView(String idArticulo, Integer ranking) {
		this.idArticulo = idArticulo;
		this.ranking = ranking;
	}

	public String getIdArticulo() {
		return idArticulo;
	}

	public void setIdArticulo(String idArticulo) {
		this.idArticulo = idArticulo;
	}

	public Integer getRanking() {
		return ranking;
	}

	public void setRanking(Integer ranking) {
		this.ranking = ranking;
	}

}
