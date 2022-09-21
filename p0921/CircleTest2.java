package p0921;
class Circle2{
	int radius;
	String name;
	
	public double getArea() {
		return 3.14*radius*radius;
	}
}

public class CircleTest2 { //main method가 있는 클래스만 public
	public static void main(String[] args) {
		Circle1 pizza = new Circle1();
		pizza.radius = 10;
		pizza.name = "피자";
		System.out.println(pizza.name + "의 면적은 " + pizza.getArea());
		
		Circle1 donut = new Circle1();
		donut.radius = 1;
		donut.name = "도넛";
		System.out.println(donut.name + "의 면적은 " + donut.getArea());
		
		Circle1 chicken = new Circle1();
		chicken.radius = 100;
		chicken.name = "치킨";
		System.out.println(chicken.name + "의 면적은 " + chicken.getArea());
	}

}
