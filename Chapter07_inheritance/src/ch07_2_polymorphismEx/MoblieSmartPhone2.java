package ch07_2_polymorphismEx;
//
//
//// 부모 클래스 (전화기능 모바일폰)
//class MobilePhone {
//	//필드
//	protected String number; //전화번호 
//	//public 전부 다 접근 //private 아무도 접근 못함 
//	//아무것도 안 적으면 default 
//	//protected 같은 패키지 거나 다른패키지여도 상속받은 관계면 사용가능 
//
//
//	//생성자
//	public MobilePhone(String num) { //() 안에 number를 호기화 할 값을 넣어줘야함 
//		this.number = num;// this 생략가능 
//
//	}
//	//메소드 
//	//전화 받는 기능만 있음 ㅋㅂㅋ
//	public void recieve() { //리턴값없음 
//		System.out.println("hi from "+this.number);
//	}
//
//}
//
//class SmartPhone extends MobilePhone{
//	//필드
//	private String androidVer;
//	//생성자
//	public SmartPhone(String num,String ver) { 
//		//부모 클래스에있는 num도 받아옴
//		//String 으로 안드로이드ver 초기화해줌 
//		super(num); //부모를 콜 해줌 String num을 받기 때문에   super는 맨 윗줄에 써야함
//		androidVer = ver; // 자기꺼 세팅해야람
//
//	}
//	//메소드
//	//부모클래스에있는 recieve 를 재정의해줌 
//	@Override
//	public void recieve() {
//
//		super.recieve();
//		System.out.println("i am smart");
//	}
//
//	//새로운 기능을 추가해줌 //2가지 전화 걸기, 어플 실행시키기
//	public void send (String number) {
//		System.out.println("Hello~ to" + number);
//	}
//	public void playApp() {
//		System.out.println("app is running in " + androidVer);
//	}
//}
public class MoblieSmartPhone2{
	public static void main(String[] args) {
		//스마트폰 객체 생성
		SmartPhone phone1 = new SmartPhone("010-0000-1111", "android7.0");
		MobilePhone phone3 = new MobilePhone("1234");

		//부모클래스의 참조변수 (phone2)s는 자식클래스 (smartphone)의 인스턴스를참조할 수 있다.
		//MobliePhone형 참조는 Smartphone 형의 인스턴스를 참조 가능하다.
		//자료형이 자동형변환이 되어서 smartphone 형이 mobliephone 형이 된다.
		MobilePhone phone2 = new SmartPhone("010-1111-2222", "android7.0");
		//double phone2 = int phone; 
		//자료형이 자동형변환이 되어서 int 가 double 로 바뀐다.

		//SmartPhone phone4 = phone3;
		//SmartPhone phone4 = new MobilePhone("1234");
		SmartPhone phone4 = (SmartPhone)new MobilePhone("1234");
		//부모클래스를 자식클래스로 형변환은 안됨 
		//(SmartPhone)를 사용해서 강제 형변환 해 줘야함 		


		phone2.recieve();
		//자식클래스를 부모클래스로 자동형볂롼 했기때문에 부모클래스 안에있는 메서드만 사용가능 
		//근데 그 메서드가 오버라이딩된거라면 오버라이딩 된 메서드가 사용된다.


		//전화걸기
		phone1.send("010-2222-3333");
		//phone2.send("010-2222-3333");//phone2는 부모타입으로 형변환된거라 send를 사용할 수 없음 8ㅅ8
		//전화받기
		phone1.recieve();
		phone2.recieve();

		//앱을 선책하여 실행하기
		phone1.playApp();
		//phone2.playApp(); // 없음 실행안됨 
	}
}

