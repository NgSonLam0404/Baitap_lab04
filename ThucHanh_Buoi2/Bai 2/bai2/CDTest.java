package bai2;
import java.util.Scanner;
public class CDTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CDList cdList = new CDList();
        int chon;
        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Them CD");
            System.out.println("2. So luong CD trong he thong");
            System.out.println("3. Tong gia thanh CD");
            System.out.println("4. Sap xep danh sach tang dan theo gia thanh");
            System.out.println("5. Sap xep danh sach tang dan theo tua CD");
            System.out.println("6. Thong tin toan bo CD trong he thong");
            System.out.println("7. Thoat chuong trinh");
            System.out.println("-----------------------------------------");
            System.out.print("Chon chuc nang: ");
            chon = input.nextInt();
            input.nextLine();
            switch (chon) {
                case 1:
                    System.out.print("nhap ma CD: ");
                    int maCD = input.nextInt(); input.nextLine();
                    System.out.print("nhap tua CD: ");
                    String tuaCD = input.nextLine();
                    System.out.print("Nhap so bai hat: ");
                    int soBaiHat = input.nextInt(); input.nextLine();
                    System.out.print("Nhap gia thanh: ");
                    double giaThanh = input.nextDouble(); input.nextLine();
                    CD cd = new CD(maCD, tuaCD, soBaiHat, giaThanh);
                    if (cdList.themCD(cd)) {
                        System.out.println("Them CD thanh cong");
                    } else {
                        System.out.println("Them CD that bai");
                    }
                    break;
                case 2:
                    int soLuongCD = cdList.soLuongCD();
                    System.out.println("So luong CD: " + soLuongCD);
                    break;
                case 3:
                    double tongGiaThanh = cdList.tongGiaThanh();
                    System.out.println("Tong gia thanh CD: " + tongGiaThanh);
                    break;
                case 4:
                    cdList.sapXepGiamDan();
                    System.out.println("Danh sach sap xep theo gia thanh tang dan");
                    cdList.inThongTinCD();
                    break;
                case 5:
                    cdList.sapXepTangDan();
                    System.out.println("Danh sach sap xep theo tua CD tang dan");
                    cdList.inThongTinCD();
                    break;
                case 6:
                    cdList.inThongTinCD();
                    break;
                case 7:
                    System.out.println("Da thoat khoi chuon r");
                    break;
            }
        } while (chon != 7);
    }
}