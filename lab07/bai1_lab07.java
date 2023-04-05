package lab07;
class HangSanXuat{
	public String tenHangSanXuat;
	public String tenQuocGia;
}
abstract class PhuongTienDiChuyen {
	String loaiPhuongTien;
	HangSanXuat hangSanXuat;
	public String layTenHangSanXuat() {
		return "khong co hang";
	}
	public void batDau() {
		System.out.println("bat dau");
	}
	public void tangToc() {
		System.out.println("tang toc");
	}
	public void dungLai() {
		System.out.println("dung lai ");
	}
	public abstract double layVanToc();
}
class MayBay extends PhuongTienDiChuyen{
	protected String loaiNhienLieu;
	public void catCanh() {
		System.out.println(" i can fly");
	}
	public void haCanh() {
		System.out.println(" ha canh trong 3s");
	}
	@Override
	public double layVanToc() {
		return 120;
	}
}
class XeOTo extends PhuongTienDiChuyen{
	String loaiNhienLieu;
	@Override
	public double layVanToc() {
		return 0;
	}
}
class XeDap extends PhuongTienDiChuyen{
	@Override 
	public double layVanToc() {
		return 0;
	}
}
public class bai1_lab07 {
	public static void main(String[] args) {
		MayBay mb1=new MayBay();
		XeOTo oto1=new XeOTo();
		XeDap xd1=new XeDap();
		System.out.println(mb1.layVanToc());
		System.out.println(oto1.layVanToc());
		System.out.println(xd1.layVanToc());
	}
}