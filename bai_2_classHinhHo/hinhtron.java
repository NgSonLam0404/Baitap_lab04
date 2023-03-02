package bai2_lab04;

import java.util.Scanner;

public class hinhtron extends HinhHoc {
	public float banKinh;
	Scanner input = new Scanner(System.in);
	public hinhtron() {}

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
