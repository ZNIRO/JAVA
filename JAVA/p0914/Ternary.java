package p0914;

import java.util.Scanner;

public class Ternary {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b;
		String str;
		
		System.out.print("첫번째 정수: ");
		a = scanner.nextInt();
		
		System.out.print("두번째 정수: ");
		b = scanner.nextInt();
		
		str = (a>b)?"첫번째 수가 커요":"두번째 수가 커요";
		
		System.out.println(str);
		
		scanner.close();
	}

}
