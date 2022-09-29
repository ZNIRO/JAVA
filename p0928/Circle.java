package p0928;


public class Circle {
	int radius;
	final double PI = 3.14;
	public Circle(int radius) {
		this.radius = radius;
	}
	public double getArea() {
		return PI*radius*radius;
	}
}
