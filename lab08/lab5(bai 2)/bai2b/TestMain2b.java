package bai2b;

import java.util.Scanner;

public class TestMain2b {
	public static void main(String[] args) {
		listhovaten list1=new listhovaten();
		Scanner input=new Scanner(System.in);
		int option = 0;
		do {
			System.out.println("---MeNu---");
			System.out.println("1. Them Thong Tin");
			System.out.println("2. Xuat Thong Tin");
			System.out.println("3. Xuat Thong Tin ngau nhien");
			System.out.println("4. Xuat Thong Tin giam dan theo ten (thu tu bang chu cai)");
			System.out.println("5. Tim kiem ten trong danh sach va xoa");
			System.out.println("0. Thoat");
			System.out.println("============================");
			option =input.nextInt();
			switch(option) {
			case 1:{
				System.out.println("nhap menu");
				list1.nhap();
				break;
			}
			case 2:{
				System.out.println("Danh sach la:");
				list1.indanhsach();
				break;
			}
			case 3:{
				System.out.println("Danh sach theo thu tu ngau nhien:");
				list1.inRanDom();
				break;
			}
			case 4: {
				System.out.println("Xuat thong tin theo thu tu bang chu cai:");
				list1.sapXepTheoTenGiamDan();
				break;
			}
			case 5:{
				System.out.println("Tim kiem va xoa ten");
				System.out.println("Nhập tên sách bạn muốn xóa");
				input.nextLine();
				String ten=input.nextLine();
				list1.xoa_TheoTen(ten);
				break;
			}
			}
			
		}while(option!=0);
		
	}
}
