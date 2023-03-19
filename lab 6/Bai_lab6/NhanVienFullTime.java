package Bai_lab6;

public class NhanVienFullTime extends NhanVien {
	private String loaiChucVu;
	private int ngayLamThem;

	public NhanVienFullTime(String ten, String loaiChucVu, int ngayLamThem) {
		this.ten = ten;
		this.loaiChucVu = loaiChucVu;
		this.ngayLamThem = ngayLamThem;
	}

	public NhanVienFullTime() {
	}

	@Override
	public String loaiNhanVien() {
		return "Fulltime";
	}

	@Override
	public void xuatThongTin() {
		System.out.println(super.ten + "" + this.ngayLamThem + "" + this.loaiChucVu);
	}

	@Override
	public void tinhLuong() {
		int luong= 2500000+100000*this.ngayLamThem;
		System.out.println("luong la"+luong);
	}
}
