package array;

import java.util.Scanner;

public class ArrayAccess{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] intArray = new int[5];
		int min = 2147483647;
		int max = -2147483648;
		int sum = 0;
		
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.print("intArray["+i+"] = ");
			intArray[i] =scanner.nextInt();//입력받고 배열에 저장하기
			if(intArray[i]>max)
				max = intArray[i];
			if(intArray[i]<min)
				min = intArray[i];
			sum += intArray[i];
		}
		System.out.println("가장 작은 값은 " + min + "입니다");
		System.out.println("가장 큰 값은 " + max + "입니다");
		System.out.println("합은 "+sum+"입니다");
		System.out.println("평균은 "+(double)sum/intArray.length+"입니다");
		
		scanner.close();
	}
}