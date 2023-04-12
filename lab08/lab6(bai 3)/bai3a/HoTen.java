package bai3a;

import java.util.Scanner;

public class HoTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập họ và tên: ");
        String hoTen = scanner.nextLine().trim();

        String ho = hoTen.substring(0, hoTen.indexOf(" ")).toUpperCase();
        String ten = hoTen.substring(hoTen.lastIndexOf(" ") + 1).toUpperCase();
        String tenDem = hoTen.substring(ho.length() + 1, hoTen.length() - ten.length() - 1).trim();

        System.out.println(" ket qua cua chuong trinh");
        System.out.println("Ho: " + ho);
        System.out.println("Ten: " + ten);
        System.out.println("Ten dem: " + tenDem);
        System.out.println("Ho va ten day du: " + hoTen);
        System.out.println("Ho va ten In Hoa: " + ho.toUpperCase() + " " + ten.toUpperCase());
    }
}
