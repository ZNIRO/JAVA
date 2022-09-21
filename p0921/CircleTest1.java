package p0921;

public class CircleTest1 {
	public static void main(String[] args) {
		Circle1 pizza = new Circle1();
		pizza.radius = 10;
		pizza.name = "피자";
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
	}

}
