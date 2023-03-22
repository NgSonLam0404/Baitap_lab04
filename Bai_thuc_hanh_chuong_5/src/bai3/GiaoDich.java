	package bai3;

public class GiaoDich {
	private String maGiaoDich;
	private int ngayGiaoDich;
	private double donGia;
	private int soLuong;
	public GiaoDich() {
		super();
	}
	public GiaoDich(String maGiaoDich, int ngayGiaoDich, double donGia, int soLuong) {
		super();
		this.maGiaoDich = maGiaoDich;
		this.ngayGiaoDich = ngayGiaoDich;
		this.donGia = donGia;
		this.soLuong = soLuong;
	}
	
	
	public String getMaGiaoDich() {
		return maGiaoDich;
	}
	public void setMaGiaoDich(String maGiaoDich) {
		this.maGiaoDich = maGiaoDich;
	}
	public int getNgayGiaoDich() {
		return ngayGiaoDich;
	}
	public void setNgayGiaoDich(int ngayGiaoDich) {
		this.ngayGiaoDich = ngayGiaoDich;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public double ThanhTien() {
		return this.soLuong*this.donGia;
	}
	@Override
	public String toString() {
		return "GiaoDich [maGiaoDich=" + maGiaoDich + ", ngayGiaoDich=" + ngayGiaoDich + ", donGia=" + donGia
				+ ", soLuong=" + soLuong + "]";
	}
	
}
