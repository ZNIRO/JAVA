package ctrl;

import java.util.Scanner;

public class GradingSwitch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char grade;
		System.out.print("당 신 의 점 수 ");
		int score = scanner.nextInt();
		
		switch (score/10) {
		case 10:
		case 9:
			grade = 'A'; break;
		case 8:
			grade = 'B'; break;
		case 7:
			grade = 'C'; break;
		case 6:
			grade = 'D'; break;
		default:
			grade = 'F';
			break;
		}
		System.out.println("학 점 은 " + grade + " 입 니 다");
		scanner.close();
	}

}
