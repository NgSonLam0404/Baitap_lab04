package bai1;
/*Tên: Nguyễn Sơn Lâm; Lớp: K10_ĐH_CNTT3; MSSV:1050080105*/

public class Product {
	private String description;
	private String productID;
	private double price;
	public Product() {
	}
	public Product(String description, String productID, double price) {
		this.description = description;
		this.productID = productID;
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [description=" + description + ", productID=" + productID + ", price=" + price + "]";
	}
	
	
	

}
