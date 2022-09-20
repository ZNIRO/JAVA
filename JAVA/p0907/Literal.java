package p0907;

public class Literal{
	public static void main(String[] args) {
		char a0 = 'A'; //char: 문자 1나개만
		char a1 = '\u0041';
		char han0 = '글';
		char han1 = '\uae00';
		int i = 1;
		float f = 3.14f;
		double pi0 = 3.14159;
		pi0 = 3.1415;
		final double pi1 = 3.14159;
		//pi1 = 3.1415;
		System.out.println(i);
		System.out.println("일상 생활 속의 탐정은 정말 의뭉스러울 때가 많다.");
		System.out.println("char: 한 문자만을 저장");
		System.out.println("Java에서 문자는 2바이트 유니코드");
		System.out.println("a0 = " + a0 + " a1= " + a1);
		System.out.println("han0 = " + han0 + " han1 = " + han1);
		System.out.println("i = " + i);
		System.out.println("숫자 literal은 int 형");
		System.out.println("실수 literal은 double 형");
		System.out.println("float 변수에는 숫자 뒤에 f를 붙임");
		System.out.println("f = " + f + " pi0 = " + pi0);
	}
}