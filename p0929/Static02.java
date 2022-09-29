package p0929;
class Scm{
	int a;
	public Scm(int a) {
		this.a = a;
	}
	void prtVariable() {
		System.out.println(a);
	}
	static void prtMessage() {
		System.out.println("간바");
	}
}
public class Static02 {
	public static void main(String[] args) {
		Scm.prtMessage(); //객체 또 안만들고 걍써먹기가능
		Scm scm = new Scm(6);
		System.out.println(scm.a);
		
		
	}

}
