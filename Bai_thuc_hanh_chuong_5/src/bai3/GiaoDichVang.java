package bai3;

public class GiaoDichVang extends GiaoDich {
	private String loaiVang;

	public GiaoDichVang(String loaiVang) {
		super();
		this.loaiVang = loaiVang;
	}

	public GiaoDichVang(String maGiaoDich, int ngayGiaoDich, double donGia, int soLuong, String loaiVang) {
		super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
		this.loaiVang = loaiVang;
	}

	@Override
	public double ThanhTien() {
		return super.getDonGia() * super.getSoLuong();
	}

}
