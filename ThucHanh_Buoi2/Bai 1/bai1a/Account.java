package bai1a;
import java.text.NumberFormat;
import java.util.Locale;
public class Account {
    private static final double laiSuat = 0.035;
    private long soTk;
    private String tenTk;
    private double soTien;
    private String trangThai;
    public Account() {
        this.soTk = 999999;
        this.tenTk = "Chua xac dinh";
        this.soTien = 50;
        this.trangThai = "Hop le";
    }
    public Account(long soTk, String tenTk, double soTien) {
        this.soTk=soTk;
        this.soTien= soTien;
        this.tenTk=tenTk;
    }
    public Account(long soTk, String tenTk) {
        this.soTk = soTk;
        this.tenTk = tenTk;
        this.soTien = 50;
        this.trangThai = "Hop le";
    }
    public long getSoTk() {
        return soTk;
    }
    public void setSoTk(long soTk) {
        if (soTk > 0 && soTk != 999999) {
            this.soTk = soTk;
        } else {
            this.soTk = 999999;
            this.trangThai = "So tai khoan khong hop le";
        }
    }
    public String getTenTk() {
        return tenTk;
    }
    public void setTenTk(String tenTk) {
        if (tenTk != null && !tenTk.isEmpty()) {
            this.tenTk = tenTk;
        } else {
            this.tenTk = "Chua xac dinh";
            this.trangThai = "Ten khach hang khong hop le";
        }
    }
    public double getSoTien() {
        return soTien;
    }
    public void setSoTien(double soTien) {
        if (soTien >= 50) {
            this.soTien = soTien;
        } else {
            this.soTien = 50;
            this.trangThai = "So tien khong hop le ";
        }
    }
    public String getTrangThai() {
        return trangThai;
    }
    public void napTien(double soTienNap) {
        if (soTienNap > 0) {
            soTien += soTienNap;
            trangThai = "Da nap tien vao tai khoan";
        } else {
            trangThai = "So tien nap vao khong hop le";
        }
    }
    public void rutTien(double soTienRut) {
        if (soTienRut > 0 && soTienRut <= soTien) {
            soTien -= soTienRut;
            trangThai = "Yeu cau rut tien cua ban da duoc duyet !";
        } else {
            trangThai = "Vui long nhap vao so tien hop le";
        }
    }
    public void chuyenKhoan(Account accountNhan, double soTienChuyen) {
        if (soTienChuyen > 0 && soTienChuyen <= soTien) {
            rutTien(soTienChuyen);
            accountNhan.napTien(soTienChuyen);
            trangThai = "Yeu cau chuyen khoang thanh cong";
        } else {
            trangThai = "So tien chuyen khong ";
        }
    }
    public void daoHan() {
        double laiSuatTichLuy = soTien * laiSuat;
        soTien += laiSuatTichLuy;
        trangThai = "So tien sau khi cong lai suat= 0.035  ";
    }
    public String toString() {
        @SuppressWarnings("deprecation")
		Locale locale = new Locale("vi", "VN");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);
        String formattedSoTien = formatter.format(soTien);
        return "Số tài khoản: " + soTk + "\n" +
               "Tên tài khoản: " + tenTk + "\n" +
               "Số tiền: " + formattedSoTien + "\n" +
               "Trạng thái: " + trangThai;
    }
}




