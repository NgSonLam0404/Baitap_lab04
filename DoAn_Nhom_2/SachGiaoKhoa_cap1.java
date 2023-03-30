package bai1;

public class SachGiaoKhoa_cap1 extends SachGiaoKhoa {

	public SachGiaoKhoa_cap1(String tenSach) {
		super(tenSach);
	}

	public SachGiaoKhoa_cap1() {
	}

	public SachGiaoKhoa_cap1(String tenSach, String loaiSach, int dayXB, int monthXB, int yearXB, int dayNK,
			int monthNK, int yearNK, String maSach, String nhaXuatBan, int soLanTaiBan, int soLuong) {
		super(tenSach, loaiSach, dayXB, monthXB, yearXB, dayNK, monthNK, yearNK, maSach, nhaXuatBan, soLanTaiBan,
				soLuong);
	}

	// 1, Them sach
	@Override
	public void nhapDanhSach(SachGiaoKhoa cap1) {
		System.out.println("moi ban nhap vao thong tin ");
	}

	@Override
	// 2. Xuất danh sách
	public void inDanhSach() {
		System.out.println("kho du lieu sach giao khoa cap 1");
	}

	@Override
	public String toString() {
		return "SACH GIAO KHOA CAP I :" + super.getTenSach() + super.toString();
	}

}