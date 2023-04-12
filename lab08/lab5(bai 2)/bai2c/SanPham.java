package bai2c;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import bai2b.listhovaten;

public class SanPham {
	private String ten;
	private double gia;
	private ArrayList<SanPham>list;
	public SanPham(String ten, double gia, ArrayList<SanPham> list) {
		super();
		this.ten = ten;
		this.gia = gia;
		this.list = list;
	}
	public SanPham() {
		this.list=new ArrayList<SanPham>();
	}
	public SanPham(String ten, double gia) {
		this.ten=ten;
		this.gia=gia;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	@Override
	public String toString() {
		return "SanPham [ten=" + ten + ", gia=" + gia + "]";
	}
	public void nhap() {
		String option;
		do{
		    Scanner input = new Scanner(System.in);
		    System.out.println("Nhập thông tin San Pham:");
		    System.out.println("Ten San Pham:");
		    ten = input.nextLine();
		    System.out.println("Gia san pham");
		    gia = input.nextDouble();
		    SanPham sanpham = new SanPham(ten,gia); // tạo một đối tượng mới
		    list.add(sanpham); 
		    System.out.println("nhap No de dung");
		    option=input.next();
		}while(!option.equals("No"));
		}
	public void indanhsach() {
		for (SanPham sanPham : list) {
			System.out.println(sanPham);
		}
	}
	public void sapXepTheoGiaGiamDan() {
	    Collections.sort(list, new Comparator<SanPham>() {
	        @Override
	        public int compare(SanPham sp1, SanPham sp2) {
	            return Double.compare(sp2.getGia(), sp1.getGia());
	        }
	    });
	    System.out.println("Danh sách sản phẩm sau khi sắp xếp theo giá giảm dần:");
	    indanhsach();
	}
	public void xoa_TheoTen(String ten) {
		for(int i=0;i<this.list.size();i++) {
			SanPham list=this.list.get(i);
			if(list.getTen().equalsIgnoreCase(ten)) {
				System.out.println("da xoa ten :"+list.getTen());
				this.list.remove(i);
			}
		}indanhsach();
	}
	public double tinhGiaTrungBinh() {
	    double tongGia = 0;
	    double soLuong = list.size();
	    for (SanPham sp : list) {
	        tongGia += sp.getGia();
	    }
	    return tongGia / soLuong;
	}
	

}
