package p0929;

public class Static04 {
	static int n;
	static int increase(int n){
		n++;
		return n;
	}
	public static void main(String[] args) {
		Static04.n = 3;
		int a;
		a = increase(n);
		System.out.println(a);
		
	}
}
