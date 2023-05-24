package bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        QuanLyDiem quanLyDiem = new QuanLyDiem();
        Scanner input = new Scanner(System.in);

        int choice = 0;

        while (choice != 5) {
            System.out.println("=== MENU ===");
            System.out.println("1. Them hoc vien");
            System.out.println("2. Dem so luong hoc vien lam bai luan van");
            System.out.println("3. Dem so luong hoc vien thi tot nghiep");
            System.out.println("4. Dem so luong hoc vien phai thi lai va ten cac mon");
            System.out.println("5. Thoat");

            System.out.print("Nhap lua chon");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                   
                    input.nextLine(); 
                    System.out.print("Nhap ho va ten:  ");
                    String hoTen = input.nextLine();
                    System.out.print("Nhap nam sinh: ");
                    int namSinh = input.nextInt();
                    input.nextLine(); 

                    List<Double> diemMonHoc = new ArrayList<>();
                    for (int i = 0; i < 5; i++) {
                        System.out.print("Nhap diem mon hoc thu" + (i + 1) + ": ");
                        double diem = input.nextDouble();
                        diemMonHoc.add(diem);
                    }

                    DiemHocVien diemHocVien = new DiemHocVien(hoTen, namSinh, diemMonHoc);
                    quanLyDiem.themDiemHocVien(diemHocVien);

                    System.out.println("Hoc vien da duoc them");
                    break;
                case 2:
                    
                    int soLuongLuanVanTotNghiep = quanLyDiem.demSoLuongLuanVanTotNghiep();
                    System.out.println("So luong hoc vien lam luan van to nghiep: " + soLuongLuanVanTotNghiep);
                    break;
                case 3:
                   
                    int soLuongThiTotNghiep = quanLyDiem.demSoLuongThiTotNghiep();
                    System.out.println("So luong hoc vien thi tot nghiep: " + soLuongThiTotNghiep);
                    break;
                case 4:
                   
                    int soLuongCanThiLai = quanLyDiem.demSoLuongCanThiLai();
                    System.out.println("So luong hoc vien phai thi lai: " + soLuongCanThiLai);
                    System.out.println("Cac hoc vien phai thi lai va cac mon thi lai:");
                    quanLyDiem.xuatDanhSachMonThiLai();
                    break;
                case 5:
                    System.out.println("Ket thuc chuong trinh ");
                    break;
                default:
                    System.out.println("Lua chon khong hop le ");
                    break;
            }
        }
    }
}
