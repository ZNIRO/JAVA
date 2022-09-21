package p0921;

public class CircleConst {
	int radius; 
	String name;
	// 생성자: 객체를 만들 때 필드 값을 초기화
	public CircleConst() {
		radius = 1;
		name = "피자";
	}
	
	public CircleConst(int radius) {
		this.radius = radius;
	}
	
//	public CircleConst(int r, String n) {
//		radius = r;
//		name = n;
//	}
	
	public CircleConst(int radius, String name) {
		this.radius = radius;
		this.name = name; 
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		CircleConst pizza1 = new CircleConst(); // class 이름과 똑같은 method : 생성자
		CircleConst pizza2 = new CircleConst(3);
		CircleConst pizza3 = new CircleConst(10, "자바피자");
		System.out.println(pizza1.radius + pizza1.name + pizza1.getArea());
		System.out.println(pizza2.radius + " " + pizza2.getArea());
		System.out.println(pizza3.radius + pizza3.name + pizza3.getArea());
	}
}
