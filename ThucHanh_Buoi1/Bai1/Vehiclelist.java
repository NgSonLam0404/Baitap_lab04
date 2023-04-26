package Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class Vehiclelist {
	private ArrayList<Vehicle> vehicles;

	public Vehiclelist() {
		vehicles = new ArrayList<>();
	}

	public void nhapDanhSach() {
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("1. Nhập thông tin xe");
			System.out.println("2. Kết thúc nhập");

			int choice = input.nextInt();

			if (choice == 1) {
				input.nextLine();

				System.out.print("Nhập tên chủ xe: ");
				String tenChuXe = input.nextLine();

				System.out.print("Nhập loại xe: ");
				String loaiXe = input.nextLine();

				System.out.print("Nhập dung tích: ");
				double dungTich = input.nextDouble();

				System.out.print("Nhập trị giá: ");
				double triGia = input.nextDouble();

				Vehicle vehicle = new Vehicle(tenChuXe, loaiXe, dungTich, triGia, 0);
				vehicle.tinhThue();

				vehicles.add(vehicle);

			} else if (choice == 2) {
				break;
			}
		}
	}

	public void xuatDanhSach() {
		System.out.println(String.format("| %-20s | %-20s | %-10s | %-20s | %-15s |", "Tên chủ xe", "Loại xe",
				"Dung tích", "Trị giá", "Thuế phải nộp"));
		System.out.println("-------------------------------------------------------------------------------------");
		for (Vehicle vehicle : vehicles) {
			System.out.println(String.format("| %-20s | %-20s | %-10.2f | %-20.2f | %-15.2f |", vehicle.getTenChuXe(),
					vehicle.getLoaiXe(), vehicle.getDungTich(), vehicle.getTriGia(), vehicle.getThuePhaiNop()));
		}
	}

}
