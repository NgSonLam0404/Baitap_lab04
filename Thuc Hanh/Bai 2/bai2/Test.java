package bai2;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LopHocPhan lopHocPhan = new LopHocPhan();

        int choice;
        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Nhập thông tin lớp học phần");
            System.out.println("2. Xuất thông tin lớp học phần");
            System.out.println("3. Thoát");

            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập mã LHP: ");
                    String maLHP = scanner.next();
                    lopHocPhan.setMaLHP(maLHP);

                    System.out.print("Nhập tên LHP: ");
                    scanner.next();String tenLHP = scanner.nextLine();
                    lopHocPhan.setTenLHP(tenLHP);
                    
                    System.out.print("Nhập tên giảng viên: ");
                    scanner.next();String tenGV = scanner.nextLine();
                    lopHocPhan.setTenGV(tenGV);

                    System.out.print("Nhập thông tin lớp học: ");
                    scanner.next();String thongTinLopHoc = scanner.nextLine();
                    lopHocPhan.setThongTinLopHoc(thongTinLopHoc);

                    System.out.print("Nhập số lượng sinh viên: ");
                    int soLuongSV = scanner.nextInt();  
                    scanner.nextLine(); // đọc ký tự xuống dòng

                    SinhVien[] dsSV = new SinhVien[soLuongSV];
                    for (int i = 0; i < soLuongSV; i++) {
                        System.out.println("Nhập thông tin sinh viên thứ " + (i+1));
                        System.out.print("Nhập mã sinh viên: ");  
                        String maSV = scanner.nextLine(); // đọc chuỗi mã sinh viên
                        System.out.print("Nhập họ tên sinh viên: ");
                        String hoTenSV = scanner.nextLine(); // đọc chuỗi họ tên sinh viên
                        SinhVien sv = new SinhVien(maSV, hoTenSV);
                        dsSV[i] = sv;
                    }

                    lopHocPhan.setDsSV(dsSV);

                    break;
                case 2:
                    System.out.println(lopHocPhan.toString());
                    break;
                case 3:
                    System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
                    break;
            }
        } while (choice != 3);

        scanner.close();
    }
}
