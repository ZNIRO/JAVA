package p1011;

public class iPhone implements PhoneInterface{

	@Override
	public void sendCall() {
		System.out.println("iPhone Call");
		
	}

	@Override
	public void receiveCall() {
		System.out.println("iPhone receive");
		
	}
	
	public void flash() {System.out.println("iPhone flash");}
	

}
