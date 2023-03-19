package Bai_lab6;

public class Main {
	public static void main(String[] args) {

		NhanVien p1 = new NhanVienPartTime("nguyen van a", 5);
		p1.xuatThongTin();
		p1.tinhLuong();

		NhanVien p2 = new NhanVienFullTime("Nguyen Van B ", " Giam Doc", 10);
		p2.xuatThongTin();
		p2.tinhLuong();
	}
}
