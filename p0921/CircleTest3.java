package p0921;

public class CircleTest3 {
	int radius;
	String name;
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	public static void main(String[] args) {
		CircleTest3 pizza = new CircleTest3();
		pizza.radius = 10;
		pizza.name = "감자베이컨마요네즈피자";
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area + "임");
		
		
	}
}
