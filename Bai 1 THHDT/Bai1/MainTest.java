package Bai1;

import java.util.Scanner;

public class MainTest {
	private static QuanLyPhongHoc qlph;
	private static Scanner input;
	public static void main(String[] args) {
		 qlph = new QuanLyPhongHoc();
		 input=new Scanner(System.in);
		
		boolean tiepTuc=true;
		while(tiepTuc) {
			hienThiMenu();
			int luaChon= input.nextInt();
			switch(luaChon) {
			case 1: themPhongHoc(); break;
			case 2: timPhongHoc(); break;
			case 3: inDanhSachPhongHoc(); break;
			case 4: inDanhSachPhongHocDatChuan(); break;
			case 5: sapXepTheoDayNhaTangDan(); break;
			case 6: sapXepDienTichGiamDan(); break;
			case 7: sapXepTheoSoBongDenTangDan(); break;
			case 8: capNhatSoMayTinh(); break;
		
			case 9:xoaPhongHoc(); break;
			
			case 10: inTongSoPhongHoc(); break;
			
			case 11:inDanhSachPhongMayco60May();break;
			case 12: tiepTuc=false;
			break;
			default:
				System.out.println("Lua chon khong hop le");
				break;
			}
		}
		
	}
	 private static void hienThiMenu() {
	        System.out.println("===== MENU =====");
	        System.out.println("1. Them phong hocc");
	        System.out.println("2. Tim phong hoc theo ma");
	        System.out.println("3. In danh sach ");
	        System.out.println("4. In danh sach phong hoc dat chuan");
	        System.out.println("5. Sắp xếp danh sach theo day nha tang dan");
	        System.out.println("6. Sắp xếp danh sach theo dien tich giam dan");
	        System.out.println("7. Sắp xếp danh sach theo so bong den tang dan");
	        System.out.println("8. Cap nhat so may tinh cho phong may tinh");
	        System.out.println("9. Xoa Phong Hoc");
	        System.out.println("10. In tong so ");
	        System.out.println("11. In danh sach phong may co 60 may");
	        System.out.println("12. Thoat");
	        System.out.print("Vui long chon: ");
	    }
	 private static void themPhongHoc() {
		 Scanner input=new Scanner(System.in);
		 System.out.println("----------ThemPhongHoc-------------");
		 System.out.println("1. Phong may tinh");
		 System.out.println("2. Phong li thuyet");
		 System.out.println("3. phong thi nghiem");
		 int loaiPhong = input.nextInt();input.nextLine();
		 String maPhong,dayNha;
		 double dienTich;
		 int soBongDen;
		 PhongHoc phongHoc;
		 
		 switch (loaiPhong) {
		 case 1:
			 System.out.println("Nhap ma phong");
			 maPhong=input.nextLine();
			 System.out.println("Nhap day nha");
			 dayNha=input.nextLine();
			 System.out.print("Nhap dien tich: ");
             dienTich = input.nextDouble();
             System.out.print("Nhap so bong den: ");
             soBongDen = input.nextInt();
             System.out.print("Nhap so may tinh: ");
             int soMayTinh = input.nextInt();
             
             phongHoc = new PhongMayTinh(maPhong, dayNha, dienTich, soBongDen, soMayTinh);
             break;
		 case 2:
			 System.out.println("Nhap ma phong");
			 maPhong=input.nextLine();
			 System.out.println("Nhap day nha");
			 dayNha=input.nextLine();
			 System.out.print("Nhap dien tich: ");
             dienTich = input.nextDouble();
             System.out.print("Nhap so bong den: ");
             soBongDen = input.nextInt();
             input.nextLine(); 
             System.out.print("co may chieu khong (true/false): ");
             boolean coMayChieu = input.nextBoolean();
             input.nextLine(); 

             phongHoc = new PhongLyThuyet(maPhong, dayNha, dienTich, soBongDen, coMayChieu);
             break;
		 case 3:
			 System.out.println("Nhap ma phong");
			 maPhong=input.nextLine();
			 System.out.println("Nhap day nha");
			 dayNha=input.nextLine();
			 System.out.print("Nhap dien tich: ");
             dienTich = input.nextDouble();
             System.out.print("Nhap so bong den: ");
             soBongDen = input.nextInt();
             input.nextLine(); 
             System.out.print("Nhap chuyen nganh: ");
             String chuyenNganh = input.nextLine();
             System.out.print("Nhập sức chứa: ");
             int sucChua = input.nextInt();
             System.out.print("Co bon rua khong (true/false): ");
             boolean coBonRua = input.nextBoolean();
             input.nextLine(); 

             phongHoc = new PhongThiNghiem(maPhong, dayNha, dienTich, soBongDen, chuyenNganh, sucChua, coBonRua);
             break;
          default: 
        	  System.out.println("thoat");
        	  return;
		 }
		 boolean themPhong=qlph.themPhongHoc(phongHoc);
		 if (themPhong) {
			 System.out.println("them phong hoc thanh cong");
		 }else {
			 System.out.println("them phong hoc that bai ma phong da ton tai");
		 }
	 }
	 private static void timPhongHoc() {
		 System.out.println("------Tim Phong Hoc------");
		 System.out.println("Nhap ma can tim: ");
		 input.nextLine();String maPhong=input.nextLine();
		 PhongHoc phongHoc=qlph.timPhongHoc(maPhong);
		 if(phongHoc!=null) {
			 System.out.println("Tim thay phong hoc: ");
			 inThongTinPhongHoc(phongHoc);
		 }else {
			 System.out.println("Khong ton tai trong he thong");
		 }
	 }
	 private static void inDanhSachPhongHoc() {
		 System.out.println("------Danh Sach Phong Hoc--------");
		 qlph.inDanhSach();
	 }
	 private static void inDanhSachPhongHocDatChuan() {
		 System.out.println("------Danh Sach Phong Hoc Dat Chuan-------");
		 qlph.inDanhSachDatChuan();
	 }
	 private static void sapXepTheoDayNhaTangDan() {
		 qlph.sapXepTheoDayNhaTangDan();
		 System.out.println("Da sap xep theo day nha tang dan");
	 }
	 private static void sapXepDienTichGiamDan() {
		 qlph.sapXepTheoDienTichGiamDan();
		 System.out.println("Da sap xep theo dien tich giam dan");
	 }
	 private static void sapXepTheoSoBongDenTangDan() {
		 qlph.sapXepTheoSoBongDenTangDan();
		 System.out.println("Da sap xep danh sach theo so bong den tang dan");
	 }
	 private static void capNhatSoMayTinh() {
		 System.out.println("-----------Cap Nhat so May Tinh--------");
		 System.out.print("Nhap ma phong can cap nhat: ");
	        input.nextLine();String maPhong = input.nextLine();
	        System.out.print("Nhap so may tinh moi: ");
	        int soMayTinh = input.nextInt();
	        input.nextLine();

	        qlph.capNhatSoMayTinh(maPhong, soMayTinh);

	        System.out.println("Cập nhật số máy tính thành công.");
	 }
	 private static void xoaPhongHoc() {
		 System.out.println("--------Xoa phong hoc---------");
		 System.out.println("Nhap ma phong can xoa: ");
		 input.nextLine(); String maPhong= input.nextLine();
		 int xoaPhong=qlph.xoaPhongHoc(maPhong);
		 if (xoaPhong==1) {
			 System.out.println("xoa phong hoc thanh cong");
		 }else if (xoaPhong==2) {
			 System.out.println("xac nhan khong xoa");
		 }else if (xoaPhong==3) {
			 System.out.println("Phong hoc khong ton tai");
		 }
	 }
	 private static void inTongSoPhongHoc() {
		 qlph.inTongSoPhongHoc();;
	 }
	 private static void inDanhSachPhongMayco60May () {
	 System.out.println("--------danh sach phong co 60 may--------");
	 qlph.inDanhSachPhongMayTinh60May();
	 }
	 private static void inThongTinPhongHoc(PhongHoc phongHoc) {
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
	 	


