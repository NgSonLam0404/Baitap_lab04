package bai2b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class listhovaten {
	private String ho;
	private String ten;
	private ArrayList<listhovaten>list;
	public listhovaten(String ho, String ten,ArrayList<listhovaten>list) {
		super();
		this.ho = ho;
		this.ten = ten;
		this.list=list;
	}
	public listhovaten(String ho,String ten) {
		this.ho=ho;
		this.ten=ten;
	}
	public listhovaten() {
		this.list=new ArrayList<listhovaten>();
	}
	
	public String getHo() {
		return ho;
	}
	public void setHo(String ho) {
		this.ho = ho;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	
	@Override
	public String toString() {
		return "listhovaten [ Ho: " + ho +", Ten: "+ ten+ "]";
	}
	public void nhap() {
	String option;
	do{
	    Scanner input = new Scanner(System.in);
	    System.out.println("Nhập thông tin nhân viên:");
	    System.out.println("Họ:");
	    ho = input.nextLine();
	    System.out.println("Tên:");
	    ten = input.nextLine();
	    listhovaten hoten = new listhovaten(ho, ten); // tạo một đối tượng mới
	    list.add(hoten); 
	    System.out.println("nhap No de dung");
	    option=input.next();
	}while(!option.equals("No"));
	}
	public void indanhsach() {
		for (listhovaten listhovaten : list) {
			System.out.println(listhovaten);
		}
	}
	public void inRanDom(){
		Collections.shuffle(list);
        System.out.println("Danh sách ngẫu nhiên:");
        for (listhovaten listhovaten : list) {
        	System.out.println(listhovaten);
		}
	}
	public void sapXepTheoTenGiamDan() {
	    Collections.sort(list, new Comparator<listhovaten>() {
	        @Override
	        public int compare(listhovaten o1, listhovaten o2) {
	            return o2.getTen().compareTo(o1.getTen());
	        }
	    });
	    System.out.println("Danh sách sau khi sắp xếp theo tên giảm dần:");
	    indanhsach();
	}
	public void xoa_TheoTen(String ten) {
		for(int i=0;i<this.list.size();i++) {
			listhovaten list=this.list.get(i);
			if(list.getTen().equalsIgnoreCase(ten)) {
				System.out.println("da xoa ten :"+list.getTen());
				this.list.remove(i);
			}
		}indanhsach();
	}
	


	
	
	

}
