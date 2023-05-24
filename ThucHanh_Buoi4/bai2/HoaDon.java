package bai2;

class HoaDon {
    protected String maKhachHang;
    protected String hoTen;
    protected String ngayRaHoaDon;
	public String getMaKhachHang() {
		return maKhachHang;
	}
	public void setMaKhachHang(String maKhachHang) {
		this.maKhachHang = maKhachHang;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getNgayRaHoaDon() {
		return ngayRaHoaDon;
	}
	public void setNgayRaHoaDon(String ngayRaHoaDon) {
		this.ngayRaHoaDon = ngayRaHoaDon;
	}
	@Override
	public String toString() {
		return "HoaDon [maKhachHang=" + maKhachHang + ", hoTen=" + hoTen + ", ngayRaHoaDon=" + ngayRaHoaDon + "]";
	}
	public HoaDon(String maKhachHang, String hoTen, String ngayRaHoaDon) {
		super();
		this.maKhachHang = maKhachHang;
		this.hoTen = hoTen;
		this.ngayRaHoaDon = ngayRaHoaDon;
	}

}
