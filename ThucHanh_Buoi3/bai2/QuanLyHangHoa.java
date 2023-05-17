package bai2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

//Nguyễn Sơn Lâm CNTT3
public class QuanLyHangHoa {
    private ArrayList<HangHoa>danhSachHangHoa;
    Scanner input=new Scanner(System.in);
	public QuanLyHangHoa(ArrayList<HangHoa> danhSachHangHoa) {
		super();
		this.danhSachHangHoa = danhSachHangHoa;
	}
    public QuanLyHangHoa() {
		
	}
	public void themHangHoa() {
    	Scanner input=new Scanner(System.in);
    	System.out.println("1. Them hang sanh su");
    	System.out.println("2. them hang Dien Tu");
    	System.out.println("3. Them hang thuc pham");
    	System.out.println("Chon loai hang hoa: ");
    	int chon=input.nextInt();
    	switch(chon) {
    	case 1:
    		themHangSanhSu();
    		break;
    	case 2:
    		themHangDienTu();
    		break;
    	case 3:
    		themHangThucPham();
    		break;
    	default:
    		System.out.println("Lua chon khong hop le");
    	}
    }
    private Date parseDate(String dateStr) {
    	SimpleDateFormat dateFormat= new SimpleDateFormat("dd/MM/yyyy");
    	try {
    		return dateFormat.parse(dateStr);
    	}catch(ParseException e) {
    		e.printStackTrace();
    	}
    	return null;
    }
    private void themHangSanhSu() {
    	System.out.println("Nhap ma hang: ");
    	String maHang= input.nextLine();
    	System.out.println("Nhap ten hang: ");
    	String tenHang= input.nextLine();
    	System.out.println("Nhap so luong ton: ");
    	int soLuongTon= input.nextInt();
    	System.out.println("Nhap don gia");
    	double donGia=input.nextDouble();
    	input.nextLine();
    	System.out.println("Nhap nha san xuat");
    	String nhaSanXuat=input.nextLine();
    	System.out.println("Nhap ngay nhap kho (dd/mm/yyyy):");
    	String ngayNhapKhoStr=input.nextLine();
    	Date ngayNhapKho= parseDate(ngayNhapKhoStr);
    	
    	HangSanhSu hangSanhSu=new HangSanhSu(maHang,tenHang,soLuongTon,donGia,nhaSanXuat, ngayNhapKho);
    	danhSachHangHoa.add(hangSanhSu);
    	
    }
    private void themHangDienTu() {
    	System.out.println("Nhap ma hang: ");
    	String maHang= input.nextLine();
    	System.out.println("Nhap ten hang: ");
    	String tenHang= input.nextLine();
    	System.out.println("Nhap so luong ton: ");
    	int soLuongTon= input.nextInt();
    	System.out.println("Nhap don gia");
    	double donGia=input.nextDouble();
    	System.out.println("nhap thoi gian bao hanh: ");
    	int thoiGianBaoHanh= input.nextInt();
    	System.out.println("Nhap Cong Suat: ");
    	double congSuat=input.nextDouble();
    	
    	HangDienMay hangDienMay=new HangDienMay(maHang,tenHang,soLuongTon,donGia, thoiGianBaoHanh,congSuat);
    	danhSachHangHoa.add(hangDienMay);
    	
    }
    private void themHangThucPham() {
    	System.out.println("Nhap ma hang: ");
    	String maHang= input.nextLine();
    	System.out.println("Nhap ten hang: ");
    	String tenHang= input.nextLine();
    	System.out.println("Nhap so luong ton: ");
    	int soLuongTon= input.nextInt();
    	System.out.println("Nhap don gia");
    	double donGia=input.nextDouble();
    	input.nextLine();
    	System.out.println("Nhap ngay san xuat (dd/mm/yyyy):");
    	String ngaySanXuatStr=input.nextLine();
    	System.out.println("Nhap ngay het han (dd/mm/yyyy):");
    	String ngayHetHanStr=input.nextLine();
    	System.out.println("Nhap nha cung cap: ");
    	String nhaCungCap=input.nextLine();
    	Date ngaySanXuat=parseDate(ngaySanXuatStr);
    	Date ngayHetHan= parseDate(ngayHetHanStr);
    	HangThucPham hangThucPham= new HangThucPham(maHang,tenHang,soLuongTon,donGia,ngaySanXuat, ngayHetHan,nhaCungCap);
    	
    }
    public void inDanhSachHangHoa() {
    	System.out.println("danh sach");
    	for (HangHoa hangHoa : danhSachHangHoa) {
    		System.out.println(hangHoa);
			
		}
    }
}
