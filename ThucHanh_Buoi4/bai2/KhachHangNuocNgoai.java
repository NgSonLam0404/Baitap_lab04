package bai2;

class KhachHangNuocNgoai extends HoaDon {
    private String quocTich;
    private int soLuong;
    private double donGia;

    public KhachHangNuocNgoai(String maKhachHang, String hoTen, String ngayRaHoaDon, String quocTich, int soLuong, double donGia) {
        super(maKhachHang, hoTen, ngayRaHoaDon);
        this.quocTich = quocTich;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public double tinhThanhTien() {
        return soLuong * donGia;
    }

	public String getQuocTich() {
		return quocTich;
	}

	public void setQuocTich(String quocTich) {
		this.quocTich = quocTich;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	@Override
	public String toString() {
		return "Hoa Don Nuoc Ngoai:"
				+ " Ma Khach Hang   :" + maKhachHang +"\n" 
				+ " Ho Va Ten       :" + hoTen +"\n"
				+ " Ngay Ra Hoa Don :"+ ngayRaHoaDon +"\n"
				+ " Quoc Tich       :" + quocTich +"\n"
				+ " So Luong        :" + soLuong + "\n"
				+ " Don gia         :" + donGia ;
	}
	

}