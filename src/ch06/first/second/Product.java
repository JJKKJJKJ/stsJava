package ch06.first.second;

public class Product<T,M> {
	private T Product;
	private M model;
	
	public T getProduct() {
		return Product;
	}
	
	public void setProduct(T product) {
		Product = product;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}

}
