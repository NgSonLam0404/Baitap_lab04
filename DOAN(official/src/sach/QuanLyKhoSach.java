package sach;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class QuanLyKhoSach {
	private ArrayList<SachGiaoKhoa> list;
	SachGiaoKhoa sgk;

	public QuanLyKhoSach() {
		this.list = new ArrayList<SachGiaoKhoa>();
	}

	public QuanLyKhoSach(ArrayList<SachGiaoKhoa> list) {
		this.list = list;
	}

	public void themVaoDanhSach(SachGiaoKhoa sgk) {
		list.add(sgk);
	}

	public void inDanhSach() {
		for (SachGiaoKhoa sgk : list) {
			if (sgk instanceof SachGiaoKhoa)
				System.out.println(sgk);
		}
	}

	public boolean kiemTraDanhSachRong() {
		return this.list.isEmpty();
	}

	public int soLuongSachHienCo() {
		return this.list.size();
	}

	public int soluongSachGiaoKhoa_Cap1() {
		int count = 0;
		for (SachGiaoKhoa sgk : list) {
			if (sgk instanceof SachGiaoKhoa_Cap1)
				count++;
		}
		return count;
	}

	public int soluongSachGiaoKhoa_Cap2() {
		int count = 0;
		for (SachGiaoKhoa sgk : list) {
			if (sgk instanceof SachGiaoKhoa_Cap2)
				count++;
		}
		return count;
	}

	public int soluongSachGiaoKhoa_Cap3() {
		int count = 0;
		for (SachGiaoKhoa sgk : list) {
			if (sgk instanceof SachGiaoKhoa_Cap3)
				count++;
		}
		return count;
	}

	public void lamRongDanhSach() {
		if (this.list.size() == 0)
			System.out.println("Danh sách đã rỗng sẵn không thể làm rỗng !");
		else {
			this.list.removeAll(list);
			System.out.println("Đã làm rỗng !");
		}
	}

	public boolean kiemTraTonTai_TheoMaSach(String maSach) {
		if (this.list.size() == 0) {
			System.out.println("Danh sách đã rỗng không thể kiểm tra sự tồn tại");
			return false;
		}

		for (SachGiaoKhoa sgk : list) {
			if (sgk.getMaSach().equals(maSach)) {
				return true;
			}
		}
		return false;
	}

	public void timSach_TheoMaSach(String maSach) {
		if (this.list.size() == 0) {
			System.out.println("Danh sách đã rỗng không thể tìm sách");
			return;
		}

		for (SachGiaoKhoa sgk : list) {
			if (sgk.getMaSach().equals(maSach)) {
				System.out.println(sgk);
			}
		}
	}

	public void timSach_TheoTen(String tenSach) {
		if (this.list.size() == 0) {
			System.out.println("Danh sách đã rỗng không thể tìm sách");
			return;
		}

		for (SachGiaoKhoa sgk : list) {
			if (sgk instanceof SachGiaoKhoa_Cap1) {
				SachGiaoKhoa_Cap1 sgk_c1 = (SachGiaoKhoa_Cap1) sgk;
				if ((sgk_c1.tenSach).equals(tenSach)) {
					System.out.println(sgk_c1);
				}
			} else if (sgk instanceof SachGiaoKhoa_Cap2) {
				SachGiaoKhoa_Cap2 sgk_c2 = (SachGiaoKhoa_Cap2) sgk;
				if ((sgk_c2.tenSach).equals(tenSach)) {
					System.out.println(sgk_c2);
				}
			} else if (sgk instanceof SachGiaoKhoa_Cap3) {
				SachGiaoKhoa_Cap3 sgk_c3 = (SachGiaoKhoa_Cap3) sgk;
				if ((sgk_c3.tenSach).equals(tenSach)) {
					System.out.println(sgk_c3);
				}
			}
		}
	}

	public void xoaSach_TheoMaSach(String maSach) {
	    if (this.list.size() == 0) {
	        System.out.println("Danh sách đã rỗng không thể xóa sách");
	        return;
	    }

	    Iterator<SachGiaoKhoa> iterator = this.list.iterator();
	    while (iterator.hasNext()) {
	        SachGiaoKhoa sgk = iterator.next();
	        if (sgk.getMaSach().equals(maSach)) {
	            iterator.remove();
	            System.out.println("Đã xóa sách có mã " + maSach);
	            return;
	        }
	    }
	    System.out.println("Không tìm thấy sách có mã " + maSach + " trong danh sách");
	}
	public void xoaSach_TheoTenSach(String tenSach) {
		for(int i=0;i<this.list.size();i++) {
			SachGiaoKhoa sgk=this.list.get(i);
			if(sgk instanceof SachGiaoKhoa_Cap1) {
				SachGiaoKhoa_Cap1 sgk_c1=(SachGiaoKhoa_Cap1)sgk;
				if((sgk_c1.tenSach).equalsIgnoreCase(tenSach)) {
					this.list.remove(i);
					System.out.println("Đã xóa sách có mã số : "+sgk_c1.getMaSach());
				}
			}else if(sgk instanceof SachGiaoKhoa_Cap2) {
				SachGiaoKhoa_Cap2 sgk_c2=(SachGiaoKhoa_Cap2)sgk;
				if((sgk_c2.tenSach).equalsIgnoreCase(tenSach)) {
					this.list.remove(i);
					System.out.println("Đã xóa sách có mã số : "+sgk_c2.getMaSach());
				}
			}else if(sgk instanceof SachGiaoKhoa_Cap3) {
				SachGiaoKhoa_Cap3 sgk_c3=(SachGiaoKhoa_Cap3)sgk;
				if((sgk_c3.tenSach).equalsIgnoreCase(tenSach)) {
					this.list.remove(i);
					System.out.println("Đã xóa sách có mã số : "+sgk_c3.getMaSach());
				}
			}
		}
	}

	public void sapXepTangDan_TheoSoLuong() {
		Collections.sort(this.list, new Comparator<SachGiaoKhoa>() {

			@Override
			public int compare(SachGiaoKhoa o1, SachGiaoKhoa o2) {
				if (o1.getSoLuong() < o2.getSoLuong())
					return -1;
				else if (o1.getSoLuong() > o2.getSoLuong())
					return 1;
				else
					return 0;
			}
		});
	}

	public void sapXepGiamDan_TheoSoLuong() {
		Collections.sort(this.list, new Comparator<SachGiaoKhoa>() {

			@Override
			public int compare(SachGiaoKhoa o1, SachGiaoKhoa o2) {
				if (o1.getSoLuong() < o2.getSoLuong())
					return 1;
				else if (o1.getSoLuong() > o2.getSoLuong())
					return -1;
				else
					return 0;
			}
		});
	}

	public void sapXepTangDan_TheoMaSach() {
		Collections.sort(this.list);
	}

	public void sapXepGiamDan_TheoMaSach() {
		Collections.sort(this.list, new Comparator<SachGiaoKhoa>() {

			@Override
			public int compare(SachGiaoKhoa o1, SachGiaoKhoa o2) {
				if (o1.getMaSach().compareTo(o2.getMaSach()) > 0) {
					return -1;
				} else if (o1.getMaSach().compareTo(o2.getMaSach()) < 0) {
					return 1;
				} else {
					return 0;
				}
			}
		});
	}

	public void inSachCap1() {
		for (SachGiaoKhoa sgk : list) {
			if (sgk instanceof SachGiaoKhoa_Cap1) {
				System.out.println(sgk);
			}
		}
	}

	public void inSachCa2() {
		for (SachGiaoKhoa sgk : list) {
			if (sgk instanceof SachGiaoKhoa_Cap2) {
				System.out.println(sgk);
			}
		}
	}

	public void inSachCap3() {
		for (SachGiaoKhoa sgk : list) {
			if (sgk instanceof SachGiaoKhoa_Cap3) {
				System.out.println(sgk);
			}
		}
	}
	public void luuFile(File f) {
		try {
			OutputStream os=new FileOutputStream(f);
			ObjectOutputStream oos=new ObjectOutputStream(os);
			for (SachGiaoKhoa sgk : list) {
				oos.writeObject(sgk);
			}
			System.out.println("Đã ghi file vào "+f.getAbsolutePath());
			oos.flush();
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void docFile(File f) {
		try {
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream(f));
			SachGiaoKhoa sgk;
			while(true) {
				try {
					sgk=(SachGiaoKhoa)ois.readObject();
					this.list.add(sgk);
				} catch (Exception e) {
					break;
				}
			}
			System.out.println("Đã đọc file "+f.getAbsolutePath());
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public boolean KiemTraSachMoi_TheoMaSach(String maSach) {
		for (SachGiaoKhoa sgk : list) {
			if(sgk instanceof SachGiaoKhoa_Cap1) {
				SachGiaoKhoa_Cap1 sgk_c1=(SachGiaoKhoa_Cap1)sgk;
				return sgk_c1.kiemTraSachMoi();
			}else if(sgk instanceof SachGiaoKhoa_Cap2) {
				SachGiaoKhoa_Cap2 sgk_c2=(SachGiaoKhoa_Cap2)sgk;
				return sgk_c2.kiemTraSachMoi();
			}else if(sgk instanceof SachGiaoKhoa_Cap3) {
				SachGiaoKhoa_Cap3 sgk_c3=(SachGiaoKhoa_Cap3)sgk;
				return sgk_c3.kiemTraSachMoi();
			}
		}
		System.out.println("Không có sách mà bạn đã nhập");
		return false;
	}
	public void chinhSuaThongTin_TheoMaSach(String maSach) {
		for(int i=0;i<this.list.size();i++) {
			SachGiaoKhoa sgk=this.list.get(i);
			if(sgk.getMaSach().equals(maSach)) {
				if(sgk instanceof SachGiaoKhoa_Cap1) {
					SachGiaoKhoa_Cap1 sgk_c1=(SachGiaoKhoa_Cap1)this.list.get(i);
					sgk_c1.chinhsuathongtin();
					this.list.set(i, sgk_c1);
				}else if(sgk instanceof SachGiaoKhoa_Cap2) {
					SachGiaoKhoa_Cap2 sgk_c2=(SachGiaoKhoa_Cap2)this.list.get(i);
					sgk_c2.chinhsuathongtin();
					this.list.set(i, sgk_c2);
				}else if(sgk instanceof SachGiaoKhoa_Cap3) {
					SachGiaoKhoa_Cap3 sgk_c3=(SachGiaoKhoa_Cap3)this.list.get(i);	
					sgk_c3.chinhsuathongtin();
					this.list.set(i, sgk_c3);
				}
			}
		}
	}
}