import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Cylinder c1=new Cylinder();
		Scanner input=new Scanner(System.in);
		System.out.println("nhap radius");
		c1.setRadius(input.nextDouble());
		System.out.println("nhap height");
		c1.setHeight(input.nextDouble());
		System.out.println("ket qua la: "+c1.getVolume());
		c1.inRadius();
	}

}
