package bai1;

public class ChuyenXe {
	public String maSoChuyen;
	public String hoVaTen;
	public double doanhThu;
	public ChuyenXe(String maSoChuyen, String hoVaTen, double doanhThu) {
		super();
		this.maSoChuyen = maSoChuyen;
		this.hoVaTen = hoVaTen;
		this.doanhThu = doanhThu;
	}
	public ChuyenXe() {
		super();
	}
	public String getMaSoChuyen() {
		return maSoChuyen;
	}
	public void setMaSoChuyen(String maSoChuyen) {
		this.maSoChuyen = maSoChuyen;
	}
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public double getDoanhThu() {
		return doanhThu;
	}
	public void setDoanhThu(double doanhThu) {
		this.doanhThu = doanhThu;
	}
	public double DoanhThu() {
		return this.doanhThu;
	}
	public double TongDT(ChuyenXe tong) {
		return this.doanhThu+doanhThu;
	}
}
