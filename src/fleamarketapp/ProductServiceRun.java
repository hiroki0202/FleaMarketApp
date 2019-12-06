package fleamarketapp;

public class ProductServiceRun {

	public static void main(String[] args) {

		ProductService productService = new ProductServiceImpl();
		productService.fetchProductInfo();
	}

}
