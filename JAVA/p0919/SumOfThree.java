package p0919;

public class SumOfThree {

	public static void main(String[] args) {
		int sum=0;
		//1부터 100까지 3의 배수의 합을 구하는 프로그램
		for(int i = 1; i<=100; i++) {
			if(i%3==0)
				sum += i; //+= : 누적
		}
		System.out.println("1부터 100까지 3의 배수의 합 :" + sum);
		
		/* while 문
		 * int sum=0, i=1;
		 * while(i<=100){
		 * 	if(i%3 != 0) {
		 * 		i++;
		 * 		continue;
		 * 	}
		 * 	else sum += 1;
		 * 	i++;
		 * }
		 */
	}

}
