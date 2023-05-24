package bai2;

import java.util.ArrayList;

class QuanLyHoaDon {
    private ArrayList<HoaDon> danhSachHoaDon;

    public QuanLyHoaDon() {
        danhSachHoaDon = new ArrayList<>();
    }

    public void themHoaDon(HoaDon hoaDon) {
        danhSachHoaDon.add(hoaDon);
    }

    public void xuatDanhSachHoaDon() {
        for (HoaDon hoaDon : danhSachHoaDon) {
            System.out.println(hoaDon.toString());
        }
    }

    public int demSoLuongKhachHangVietNam() {
        int count = 0;
        for (HoaDon hoaDon : danhSachHoaDon) {
            if (hoaDon instanceof KhachHangVietNam) {
                count++;
            }
        }
        return count;
    }

    public double tinhTrungBinhThanhTienKhachHangNuocNgoai() {
        double tongThanhTien = 0;
        int soLuongKhachHangNuocNgoai = 0;
        for (HoaDon hoaDon : danhSachHoaDon) {
            if (hoaDon instanceof KhachHangNuocNgoai) {
                KhachHangNuocNgoai khachHangNuocNgoai = (KhachHangNuocNgoai) hoaDon;
                tongThanhTien += khachHangNuocNgoai.tinhThanhTien();
                soLuongKhachHangNuocNgoai++;
            }
        }
        if (soLuongKhachHangNuocNgoai > 0) {
            return tongThanhTien / soLuongKhachHangNuocNgoai;
        } else {
            return 0;
        }
    }
    public double tinhTrungBinhThanhTienKhachHangVietNam() {
        double tongThanhTien = 0;
        int soLuongKhachHangVietNam = 0;
        for (HoaDon hoaDon : danhSachHoaDon) {
            if (hoaDon instanceof KhachHangVietNam) {
                KhachHangVietNam KHVN = (KhachHangVietNam) hoaDon;
                tongThanhTien += KHVN.tinhThanhTien();
                soLuongKhachHangVietNam++;
            }
        }
        if (soLuongKhachHangVietNam > 0) {
            return tongThanhTien / soLuongKhachHangVietNam;
        } else {
            return 0;
        }
    }

    public void xuatHoaDon24052023() {
        for (HoaDon hoaDon : danhSachHoaDon) {
            String ngayRaHoaDon = hoaDon.getNgayRaHoaDon();
           if (ngayRaHoaDon.contains("24/5/2023")&& ngayRaHoaDon.contains("24/05/2023")) {
                System.out.println(hoaDon.toString());
            }
        }
    }
}
