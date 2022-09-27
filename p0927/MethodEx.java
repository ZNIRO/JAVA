package p0927;

public class MethodEx {

	public static void main(String[] args) {
		MethodSample a = new MethodSample();

		System.out.println(a.getSum(3, 8));
		
		System.out.println(a.getSum(3));
		
		System.out.println(a.getSum(1.0,6.0));
		
		System.out.println(a.getSum(8, 9, 10));
		
	}

}
