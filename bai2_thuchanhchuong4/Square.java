package bai2_thuchanhchuong4;
// lop Square ke thua lop Rectangle
public class Square extends Rectangle {
	private double side;
	public Square () {}
	public Square (double side,double width,double length) {
		super(width,length);
		this.side=side;
	}
	public Square(double side,String color, boolean filled, double width,double length) {
		super(width,length,color,filled);
		this.side = side;
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	public void setWidth(double side) {
		this.side=getWidth();
	}
	public void setLength(double side) {
		this.side=getLength();
	}
	@Override
	public String toString() {
		return "Square [side=" + getWidth()+ "Area="+getArea() ;
	}
	
	

}
