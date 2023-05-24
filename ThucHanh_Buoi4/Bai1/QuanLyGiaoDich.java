package Bai1;

import java.util.ArrayList;

public class QuanLyGiaoDich {
	private ArrayList<GiaoDich> danhSachGiaoDich;

	public QuanLyGiaoDich() {
		danhSachGiaoDich = new ArrayList<>();
	}

	public void themGiaoDich(GiaoDich giaoDich) {
		danhSachGiaoDich.add(giaoDich);
	}

	public void xuatDanhSachGiaoDich() {
		for (GiaoDich giaoDich : danhSachGiaoDich) {
			System.out.println(giaoDich);
		}
	}

	public int demSoLuongLoaiGiaoDich(String loai) {
		int count = 0;
		for (GiaoDich giaoDich : danhSachGiaoDich) {
			if (giaoDich instanceof GiaoDichNha) {
				GiaoDichNha gdn = (GiaoDichNha) giaoDich;
				if (gdn.getLoaiNha().equalsIgnoreCase(loai)) {
					count++;
				}
			} else if (giaoDich instanceof GiaoDichDat) {
				GiaoDichDat gdd = (GiaoDichDat) giaoDich;
				if (gdd.getLoaiDat() == loai.charAt(0)) {
					count++;
				}
			}
		}
		return count;
	}

	public double tinhTrungBinhThanhTienDat() {
		double tongThanhTien = 0;
		int soLuongGiaoDichDat = 0;

		for (GiaoDich giaoDich : danhSachGiaoDich) {
			if (giaoDich instanceof GiaoDichDat) {
				GiaoDichDat GDD = (GiaoDichDat) giaoDich;
				GDD.tinhThanhTien();
				tongThanhTien += GDD.getThanhTien();
				soLuongGiaoDichDat++;
			}
		}

		if (soLuongGiaoDichDat > 0) {
			return tongThanhTien / soLuongGiaoDichDat;
		} else {
			return 0;
		}
	}

	public double tinhTrungBinhThanhTienNha() {
		double tongThanhTien = 0;
		int soLuongGiaoDichNha = 0;

		for (GiaoDich giaoDich : danhSachGiaoDich) {
			if (giaoDich instanceof GiaoDichNha) {
				GiaoDichNha GDN = (GiaoDichNha) giaoDich;
				GDN.tinhThanhTien();
				tongThanhTien += GDN.getThanhTien();
				soLuongGiaoDichNha++;
			}
		}

		if (soLuongGiaoDichNha > 0) {
			return tongThanhTien / soLuongGiaoDichNha;
		} else {
			return 0;
		}
	}

	public void xuatGiaoDich24_5_2023() {
		for (GiaoDich giaoDich : danhSachGiaoDich) {
			String ngayGiaoDich = giaoDich.getNgayGiaoDich();
			if (ngayGiaoDich.contains("24/5/2023") || ngayGiaoDich.contains("24/05/2023")) {
				System.out.println(giaoDich);
			}
		}
	}
}
