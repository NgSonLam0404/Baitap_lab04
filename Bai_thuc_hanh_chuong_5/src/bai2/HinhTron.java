package bai2;

public class HinhTron extends Hinh {
	private float r;
	private double Pi=3.14;
	public HinhTron(float r) {
		this.r=r;
	}
	@Override
	public String toString() {
		return "HinhTron [r=" + r + "]";
	}
	public double dienTich() {
		return Pi*this.r;
	}

}
