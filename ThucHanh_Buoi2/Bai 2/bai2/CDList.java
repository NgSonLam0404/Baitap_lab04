package bai2;
public class CDList {
    private CD[] cdList;
    private int count;
    public CDList() {
        this.cdList = new CD[10];
        this.count = 0;
    }
    public CDList(int n) {
        if (n > 0) {
            this.cdList = new CD[n];
        } else {
            this.cdList = new CD[10];
        }
        this.count = 0;
    }
    public boolean themCD(CD cd) {
        if (count < cdList.length) {
            for (int i = 0; i < count; i++) {
                if (cdList[i].getMaCD() == cd.getMaCD()) {
                    System.out.println("Ma CD da ton tai");
                    return false;
                }
            }
            cdList[count] = cd;
            count++;
            return true;
        } else {
            System.out.println("He thong da day");
            return false;
        }
    }
    public int soLuongCD() {
        return count;
    }
    public double tongGiaThanh() {
        double tong = 0;
        for (int i = 0; i < count; i++) {
            tong += cdList[i].getGiaThanh();
        }
        return tong;
    }
    public void sapXepGiamDan() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (cdList[i].getGiaThanh() < cdList[j].getGiaThanh()) {
                    CD temp = cdList[i];
                    cdList[i] = cdList[j];
                    cdList[j] = temp;
                }
            }
        }
    }
    public void sapXepTangDan() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (cdList[i].getTuaCD().compareToIgnoreCase(cdList[j].getTuaCD()) > 0) {
                    CD temp = cdList[i];
                    cdList[i] = cdList[j];
                    cdList[j] = temp;	
                }
            }
        }
    }
    public void inThongTinCD() {
        if (count == 0) {
            System.out.println("He thong rong");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println(cdList[i].toString());
            }
        }
    }
}