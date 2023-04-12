package bai1;

public class MainTest {
	public static void main(String[] args) {
		SanPham sp1=new SanPham();
		SanPham sp2=new SanPham();
		SanPham sp3=new SanPham("Banh Gao",14300);
		sp1.nhap();
		System.out.println(sp1.toString());
		sp2.nhap();
		System.out.println(sp2.toString());
		System.out.println(sp3.toString());
	}

}
