package p0926;

public class MyClass {
	double x;
		
		public double getX() {
			return this.x;
		}
	
		public void setX(int x) {
			this.x = x;
		}
	
		public MyClass() {
			this(3);
			System.out.println("매개변수 없는 생성자");
		}
	
		public MyClass(double x) {
	 	// this(); 무조건~ 생성자 첫줄 
			this.x = x;
			System.out.println("매개변수 1개 생성자");
		
	}

}
