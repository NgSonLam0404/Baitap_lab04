package Bai1;

public class Vehicle {
	private String tenChuXe;
	private String loaiXe;
	private double dungTich;
	private double triGia;
	private double thuePhaiNop;

	public Vehicle(String tenChuXe, String loaiXe, double dungTich, double triGia, double thuePhaiNop) {
		super();
		this.tenChuXe = tenChuXe;
		this.loaiXe = loaiXe;
		this.dungTich = dungTich;
		this.triGia = triGia;
		this.thuePhaiNop = thuePhaiNop;
	}

	public Vehicle() {

	}

	public String getTenChuXe() {
		return tenChuXe;
	}

	public void setTenChuXe(String tenChuXe) {
		this.tenChuXe = tenChuXe;
	}

	public String getLoaiXe() {
		return loaiXe;
	}

	public void setLoaiXe(String loaiXe) {
		this.loaiXe = loaiXe;
	}

	public double getDungTich() {
		return dungTich;
	}

	public void setDungTich(double dungTich) {
		this.dungTich = dungTich;
	}

	public double getTriGia() {
		return triGia;
	}

	public void setTriGia(double triGia) {
		this.triGia = triGia;
	}

	public double getThuePhaiNop() {
		return thuePhaiNop;
	}

	public void tinhThue() {
		if (this.getDungTich() < 100) {
			this.thuePhaiNop = this.getTriGia() * 0.01;
		} else if (this.getDungTich() >= 100 && this.getDungTich() <= 200) {
			this.thuePhaiNop = this.getTriGia() * 0.03;
		} else {
			this.thuePhaiNop = this.getTriGia() * 0.05;
		}
	}
}
