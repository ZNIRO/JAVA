package p0915;

import java.util.Scanner;

public class BreakExample {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("exit을 입력하면 종료합니다");
		while(true) {//무한반복
			System.out.print(">>");
			String text = scanner.nextLine();
			if(text.equals("exit"))
				break;
		}
		System.out.println("킹료합니다");
		
		scanner.close();
	}

}
