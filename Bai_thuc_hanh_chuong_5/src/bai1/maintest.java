package bai1;

import java.util.ArrayList;



public class maintest {
	public static void main(String[] args) {
	
		ArrayList<ChuyenXe> danhSach = new ArrayList<>();

		ChuyenXe danhSach1a = new NgoaiThanh("chuyen 1", "NguyenVanA", 3500000);
		ChuyenXe danhSach1b = new NgoaiThanh("chuyen 1", "NguyenVanA", 4500000);
		danhSach.add(danhSach1b);
		danhSach.add(danhSach1a);
		
		ChuyenXe danhSach2a = new NoiThanh("chuyen 3", "NguyenVanA", 3500000);
		ChuyenXe danhSach2b = new NoiThanh("chuyen 4", "NguyenVanA", 600000);
		danhSach.add(danhSach2b);
		danhSach.add(danhSach2a);
		
		System.out.println("doanh thu cua xe ngoai thanh 1 la:" + danhSach1b.doanhThu);
		System.out.println("doanh thu cua xe ngoai thanh 2 la:" +danhSach1b.doanhThu);
		double a= danhSach1a.TongDT( danhSach1b);
		System.out.println("tong doanh thu cua hai chuyen la:" + a);

		System.out.println("doanh thu cua xe noi thanh 1 la:" +  danhSach2a.doanhThu);
		System.out.println("doanh thu cua xe noi thanh 2 la:" +  danhSach2a.doanhThu);
		double t= danhSach2a.TongDT( danhSach2b);
		System.out.println("tong doanh thu cua hai chuyen la:" +  t);
		
		System.out.println("tong cua tat ca cac chuyen la"+ (a+t));
	}

}
