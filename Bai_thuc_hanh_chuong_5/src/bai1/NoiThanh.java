package bai1;



public class NoiThanh extends ChuyenXe{
	public int soTuyen;
	public int soKmDiDuoc;

	public NoiThanh(String maSoChuyen, String hoVaTen, double doanhThu, int soTuyen, int soKmDiDuoc) {
		super(maSoChuyen, hoVaTen, doanhThu);
		this.soTuyen = soTuyen;
		this.soKmDiDuoc = soKmDiDuoc;
	
	}
	public NoiThanh(String maSoChuyen, String hoVaTen, double doanhThu) {
		super(maSoChuyen, hoVaTen, doanhThu);
	}
	@Override
	public double DoanhThu() {
		return this.doanhThu;
	}
	@Override 
	public double TongDT(ChuyenXe cx1) {
		return this.doanhThu+cx1.doanhThu;
	}
	
}
