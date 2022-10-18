package Shape;

public class Circle implements Shape {
	private int r;
	
	
	public Circle(int r) {
		this.r = r;
	}



	@Override
	public void draw() {
		System.out.println("반지름이 " + r +"인 원입니다.");
		
	}

	@Override
	public double getArea() {
		return PI * this.r * this.r;
	}

}
