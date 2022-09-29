package p0928;

public class CircleArray {

	public static void main(String[] args) {
		Circle [] circles = new Circle[5];
		
		for(int i=0; i<circles.length; i++)
			circles[i] = new Circle(i);

	}

}
