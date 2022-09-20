package p0919;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		//p.109 14번 if문을 switch문으로 바꾸어라.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("가위, 바위, 보 중 선택");
		String in = scanner.next();
//		if(in.equals("가위"))		// in == "가위" 않되!
//			System.out.println(1);
//		else if(in.equals("바위"))
//			System.out.println(2);
//		else if(in.equals("보"))
//			System.out.println(3);
//		else {
//			System.out.println(0);
//		}
		switch (in) {
		case "가위":
			System.out.println(1);
			break;
		case "바위":
			System.out.println(2);
			break;
		case "보":
			System.out.println(3);
			break;

		default:
			System.out.println(0);
			break;
			

		}
		scanner.close();

	}

}
