package sach;

import java.util.Scanner;

public class SachGiaoKhoa_Cap2 extends SachGiaoKhoa {
	public SachGiaoKhoa_Cap2() {
	}

	public SachGiaoKhoa_Cap2(String maSach,String tenSach, String nhaXuatBan, Date ngayXuatBan, Date ngayNhapKho, int soLanTaiBan,
			int soLuong) {
		super(maSach,tenSach, nhaXuatBan,ngayXuatBan, ngayNhapKho, soLanTaiBan, soLuong);
		
	}
	
	public SachGiaoKhoa_Cap2(String tenSach) {
		super(tenSach);
	}

	
	public boolean kiemTraSachMoi() {
		if (super.ngayNhapKho.getNam() >= 2022)
			return true;
		else
			return false;
	}

	@Override
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập mã sách");
		this.setMaSach(sc.nextLine());
		System.out.println("Nhập ten sách");
		this.setTenSach(sc.nextLine());
		System.out.println("");
		System.out.println("Nhập nhà xuất bản");
		this.setNhaXuatBan(sc.nextLine());
		System.out.println("");
		System.out.println("Nhập ngày,tháng,năm xuất bản của sách");
		this.ngayXuatBan = new Date();
		this.ngayXuatBan.nhapDate();

		// Ràng Buộc ngày tháng năm của ngày nhập kho phải lớn hơn hoặc = ngày xuất bản
		int check;
		do {
			System.out.println("");
			System.out.println("Nhập ngày,tháng,năm nhập kho của sách");
			this.ngayNhapKho = new Date();
			this.ngayNhapKho.nhapDate();
			check = 0;
			if (this.ngayNhapKho.getNam() == this.ngayXuatBan.getNam()) {
				if (this.ngayNhapKho.getThang() == this.ngayXuatBan.getThang()) {
					if (this.ngayNhapKho.getNgay() < this.ngayXuatBan.getNgay()) {
						System.out.println("Vui lòng nhập ngày nhập kho lớn hơn hoặc bằng ngày xuất bản !");
						check = 1;
					}
				} else if (this.ngayNhapKho.getThang() < this.ngayXuatBan.getThang()) {
					System.out.println("Vui lòng nhập tháng nhập kho lớn hơn hoặc bằng tháng xuất bản !");
					check = 1;
				}
			} else if (this.ngayNhapKho.getNam() < this.ngayXuatBan.getNam()) {
				System.out.println("Vui lòng năm ngày nhập kho lớn hơn hoặc bằng năm xuất bản !");
				check = 1;
			}
		} while (check == 1);

		System.out.println("");
		do {
			System.out.println("Nhập số lần tái bản");
			this.setSoLanTaiBan(sc.nextInt());
			if (this.getSoLanTaiBan() < 0) {
				System.out.println("Vui lòng nhập số lần tái bản lớn hơn hoạc bằng 0 !");
			}
		} while (this.getSoLanTaiBan() < 0);

		System.out.println("");
		do {
			System.out.println("Nhập số lượng sách ");
			this.setSoLuong(sc.nextInt());
			if (this.getSoLuong() < 0) {
				System.out.println("Vui lòng nhập số lượng lớn hơn hặc bằng 0 !");
			}
		} while (this.getSoLuong() < 0);
	}
	@Override
	public void chinhsuathongtin() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhập nhà xuất bản bạn muốn chỉnh sửa");
		this.setNhaXuatBan(sc.nextLine());
		System.out.println("Nhập tên sách bạn muốn chỉnh sửa");
		this.setTenSach(sc.nextLine());
		System.out.println("Nhập loai sách bạn muốn chỉnh sửa");
		System.out.println("");
		System.out.println("Nhập ngày,tháng,năm xuất bản của sách bạn muốn chỉnh sửa");
		this.ngayXuatBan = new Date();
		this.ngayXuatBan.nhapDate();

		// Ràng Buộc ngày tháng năm của ngày nhập kho phải lớn hơn hoặc = ngày xuất bản
		int check;
		do {
			System.out.println("");
			System.out.println("Nhập ngày,tháng,năm nhập kho của sách bạn muốn chỉnh sửa");
			this.ngayNhapKho = new Date();
			this.ngayNhapKho.nhapDate();
			check = 0;
			if (this.ngayNhapKho.getNam() == this.ngayXuatBan.getNam()) {
				if (this.ngayNhapKho.getThang() == this.ngayXuatBan.getThang()) {
					if (this.ngayNhapKho.getNgay() < this.ngayXuatBan.getNgay()) {
						System.out.println("Vui lòng nhập ngày nhập kho lớn hơn hoặc bằng ngày xuất bản !");
						check = 1;
					}
				} else if (this.ngayNhapKho.getThang() < this.ngayXuatBan.getThang()) {
					System.out.println("Vui lòng nhập tháng nhập kho lớn hơn hoặc bằng tháng xuất bản !");
					check = 1;
				}
			} else if (this.ngayNhapKho.getNam() < this.ngayXuatBan.getNam()) {
				System.out.println("Vui lòng năm ngày nhập kho lớn hơn hoặc bằng năm xuất bản !");
				check = 1;
			}
		} while (check == 1);

		System.out.println("");
		do {
			System.out.println("Nhập số lần tái bản bạn muốn chỉnh sửa");
			this.setSoLanTaiBan(sc.nextInt());
			if (this.getSoLanTaiBan() < 0) {
				System.out.println("Vui lòng nhập số lần tái bản lớn hơn hoạc bằng 0 !");
			}
		} while (this.getSoLanTaiBan() < 0);

		System.out.println("");
		do {
			System.out.println("Nhập số lượng sách bạn muốn chỉnh sửa");
			this.setSoLuong(sc.nextInt());
			if (this.getSoLuong() < 0) {
				System.out.println("Vui lòng nhập số lượng lớn hơn hặc bằng 0 !");
			}
		} while (this.getSoLuong() < 0);
	}
	

	@Override
	public String toString() {
		return "SachGiaoKhoa_Cap2 "+ super.toString() ;
	}

	@Override
	public int compareTo(SachGiaoKhoa o) {
		return this.getMaSach().compareTo(o.maSach);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		SachGiaoKhoa_Cap2 other = (SachGiaoKhoa_Cap2) obj;
		return tenSach == other.tenSach;
	}

}