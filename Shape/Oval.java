package Shape;

public class Oval implements Shape{
	private int x, y;
	
	

	public Oval(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void draw() {
		System.out.println(x + "x" + y + "에 내접하는 타원입니다.");
		
	}

	@Override
	public double getArea() {
		return x*y*PI;
	}

}
