package sach;

import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;

public abstract class SachGiaoKhoa implements Comparable<SachGiaoKhoa>,Serializable {
	protected String maSach,tenSach, nhaXuatBan;
	protected Date ngayXuatBan, ngayNhapKho;
	protected int soLanTaiBan, soLuong;

	public SachGiaoKhoa(String maSach,String tenSach, String nhaXuatBan, Date ngayXuatBan, Date ngayNhapKho, int soLanTaiBan,
			int soLuong) {
		this.maSach = maSach;
		this.tenSach=tenSach;
		this.nhaXuatBan = nhaXuatBan;
		this.ngayXuatBan = ngayXuatBan;
		this.ngayNhapKho = ngayNhapKho;
		this.soLanTaiBan = soLanTaiBan;
		this.soLuong = soLuong;
	}
	public SachGiaoKhoa(String maSach) {
		this.maSach = maSach;
	}


	public SachGiaoKhoa() {
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
	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}
	public String getTenSach() {
		return tenSach;
	}
	public void setNhaXuatBan(String nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}

	public Date getNgayXuatBan() {
		return ngayXuatBan;
	}
	
	public void setNgayXuatBan(Date ngayXuatBan) {
		this.ngayXuatBan = ngayXuatBan;
	}

	public Date getNgayNhapKho() {
		return ngayNhapKho;
	}

	public void setNgayNhapKho(Date ngayNhapKho) {
		this.ngayNhapKho = ngayNhapKho;
	}

	public int getSoLanTaiBan() {
		return soLanTaiBan;
	}

	public void setSoLanTaiBan(int soLanTaiBan) {
		this.soLanTaiBan = soLanTaiBan;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public void nhap() {
		
	}

	public abstract boolean kiemTraSachMoi();
	public  void chinhsuathongtin() {};
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

	@Override
	public String toString() {
		return "SachGiaoKhoa [maSach:" + maSach+ ", ten sach: "+ tenSach +  ", nhaXuatBan: " + nhaXuatBan + ", ngayXuatBan:"
				+ ngayXuatBan.toString() + ", ngayNhapKho: " + ngayNhapKho.toString() + ", soLanTaiBan: " + soLanTaiBan
				+ ", soLuong=" + soLuong + "]";
	}

}