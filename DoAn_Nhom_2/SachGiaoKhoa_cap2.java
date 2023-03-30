package bai1;

public class SachGiaoKhoa_cap2 extends SachGiaoKhoa {

	public SachGiaoKhoa_cap2(String maSach) {
	}

	public SachGiaoKhoa_cap2() {
	}

	public SachGiaoKhoa_cap2(String tenSach, String loaiSach, int dayXB, int monthXB, int yearXB, int dayNK,
			int monthNK, int yearNK, String maSach, String nhaXuatBan, int soLanTaiBan, int soLuong) {
		super(tenSach, loaiSach, dayXB, monthXB, yearXB, dayNK, monthNK, yearNK, maSach, nhaXuatBan, soLanTaiBan,
				soLuong);
	}

	@Override
	public void nhapDanhSach(SachGiaoKhoa cap1) {
		System.out.println("moi ban nhap vao thong tin sgk cap 2 ");
	}

	@Override
	// 2. Xuất danh sách
	public void inDanhSach() {
		System.out.println("kho du lieu sach giao khoa cap 2");
	}

	@Override
	public String toString() {
		return "SACH GIAO KHOA CAP II :" + super.toString();
	}

}