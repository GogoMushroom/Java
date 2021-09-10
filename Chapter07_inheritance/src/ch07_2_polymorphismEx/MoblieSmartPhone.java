package ch07_2_polymorphismEx;


// 부모 클래스 (전화기능 모바일폰)
class MobilePhone {
	//필드
	protected String number; //전화번호 
	//public 전부 다 접근 //private 아무도 접근 못함 
	//아무것도 안 적으면 default 
	//protected 같은 패키지 거나 다른패키지여도 상속받은 관계면 사용가능 


	//생성자
	public MobilePhone(String num) { //() 안에 number를 호기화 할 값을 넣어줘야함 
		this.number = num;// this 생략가능 

	}
	//메소드 
	//전화 받는 기능만 있음 ㅋㅂㅋ
	public void recieve() { //리턴값없음 
		System.out.println("hi from "+this.number);
	}

}

class SmartPhone extends MobilePhone{
	//필드
	private String androidVer;
	//생성자
	public SmartPhone(String num,String ver) { 
		//부모 클래스에있는 num도 받아옴
		//String 으로 안드로이드ver 초기화해줌 
		super(num); //부모를 콜 해줌 String num을 받기 때문에   super는 맨 윗줄에 써야함
		androidVer = ver; // 자기꺼 세팅해야람

	}
	//메소드
	//부모클래스에있는 recieve 를 재정의해줌 
	@Override
	public void recieve() {

		super.recieve();
		System.out.println("i am smart");
	}

	//새로운 기능을 추가해줌 //2가지 전화 걸기, 어플 실행시키기
	public void send (String number) {
		System.out.println("Hello~ to" + number);
	}
	public void playApp() {
		System.out.println("app is running in " + androidVer);
	}
}

	public class MoblieSmartPhone{

		public static void main(String[] args) {
			//스마트폰 객체 생성
			SmartPhone phone = new SmartPhone("010-0000-1111", "android7.0");
			//전화걸기
			phone.send("010-2222-3333");
			//전화받기
			phone.recieve();
			//앱을 선책하여 실행하기
			phone.playApp();
		}
	}

