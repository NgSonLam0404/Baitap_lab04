package bai1a;
public class AccountList {
    private Account[] accList;
    private int count;
    public AccountList() {
        this.accList = new Account[10];
        this.count = 0;
    }
    public AccountList(int n) {
        if (n > 0) {
            this.accList = new Account[n];
        } else {
            this.accList = new Account[10];
        }
        this.count = 0;
    }
    public void themAccount(Account account) {
        if (count < accList.length) {
            accList[count] = account;
            count++;
            System.out.println("Them tai khoan thanh cong.");
        } else {
            System.out.println("Kho du lieu he thong da day.");
        }
    }
    public Account timAccountTheoSoTk(long soTk) {
        for (int i = 0; i < count; i++) {
            if (accList[i].getSoTk() == soTk) {
                return accList[i];
            }
        }
        return null;
    }
    public void xoaAccountTheoSoTk(long soTk) {
        for (int i = 0; i < count; i++) {
            if (accList[i].getSoTk() == soTk) {
                for (int j = i; j < count - 1; j++) {
                    accList[j] = accList[j + 1];
                }
                accList[count - 1] = null;
                count--;
                System.out.println("");
                return;
            }
        }
        System.out.println("Khong tim thay so tai khoan: " + soTk + " để xóa.");
    }
    public int getAccountCount() {
        return count;
    }
    public void xuatAccountList() {
        if (count == 0) {
            System.out.println("Danh sach da rong.");
        } else {
            System.out.println("Cac tai khoan trong he thong:");
            for (int i = 0; i < count; i++) {
                System.out.println(accList[i].toString());
            }
        }
    }
}
