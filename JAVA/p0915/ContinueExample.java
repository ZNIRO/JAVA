package p0915;

import java.util.Scanner;

public class ContinueExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//import 단축키 ^~o
		int sum = 0;
		System.out.println("정수를 5개 입력하세요");
		for(int i = 0; i<5; i++) {
			int n = scanner.nextInt(); //정수입력반복
			if(n<=0)
				continue; //아래의 명령을 수행하지 말고 다음 반복으로 넘어가기
			else 
				sum += n;
		}
		System.out.println("양수의 합은 " + sum);
		
		scanner.close();
		

	}

}
