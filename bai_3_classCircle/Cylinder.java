
public class Cylinder extends Circle{
	private double height;
	public Cylinder () {}
	public Cylinder(String color, double radius,double height) {
		super(color, radius);
		this.height=height;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getVolume() {
		return this.getArea()*height;
	}
	public void inRadius() {
		System.out.println("radius la:"+this.getRadius());
	}
	

}
