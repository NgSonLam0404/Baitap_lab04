package bai3b;

import java.util.ArrayList;
import java.util.Scanner;

public class SanPham {
	private String tenSp;
	private String hang;
	private double donGia;
	private ArrayList<SanPham> list;

	public SanPham() {
		this.list = new ArrayList<SanPham>();
	}

	public SanPham(String tenSp, String hang, double donGia, ArrayList<SanPham> list) {
		this.tenSp = tenSp;
		this.hang = hang;
		this.donGia = donGia;
	}

	public SanPham(String tenSp, String hang, double donGia) {
		this.tenSp = tenSp;
		this.hang = hang;
		this.donGia = donGia;
	}

	public String getTenSp() {
		return tenSp;
	}

	public void setTenSp(String tenSp) {
		this.tenSp = tenSp;
	}

	public String getHang() {
		return hang;
	}

	public void setHang(String hang) {
		this.hang = hang;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	@Override
	public String toString() {
		return "SanPham [tenSp=" + tenSp + ", hang=" + hang + ", donGia=" + donGia + "]";
	}

	public void Nhap() {
		String option;
		do {
			Scanner input = new Scanner(System.in);
			System.out.println("Nhập thông tin San Pham:");
			System.out.println("Ten San Pham:");
			tenSp = input.nextLine();
			System.out.println("Hang San Xuat:");
			hang = input.nextLine();
			System.out.println("Gia san pham");
			donGia = input.nextDouble();
			SanPham sanpham = new SanPham(tenSp, hang, donGia); // tạo một đối tượng mới
			list.add(sanpham);
			System.out.println("nhap No de dung");
			option = input.next();
		} while (!option.equalsIgnoreCase("No"));
	}

	public void inDanhSach() {
		for (SanPham sanPham : list) {
			if (sanPham.getHang().equals("Nokia")) {
				System.out.println(sanPham);
			}
		}
	}
}
