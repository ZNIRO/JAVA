package p0928;

public class MethodOverloading {
	//method overloading은 signature의 parameter 개수, 타입, 순서가 
	//다르면 같은 이름의 메소드를 생성할 수 있는 것을 의미함.
	static void abc() {
	}
	static void abc(char c) {
	}
	static void abc(int a) {	
	}
	static void abc(int a, int b) {	
	}
	static void abc(char c, int a) {
	}
	static void abc(int a, char c) {	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
