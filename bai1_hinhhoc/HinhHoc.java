package bai2;

import java.util.Scanner;

public class HinhHoc {
	public float Pi = 3.14f;
	public String ten;
	public float chuVi;
	public float theTich, dienTich;

	public HinhHoc() {

	}

	public void xuatTen() {
		System.out.println("ten cua hinh la" + ten);
	}

	public void inChuVi() {
		System.out.println("chu vi la" + chuVi);
	}

	public void inDienTich() {
		System.out.println("dien tich la" + dienTich);
	}

	public void inTheTich() {
		System.out.println("the tich la" + theTich);
	}
}

class hinhtron extends HinhHoc {
	public float banKinh;
	Scanner input = new Scanner(System.in);

	public hinhtron() {
		this.ten = "hinh tron";
	}

	public void nhapBanKinh() {
		System.out.println("nhap ban kinh");
		banKinh = input.nextFloat();
	}

	public void tinhChuVi() {
		chuVi = 2 * Pi * banKinh;
		inChuVi();
	}

	public void tinhDienTich() {
		dienTich = Pi * banKinh * banKinh;
		inDienTich();
	}
}

class hinhchunhat extends HinhHoc {
	public float dai;
	public float rong;
	Scanner input = new Scanner(System.in);

	public hinhchunhat() {
		this.ten = "hinh chu nhat";
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
		chuVi = (dai + rong) * 2;
		inChuVi();
	}

	public void tinhDienTich() {
		dienTich = dai * rong;
		inDienTich();
	}

}

class hinhtru extends hinhtron {
	public float chieuCao;

	public hinhtru() {
		this.ten = "hinh tru";
	}

	public void nhapChieuCao() {
		System.out.println("nhap chieu cao");
		chieuCao = input.nextFloat();
	}

	public void tinhTheTich() {
		System.out.println("nhap lai ban kinh");
		banKinh = input.nextFloat();
		theTich = 2 * chieuCao * Pi * banKinh * banKinh;
		inTheTich();
	}

}

class hinhvuong extends hinhchunhat {
	public float a;

	public hinhvuong() {
		ten = "hinh vuong";
	}

	public void nhapCanh() {
		System.out.println("nhap do dai canh");
		a = input.nextFloat();
		this.dai = this.rong = a;
	}

}
