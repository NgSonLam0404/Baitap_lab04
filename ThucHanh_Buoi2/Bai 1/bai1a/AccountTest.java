package bai1a;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        AccountList accountList = new AccountList();
        Scanner input = new Scanner(System.in);
        int chon = 0;
        while (chon != 7) {
            System.out.println("----- MENU -----");
            System.out.println("1. Them tai khoan vao he thong");
            System.out.println("2. So luong tai khoan hien co");
            System.out.println("3. In thong tin tai khoan");
            System.out.println("4. Nap tien");
            System.out.println("5. Rut tien");
            System.out.println("6. Chuyen tien");
            System.out.println("7. Thoat chuong trinh");
            System.out.println("------------------------------------");
            System.out.print("Chon chuc nang: ");
            chon = input.nextInt(); input.nextLine();
            switch (chon) {
                case 1:
                    System.out.print("Nhap so tai khoan: ");
                    long soTk = input.nextLong();input.nextLine();
                    System.out.print("Nhap ten tai khoan: ");
                    String tenTk = input.nextLine();
                    Account account = new Account(soTk, tenTk);
                    accountList.themAccount(account);
                    break;
                case 2:
                    int accountCount = accountList.getAccountCount();
                    System.out.println("So tai khoan hien co: " + accountCount);
                    break;
                case 3:
                    accountList.xuatAccountList();
                    break;
                case 4:
                    System.out.print("Nhap so tai khoan: ");
                    long napTienSoTk = input.nextLong();input.nextLine();
                    Account napTienAccount = accountList.timAccountTheoSoTk(napTienSoTk);
                    if (napTienAccount != null) {
                        System.out.print("Nhập số tiền nạp: ");
                        double soTienNap = input.nextDouble(); input.nextLine();
                        napTienAccount.napTien(soTienNap);
                        System.out.println(napTienAccount.getTrangThai());
                    } else {
                        System.out.println("Khong tim thay so tai khoan: " + napTienSoTk);
                    }
                    break;
                case 5:
                    System.out.print("Nhap so tai khoan: ");
                    long rutTienSoTk = input.nextLong();input.nextLine();
                    Account rutTienAccount = accountList.timAccountTheoSoTk(rutTienSoTk);
                    if (rutTienAccount != null) {
                        System.out.print("Nhap so tien can rut: ");
                        double soTienRut = input.nextDouble();input.nextLine();
                        rutTienAccount.rutTien(soTienRut);
                        System.out.println(rutTienAccount.getTrangThai());
                    } else {
                        System.out.println("Khong tim thay so tai khoan" + rutTienSoTk);
                    }
                    break;
                case 6:
                    System.out.print("Nhap so tai khoan nguon: ");
                    long tkNguon = input.nextLong();input.nextLine();
                    Account accountNguon = accountList.timAccountTheoSoTk(tkNguon);
                    if (accountNguon != null) {
                        System.out.print("Nhap so tai khoan dich: ");
                        long tkDich = input.nextLong(); input.nextLine();
                        Account accountDich = accountList.timAccountTheoSoTk(tkDich);
                        if (accountDich != null) {
                            System.out.print("So tien chuyen : ");
                            double soTienChuyen = input.nextDouble(); input.nextLine();
                            accountNguon.chuyenKhoan(accountDich, soTienChuyen);
                            System.out.println(accountNguon.getTrangThai());
                        } else {
                            System.out.println("Khong tim thay tai khoan dich voi so tai khoan : " + tkDich);
                        }
                    } else {
                        System.out.println("Khong tim thay tai khoan nguon voi so tai khoan : " + tkNguon);
                    }
                    break;
                case 7:
                    System.out.println("Thoat Khoi Chuong Trinh !!");
                    System.exit(0);
                    break;
            }
        }
    }
}


