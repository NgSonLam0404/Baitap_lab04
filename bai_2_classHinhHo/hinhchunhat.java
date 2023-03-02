package bai2_lab04;

import java.util.Scanner;

public class hinhchunhat extends HinhHoc {
	public float dai;
	public float rong;
	Scanner input = new Scanner(System.in);

	public hinhchunhat() {
	}

	public void nhapChieuDai() {
		System.out.println("nhap chieu dai");
		dai = input.nextFloat();
	}

	public void nhapChieuRong() {
		System.out.println("nhap chieu rong");
		rong = input.nextFloat();
	}
	public void tinhChuVi() {
		chuVi=(dai+rong)*2;
		inChuVi();
	}
	public void tinhDienTich() {
		dienTich=dai*rong;
		inDienTich();
	}

}
