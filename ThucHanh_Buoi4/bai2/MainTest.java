package bai2;
import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        QuanLyHoaDon quanLyHoaDon = new QuanLyHoaDon();
        Scanner input = new Scanner(System.in);
        
        int choice;
        do {
            System.out.println("------ MENU ------");
            System.out.println("1. Them hoa don");
            System.out.println("2. Xuat danh sach hoa don");
            System.out.println("3. Tong so luong khach viet nam");
            System.out.println("4. Tinh trung binh thanh tien khach hang Nươc Ngoai");
            System.out.println("5. Tinh trung binh thanh tien khach hang Viet Nam");
            System.out.println("6. Xuat Hoa Don trong ngay 24/5/2023");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    
                    HoaDon hoaDon = nhapHoaDon(input);
                    quanLyHoaDon.themHoaDon(hoaDon);
                    break;
                case 2:
                    
                    quanLyHoaDon.xuatDanhSachHoaDon();
                    break;
                case 3:
                   
                    int soLuongKhachHangVietNam = quanLyHoaDon.demSoLuongKhachHangVietNam();
                    System.out.println("Tong so luong khach hang viet nam: " + soLuongKhachHangVietNam);
                    break;
                case 4:
                   
                    double trungBinhThanhTienKhachHangNuocNgoai = quanLyHoaDon.tinhTrungBinhThanhTienKhachHangNuocNgoai();
                    System.out.println("trung binh thanh tien khach hang nuoc ngoai:" + trungBinhThanhTienKhachHangNuocNgoai);
                    break;
                case 5:
                    
                    double trungBinhThanhTienKhachHangVietNam = quanLyHoaDon.tinhTrungBinhThanhTienKhachHangVietNam();
                    System.out.println("trung binh thanh tien khanh hang viet nam " + trungBinhThanhTienKhachHangVietNam);
                    break;
                case 6:
                	System.out.println("----- Hoa don ngay 24/5/2023 -----");
                    quanLyHoaDon.xuatHoaDon24052023();
                    break;
                case 0:
                    
                    System.out.println("Da thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le");
            }
        } while (choice != 0);
        
    }
    
    public static HoaDon nhapHoaDon(Scanner input) {
        System.out.println("------ Them hoa don ------");
        System.out.print("Nhap ma khach hang ");
        String maKhachHang = input.nextLine();
        System.out.print("Nhap ho ten: ");
        String hoTen = input.nextLine();
        System.out.print("Nhap ngay xuat hoa don (dd/mm/yyyy): ");
        String ngayRaHoaDon = input.nextLine();
        System.out.print("Nhap loai khach: [ 1 - Khach hang Viet Nam| 2- Khach Hang Nuoc Ngoai ]: ");
        int loaiKhachHang = input.nextInt();
        input.nextLine(); 

        HoaDon hoaDon = null;
        if (loaiKhachHang == 1) {
            System.out.print("Nhap doi tuong su dung:  [ sinh hoat, kinh doanh, san xuat ]: ");
            String doiTuongKhachHang = input.nextLine();
            System.out.print("Nhap so luong (So KW tieu thu): ");
            int soLuong = input.nextInt();
            System.out.print("Nhap don gia: ");
            double donGia = input.nextDouble();
            System.out.print("Nhap dinh muc ");
            int dinhMuc = input.nextInt();
            hoaDon = new KhachHangVietNam(maKhachHang, hoTen, ngayRaHoaDon, doiTuongKhachHang, soLuong, donGia, dinhMuc);
        } else if (loaiKhachHang == 2) {
            System.out.print("Nhap quoc tich ");
            String quocTich = input.nextLine();
            System.out.print("Nhap so luong: ");
            int soLuong = input.nextInt();
            System.out.print("Nhap don gia: ");
            double donGia = input.nextDouble();
            hoaDon = new KhachHangNuocNgoai(maKhachHang, hoTen, ngayRaHoaDon, quocTich, soLuong, donGia);
        } else {
            System.out.println("Lua chon khong op le");
        }

        return hoaDon;
    }
}
