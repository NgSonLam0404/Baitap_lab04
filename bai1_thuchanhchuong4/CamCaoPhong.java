package bai1_thuchanhchuong4;
// lop CamCaoPhong ke thua lop QuaCam
import java.util.Scanner;

public class CamCaoPhong extends QuaCam {
	public String color="green-orange";
	Scanner input= new Scanner(System.in);
	public CamCaoPhong() {
		ten="Cam Cao Phong";
	}
	public CamCaoPhong(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	void nhap() {
		System.out.println("nhap gia ban : ");
		this.setGiaBan(input.nextDouble());input.nextLine();
		System.out.println("Nhap nguon goc:");
		this.setNguonGoc(input.nextLine());
		System.out.println("Nhap so luong : ");
		this.setSoLuong(input.nextInt());
		System.out.println("Nhap ngay nhap ");
		this.setNgayNhap(input.nextInt());
	}

}
