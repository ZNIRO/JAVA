package p0908;

public class Casting {
	public static void main(String[] args) {
		// -128~ 127
		byte b = (byte)1;
		// -32768 ~ 32767
		short sh = (short)2;
		//-2147483648 ~ 2147483647
		int i = 3;
		// -9223372036854775808 ~ 9223372036854775807
		long l = 4l;
		
		System.out.printf("%d %d %d %d\n", b, sh, i, l);
		
		int n = 120;
		b = (byte)n; //int n을 byte n으로 만들기~ casting: 데이터 타입 변환
	}

}
