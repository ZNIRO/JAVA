package p0915;

public class DoWhileSample {
	public static void main(String[] args) {
		char ch01 = 'a';
		char ch02 = 'A';
		
		do {
			System.out.print(ch01);
			//c는 char type, 1은 int type
			//c + 1은 int type이므로 형변환(casting)
			ch01 = (char)(ch01 + 1);
		} while(ch01 <= 'z');
		
		System.out.println();
		
		do {
			System.out.print(ch02);
			ch02 = (char)(ch02 + 1);
		} while(ch02 <= 'Z');
	}

}