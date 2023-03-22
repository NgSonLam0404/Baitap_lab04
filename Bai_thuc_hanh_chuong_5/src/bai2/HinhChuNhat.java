package bai2;

public class HinhChuNhat extends Hinh {
	private float cd;
	private float cr;
	public HinhChuNhat(float cd, float cr) {
		this.cd=cd;
		this.cr=cr;
	}
	@Override
	public String toString() {
		return "HinhChuNhat [cd=" + cd + ", cr=" + cr + "]";
	}
	public double dienTich() {
		return this.cd*this.cr;
	}

}
