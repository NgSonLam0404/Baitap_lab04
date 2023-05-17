package bai2;

import java.util.Date;

//Nguyễn Sơn Lâm
public class HangDienMay extends HangHoa{
	private int thoiGianBaoHanh;
	private double congSuat;
	public HangDienMay(String maHang, String tenHang, int soLuongTon, double donGia, int thoiGianBaoHanh,
			double congSuat) {
		super(maHang, tenHang, soLuongTon, donGia);
		this.thoiGianBaoHanh = thoiGianBaoHanh;
		this.congSuat = congSuat;
	}
	public int getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}
	public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}
	public double getCongSuat() {
		return congSuat;
	}
	public void setCongSuat(double congSuat) {
		this.congSuat = congSuat;
	}
	@Override
	public void tinhMucDoBanBuon() {
		if(soLuongTon<0 ) {
			System.out.println("Hang dien may muc do: kho ban");
		}else {
			System.out.println("Hang dien may: ban chay");
		}
	}
	@Override
	public void tinhTienVAT() {
		double vat=donGia*0.1;
		double tongTien=donGia+vat;
		System.out.println("Tien VAT cua Hang Dien may: "+vat);
		System.out.println("tong tien: "+tongTien);
	}
	@Override
	public String toString() {
		return "Ma hang: " + maHang + ", Ten Hang: "+tenHang+", So luong ton: "+soLuongTon+", Don gia: "+ donGia+
				", thoi gian bao hanh: "+thoiGianBaoHanh+", congSuat: "+congSuat;
	}
}
