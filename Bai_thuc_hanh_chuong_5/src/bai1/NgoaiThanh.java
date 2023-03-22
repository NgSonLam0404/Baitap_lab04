package bai1;


public class NgoaiThanh extends ChuyenXe {
	public String noiDen;
	public int soNgayDiDuoc;
	public NgoaiThanh(String maSoChuyen, String hoVaTen, double doanhThu, String noiDen, int soNgayDiDuoc) {
		super(maSoChuyen, hoVaTen, doanhThu);
		this.noiDen = noiDen;
		this.soNgayDiDuoc = soNgayDiDuoc;
	}
	public NgoaiThanh(String maSoChuyen, String hoVaTen, double doanhThu) {
		super(maSoChuyen, hoVaTen, doanhThu);
	}
	@Override
	public double DoanhThu() {
		return this.doanhThu;
	}
	@Override 
	public double TongDT(ChuyenXe cx2) {
		return this.doanhThu+cx2.doanhThu;
	}
	
}
	


