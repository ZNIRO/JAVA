package p1017;



class SmartPhone extends PDA implements MobliePhoneInterface, MP3Interface{

	@Override
	public void sendCall() {
		System.out.println("전화를 걸다");
		
	}

	@Override
	public void receiveCall() {
		System.out.println("전화가 오다");
		
	}

	@Override
	public void play() {
		System.out.println("음악을 연주하다");
		
	}

	@Override
	public void stop() {
		System.out.println("음악을 멈추다");
		
	}

	@Override
	public void sendSMS() {
		System.out.println("문자가 가다");
		
	}

	@Override
	public void reveiveSMS() {
		System.out.println("문자가 오다");
		
	}
	public void schedule() {
		System.out.println("일정 관리를 합니다");
	}
	
}
