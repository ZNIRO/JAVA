package p0913;

public class TernaryOperater {

	public static void main(String[] args) {
		int a = 3, b = 5;
		
		System.out.println((a < b)? (b-a) : (a-b)); //삼항연산자
		
		/*조건문*/
		if (a < b) {
			System.out.println("b가 큰 값 " + (b -a));
		}else {
			System.out.println("a가 큰 값 " + (a - b));
		}
		
		//두개똑같음
	}

}
