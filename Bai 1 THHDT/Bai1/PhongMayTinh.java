package Bai1;

public class PhongMayTinh extends PhongHoc{
	protected int soMayTinh;

	public PhongMayTinh(String maPhong, String dayNha, double dienTich, int soBongDen, int soMayTinh) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.soMayTinh = soMayTinh;
	}

	public int getSoMayTinh() {
		return soMayTinh;
	}

	public void setSoMayTinh(int soMayTinh) {
		this.soMayTinh = soMayTinh;
	}
	@Override
	public boolean datChuan() {
		return super.datChuan()&& dienTich/soMayTinh>=1.5;
	}
	
	
	

}
