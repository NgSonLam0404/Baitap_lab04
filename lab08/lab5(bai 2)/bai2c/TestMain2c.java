package bai2c;

import java.util.Scanner;

public class TestMain2c {
	public static void main(String[] args) {
		SanPham sp1=new SanPham();
		Scanner input=new Scanner(System.in);
		int option = 0;
		do {
			System.out.println("---MeNu---");
			System.out.println("1. Them Thong Tin");
			System.out.println("2. Xuat Thong Tin");
			System.out.println("3. Xuat Thong Tin giam dan theo ten (theo gia tien)");
			System.out.println("4. Tim kiem ten trong danh sach va xoa");
			System.out.println("5. Gia Trung Binh");
			System.out.println("0. Thoat");
			System.out.println("============================");
			option =input.nextInt();
			switch(option) {
			case 1:{
				System.out.println("nhap menu");
				sp1.nhap();
				break;
			}
			case 2:{
				System.out.println("Danh sach la:");
				sp1.indanhsach();
				break;
			}
			case 3:{
				System.out.println("Xuat thong tin theo thu tu giam dan cua gia:");
				sp1.sapXepTheoGiaGiamDan();
				break;
			}
			case 4: {
				System.out.println("Tim kiem va xoa ten");
				System.out.println("Nhập ten san pham bạn muốn xóa");
				input.nextLine();
				String ten=input.nextLine();
				sp1.xoa_TheoTen(ten);
				break;
			}
			case 5:{
				double giaTrungBinh = sp1.tinhGiaTrungBinh();
				System.out.println("Giá trung bình của các sản phẩm là: " + giaTrungBinh);
			}
			}
			
		}while(option!=0);
		
	}

}
