package p0926;

public class ConstructorExample {
	

	
	public static void main(String[] args) {
		MyClass a = new MyClass(); // 필드 값 설정 안 하면 0
		System.out.println(a.getX());
		
		System.out.println(a.toString()); //객체의 시리얼넘버

	}

}
