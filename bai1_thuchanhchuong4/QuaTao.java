package bai1_thuchanhchuong4;
//QuaTao thua ke lop HoaQua
import java.util.Scanner;

public class QuaTao extends HoaQua {
	public String color="red";
	Scanner input=new Scanner(System.in);
	public QuaTao() {
		this.ten="Qua Tao";
	}
	public QuaTao(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void inColor() {
		System.out.println("mau cua qua la "+color);
	}
	void nhap() {
		System.out.println("nhap gia ban : ");
		super.setGiaBan(input.nextDouble());input.nextLine();
		System.out.println("Nhap nguon goc:");
		this.setNguonGoc(input.nextLine());
		System.out.println("Nhap so luong : ");
		super.setSoLuong(input.nextInt());
		System.out.println("Nhap ngay nhap ");
		super.setNgayNhap(input.nextInt());
	}
}
