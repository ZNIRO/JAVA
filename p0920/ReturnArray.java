package p0920;

public class ReturnArray {
	
	public static void main(String[] args) {
		int intArray[];
		intArray = makeArray();
		for(int i=0; i<intArray.length; i++)
			System.out.print(intArray[i]+ " " );
	}
	
	private static int[] makeArray() { // 정수형 배열을 리턴하는 메소드
		int[] temp = new int[4];
		for(int i=0; i<temp.length; i++)
			temp[i] = i+1; // 배열 원소 1, 2, 3, 4 초기화
		return temp; // 배열 리턴
	}

	
}
