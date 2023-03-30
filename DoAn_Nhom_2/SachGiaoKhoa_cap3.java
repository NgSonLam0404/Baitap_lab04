package bai1;

public class SachGiaoKhoa_cap3 extends SachGiaoKhoa {

	public SachGiaoKhoa_cap3(String maSach) {
	}

	public SachGiaoKhoa_cap3() {
	}

	public SachGiaoKhoa_cap3(String tenSach, String loaiSach, int dayXB, int monthXB, int yearXB, int dayNK,
			int monthNK, int yearNK, String maSach, String nhaXuatBan, int soLanTaiBan, int soLuong) {
		super(tenSach, loaiSach, dayXB, monthXB, yearXB, dayNK, monthNK, yearNK, maSach, nhaXuatBan, soLanTaiBan,
				soLuong);
	}

	// 1, Them sach
	@Override
	public void nhapDanhSach(SachGiaoKhoa cap1) {
		System.out.println("moi ban nhap vao thong tin sgk cap 3 ");
	}

	@Override
	// 2. Xuất danh sách
	public void inDanhSach() {
		System.out.println("kho du lieu sach giao khoa cap 3");
	}

	@Override
	public String toString() {
		return "SACH GIAO KHOA CAP III :" + super.toString();
	}

}