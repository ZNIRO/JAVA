package ctrl;

import java.util.Scanner;

public class CoffePrice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int price = 0;
		System.out.println("무슨 커피 드릴까");
		String order = scanner.next();
		
		switch(order) {
		case "에스프레소":
		case "카푸치노":
		case "카페라떼":
			price = 3000;
			break;
		case "아메리카노":
			price = 2000;
			break;
		default:
			System.out.println("안 팔 아 요");
		}
		if(price != 0)
			System.out.println(order + "는 "+price+"원 입니다");
		scanner.close();
	}
}