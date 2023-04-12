package bai3c;

import java.util.ArrayList;
import java.util.Scanner;

public class SinhVien {
	private String email;
	private String sdt;
	private String cccd;
	private String hoTen;
	private ArrayList<SinhVien> list;

	public SinhVien(String email, String sdt, String cccd, String hoTen, ArrayList<SinhVien> list) {
		super();
		this.email = email;
		this.sdt = sdt;
		this.cccd = cccd;
		this.hoTen = hoTen;
		this.list = list;
	}

	public SinhVien(String hoTen, String cccd, String sdt, String email) {
		super();
		this.email = email;
		this.sdt = sdt;
		this.cccd = cccd;
		this.hoTen = hoTen;
	}

	public SinhVien() {
		this.list = new ArrayList<SinhVien>();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getCccd() {
		return cccd;
	}

	public void setCccd(String cccd) {
		this.cccd = cccd;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	@Override
	public String toString() {
		return "SinhVien [email=" + email + ", sdt=" + sdt + ", cccd=" + cccd + ", hoTen=" + hoTen + "]";
	}

	public void nhap() {
		Scanner input = new Scanner(System.in);

		System.out.print("Nhap ho ten: ");
		this.hoTen = input.nextLine();

		// Kiểm tra định dạng email
		while (true) {
			System.out.print("Nhap email: ");
			String inputEmail = input.nextLine();

			if (inputEmail.matches("^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,3})+$")) {
				this.email = inputEmail;
				break;
			} else {
				System.out.println("Sai dinh dang email, vui long nhap lai!");
			}
		}

		// Kiểm tra định dạng số điện thoại
		while (true) {
			System.out.print("Nhap so dien thoai: ");
			String inputSDT = input.nextLine();

			if (inputSDT.matches("^\\d{10,11}$")) {
				this.sdt = inputSDT;
				break;
			} else {
				System.out.println("Sai dinh dang so dien thoai, vui long nhap lai!");
			}
		}

		// Kiểm tra định dạng CMND
		while (true) {
			System.out.print("Nhap so CMND: ");
			String inputCCCD = input.nextLine();

			if (inputCCCD.matches("^\\d{9}$")) {
				this.cccd = inputCCCD;
				break;
			} else {
				System.out.println("Sai dinh dang CMND, vui long nhap lai!");
			}
		}
		SinhVien sv = new SinhVien(hoTen, cccd, sdt, email);
		list.add(sv);
	}

	public void inDanhSach() {
		for (SinhVien sinhVien : list) {
			System.out.println(sinhVien);
		}
	}
}
