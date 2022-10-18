package Shape;

public class Rect implements Shape{
	private int x,y;
	public Rect(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void draw() {
		System.out.println(x+"x"+y+"크기의 사각형");
		
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return x*y;
	}

}
