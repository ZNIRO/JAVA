package p0926;

public class CirclaArray {
	public static void main(String[] args) {
		Circle c1 = new Circle(10);
		
		Circle[] c = new Circle[10];
		
		for(int i=0; i<c.length; i++) {
			c[i] = new Circle(0); 
		}
		
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i].getArea() + " ");
		}
		
	}

}
