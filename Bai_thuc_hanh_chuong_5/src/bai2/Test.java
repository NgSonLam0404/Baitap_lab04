package bai2;

import java.util.Scanner;



public class Test {
	
	private static HinhTron nhapHinhTron() {
		Scanner input=new Scanner(System.in);
		System.out.println("nhap ban kinh");
		int r=input.nextInt();
		return new HinhTron(r);
	}
	private static HinhChuNhat nhapHinhChuNhat() {
		Scanner input=new Scanner(System.in);
		System.out.println("nhap cd va cr");
		int cd=input.nextInt();
		int cr=input.nextInt();
		return new HinhChuNhat(cd,cr);
	}
	
	
	public static void main(String[] args) {
	
		HinhTron hinhTron=nhapHinhTron();
		HinhChuNhat hinhChuNhat=nhapHinhChuNhat();
		
		System.out.println("thong tin hinh tron: "+hinhTron.toString()+" dien tich cua no la: "+hinhTron.dienTich());
		System.out.println("thong tin hinh chu nhat la: "+hinhChuNhat.toString()+ "\n"+" dien tich cua no la: "+hinhChuNhat.dienTich());
	
		DanhSachHinh dsh = new DanhSachHinh();
		
		System.out.println("cac hinh nam trong mang la");
		dsh.Them(hinhChuNhat);
		dsh.Them(hinhTron);
		dsh.inDanhSach();
	}
		

}
