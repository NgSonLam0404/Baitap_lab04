package bai2;

//Nguyen Son Lam CNTT3
import java.util.Scanner;

public class MainTest {
	public static void main(String[] args) {
		QuanLyHangHoa quanLyHangHoa = new QuanLyHangHoa();
		menu(quanLyHangHoa);
	
	}
	public static void menu(QuanLyHangHoa quanLyHangHoa) {
		Scanner input=new Scanner(System.in);
		int chon;
		do {
			System.out.println("-----Menu-----");
			System.out.println("1. Them hang hoa");
			System.out.println("2. In danh Sach");
			System.out.println("0. thoat");
			System.out.println("chon chuc nang: ");
			chon=input.nextInt();
			switch(chon) {
			case 1:
				quanLyHangHoa.themHangHoa();
				break;
			case 2:
				quanLyHangHoa.inDanhSachHangHoa();
				break;
			case 0:
				System.out.println("thoat");
			}
		}while (chon!=0);
	}
}
