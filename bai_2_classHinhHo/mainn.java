package bai2_lab04;

public class mainn {
	public static void main (String[] args) {
		hinhtron hinhtron1= new hinhtron();
		hinhtron1.nhapBanKinh();
		hinhtron1.tinhChuVi();
		hinhtron1.tinhDienTich();
		
		hinhchunhat hcn1= new hinhchunhat();
		hcn1.nhapChieuDai();
		hcn1.nhapChieuRong();
		hcn1.tinhChuVi();
		hcn1.tinhDienTich();
		
		hinhvuong v1= new hinhvuong();
		v1.nhapCanh();
		v1.tinhChuVi();
		v1.tinhDienTich();
		
		hinhtru htru1=new hinhtru();
		htru1.nhapChieuCao();
		htru1.tinhTheTich();
	}

}
