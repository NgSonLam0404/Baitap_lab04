package bai1_thuchanhchuong4;

public class Test {
	public static void main(String[] args) {
		System.out.println("Trai Cam Cao Phong");
		CamCaoPhong C1 = new CamCaoPhong();
		C1.nhap();
		C1.inTen();
		C1.inColor();
		C1.inGiaBan();
		C1.inSoLuong();
		C1.inNgayNhap();
		C1.inNguonGoc();
		
		System.out.println("Trai Cam");
		QuaCam quacam1 = new QuaCam();
		quacam1.nhap();
		quacam1.inTen();
		quacam1.inColor();
		quacam1.inGiaBan();
		quacam1.inSoLuong();
		quacam1.inNgayNhap();
		quacam1.inNguonGoc();

		QuaTao quatao1 = new QuaTao();
		System.out.println("Trai Tao");
		quatao1.nhap();
		quatao1.inTen();
		quatao1.inColor();
		quatao1.inGiaBan();
		quatao1.inSoLuong();
		quatao1.inNgayNhap();
		quatao1.inNguonGoc();

		
		

		System.out.println("Trai Cam Sanh");
		CamSanh CS1 = new CamSanh();
		CS1.nhap();
		CS1.inTen();
		CS1.inColor();
		CS1.inGiaBan();
		CS1.inSoLuong();
		CS1.inNgayNhap();
		CS1.inNguonGoc();
	}

}
