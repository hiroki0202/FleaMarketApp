package fleamarketapp;

public class ProductServiceImpl implements ProductService {

	@Override
	public void fetchProductInfo() {

		ProductRepository product = new ProductRepository();
		System.out.println("商品名：" + product.getName());
		System.out.println("値段：" + product.getPrice());
		System.out.println("ブランド：" + product.getLabel());
		System.out.println("サイズ：" + product.getSize());
		System.out.println("いいね数：" + product.getGood());
		System.out.println("商品説明：" + product.getComment());
	}

}
