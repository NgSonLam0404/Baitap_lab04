package bai1;

import java.util.Objects;

public abstract class SachGiaoKhoa implements Comparable<SachGiaoKhoa> {
	protected String tenSach;
	protected String loaiSach;
	protected int dayXB, monthXB, yearXB;
	protected int dayNK, monthNK, yearNK;
	protected String maSach, nhaXuatBan;
	protected int soLanTaiBan, soLuong;

	public SachGiaoKhoa() {

	}

	public SachGiaoKhoa(String maSach) {
		this.maSach = maSach;
	}

// constructor co tham so:
	public SachGiaoKhoa(String tenSach, String loaiSach, int dayXB, int monthXB, int yearXB, int dayNK, int monthNK,
			int yearNK, String maSach, String nhaXuatBan, int soLanTaiBan, int soLuong) {
		super();
		this.tenSach = tenSach;
		this.loaiSach = loaiSach;
		this.dayXB = dayXB;
		this.monthXB = monthXB;
		this.yearXB = yearXB;
		this.dayNK = dayNK;
		this.monthNK = monthNK;
		this.yearNK = yearNK;
		this.maSach = maSach;
		this.nhaXuatBan = nhaXuatBan;
		this.soLanTaiBan = soLanTaiBan;
		this.soLuong = soLuong;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public String getTenSach() {
		return tenSach;
	}

	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}

	public String getLoaiSach() {
		return loaiSach;
	}

	public void setLoaiSach(String loaiSach) {
		this.loaiSach = loaiSach;
	}

	public int getDayXB() {
		return dayXB;
	}

	public void setDayXB(int dayXB) {
		this.dayXB = dayXB;
	}

	public int getMonthXB() {
		return monthXB;
	}

	public void setMonthXB(int monthXB) {
		this.monthXB = monthXB;
	}

	public int getYearXB() {
		return yearXB;
	}

	public void setYearXB(int yearXB) {
		this.yearXB = yearXB;
	}

	public int getDayNK() {
		return dayNK;
	}

	public void setDayNK(int dayNK) {
		this.dayNK = dayNK;
	}

	public int getMonthNK() {
		return monthNK;
	}

	public void setMonthNK(int monthNK) {
		this.monthNK = monthNK;
	}

	public int getYearNK() {
		return yearNK;
	}

	public void setYearNK(int yearNK) {
		this.yearNK = yearNK;
	}

	public String getMaSach() {
		return maSach;
	}

	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}

	public String getNhaXuatBan() {
		return nhaXuatBan;
	}

	public void setNhaXuatBan(String nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}

	public int getSoLanTaiBan() {
		return soLanTaiBan;
	}

	public void setSoLanTaiBan(int soLanTaiBan) {
		this.soLanTaiBan = soLanTaiBan;
	}

	abstract void nhapDanhSach(SachGiaoKhoa o);

	abstract void inDanhSach();

	public String thoiDiemXuatBan() {
		return this.dayXB + "/" + this.monthXB + "/" + this.yearXB;
	}

	public String thoiDiemNhapKho() {
		return this.dayNK + "/" + this.monthNK + "/" + this.yearNK;
	}

	public String toString() {
		return "Thong Tin cua kho hien tai la : Ten Sach: " + tenSach + ", Loai Sach: " + loaiSach + ", Ma sach: "
				+ maSach + ", Nha Xuat Ban: " + nhaXuatBan + ", So Lan Tai Ban: " + soLanTaiBan + "So Luong: " + soLuong
				+ ", Ngay xuat ban la:" + thoiDiemXuatBan() + ", Ngay nhap kho la:" + thoiDiemNhapKho();
	}

	@Override
	public int compareTo(SachGiaoKhoa o) {
		return this.maSach.compareTo(o.maSach);
	}

	@Override
	public int hashCode() {
		return Objects.hash(maSach, tenSach);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SachGiaoKhoa other = (SachGiaoKhoa) obj;
		return Objects.equals(maSach, other.maSach);
	}

}
