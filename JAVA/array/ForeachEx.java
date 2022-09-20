package array;

public class ForeachEx {
	enum Week {월, 화, 수, 목, 금, 토, 일} //열거형 변수(전역변수) -레퍼런스 타입
	public static void main(String[] args) {
		int[] n = {1, 2, 3, 4, 5};
		String names[] = {"사과", "배", "바나나", "딸기", "포도","체리"};
		
		int sum = 0;
		for (int k : n) {
			System.out.print(k + "  ");
			sum += k;
		}
		
		System.out.println("합은 " + sum);
		
		for (String s : names) { //매개변수 s : 지역(메소드)변수
			System.out.print(s + "  ");
		}
		System.out.println();
		
		for (Week day : Week.values()) {
			System.out.print(day + "요일");
		}
		System.out.println();
		
	}

}
