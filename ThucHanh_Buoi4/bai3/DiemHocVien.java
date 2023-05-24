package bai3;

import java.util.ArrayList;
import java.util.List;

class DiemHocVien {
    private String hoTen;
    private int namSinh;
    private List<Double> diemMonHoc;

    public DiemHocVien(String hoTen, int namSinh, List<Double> diemMonHoc) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diemMonHoc = diemMonHoc;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public List<Double> getDiemMonHoc() {
        return diemMonHoc;
    }

    public boolean coLamLuanVanTotNghiep() {
        double diemTrungBinh = tinhDiemTrungBinh();
        for (double diem : diemMonHoc) {
            if (diem < 5) {
                return false;
            }
        }
        return diemTrungBinh >= 7;
    }

    public boolean thiTotNghiep() {
        double diemTrungBinh = tinhDiemTrungBinh();
        for (double diem : diemMonHoc) {
            if (diem < 5) {
                return false;
            }
        }
        return diemTrungBinh > 7;
    }

    public boolean canThiLai() {
        for (double diem : diemMonHoc) {
            if (diem < 5) {
                return true;
            }
        }
        return false;
    }

    public List<String> getMonThiLai() {
        List<String> monThiLai = new ArrayList<>();
        if (canThiLai()) {
            for (int i = 0; i < diemMonHoc.size(); i++) {
                if (diemMonHoc.get(i) < 5) {
                    monThiLai.add(getTenMonHoc(i));
                }
            }
        }
        return monThiLai;
    }

    private String getTenMonHoc(int index) {
        switch (index) {
            case 0:
                return "Toan";
            case 1:
                return "Ly";
            case 2:
                return "Hoa";
            case 3:
                return "Sinh";
            case 4:
                return "Anh";
            default:
                return "";
        }
    }

    private double tinhDiemTrungBinh() {
        double tongDiem = 0;
        for (double diem : diemMonHoc) {
            tongDiem += diem;
        }
        return tongDiem / diemMonHoc.size();
    }

}
