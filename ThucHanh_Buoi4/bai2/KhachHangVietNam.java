package bai2;

class KhachHangVietNam extends HoaDon {
    private String doiTuongKhachHang;
    private int soLuong;
    private double donGia;
    private int dinhMuc;

    public KhachHangVietNam(String maKhachHang, String hoTen, String ngayRaHoaDon, String doiTuongKhachHang, int soLuong, double donGia, int dinhMuc) {
        super(maKhachHang, hoTen, ngayRaHoaDon);
        this.doiTuongKhachHang = doiTuongKhachHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.dinhMuc = dinhMuc;
    }
    

    public String getDoiTuongKhachHang() {
		return doiTuongKhachHang;
	}


	public void setDoiTuongKhachHang(String doiTuongKhachHang) {
		this.doiTuongKhachHang = doiTuongKhachHang;
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


	public int getDinhMuc() {
		return dinhMuc;
	}


	public void setDinhMuc(int dinhMuc) {
		this.dinhMuc = dinhMuc;
	}


	public double tinhThanhTien() {
        if (soLuong <= dinhMuc) {
            return soLuong * donGia;
        } else {
            return soLuong * donGia * dinhMuc + (soLuong - dinhMuc) * donGia * 2.5;
        }
    }


	@Override
	public String toString() {
		return "Hoa Don Nuoc Ngoai:"
				+ " Ma Khach Hang   :" + maKhachHang +"\n" 
				+ " Ho Va Ten       :" + hoTen +"\n"
				+ " Ngay Ra Hoa Don :" + ngayRaHoaDon +"\n"
				+ " Dinh muc        :" + dinhMuc+"\n"
				+ " So Luong        :" + soLuong + "\n"
				+ " Don gia         :" + donGia ;
	}
	
}