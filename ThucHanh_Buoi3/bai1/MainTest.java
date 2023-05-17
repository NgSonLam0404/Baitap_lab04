package bai1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MainTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<Order> orders = new ArrayList<>();
		int chon;
		do {
			System.out.println("-----Menu-----");
			System.out.println("1. Tao Hoa Don");
			System.out.println("2. Xuat Hoa Don");
			System.out.println("0. Thoat");
			System.out.println("----------");
			System.out.println("Lua Chon: ");
			chon = input.nextInt();
			input.nextLine();
			switch (chon) {
			case 1:
				System.out.println("Nhap Ma Hoa Don");
				int orderID = input.nextInt();
				input.nextLine();
				LocalDate orderDate=LocalDate.now();
				
				Order tontaiOrder= find(orders,orderID);
				if(tontaiOrder!=null) {
					System.out.println("Hoa Don da ton tai, them san pham");
					add(tontaiOrder, input);
				}else {
					Order newOrder=new Order(orderID,orderDate);
					System.out.println(" Hoa Don Da duoc tao moi");
					add(newOrder,input);
					orders.add(newOrder);
				}
				break;
			case 2:
				System.out.println("nhap ma hoa don: ");
				int tontaiorderID= input.nextInt();
				input.nextLine();
				
				Order idtontai=find(orders,tontaiorderID);
				if (idtontai!=null) {
					System.out.println(idtontai);
				}else {
					System.out.println("Hoa don khong ton tai");
				}
				break;
			case 0:
				System.out.println("Da thoat chuong trinh");
			}

		} while (chon != 0);
	}

	public static void  add(Order order, Scanner input) {
		System.out.println("Nhap ma san pham:");
		String productID=input.nextLine();
		System.out.println("nhap mo ta san pham");
		String description= input.nextLine();
		System.out.println("Nhap gia san pham: ");
		double price = input.nextDouble();
		System.out.println("Nhap so luong: ");
		int quantity= input.nextInt();
		input.nextLine();
		
		Product product =new Product( description, productID,price);
		order.addLineItem(product, quantity);
		System.out.println("Da them vao hoa don");
		}
	public static Order find(List<Order>orders, int orderID ) {
		for (Order order : orders) {
			if (order.getOrderID()==orderID) {
				return order;
			}
		}
		return null;
	}
}
