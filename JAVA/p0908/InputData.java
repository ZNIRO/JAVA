package p0908;

import java.util.Scanner;

public class InputData {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //Scanner 객체 생성, System.in 키 값을 바이트로 리턴
		String name;
		int age;
		System.out.print("이름 입력: ");
		name = scanner.next();
		System.out.print("나이 입력: ");
		age = scanner.nextInt();
		System.out.println(name + "의 나이를 맞춰보겠습니다." + name +  "의 나이는 " + age + "세.");
		System.out.println("맞나요?");
		
//		System.out.print("당신의 정보를 입력하십시오");
//		name = scanner.next();
//		age = scanner.nextInt();
//		System.out.println(name + "의 나이를 맞춰보겠습니다. 당신은 " + age + "세.");
		
		//더이상 입력 받지 않는다
		scanner.close();
	}

}
