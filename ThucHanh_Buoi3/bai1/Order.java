package bai1;
/*Tên: Nguyễn Sơn Lâm; Lớp: K10_ĐH_CNTT3; MSSV:1050080105*/

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
	private int orderID;
	private LocalDate orderDate;
	private List<OrderDetail> lineItems;
	private int count;
	public Order( int orderID, LocalDate orderDate) {
		this.orderID=orderID;
		this.orderDate= orderDate;
		this.lineItems= new ArrayList<OrderDetail>();
		this.count=0;
	}
	public List<OrderDetail> getLineItems(){
		return lineItems;
	}
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public void setLineItems(List<OrderDetail> lineItems) {
		this.lineItems = lineItems;
	}
	public double calcToTalCharge() {
		double totalCharge= 0.0;
		for (OrderDetail item : lineItems) {
			totalCharge+= item.calcTotalPrice();
		}
		return totalCharge;
	}
	public void addLineItem(Product p, int q) {
		if (count<20) {
			lineItems.add(new OrderDetail(p,q));
			count++;
		}else {
			System.out.println("Hoa don da dat gioi han");
		}
	}
	@Override
	public String toString() {
		StringBuilder sb= new StringBuilder();
		sb.append("Ma HD: ").append(orderID).append("\n");
		sb.append("ngay lap hoa don: ").append(orderDate).append("\n");
		sb.append(String.format("%-4s | %-7s | %-10s | %-7s | %-8s | %-10s%n", "STT", "MaSP", "Mo Ta", "Don Gia", "So Luong", "Thanh Tien"));
		sb.append("------------------------------------------------\n");
		double totalCharge =0.0;
		for (int i=0; i<lineItems.size();i++) {
			OrderDetail item= lineItems.get(i);
			double totalPrice =item.calcTotalPrice();
			sb.append(String.format("%-4s | %-7s | %-10s | %-7.0f | %-8d | %-10.0f%n",(i),item.getProduct().getProductID(),item.getProduct().getDescription(),item.getProduct().getPrice(),item.getQuantity(),totalPrice));
			totalCharge+=totalPrice;
		}
		sb.append("tong tien thanh toan: ").append(totalCharge).append("VND\n");
		return sb.toString();
		
	}
	
	
}
