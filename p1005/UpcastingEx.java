package p1005;

class Person{
	String name;
	String id;
	
	public Person() { };
	public Person(String name) {
		this.name = name;
	}
}
class Student extends Person{
	String grade;
	String department;
	
	Student(){ };
	Student(String name){
		super(name);
	}
}
public class UpcastingEx {
	public static void main(String[] args) {
		Person p;

		Student s = new Student("굿~");
		
		//왼쪽이 부모이고 오른쪽이 자손이면 묵시적 형 변환이 이루어짐
		//상속 관계 아닐 때 a = b; : a와 b는 같은 클래스로 만든 객체
		p = s;
		//p가 접근 가능한 필드와 메소드는 Person에 한정
		System.out.println(p.name);
//		System.out.println(p.grade); error
		
		Person p1 = new Student("와우");
		System.out.println(p1.name);
		
		Student s1 = (Student)p1;
		s1.department = "천재";
		System.out.println(s1.name);
		System.out.println(s1.department);
	}

}
