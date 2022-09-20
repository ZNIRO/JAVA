package p0914;

public class Combine {

	public static void main(String[] args) {
		int a, b, c, d;
		
		//단항, 삼항, 할당 연산자는 오른쪽에서 왼쪽으로
		//제일 오른쪽에 있는 것이 먼저 실행되고 차츰 왼쪽으로
		a = b = c = d = 1; //d = 1부터 실행
		//나머지 연산자는 왼쪽에서 오른쪽으로
		d= a+b+c; //a+b부터 실행
		
		
		
		System.out.printf("%d %d %d %d\n", a, b, c, d);
		System.out.printf("\n");
		
		int i=0;
		System.out.printf("%d\n", ++i);
		
		i = 0;
		System.out.printf("%d\n", i++);
		
		i=0;
		System.out.printf("%d %d\n", ++i,i);
		
		i=0;
		System.out.printf("%d %d\n", i++,i);
		
		i=0;
		System.out.printf("%d %d\n", i,++i);
		
		i=0;
		System.out.printf("%d %d\n", i,i++);
		
		i=0;
		System.out.printf("%d %d %d %d %d\n", ++i, ++i, ++i, ++i, ++i);
		

	}

}
