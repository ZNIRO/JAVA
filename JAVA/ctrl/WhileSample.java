package ctrl;

import java.util.Scanner;

public class WhileSample{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		int sum = 0;
		System.out.println("정수를 입력, 마지막에 -1 입력");
		int n = scanner.nextInt();
		while(n != -1) {
			count++;
			sum=+n;
			n = scanner.nextInt();
		}
		if(count == 0)
			System.out.println("입력된 수가 없다");
		else {
			System.out.println("입력된 정수는 총 " + count + "개다");
			System.out.println("입력된 정수의 평균은 " + (double)sum/count + "이다");
		}
		scanner.close();
	}
}