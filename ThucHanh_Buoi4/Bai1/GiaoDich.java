package Bai1;

//Nguyễn Sơn Lâm-1050080105-K10_ĐH_CNTT3
public class GiaoDich {
	protected String maGiaoDich;
	protected String ngayGiaoDich;
	protected String hoTenKH;
	protected double donGia;
	protected double dienTich;
	protected double thanhTien;

	public GiaoDich(String maGiaoDich, String hoTenKH, String ngayGiaoDich, double donGia, double dienTich) {
		super();
		this.maGiaoDich = maGiaoDich;
		this.ngayGiaoDich = ngayGiaoDich;
		this.hoTenKH = hoTenKH;
		this.donGia = donGia;
		this.dienTich = dienTich;
		this.thanhTien = 0;
	}

	public String getMaGiaoDich() {
		return maGiaoDich;
	}

	public void setMaGiaoDich(String maGiaoDich) {
		this.maGiaoDich = maGiaoDich;
	}

	public String getNgayGiaoDich() {
		return ngayGiaoDich;
	}

	public void setNgayGiaoDich(String ngayGiaoDich) {
		this.ngayGiaoDich = ngayGiaoDich;
	}

	public String getHoTenKH() {
		return hoTenKH;
	}

	public void setHoTenKH(String hoTenKH) {
		this.hoTenKH = hoTenKH;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public double getDienTich() {
		return dienTich;
	}

	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}

	public double getThanhTien() {
		return thanhTien;
	}

	public void setThanhTien(double thanhTien) {
		this.thanhTien = thanhTien;
	}

	public void tinhThanhTien() {
		System.out.println("Chua xac dinh duoc loai giao dich");
	}

	@Override
	public String toString() {
		return "GiaoDich [maGiaoDich=" + maGiaoDich + ", ngayGiaoDich=" + ngayGiaoDich + ", hoTenKH=" + hoTenKH
				+ ", donGia=" + donGia + ", dienTich=" + dienTich + ", thanhTien=" + thanhTien + "]";
	}

}
