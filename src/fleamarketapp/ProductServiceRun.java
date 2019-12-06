package fleamarketapp;

public class ProductServiceRun {

	public static void main(String[] args) {

		ProductServiceImpl productServiceImpl = new ProductServiceImpl();
		productServiceImpl.fetchProductInfo();
	}

}
