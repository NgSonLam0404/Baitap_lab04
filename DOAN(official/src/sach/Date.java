package sach;

import java.util.Scanner;

public class Date {
	private int ngay, thang, nam;

	public Date(int ngay, int thang, int nam) {
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}

	public Date() {
	}

	public int getNgay() {
		return ngay;
	}

	public void setNgay(int ngay) {
		this.ngay = ngay;
	}

	public int getThang() {
		return thang;
	}

	public void setThang(int thang) {
		this.thang = thang;
	}

	public int getNam() {
		return nam;
	}

	public void setNam(int nam) {
		this.nam = nam;
	}

	public void nhapDate() {
		//Ràng buộc nếu năm <=0 thì nhập lại
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nhập năm của sách");
			this.setNam(sc.nextInt());
			if (this.getNam() <= 0 && this.getNam() > 2023) {
				System.out.println("Vui lòng nhập năm của sách lớn hơn 0 !");
			}
		} while (this.getNam() <= 0);

		//Ràng buộc nếu tháng <=0 hoặc >12 thì nhập lại
		do {
			System.out.println("Nhập tháng của sách");
			this.setThang(sc.nextInt());
			if (this.getThang() <= 0 || this.getThang() > 12) {
				System.out.println("Vui lòng nhập tháng của sách lớn hơn 0 và nhỏ hơn 13 !");
			}
		} while (this.getThang() <= 0 || this.getThang() > 12);

		//Ràng buộc ngày 
		//Tháng 1,3,5,7,8,10,12 => 0 < ngày < 32
		//Tháng 2 năm nhuận => 0 < ngay < 30
		//Tháng 2 năm không nhuận => 0 < ngay <29
		//Tháng còn lại là => 0 < ngay < 31
		if (this.getThang() == 1 || this.getThang() == 3 || this.getThang() == 5 || this.getThang() == 7
				|| this.getThang() == 8 || this.getThang() == 10 || this.getThang() == 12) {
			do {
				System.out.println("Nhập ngày ");
				this.setNgay(sc.nextInt());
				if (this.getNgay() <= 0 || this.getNgay() > 31) {
					System.out.println("Vui lòng nhập ngày từ 1-31 !");
				}
			} while (this.getNgay() <= 0 || this.getNgay() > 31);
		} else if (this.getThang() == 2) {
			if (this.getNam() % 400 == 0 || this.getNam() % 4 == 0 && this.getNam() % 100 != 0) {
				do {
					System.out.println("Nhập ngày ");
					this.setNgay(sc.nextInt());
					if (this.getNgay() <= 0 || this.getNgay() > 29)
						System.out.println("Vui Lòng nhập ngày từ 1-29 !");
				} while (this.getNgay() <= 0 || this.getNgay() > 29);
			} else {
				do {
					System.out.println("Nhập ngày ");
					this.setNgay(sc.nextInt());
					if (this.getNgay() <= 0 || this.getNgay() > 28)
						System.out.println("Vui Lòng nhập ngày từ 1-28 !");
				} while (this.getNgay() <= 0 || this.getNgay() > 28);
			}
		} else {
			do {
				System.out.println("Nhập ngày");
				this.setNgay(sc.nextInt());
				if (this.getNgay() <= 0 || this.getNgay() > 30)
					System.out.println("Vui lòng nhập ngày từ 1-30 !");
			} while (this.getNgay() <= 0 || this.getNgay() > 30);
		}
	}

	@Override
	public String toString() {
		return this.getNgay() + "/" + this.getThang() + "/" + this.getNam();
	}
}