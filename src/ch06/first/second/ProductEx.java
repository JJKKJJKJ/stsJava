package ch06.first.second;

public class ProductEx {
	public static void main(String[] args) {
		
		Product<String,Integer> ipone6 = new Product<>();
		ipone6.setModel(6);
		
		Product<String,String> ipone6s = new Product<>();
		ipone6s.setModel("6s");
		
		
		Product<Tv,String> product = new Product<>();
		
		Tv tv = new Tv();
		
		product.setProduct(tv);
	}

}
