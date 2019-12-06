package fleamarketapp;

public class ProductRepository  {

	private String name;
	private int price;
	private String label;
	private String size;
	private int good;
	private String comment;

	public ProductRepository() {
		// 本当はDBから取得する
		super();
		this.name = "フード付きパーカー";
		this.price = 1200;
		this.label = "ウニクロ";
		this.size = "フリーサイズ";
		this.good = 12;
		this.comment = "ワンポイントでロゴが入っています";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getGood() {
		return good;
	}

	public void setGood(int good) {
		this.good = good;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}
