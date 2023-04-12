package bai2a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class nhapsothuc {
	private ArrayList<Double> list;
	Scanner input=new Scanner(System.in);
	
	public nhapsothuc(ArrayList<Double>list) {
		this.list=list;
	}
	public nhapsothuc() {
		this.list=new ArrayList<Double>();
	}
	public void nhap() {
	    Scanner scanner = new Scanner(System.in);
	    String tiepTuc;
	    do {
	        System.out.print("Nhập giá trị kiểu double: ");
	        double value = scanner.nextDouble();
	        list.add(value);
	        System.out.print("Nhập Y để tiếp tục và N để dừng: ");
	        tiepTuc = scanner.next();
	    } while(!tiepTuc.equals("N"));
	    scanner.close();
	}


	@Override
	public String toString() {
		return "nhapsothuc [list=" + list + "]";
	}
	public void inDanhSach() {
		for (Double double1 : list) {
			System.out.println(double1);
		}
	}
	public double tinhTong() {
	    double tong = 0;
	    for (Double x : list) {
	        tong += x;
	    }
	    return tong;
	}

}
