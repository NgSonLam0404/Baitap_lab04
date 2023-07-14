package Bai1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class QuanLyPhongHoc {
	private ArrayList<PhongHoc> danhSachPhongHoc;

	public QuanLyPhongHoc() {
		danhSachPhongHoc = new ArrayList<>();
	}

	public boolean themPhongHoc(PhongHoc phongHoc) {
	    for (PhongHoc ph : danhSachPhongHoc) {
	        if (ph.getMaPhong().equals(phongHoc.getMaPhong())) {
	            return false;
	        }
	    }
	    danhSachPhongHoc.add(phongHoc);
	    return true;
	}

	public boolean themPhongLyThuyet(String maPhong, String dayNha, double dienTich, int soBongDen,
			boolean coMayChieu) {
		PhongLyThuyet plt = new PhongLyThuyet(maPhong, dayNha, dienTich, soBongDen, coMayChieu);
		return themPhongHoc(plt);
	}

	public boolean themPhongMayTinh(String maPhong, String dayNha, double dienTich, int soBongDen, int soMayTinh) {
		PhongMayTinh pmt = new PhongMayTinh(maPhong, dayNha, dienTich, soBongDen, soMayTinh);
		return themPhongHoc(pmt);
	}

	public boolean themPhongThiNghiem(String maPhong, String dayNha, double dienTich, int soBongDen, String chuyenNganh,
			int sucChua, boolean coBonRua) {
		PhongThiNghiem ptn = new PhongThiNghiem(maPhong, dayNha, dienTich, soBongDen, chuyenNganh, sucChua, coBonRua);
		return themPhongHoc(ptn);
	}

	public PhongHoc timPhongHoc(String maPhong) {
		for (PhongHoc phongHoc : danhSachPhongHoc) {
			if (phongHoc.getMaPhong().equals(maPhong)) {
				return phongHoc;
			}
		}
		return null;
	}

	public void inDanhSach() {
		for (PhongHoc phongHoc : danhSachPhongHoc) {
			System.out.println("Ma Phong    : " + phongHoc.getMaPhong());
			System.out.println("Day Nha     : " + phongHoc.getDayNha());
			System.out.println("Dien tich   : " + phongHoc.getDienTich());
			System.out.println("So bong den : " + phongHoc.getSoBongDen());
			if (phongHoc instanceof PhongMayTinh) {
				System.out.println("So May Tinh :" + ((PhongMayTinh) phongHoc).getSoMayTinh());
			} else if (phongHoc instanceof PhongLyThuyet) {
				System.out.println("Co may chieu: " + ((PhongLyThuyet) phongHoc).isCoMayChieu());
			} else if (phongHoc instanceof PhongThiNghiem) {
				PhongThiNghiem ptm = (PhongThiNghiem) phongHoc;
				System.out.println("Chuyen Nganh:" + ptm.getChuyenNganh());
				System.out.println("Suc Chua: " + ptm.getSucChua());
				System.out.println("Co bon rua:" + ptm.isCoBonRua());
			}
		}
	}
	public void inDanhSachDatChuan() {
		for (PhongHoc phongHoc : danhSachPhongHoc) {
			if (phongHoc instanceof PhongMayTinh && phongHoc.datChuan()) {
				PhongMayTinh pmt =(PhongMayTinh)phongHoc;
				System.out.println("Ma Phong    : " + pmt.getMaPhong());
				System.out.println("Day Nha     : " + pmt.getDayNha());
				System.out.println("Dien tich   : " + pmt.getDienTich());
				System.out.println("So bong den : " + pmt.getSoBongDen());
				System.out.println("So May Tinh :" 	+ pmt.getSoMayTinh());
			}else if (phongHoc instanceof PhongLyThuyet && phongHoc.datChuan()) {
				PhongLyThuyet plt= (PhongLyThuyet)phongHoc;
				System.out.println("Ma Phong    : " + plt.getMaPhong());
				System.out.println("Day Nha     : " + plt.getDayNha());
				System.out.println("Dien tich   : " + plt.getDienTich());
				System.out.println("So bong den : " + plt.getSoBongDen());
				System.out.println("Co may chieu: " + plt.isCoMayChieu());
			}else if (phongHoc instanceof PhongThiNghiem && phongHoc.datChuan()) {
				PhongThiNghiem ptm= (PhongThiNghiem) phongHoc;
				System.out.println("Ma Phong    : " + ptm.getMaPhong());
				System.out.println("Day Nha     : " + ptm.getDayNha());
				System.out.println("Dien tich   : " + ptm.getDienTich());
				System.out.println("So bong den : " + ptm.getSoBongDen());
				System.out.println("Chuyen Nganh:"  + ptm.getChuyenNganh());
				System.out.println("Suc Chua    : " + ptm.getSucChua());
				System.out.println("Co bon rua  :"  + ptm.isCoBonRua());
			}
			
		}
	}
	public void sapXepTheoDayNhaTangDan() {
		danhSachPhongHoc.sort((ph1,ph2)-> ph1.getDayNha().compareTo(ph2.getDayNha()));
	}
	public void sapXepTheoDienTichGiamDan() {
		danhSachPhongHoc.sort((ph1,ph2)-> Double.compare(ph2.getDienTich(),ph1.getDienTich()));
	}
	public void sapXepTheoSoBongDenTangDan() {
		danhSachPhongHoc.sort((ph1,ph2)-> Integer.compare(ph1.getSoBongDen(),ph2.getSoBongDen()));
	}
	public void capNhatSoMayTinh (String maPhong, int soMayTinh) {
		for (PhongHoc phongHoc : danhSachPhongHoc) {
			if (phongHoc.getMaPhong().equals(maPhong)&&phongHoc instanceof PhongMayTinh) {
				((PhongMayTinh)phongHoc).setSoMayTinh(soMayTinh);
			}
		}
	}
	public int xoaPhongHoc(String maPhong) {
		for (PhongHoc phongHoc : danhSachPhongHoc) {
			if(phongHoc.getMaPhong().equals(maPhong)) {
				System.out.println("Ban co chac chan muon xoa");
				Scanner input= new Scanner(System.in);
				int a= input.nextInt();
				if(a==1) {
					danhSachPhongHoc.remove(phongHoc);
					return 1;
				}else 
					return 2;
			}
		}
		return 3;
	}
	public void inTongSoPhongHoc() {
		System.out.println("Tong so phong hoc : "+danhSachPhongHoc.size());
	}
	public void inDanhSachPhongMayTinh60May() {
		for (PhongHoc phongHoc : danhSachPhongHoc) {
			if (phongHoc instanceof PhongMayTinh && ((PhongMayTinh)phongHoc).getSoMayTinh()==60) {
				PhongMayTinh pmt =(PhongMayTinh)phongHoc;
				System.out.println("Ma Phong    : " + pmt.getMaPhong());
				System.out.println("Day Nha     : " + pmt.getDayNha());
				System.out.println("Dien tich   : " + pmt.getDienTich());
				System.out.println("So bong den : " + pmt.getSoBongDen());
				System.out.println("So May Tinh :" 	+ pmt.getSoMayTinh());
			}
		}
	}

}
