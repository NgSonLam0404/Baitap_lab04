package Bai2_lab6;

public class HocSinhChuyenToan extends HocSinh {
	public HocSinhChuyenToan() {
	}

	public HocSinhChuyenToan(String hoTen, String lop, double toan, double ly, double hoa) {
		super(hoTen, lop, toan, ly, hoa);
	}

	@Override
	public void diemtrungbinh() {
		double tb = ((this.toan * 2 + this.hoa + this.ly)) / 4;
		System.out.println("diem trung binh hoc sinh chuyen toan la: " + tb);
	}

}
