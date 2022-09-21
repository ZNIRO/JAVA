package p0920;

public class Ex1 {
	public static void main(String[] args) {
		for(int i=0;i<5;i++) { // 행i개
			for(int j=5;j>i;j--) { // 열 j개
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
