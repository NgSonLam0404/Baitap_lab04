package bai3;

import java.util.ArrayList;
import java.util.List;

class QuanLyDiem {
    private List<DiemHocVien> danhSachDiem;

    public QuanLyDiem() {
        danhSachDiem = new ArrayList<>();
    }

    public void themDiemHocVien(DiemHocVien diemHocVien) {
        danhSachDiem.add(diemHocVien);
    }

    public int demSoLuongLuanVanTotNghiep() {
        int count = 0;
        for (DiemHocVien diemHocVien : danhSachDiem) {
            if (diemHocVien.coLamLuanVanTotNghiep()) {
                count++;
            }
        }
        return count;
    }

    public int demSoLuongThiTotNghiep() {
        int count = 0;
        for (DiemHocVien diemHocVien : danhSachDiem) {
            if (diemHocVien.thiTotNghiep()) {
                count++;
            }
        }
        return count;
    }

    public int demSoLuongCanThiLai() {
        int count = 0;
        for (DiemHocVien diemHocVien : danhSachDiem) {
            if (diemHocVien.canThiLai()) {
                count++;
            }
        }
        return count;
    }

    public void xuatDanhSachMonThiLai() {
        for (DiemHocVien diemHocVien : danhSachDiem) {
            if (diemHocVien.canThiLai()) {
                List<String> monThiLai = diemHocVien.getMonThiLai();
                System.out.println("Hoc vien: " + diemHocVien.getHoTen());
                System.out.println("Mon thi lai: " + monThiLai);
            }
        }
    }
}
