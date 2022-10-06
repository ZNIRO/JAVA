package p1005;

class A{
	int a;

	public A() {super(); System.out.println("생성자A");}
	public A(int a) { super(); this.a = a;}
}

class B extends A{
	int b;

	public B() {super();System.out.println("생성자B");}
	public B(int b) {super(b);this.b = b;}
}

class C extends B{
	int c;
	
	public C() {super();System.out.println("생성자C");}
	public C(int c) {super(c); this.c = c;}
}

public class ConstructorEx{
	public static void main(String[] args) {
		C c = new C();
		C c1 = new C();
		System.out.println(c.toString());
		System.out.println(c1.toString());
	}
}

