package p1011;

public class B extends A{
	void f() {}
	public static void main(String[] args) {
		A a = new B();
		a.f();
		B b = new B();
		b.f();
	}

}
