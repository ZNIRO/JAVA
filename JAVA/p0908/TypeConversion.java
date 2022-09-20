package p0908;

public class TypeConversion {
	public static void main(String[] args) {
		byte b = 127;
		int i = 100;
		
		System.out.println(b + i);//byte + int 결과  int(32bit)
		System.out.println(10/4);//정수와 정수 연산은 결과가 정수
		//CPU가 operand연산자 2개를 ... 둘 다 정수.... 결과를 위한 공간register를 정수형으로 준비함 
		System.out.println(10.0/4);
		System.out.println((char)0x12340041); //char는 2바이트니깐 뒤에 0041만 냄겨요 아스키코드에서 41은 A입니다
		System.out.println("배고프다");
		System.out.println((byte)(b+i)); //7f랑 64더해서 32bit 결과를 8bit로 만들엇음
		System.out.printf("b = %d  %x\n", b, b); //%x: 16진수 출력
		System.out.printf("i = %d  %x\n", i, i);
		System.out.println((int)2.9 + 1.9);
		System.out.println((int)(2.9+1.8));
		System.out.println((int)(2.9)+(int)(1.8));
	}
}
