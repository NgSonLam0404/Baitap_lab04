package bai2;

public class LopHocPhan {
    private String maLHP;
    private String tenLHP;
    private String tenGV;
    private String thongTinLopHoc;
    private SinhVien[] dsSV;

    public LopHocPhan(String maLHP, String tenLHP, String tenGV, String thongTinLopHoc, SinhVien[] dsSV) {
        this.maLHP = maLHP;
        this.tenLHP = tenLHP;
        this.tenGV = tenGV;
        this.thongTinLopHoc = thongTinLopHoc;
        this.dsSV = dsSV;
    }

    public LopHocPhan() {
        this.maLHP = "";
        this.tenLHP = "";
        this.tenGV = "";
        this.thongTinLopHoc = "";
        this.dsSV = new SinhVien[0];
    }

    public String getMaLHP() {
        return maLHP;
    }

    public void setMaLHP(String maLHP) {
        this.maLHP = maLHP;
    }

    public String getTenLHP() {
        return tenLHP;
    }

    public void setTenLHP(String tenLHP) {
        this.tenLHP = tenLHP;
    }

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    public String getThongTinLopHoc() {
        return thongTinLopHoc;
    }

    public void setThongTinLopHoc(String thongTinLopHoc) {
        this.thongTinLopHoc = thongTinLopHoc;
    }

    public SinhVien[] getDsSV() {
        return dsSV;
    }

    public void setDsSV(SinhVien[] dsSV) {
        this.dsSV = dsSV;
    }

    public int getSoLuongSV() {
        return dsSV.length;
    }

    @Override
    public String toString() {
        String result = "MaLHP: " + this.maLHP + "\n";
        result += "TenLHP: " + this.tenLHP + "\n";
        result += "GvGiangDay: " + this.tenGV + "\n";
        result += "Thongtinbuoihoc: " + this.thongTinLopHoc + "\n";
        result += "Danh sach sinh vien:\n";
        for (SinhVien sv : this.dsSV) {
            result += sv.getMaSV() + "|" + sv.getHoTen() + "\n";
        }
        result += "Tong so sinh vien: " + this.dsSV.length + "\n";
        return result;
    }
}
