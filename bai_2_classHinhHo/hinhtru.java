package bai2_lab04;

import java.util.Scanner;

public class hinhtru extends hinhtron{
	private float chieuCao;
	Scanner input=new Scanner(System.in);
	public hinhtru() {}
	public void nhapChieuCao() {
		System.out.println("nhap chieu cao");
		chieuCao=input.nextFloat();
	}
	public void tinhTheTich() {
		theTich=Pi*banKinh*chieuCao;
		inTheTich();
	}

}
