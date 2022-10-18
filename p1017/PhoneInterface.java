package p1017;

public interface PhoneInterface {
	final int TIMEOUT = 10000;
	abstract void sendCall();	//추상 메소드
	abstract void receiveCall();	//추상 메소드
	default void printLogo() {
		System.out.println("** Phone **");
	}

}
