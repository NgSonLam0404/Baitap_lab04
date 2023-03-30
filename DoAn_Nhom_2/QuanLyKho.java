package bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLyKho extends SachGiaoKhoa {
	private ArrayList<SachGiaoKhoa> danhSach;
	int option1 = 0, option2 = 0, option3 = 0;
	SachGiaoKhoa sgk1;
	SachGiaoKhoa sgk2;
	SachGiaoKhoa sgk3;
	Scanner input = new Scanner(System.in);

	public QuanLyKho() {
		this.danhSach = new ArrayList<SachGiaoKhoa>();
	}

	public QuanLyKho(String tenSach, String loaiSach, int dayXB, int monthXB, int yearXB, int dayNK, int monthNK,
			int yearNK, String maSach, String nhaXuatBan, int soLanTaiBan, int soLuong) {
		super(tenSach, loaiSach, dayXB, monthXB, yearXB, dayNK, monthNK, yearNK, maSach, nhaXuatBan, soLanTaiBan,
				soLuong);
	}

	public QuanLyKho(ArrayList<SachGiaoKhoa> danhSach) {
		this.danhSach = danhSach;
	}

	@Override
	public void nhapDanhSach(SachGiaoKhoa sgk) {
		danhSach.add(sgk);
	}

	@Override
	public void inDanhSach() {
		for (SachGiaoKhoa sach : danhSach) {
			System.out.println(sach.toString());
		}
	}

	// 3. Kiểm tra danh sach co rỗng hay không
	public boolean kiemTraDanhSachRong() {
		return this.danhSach.isEmpty();
		// hàm isEmpty là hàm có sẵn trả về 2 kết quả true fales
	}

	// 4. lấy ra số lượng trong danh sách
	public int laySoLuongSachHienCo() {
		return this.danhSach.size();
		// đây là hàm size có sẵn
	}

	// 5. làm rỗng danh sách
	public void lamRongDanhSach() {
		this.danhSach.removeAll(danhSach);
	}

	// 6. Kiem tra co ton tai trong danh sach hay khong
	public boolean kiemTraTonTai(String tenSach) {
		for (SachGiaoKhoa sgk : danhSach) {
			if (sgk.getTenSach().equals(tenSach)) {
				return true;
			}
		}
		return false;
	}

	// 7. Tìm kiếm tất cả dựa trên tên
	public void timSach(String maSach) {
		for (SachGiaoKhoa sachGiaoKhoa : danhSach) {
			if (sachGiaoKhoa.getMaSach().equals(maSach)) {
				System.out.println(sachGiaoKhoa);
			}
		}
	}

	// 8. Xoa sach theo ten
	public boolean xoaSachGiaoKhoa(String maSach) {
		SachGiaoKhoa sgk = null;
		for (SachGiaoKhoa s : this.danhSach) {
			if (s.getMaSach().equals(maSach)) {
				sgk = s;
				break;
			}
		}
		if (sgk != null) {
			return this.danhSach.remove(sgk);
		}
		return false;
	}

	// 9. sắp xếp danh sách theo so luong giảm dần
	public void sapXepGiamDan() {
		Collections.sort(danhSach, new Comparator<SachGiaoKhoa>() {
			public int compare(SachGiaoKhoa sgk1, SachGiaoKhoa sgk2) {
				if (sgk1.getSoLuong() < sgk2.getSoLuong()) {
					return 1;
				} else if (sgk1.getSoLuong() > sgk2.getSoLuong()) {
					return -1;
				} else {
					return 0;
				}
			}
		});
	}

	public void Menu() {
		do {
			System.out.println("-----MeNU chuc nang chinh-----");
			System.out.println("1.Nhap thong tin sach ");
			System.out.println("2.Xuat thong tin sach");
			System.out.println("3.Kiem Tra danh sach co rong khong");
			System.out.println("4.Xuat ra so luong hien tai");
			System.out.println("5.Lam rong danh sach");
			System.out.println("6.Kiem tra sach co ton tai trong kho khong");
			System.out.println("7.Tim sach theo ten");
			System.out.println("8.Xoa sach theo ten");
			System.out.println("9.Sap xep toan bo kho sach theo so luong tang dan");
			System.out.println("0:Thoat chuong trinh");
			System.out.println("---------------------------------------------");
			System.out.print("Lua chon cua ban la:   ");
			option1 = input.nextInt();
			switch (option1) {
			case 1: {
				do {
					System.out.println("1.Them du lieu cho kho sach giao khoa cap 1");
					System.out.println("2.Them du lieu cho kho sach giao khoa cap 3");
					System.out.println("3.Them du lieu cho kho sach giao khoa cap 2");
					System.out.println("0. THOAT KHOI MENU NHAP THONG TIN");
					option3 = input.nextInt();
					switch (option3) {
					case 1: {
						System.out.println("Moi ban nhap du lieu cho kho sach giao khoa cap 1");
						System.out.println("Nhap ten sach");
						input.nextLine();
						String tenSach = input.nextLine();
						System.out.println("Nhap maSach");
						String maSach = input.nextLine();
						System.out.println("Nhap nha xuat ban");
						String nhaXuatBan = input.nextLine();
						System.out.println("Nhap so lan tai ban");
						int soLanTaiBan = input.nextInt();
						String loaiSach = "sach cap 1";
						System.out.println("Nhap vao ngay thang nam xuat ban");
						int dayXB = input.nextInt();
						int monthXB = input.nextInt();
						int yearXB = input.nextInt();
						System.out.println("Nhap vao ngay thang nam nhap kho");
						int dayNK = input.nextInt();
						int monthNK = input.nextInt();
						int yearNK = input.nextInt();
						System.out.println("nhap so luong: ");
						int soLuong = input.nextInt();
						SachGiaoKhoa cap1 = new SachGiaoKhoa_cap1(tenSach, loaiSach, dayXB, monthXB, yearXB, dayNK,
								monthNK, yearNK, maSach, nhaXuatBan, soLanTaiBan, soLuong);
						nhapDanhSach(cap1);
						;
						break;
					}
					case 2: {
						System.out.println("Moi ban nhap du lieu cho kho sach giao khoa cap 1");
						System.out.println("Nhap ten sach");
						input.nextLine();
						String tenSach = input.nextLine();
						System.out.println("Nhap maSach");
						String maSach = input.nextLine();
						System.out.println("Nhap nha xuat ban");
						String nhaXuatBan = input.nextLine();
						System.out.println("Nhap so lan tai ban");
						int soLanTaiBan = input.nextInt();
						String loaiSach = "sach cap 2";
						System.out.println("Nhap vao ngay thang nam xuat ban");
						int dayXB = input.nextInt();
						int monthXB = input.nextInt();
						int yearXB = input.nextInt();
						System.out.println("Nhap vao ngay thang nam nhap kho");
						int dayNK = input.nextInt();
						int monthNK = input.nextInt();
						int yearNK = input.nextInt();
						System.out.println("nhap so luong: ");
						int soLuong = input.nextInt();
						SachGiaoKhoa cap2 = new SachGiaoKhoa_cap2(tenSach, loaiSach, dayXB, monthXB, yearXB, dayNK,
								monthNK, yearNK, maSach, nhaXuatBan, soLanTaiBan, soLuong);
						nhapDanhSach(cap2);
						;
						break;
					}
					case 3: {
						System.out.println("Moi ban nhap du lieu cho kho sach giao khoa cap 1");
						System.out.println("Nhap ten sach");
						input.nextLine();
						String tenSach = input.nextLine();
						System.out.println("Nhap maSach");
						String maSach = input.nextLine();
						System.out.println("Nhap nha xuat ban");
						String nhaXuatBan = input.nextLine();
						System.out.println("Nhap so lan tai ban");
						int soLanTaiBan = input.nextInt();
						String loaiSach = "sach cap 3";
						System.out.println("Nhap vao ngay thang nam xuat ban");
						int dayXB = input.nextInt();
						int monthXB = input.nextInt();
						int yearXB = input.nextInt();
						System.out.println("Nhap vao ngay thang nam nhap kho");
						int dayNK = input.nextInt();
						int monthNK = input.nextInt();
						int yearNK = input.nextInt();
						System.out.println("nhap so luong: ");
						int soLuong = input.nextInt();
						SachGiaoKhoa cap3 = new SachGiaoKhoa_cap3(tenSach, loaiSach, dayXB, monthXB, yearXB, dayNK,
								monthNK, yearNK, maSach, nhaXuatBan, soLanTaiBan, soLuong);
						nhapDanhSach(cap3);
						;
						break;
					}

					}
					break;
				} while (option3 != 0);

			}
			case 2: {
				for (SachGiaoKhoa sachGiaoKhoa : danhSach) {
					System.out.println(sachGiaoKhoa);
				}
				break;
			}
			case 3: {
				System.out.println("Kiem tra kho hang hien tai co rong hay khong :");
				if (kiemTraDanhSachRong() == true) {
					System.out.println("Kho hang hien dang rong, can bo sung them sach de kip thoi cung cap!!!");
				} else {
					System.err.println("kho hang hien dang con sach !!!");
				}
				break;
			}
			case 4: {
				System.out.println("Tong so luong sach dang co trong kho la:" + laySoLuongSachHienCo());
				break;
			}
			case 5: {
				System.out.println(" Dang xoa toan bo danh sach!!!! ");
				lamRongDanhSach();
				System.out.println("Danh sach kho hang da duoc lam rong !!!");
				break;
			}
			case 6: {
				System.out.println("Nhập ten sach can kiem tra: ");
				input.nextLine();
				String tenSach = input.nextLine();
				if (kiemTraTonTai(tenSach) == true) {
					System.out.println("Sach ban dang tim van con trong khong");
				} else {
					System.out.println("Rat tiec ! Sach ban can da KHONG CON");
				}
				break;
			}

			case 7: {
				System.out.println("nhap vao ma sach ma ban can tra cuu");
				input.nextLine();
				String maSach = input.nextLine();
				System.out.println("ket qua tim kiem la");
				timSach(maSach);
				break;
			}
			case 8: {
				System.out.println("Nhap vao ma sach ma ban muon xoa: ");
				input.nextLine();
				String maSach = input.nextLine();
				boolean xoaThanhCong = xoaSachGiaoKhoa(maSach);
				if (xoaThanhCong) {
					System.out.println("Đã xóa sách giáo khoa có mã " + maSach + " khỏi danh sách.");
				} else {
					System.out.println("Không tìm thấy sách giáo khoa có mã " + maSach + " trong danh sách.");
				}
				break;
			}
			case 9: {
				sapXepGiamDan();
				inDanhSach();
				break;
			}

			}
		} while (option1 != 0);

	}
}
