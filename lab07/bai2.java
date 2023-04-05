package lab07;
interface Moverable{
	public void moveUp();
	public void moveDown();
	public void moveLeft();
	public void moveRight();
}
class MovereablePoint implements Moverable{
	int x,y;
	int xSpeed;
	int ySpeed;
	public MovereablePoint(int x, int y, int xSpeed, int ySpeed) {
		super();
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	public MovereablePoint() {}
	@Override
	public void moveUp() {
		System.out.println("move up");
	}
	@Override
	public void moveDown() {
		System.out.println("move Down");
	}
	@Override
	public void moveLeft() {
		System.out.println("move left");
	}
	@Override
	public void moveRight() {
		System.out.println("move Right");
	}
	
	@Override
	public String toString() {
		return "MovereablePoint=" +x+"y="+xSpeed+ySpeed;
	}

}

class MoverableCircle implements Moverable{
	public int radius;
	public MovereablePoint center;
	@Override
	public void moveUp() {
		System.out.println("move up");
	}
	@Override
	public void moveDown() {
		System.out.println("move Down");
	}
	@Override
	public void moveLeft() {
		System.out.println("move left");
	}
	@Override
	public void moveRight() {
		System.out.println("move Right");
	}
	public MoverableCircle(int radius, MovereablePoint center) {
		super();
		this.radius = radius;
		this.center = center;
	}
	public MoverableCircle() {}
	public String toString() {
		return "MoverableCircle [radius=" + radius + ", center=" + center + "]";
	}
	
	
	
}

public class bai2  {
	public static void main(String[] args) {
		MoverableCircle mc1=new MoverableCircle();
		MovereablePoint mp1=new MovereablePoint();
		mc1.moveDown(); mc1.moveLeft();mc1.moveRight();mc1.moveUp();
		mp1.moveDown(); mp1.moveLeft();mp1.moveRight();mp1.moveUp();
	}

}
