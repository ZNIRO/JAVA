package p0914;

import java.util.Scanner;

public class Bitwise {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b, c;
		
		System.out.print("첫번째 정수: ");
		a = scanner.nextInt();
		
		System.out.print("두번째 정수: ");
		b = scanner.nextInt();
		
		System.out.printf("%d, %x, %o\n",a,a,a); //10진수decimal 16진수hexadecimal 8진수octal
		System.out.printf("%d, %x, %o\n ",b,b,b);
		c = a & b;
		System.out.println(c);
		c = a | b;
		System.out.println(c);
		a &= b; //a = a & b;
		System.out.println(a);
		a |= b; //a = a | b;
		System.out.println(a);
	
		scanner.close();
		
		
	}

}
