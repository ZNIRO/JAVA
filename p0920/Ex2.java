package p0920;

public class Ex2 {

	public static void main(String[] args) {
		char [] alpha = {'a', 'b','c','d'}; //for문
		for(int i=0; i<alpha.length; i++)
			System.out.print(alpha[i] + " ");
		System.out.println();
		
		
		for(char c : alpha) //for~each 문
			System.out.print(c + " ");

	}

}
