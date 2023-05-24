package Bai1;

class GiaoDichDat extends GiaoDich {
	private char loaiDat;

	public GiaoDichDat(String maGiaoDich,String hoTenKH ,String ngayGiaoDich, double donGia, double dienTich, char loaiDat) {
		super(maGiaoDich, hoTenKH, ngayGiaoDich, donGia, dienTich);
		this.loaiDat = loaiDat;
	}

	@Override
	public void tinhThanhTien() {
		if (loaiDat == 'A') {
			thanhTien = dienTich * donGia * 1.5;
		} else {
			thanhTien = dienTich * donGia;
		}
	}

	public char getLoaiDat() {
		return loaiDat;
	}

	public void setLoaiDat(char loaiDat) {
		this.loaiDat = loaiDat;
	}

	@Override
	public String toString() {
		return "Giao Dich Dat:"
				+ "Ma Giao Dich   :" + maGiaoDich +"\n"
				+ "Ho va ten KH   :" + hoTenKH+"\n"
				+ "Ngay Giao Dich :" + ngayGiaoDich +"\n"
				+ "Don Gia        :" + donGia+"\n"
				+ "Dien Tich      :" + dienTich + "\n"
				+ "Thanh Tien     :" + thanhTien + "\n"
				+ "Loai Dat       :" + loaiDat;
	}

}
