package p1017;

public class InterfaceEx extends SmartPhone{
	public static void main(String[] args) {
		SmartPhone Phone = new SmartPhone();
		Phone.printLogo();
		Phone.sendCall();
		Phone.play();
		System.out.println("3과 5를 더하면 " + Phone.calculate(3, 5));
		Phone.schedule();
	}

}
