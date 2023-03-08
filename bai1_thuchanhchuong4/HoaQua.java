package bai1_thuchanhchuong4;

public class HoaQua {
	public double giaBan;
	public int soLuong;
	public int ngayNhap;
	public String nguonGoc;
	public String ten;
	public HoaQua(double giaBan, int soLuong, int ngayNhap, String nguonGoc, String ten) {
		this.giaBan = giaBan;
		this.soLuong = soLuong;
		this.ngayNhap = ngayNhap;
		this.nguonGoc = nguonGoc;
		this.ten = ten;
	}
	public HoaQua() {}
	public double getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public int getNgayNhap() {
		return ngayNhap;
	}
	public void setNgayNhap(int ngayNhap) {
		this.ngayNhap = ngayNhap;
	}
	public String getNguonGoc() {
		return nguonGoc;
	}
	public void setNguonGoc(String nguonGoc) {
		this.nguonGoc = nguonGoc;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public void inTen() {
		System.out.println("ten la: "+ten);
	}
	public void inSoLuong() {
		System.out.println("so luong la: "+soLuong);
	}
	public void inNgayNhap() {
		System.out.println("ngay nhap la: "+ngayNhap);
	}
	public void inNguonGoc() {
		System.out.println("nguon goc la: "+nguonGoc);
	}
	public void inGiaBan() {
		System.out.println("gia ban la "+giaBan);
	}
	@Override
	public String toString() {
		return "HoaQua [giaBan=" + giaBan + ", soLuong=" + soLuong + ", ngayNhap=" + ngayNhap + ", nguonGoc=" + nguonGoc
				+ ", ten=" + ten + "]";
	}
	
}
