package p0913;

public class AssignmentEX {

	public static void main(String[] args) {
		int a = 3, b = 3, c = 3;
		a += 3;
		b *= 3;
		c %= 2;
		
		System.out.println("a="+a+" b="+b+" c="+c);
		
		int d = 3;
		a=d++; //a=d=d+1
		System.out.println("a="+a+" d="+d);	
		a=++d; //a=d+1=d
		System.out.println("a="+a+" d="+d);
		a=d--; //a=d=d-1
		System.out.println("a="+a+" d="+d);
		a=--d; //a=d-1=d
		System.out.println("a="+a+" d="+d);

	}

}
