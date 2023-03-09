package bai2_thuchanhchuong4;
//lop Circle ke thua lop Shape
public class Circle extends Shape {
	private double radius=1.0;
	private double Pi=3.14;

	public Circle() {}
	public Circle(double radius) {
		this.radius=radius;
	}
	public Circle(String color, boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return this.radius*this.radius*Pi;
	}
	public double getPerimerer() {
		return this.radius*2*Pi;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getRadius()=" + getRadius() + ", getArea()=" + getArea()
				+ ", getPerimerer()=" + getPerimerer() + "]";
	}
	

	

}
