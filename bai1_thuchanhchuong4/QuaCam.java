package bai1_thuchanhchuong4;
//lop QuaCam thua ke lop HoaQua
import java.util.Scanner;

public class QuaCam extends HoaQua {
	public String color="orange";
	Scanner input=new Scanner(System.in);
	public QuaCam(double giaBan, int soLuong, int ngayNhap, String nguonGoc, String ten, String color) {
		super(giaBan, soLuong, ngayNhap, nguonGoc, ten);
		this.color = color;
	}
	public QuaCam() {
		this.ten="Cam";
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
