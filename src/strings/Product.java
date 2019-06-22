package strings;

public class Product implements Comparable<Object> {
	int id;
	String prodName;
	String skuID;
	double turnOver;

	public Product(int id, String prodName, String skuId, double turnOver) {
		this.id = id;
		this.prodName = prodName;
		this.skuID = skuId;
		this.turnOver = turnOver;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Product ref = (Product) o;
		return this.id - ref.id;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", prodName=" + prodName + ", skuID=" + skuID + ", turnOver=" + turnOver + "]";
	}
}
