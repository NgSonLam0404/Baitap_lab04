package Bai_lab6;

public class NhanVien {
	protected String ten;
	protected long luong;

	public NhanVien() {
	}

	public NhanVien(String ten) {
		this.ten = ten;
	}

	public String loaiNhanVien() {
		return "parttime" + "fulltme";
	}

	public void tinhLuong() {
		System.out.println("can biet luong cu the");
	}

	public void xuatThongTin() {
		System.out.println(loaiNhanVien() + this.ten);
	}

}
