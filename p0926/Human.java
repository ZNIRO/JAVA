package p0926;

public class Human {
	String name; // default 접근 지정자
	private int age; // 
	double height, weight;
	
	public Human(String name) {
		this.name = name;
	}

	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
