package bai1;

import java.util.Scanner;

public class SanPham {
	private String tenSp;
	private double donGia;
	private double giamGia;
	Scanner input=new Scanner(System.in);
	
	public SanPham() {}
	public SanPham( String tenSp, double donGia) {
		this.donGia=donGia;
		this.tenSp=tenSp;
	}
	public SanPham(String tenSp, double donGia, double giamGia) {
		super();
		this.tenSp = tenSp;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}
	public String getTenSp() {
		return tenSp;
	}
	public void setTenSp(String tenSp) {
		this.tenSp = tenSp;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public double getGiamGia() {
		return giamGia;
	}
	public void setGiamGia(double giamGia) {
		this.giamGia = giamGia;
	}
	public void nhap() {
		System.out.println("nhap vao ten san pham:");
		this.setTenSp(input.nextLine());
		System.out.println("nhap vao don gia:");
		this.setDonGia(input.nextDouble());
		System.out.println("nhap vao giam gia ");
		this.setGiamGia(input.nextDouble());
	}
	public double getThueNhapKhau() {
		return this.donGia*0.1;
	}
	@Override
	public String toString() {
		return "SanPham [tenSp=" + tenSp + ", donGia=" + donGia + ", giamGia=" + giamGia + ", Thue nhap khau la:"+this.getThueNhapKhau()+ "]";
	}
	
}
