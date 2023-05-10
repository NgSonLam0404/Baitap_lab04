package bai2;
public class CD {
    private int maCD;
    private String tuaCD;
    private int soBaiHat;
    private double giaThanh;
    public CD() {
        this.maCD = 999999;
        this.tuaCD = "Chua xac dinh";
        this.soBaiHat = 0;
        this.giaThanh = 0.0;
    }
    public CD(int maCD, String tuaCD, int soBaiHat, double giaThanh) {
        this.maCD=maCD;
        this.tuaCD=tuaCD;
        this.soBaiHat=soBaiHat;
        this.giaThanh=giaThanh;
    }
    public int getMaCD() {
        return maCD;
    }
    public void setMaCD(int maCD) {
        if (maCD > 0) {
            this.maCD = maCD;
        } else {
            System.out.println("Ma Cd khong hop le");
        }
    }
    public String getTuaCD() {
        return tuaCD;
    }
    public void setTuaCD(String tuaCD) {
        if (tuaCD != null && !tuaCD.isEmpty()) {
            this.tuaCD = tuaCD;
        } else {
            System.out.println("Tua CD khong hop le");
        }
    }
    public int getSoBaiHat() {
        return soBaiHat;
    }
    public void setSoBaiHat(int soBaiHat) {
        if (soBaiHat > 0) {
            this.soBaiHat = soBaiHat;
        } else {
            System.out.println("Số bài hát không hợp lệ");
        }
    }
    public double getGiaThanh() {
        return giaThanh;
    }
    public void setGiaThanh(double giaThanh) {
        if (giaThanh > 0) {
            this.giaThanh = giaThanh;
        } else {
            System.out.println("Giá thành không hợp lệ");
        }
    }
    @Override
    public String toString() {
        return "CD [Mã CD: " + maCD + ", Tựa CD: " + tuaCD + ", Số bài hát: " + soBaiHat + ", Giá thành: " + giaThanh + "]";
    }
}