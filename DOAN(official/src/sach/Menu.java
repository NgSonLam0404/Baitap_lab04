package sach;

import java.io.File;
import java.util.Scanner;

import sach.QuanLyKhoSach;
import sach.SachGiaoKhoa;
import sach.SachGiaoKhoa_Cap1;
import sach.SachGiaoKhoa_Cap2;
import sach.SachGiaoKhoa_Cap3;

public class Menu {
	Scanner sc = new Scanner(System.in);
	QuanLyKhoSach list = new QuanLyKhoSach();
	SachGiaoKhoa sgk;
	SachGiaoKhoa_Cap1 sgkc1;
	SachGiaoKhoa_Cap2 sgkc2;
	SachGiaoKhoa_Cap3 sgkc3;

	public void menu() {
		int chon = 0;
		do {
			System.out.println("");
			System.out.println("------Menu------");
			System.out.println("1. Thêm Sách Giáo Khoa Vào Danh Sách");
			System.out.println("2. In Danh Sách");
			System.out.println("3. In Sách Giáo Khoa Cấp 1");
			System.out.println("4. In Sách Giáo Khoa Cấp 2");
			System.out.println("5. In Sách Giáo Khoa Cấp 3");
			System.out.println("6. Kiểm Tra Danh Sách Rỗng");
			System.out.println("7. Số Lượng Sách Giáo Khoa Hiện Có");
			System.out.println("8. Số Lượng Sách Giáo Khoa Cấp 1");
			System.out.println("9. Số Lượng Sách Giáo Khoa Cấp 2");
			System.out.println("10.Số Lượng Sách Giáo Khoa Cấp 3");
			System.out.println("11.Làm Rỗng Danh Sách");
			System.out.println("12.Kiểm Tra Tồn Tại ( Theo Mã Sách)");
			System.out.println("13.Tìm Sách (Theo Mã Sách)");
			System.out.println("14.Tìm Sách (Theo Tên Sách)");
			System.out.println("15.Xóa Sách (Theo Mã Sách)");
			System.out.println("16.Sắp Xếp Tăng Dần (Theo Số Lượng)");
			System.out.println("17.Sắp Xếp Giảm Dần (Theo Số Lượng)");
			System.out.println("18.Sắp Xếp Tăng Dần (Theo Mã Sách)");
			System.out.println("19.Sắp Xếp Giảm Dần (Theo Mã Sách)");
			System.out.println("20.Xóa Sách ( Theo Tên Sách)");
			System.out.println("21.Chỉnh Sửa Thông Tin (Theo Mã Sách )");
			System.out.println("22.Lưu File");
			System.out.println("23.Đọc File");
			System.out.println("24.Kiểm tra sách mới (số năm lớn hơn 2021)");
			System.out.println("0. Thoát");
			System.out.println("");
			chon = sc.nextInt();
			sc.nextLine();

			if (chon == 1) {
				int luaChon = 0;
				// Nếu Lựa Chọn khác 1,2,3 thi nhập lại
				do {
					System.out.println("---Hãy Chọn Sách Giáo Khoa---");
					System.out.println("1.Sách Giáo Khoa Cấp 1");
					System.out.println("2.Sách Giáo Khoa Cấp 2");
					System.out.println("3.Sách Giáo Khoa Cấp 3");
					luaChon = sc.nextInt();

					if (luaChon == 1) {
						sgkc1 = new SachGiaoKhoa_Cap1();
						sgkc1.nhap();
						this.list.themVaoDanhSach(sgkc1);
					} else if (luaChon == 2) {
						sgkc2 = new SachGiaoKhoa_Cap2();
						sgkc2.nhap();
						this.list.themVaoDanhSach(sgkc2);
					} else if (luaChon == 3) {
						sgkc3 = new SachGiaoKhoa_Cap3();
						sgkc3.nhap();
						this.list.themVaoDanhSach(sgkc3);
					} else {
						System.out.println("Vui Lòng Chọn Sách Hợp Lệ !");
					}
				} while (luaChon != 1 && luaChon != 2 && luaChon != 3);

			} else if (chon == 2) {
				this.list.inDanhSach();
			} else if (chon == 3) {
				this.list.inSachCap1();
			} else if (chon == 4) {
				this.list.inSachCa2();
			} else if (chon == 5) {
				this.list.inSachCap3();
			} else if (chon == 6) {
				System.out.println("Danh Sách Có Rỗng Không : " + this.list.kiemTraDanhSachRong());
			} else if (chon == 7) {
				System.out.println("Số Lượng Sách Hiện Có : " + this.list.soLuongSachHienCo());
			} else if (chon == 8) {
				System.out.println("Số Lượng Sách Giáo Khóa Cấp 1 : " + this.list.soluongSachGiaoKhoa_Cap1());
			} else if (chon == 9) {
				System.out.println("Số Lượng Sách Giáo Khóa Cấp 2 : " + this.list.soluongSachGiaoKhoa_Cap2());
			} else if (chon == 10) {
				System.out.println("Số Lượng Sách Giáo Khóa Cấp 3 : " + this.list.soluongSachGiaoKhoa_Cap3());
			} else if (chon == 11) {
				this.list.lamRongDanhSach();
			} else if (chon == 12) {
				System.out.println("Nhập Mã Sách Bạn Muốn Kiểm Tra");
				String maSach = sc.nextLine();
				System.out.println("Kiểm Tra Tồn Tại Theo Mã Sách : " + this.list.kiemTraTonTai_TheoMaSach(maSach));
			} else if (chon == 13) {
				System.out.println("Nhập Mã Sách Bạn Muốn Tìm Kiếm");
				String maSach = sc.nextLine();
				this.list.timSach_TheoMaSach(maSach);
			} else if (chon == 14) {
				System.out.println("Nhập Tên Sách Bạn Muốn Tìm");
				String tenSach = sc.nextLine();
				this.list.timSach_TheoTen(tenSach);
			} else if (chon == 15) {
				System.out.println("Nhập Mã Sách Bạn Muốn Xóa");
				String maSach = sc.nextLine();
				this.list.xoaSach_TheoMaSach(maSach);
			} else if (chon == 16) {
				this.list.sapXepTangDan_TheoSoLuong();
				this.list.inDanhSach();
			} else if (chon == 17) {
				this.list.sapXepGiamDan_TheoSoLuong();
				this.list.inDanhSach();
			} else if (chon == 18) {
				this.list.sapXepTangDan_TheoMaSach();
				this.list.inDanhSach();
			} else if (chon == 19) {
				this.list.sapXepGiamDan_TheoMaSach();
				this.list.inDanhSach();
			} else if(chon==20) {
				System.out.println("Nhập tên sách bạn muốn xóa");
				String ten=sc.nextLine();
				this.list.xoaSach_TheoTenSach(ten);
			}else if(chon==21) {
				System.out.println("Nhập mã sách mà bạn muốn chỉnh sửa thông tin");
				String maSach=sc.nextLine();
				this.list.chinhSuaThongTin_TheoMaSach(maSach);
			}else if(chon==22) {
				System.out.println("Nhập đường dẫn file bạn muốn lưu");
				String file=sc.nextLine();
				File tenFile=new File(file);
				this.list.luuFile(tenFile);
			}else if(chon==23) {
				System.out.println("Nhập đường dẫn file bạn muốn đọc");
				String file=sc.nextLine();
				File tenFile=new File(file);
				this.list.docFile(tenFile);	
			}else if(chon==24) {
				System.out.println("Nhập mã sách bạn muốn kiểm tra");
				String maSach=sc.nextLine();
				System.out.println("Sách mới :"+this.list.KiemTraSachMoi_TheoMaSach(maSach));
			}else if(chon==0) {
				System.out.println("Bạn Đã Thoát Khỏi Menu Xin Cảm Ơn !");		
			}else {
				System.out.println("Vui lòng chọn trong menu");
			}
		}while(chon!=0);
	}
	
}