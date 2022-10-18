package p1011;

public class InterfaceEx {
	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
		
		iPhone phone2 = new iPhone();
		phone2.printLogo();
		phone2.sendCall();
		phone2.receiveCall();
		phone2.flash();
	}

}
