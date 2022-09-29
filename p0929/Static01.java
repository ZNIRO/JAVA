package p0929;


public class Static01 {
		int a;
		static int n; // 이 클래스로 만드는 모든 객체가 공유
		public Static01() {
			n++; //object 몇개 만들었는지
		}

	
	public static void main(String[] args) {
		Static01 sc1 = new Static01();
		Static01 sc2 = new Static01();
		Static01 sc3 = new Static01();
		Static01 sc4 = new Static01();
		Static01 sc5 = new Static01();
		sc1.a = 1;
//		StaticClass.n= 1;
//		static 필드는 '객체이름.필드'보다는
//		'클래스이름.필드' 기술하기를 권장
		System.out.println(sc1.a + " " + Static01.n);
		sc2.a = 2;
		System.out.println(sc2.a+ " " + Static01.n);
		sc3.a = 3;
		System.out.println(sc3.a+ " " + Static01.n);
		sc4.a = 4;
		System.out.println(sc4.a+ " " + Static01.n);
		sc5.a = 5;
		System.out.println(sc5.a+ " " + Static01.n);
	}
	
	

}
