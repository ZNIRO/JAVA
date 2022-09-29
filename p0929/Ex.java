package p0929;
class StaticSample{
	public int n;
	public void g() {
		m = 20;
	}
	public void h() {
		m = 30;
	}
	public static int m;
	public static void f() {
		m = 5;
	}
}

public class Ex {
	public static void main(String[] args) {
		StaticSample s1, s2;
		s1 = new StaticSample();
		s1.n = 5;
		System.out.println("m = " + StaticSample.m); //m=0;
		s1.g();
		System.out.println("m = " + StaticSample.m); //m=20;
		StaticSample.m = 50;
		System.out.println("m = " + StaticSample.m); //m=50;
		s2 = new StaticSample();
		s2.n = 8;
		s2.h(); 
		System.out.println("m = " + StaticSample.m);//m=30;
		StaticSample.f();
		System.out.println("m = " + StaticSample.m);//m=5;
		
	}
}
