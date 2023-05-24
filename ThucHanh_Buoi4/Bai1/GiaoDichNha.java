package Bai1;

public class GiaoDichNha extends GiaoDich {
	
	    private String loaiNha;
	    private String diaChi;

	  
	    
	    public GiaoDichNha(String maGiaoDich, String hoTenKH,String ngayGiaoDich, double donGia, double dienTich,String loaiNha, String diaChi) {
			super(maGiaoDich, hoTenKH ,ngayGiaoDich, donGia, dienTich);
			this.loaiNha = loaiNha;
			this.diaChi = diaChi;
		}

		public String getLoaiNha() {
			return loaiNha;
		}

		public void setLoaiNha(String loaiNha) {
			this.loaiNha = loaiNha;
		}

		public String getDiaChi() {
			return diaChi;
		}

		public void setDiaChi(String diaChi) {
			this.diaChi = diaChi;
		}
		@Override
	    public void tinhThanhTien() {
	        if (loaiNha.equals("cao cấp")) {
	            thanhTien = dienTich * donGia;
	        } else {
	            thanhTien = dienTich * donGia * 0.9;
	        }
	    }

		@Override
		public String toString() {
			return "Giao Dich Nha:"
					+ "Ma Giao Dich   :" + maGiaoDich +"\n"
					+ "Ho va ten KH   :" + hoTenKH+"\n"
					+ "Ngay Giao Dich :" + ngayGiaoDich +"\n"
					+ "Don Gia        :" + donGia+"\n"
					+ "Dien Tich      :" + dienTich + "\n"
					+ "Thanh Tien     :" + thanhTien + "\n"
					+ "Loai Nha       :" + loaiNha+"\n"
					+ "Dia Chi        :" + diaChi;
			
		}

		
	}


