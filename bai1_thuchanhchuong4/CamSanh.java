package bai1_thuchanhchuong4;
// lop CamSanh ke thua lai lop QuaCam

import java.util.Scanner;

public class CamSanh extends QuaCam{
	public String color="green";
	Scanner input=new Scanner(System.in);
	public CamSanh() {
		ten="Cam Sanh";
	}
	public CamSanh(String color) {
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
