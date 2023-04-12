package bai2a;

public class TestArray {
	public static void main(String[] args) {
	    nhapsothuc listSoThuc = new nhapsothuc();
	    System.out.println("Nhap danh sach so thuc (nhap Y de nhap tiep va N de thoat): ");
	    listSoThuc.nhap();
	    System.out.println("Danh sach so thuc vua nhap la: ");
	    listSoThuc.inDanhSach();
	    System.out.println(listSoThuc.tinhTong());
	}

}
