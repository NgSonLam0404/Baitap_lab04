package bai2;
//Nguyễn Sơn Lâm CNTT3

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class HangSanhSu extends HangHoa {
	private String nhaSanXuat;
	private Date ngayNhapKho;
	public HangSanhSu(String maHang, String tenHang, int soLuongTon, double donGia, String nhaSanXuat,
			Date ngayNhapKho) {
		super(maHang, tenHang, soLuongTon, donGia);
		this.nhaSanXuat = nhaSanXuat;
		this.ngayNhapKho = ngayNhapKho;
	}
	public String getNhaSanXuat() {
		return nhaSanXuat;
	}
	public void setNhaSanXuat(String nhaSanXuat) {
		this.nhaSanXuat = nhaSanXuat;
	}
	public Date getNgayNhapKho() {
		return ngayNhapKho;
	}
	public void setNgayNhapKho(Date ngayNhapKho) {
		this.ngayNhapKho = ngayNhapKho;
	}
	@Override
	public void tinhTienVAT() {
		double vat=donGia*0.15;
		double tongTien=donGia+vat;
		System.out.println("Tien VAT cua Hang Sanh Su: "+vat);
		System.out.println("tong tien: "+tongTien);
	}
	@Override
	public void tinhMucDoBanBuon() {
		if(soLuongTon>3 && tinhSoNgayLuuKho()>10 ) {
			System.out.println("Hang dien may muc do: kho ban");
		}else {
			System.out.println("Hang dien may: ban chay");
		}
	}
	public int tinhSoNgayLuuKho() {
		Date ngayHienTai= new Date();
		long a=Math.abs(ngayHienTai.getTime()-ngayNhapKho.getTime());
		long soNgay=TimeUnit.DAYS.convert(a,TimeUnit.MICROSECONDS);
		return (int)soNgay;
	}
	@Override
	public String toString() {
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
		String ngayNhapKhoStr= dateFormat.format(ngayNhapKho);
		return "Ma hang: " + maHang + ", Ten Hang: "+tenHang+", So luong ton: "+soLuongTon+", Don gia: "+ donGia+
				", Nha San Xuat: "+nhaSanXuat+", Ngay Nhap kho: "+ngayNhapKhoStr; 
	}
   
}
