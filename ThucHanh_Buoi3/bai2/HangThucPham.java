package bai2;
//Nguyễn Sơn Lâm CNTT3

import java.text.SimpleDateFormat;
import java.util.Date;

public class HangThucPham extends HangHoa {
	private Date ngaySanXuat;
	private Date ngayHetHan;
	private String nhaCungCap;
	public HangThucPham(String maHang, String tenHang, int soLuongTon, double donGia, Date ngaySanXuat, Date ngayHetHan,
			String nhaCungCap) {
		super(maHang, tenHang, soLuongTon, donGia);
		this.ngaySanXuat = ngaySanXuat;
		this.ngayHetHan = ngayHetHan;
		this.nhaCungCap = nhaCungCap;
	}
	public Date getNgaySanXuat() {
		return ngaySanXuat;
	}
	public void setNgaySanXuat(Date ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}
	public Date getNgayHetHan() {
		return ngayHetHan;
	}
	public void setNgayHetHan(Date ngayHetHan) {
		this.ngayHetHan = ngayHetHan;
	}
	public String getNhaCungCap() {
		return nhaCungCap;
	}
	public void setNhaCungCap(String nhaCungCap) {
		this.nhaCungCap = nhaCungCap;
	}
	@Override
	public void tinhTienVAT() {
		double vat=donGia*0.05;
		double tongTien=donGia+vat;
		System.out.println("Tien VAT cua Hang Thuc Pham: "+vat);
		System.out.println("tong tien: "+tongTien);
	}
	@Override
	public void tinhMucDoBanBuon() {
		if(soLuongTon>0 && ngayHetHan.before(new Date())) {
			System.out.println("Hang thuc pham muc do: kho ban");
		}else {
			System.out.println("Hang thuc pham: ban chay");
		}
	}
	@Override
	public String toString() {
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
		String ngaySanXuatStr= dateFormat.format(ngaySanXuat);
		String ngayHetHanStr= dateFormat.format(ngayHetHan);
		return "Ma hang: " + maHang + ", Ten Hang: "+tenHang+", So luong ton: "+soLuongTon+", Don gia: "+ donGia+", Ngay san xuat: "+ngaySanXuatStr+
				", Ngay het han: "+ ngayHetHanStr+", Nha cung cap: "+nhaCungCap;				
	}
}
	
