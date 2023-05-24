package Bai1;

import java.util.Scanner;

public class MainTest {
	public static void main(String[] args) {
		QuanLyGiaoDich quanLy = new QuanLyGiaoDich();
		Scanner input = new Scanner(System.in);
		int choice;

		do {
			System.out.println("----- MENU -----");
			System.out.println("1. Them Giao Dich");
			System.out.println("2. Xuat Danh Sach Giao Dich");
			System.out.println("3. So luong giao dich tung loai");
			System.out.println("4. Tinh trung binh thanh tien cua giao dich dat");
			System.out.println("5. Tinh trung binh thanh tien cua giao dich nha");
			System.out.println("6. Xuat giao dich ngay 24/5/2023");
			System.out.println("0. Thoat");
			System.out.println("--------------------------------------------------");
			System.out.print("Nhập lựa chọn của bạn: ");
			choice = input.nextInt();

			switch (choice) {
			case 1:
				input.nextLine();
				System.out.println("Chon loai giao dich:");
				System.out.println("1: Giao dich dat");
				System.out.println("2: Giao dich nha");
				int loaiGiaoDich = input.nextInt();
				input.nextLine();

				System.out.println("Nhap ma giao dich");
				String maGiaoDich = input.nextLine();

				System.out.println("Nhap nguoi giao dich: ");
				String hoTenKH = input.nextLine();

				System.out.println("Nhap ngay giao dich (dd/mm/yyyy): ");
				String ngayGiaoDich = input.nextLine();

				System.out.println("Nhap don gia ");
				double donGia = input.nextDouble();

				System.out.println("Nhap dien tich ");
				double dienTich = input.nextDouble();

				if (loaiGiaoDich == 1) {
					char loaiDat;
					do {
						System.out.println("Loai Dat: [A | B| C]: ");
						loaiDat = input.next().charAt(0);
					} while (loaiDat != 'A' && loaiDat != 'B' && loaiDat != 'C');
					GiaoDichDat giaoDichDat = new GiaoDichDat(maGiaoDich, hoTenKH, ngayGiaoDich, donGia, dienTich,
							loaiDat);
					quanLy.themGiaoDich(giaoDichDat);
				} else if (loaiGiaoDich == 2) {
					input.nextLine();
					String loaiNha;
					do {
						System.out.println("Loai Nha [ Cao Cap|Thuong]: ");
						loaiNha = input.nextLine();
					} while (!loaiNha.equalsIgnoreCase("cao cap") && !loaiNha.equalsIgnoreCase("thuong"));

					System.out.print("Nhap dia chi");
					String diaChi = input.nextLine();

					GiaoDichNha giaoDichNha = new GiaoDichNha(maGiaoDich, hoTenKH, ngayGiaoDich, donGia, dienTich,
							loaiNha, diaChi);
					quanLy.themGiaoDich(giaoDichNha);
				} else {
					System.out.println("LUA CHON KHONG HOP LE");
				}
				break;

			case 2:
				System.out.println("----- DANH SACH GIAO DICH TONG -----");
				quanLy.xuatDanhSachGiaoDich();
				System.out.println("--------------------------------");
				break;

			case 3:
				input.nextLine();
				System.out.print("Nhap loai giao dich:"+"\n"
								+"Dat : A|B|C"+"\n"
								+"Nha: Cao Cap |Thuong");
				String loai = input.nextLine();
				int soLuong = quanLy.demSoLuongLoaiGiaoDich(loai);
				System.out.println("So luong giao dich loai  " + loai + "la : " + soLuong);
				break;

			case 4:
				double trungBinhThanhTiendat = quanLy.tinhTrungBinhThanhTienDat();
				System.out.println("Trung binh thanh tien cua giao dich dat: " + trungBinhThanhTiendat);
				break;
			case 5:
				double trungBinhThanhTiennha = quanLy.tinhTrungBinhThanhTienNha();
				System.out.println("Trung binh thanh tien cua giao dich nha: " + trungBinhThanhTiennha);
				break;

			case 6:
				System.out.println("----- DANH SACH GIAO DICH NGAY 24/5/2023 -----");
				quanLy.xuatGiaoDich24_5_2023();
				System.out.println("-----------------------------------------------");
				break;

			case 0:
				System.out.println("Đã thoát chương trình.");
				break;

			default:
				System.out.println("Lựa chọn không hợp lệ!");
				break;
			}
		} while (choice != 0);
	}
}
