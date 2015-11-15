package response;

import java.util.List;

import view.BestSellerView;

public class BestSellersResponse {
	private List<BestSellerView> bestSellers;

	public BestSellersResponse(List<BestSellerView> bestSellers) {
		this.bestSellers = bestSellers;
	}

	public List<BestSellerView> getBestSellers() {
		return bestSellers;
	}

	public void setBestSellers(List<BestSellerView> bestSellers) {
		this.bestSellers = bestSellers;
	}

}
