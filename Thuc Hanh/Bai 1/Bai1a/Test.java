package Bai1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Vehiclelist vehicleList = new Vehiclelist();
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.println("1. Nhập danh sách xe");
            System.out.println("2. Xuất danh sách xe");
            System.out.println("3. Thoát");
            int choice = input.nextInt();
            if (choice == 1) {
                vehicleList.nhapDanhSach();
            } else if (choice == 2) {

                vehicleList.xuatDanhSach();
            } else if (choice == 3) {
                System.out.println("Chương trình kết thúc!");
                break;
            } else {
                System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
        }
    }
}
