package ctrl;

import java.util.Scanner;

public class Grading {
	public static void main(String[] args) {
		char grade;
		Scanner scanner = new Scanner(System.in);
		System.out.print("점 수 로 당 신의 성 적 을 판 별 해 드 리 겠 습 니 다");
		int score = scanner.nextInt();
		
		if(score>=90)
			grade = 'A';
		else if(score>=80)
			grade = 'B';
		else if(score>=70)
			grade = 'C'	;
		else if(score>=60)
			grade = 'D';
		else
			grade = 'F';
		
		System.out.println("당 신 의 성 적 은 " + grade + " 입 니 다");
		scanner.close();
		
		
		
	}
	
	

}
