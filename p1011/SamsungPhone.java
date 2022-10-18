package p1011;

public class SamsungPhone implements PhoneInterface{

	@Override
	public void sendCall() {
		System.out.println("덜덜덜");
		
	}

	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
		
	}
	
//	메소드 추가 작성
	public void flash() {System.out.println("전화기 가스레인지");}
	

}
