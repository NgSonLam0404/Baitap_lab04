package Bai_lab6;

public class NhanVienPartTime extends NhanVien {
	private int gioLamViec;

	public NhanVienPartTime(String ten, int gioLamviec) {
		super(ten);
		this.gioLamViec = gioLamviec;
	}

	@Override
	public void tinhLuong() {
		System.out.println("Luong nhan vien parttime la:" + this.gioLamViec * 250000);
	}

	@Override
	public String loaiNhanVien() {
		return "nhan vien parttime";
	}
}
