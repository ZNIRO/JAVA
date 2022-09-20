package ctrl;

import java.util.Scanner;

public class NestedIf {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("학년 입력: ");
		int year = scanner.nextInt();
		System.out.print("점수 입력");
		int score = scanner.nextInt();
		
		if(year == 4) {
			if(score>=70)
				System.out.println("합격입니다");
			else
				System.out.println("불합격입니다");
		}else {
			if (score>=60) {if(score>=60)
				System.out.println("합격입니다");
			else
				System.out.println("불합격입니다");
			scanner.close();
			} 
		}
	}
}
