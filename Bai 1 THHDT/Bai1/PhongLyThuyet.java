package Bai1;

public class PhongLyThuyet extends PhongHoc {
	protected boolean coMayChieu;

	public PhongLyThuyet(String maPhong, String dayNha, double dienTich, int soBongDen, boolean coMayChieu) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.coMayChieu = coMayChieu;
	}

	public boolean isCoMayChieu() {
		return coMayChieu;
	}

	public void setCoMayChieu(boolean coMayChieu) {
		this.coMayChieu = coMayChieu;
	}
	@Override
	public boolean datChuan() {
		return super.datChuan() && coMayChieu;
	}
}
