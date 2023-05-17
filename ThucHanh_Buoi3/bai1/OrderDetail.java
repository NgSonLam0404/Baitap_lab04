package bai1;
/*Tên: Nguyễn Sơn Lâm; Lớp: K10_ĐH_CNTT3; MSSV:1050080105*/
public class OrderDetail {
	private int quantity;
	private Product product;
	
	
	public OrderDetail(Product product, int quantity) {
		this.product=product;
		this.quantity=quantity;
	}
	public double calcTotalPrice() {
		return quantity*product.getPrice();
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "OrderDetail [quantity=" + quantity + ", product=" + product + "]";
	}
	
	

}
