package p0919;

public class ArrayEx {
	public static void main(String[] args) {
		int [] intArray = new int[5];
		for(int i=0; i<intArray.length;i++) intArray[i] += 10*(i+1); 
		for(int i=0; i<intArray.length; i++) System.out.println(intArray[i]);
		
		char[] charArray = new char[5];
		for(int i=0; i<charArray.length; i++) charArray[i] = (char)('a'+i); 
		for(int i=0; i<charArray.length; i++) System.out.println(charArray[i]);
	}

}
