package Bai2_lab6;

public class HocSinh {
	protected String hoTen;
	protected String lop;
	protected double toan, ly, hoa;

	public HocSinh() {
	}

	public HocSinh(String hoTen, String lop, double toan, double ly, double hoa) {
		this.hoTen = hoTen;
		this.lop = lop;
		this.toan = toan;
		this.ly = ly;
		this.hoa = hoa;
	}

	public void diemtrungbinh() {
		double tb = (toan + ly + hoa) / 3;
		System.out.println("diem trung binh la" + tb);
	}
}
