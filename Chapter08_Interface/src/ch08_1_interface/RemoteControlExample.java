package ch08_1_interface;


interface RemoteControl{
	//상수
	public static final int MAX_VOLUME = 10; //static final 붙여주기
	public int MIN_VOLUME = 0; //메모리상으로는 메소드영역에 저장
	// 교제에서 안 붙인 이유는 안붙여주면 자동으로 붙여주기때문 
	
	//추상메소드
	public abstract void turnOn();
	public void turnOff();
	public void setVolume(int volume);// 메소드 선언부만 작성
	//abstract 도 붙이지 않으면 자동으로 붙여준다.
	//구현부를 없앰 = 상속해서 구현해야함 
	
	//extends
	//부모에서 선언 / 정의를 모두하며 자식은 메소드 / 변수를 그대로 사용할 수 있음
	//implements (interface 구현)
	//부모 객체는 선언만 하며 정의(내용)은 자식에서 오버라이딩 (재정의) 해서 사용해야함
}
class Television implements RemoteControl{
	//implements=기능을 구현했다.
	//tv는 리모콘 기능을 구현한다.
	//
	//필드
	private int volume;
	
	
	//turnOn () 추상 메소드의 실제 메소드 
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	//turnOff () 추상 메소드의 실제 메소드 
	public void turnOff() {
		System.out.println("TV를 끕니다.");	
	}
	//setVolume() 추상메소드의 실체 메소드
	public void setVolume(int Volume) {
		if (volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if (volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현제 tv 볼륨 " + this.volume);
	}
}

class Audio implements RemoteControl{
	//필드
	private int volume;
	//turnOn () 추상 메소드의 실제 메소드 
		public void turnOn() {
			System.out.println("오디오를 켭니다.");
		}
		//turnOff () 추상 메소드의 실제 메소드 
		public void turnOff() {
			System.out.println("오디오를 끕니다.");	
		}
		//setVolume() 추상메소드의 실체 메소드
		public void setVolume(int Volume) {
			if (volume>RemoteControl.MAX_VOLUME) {
				this.volume = RemoteControl.MAX_VOLUME;
			}else if (volume<RemoteControl.MIN_VOLUME) {
				this.volume = RemoteControl.MIN_VOLUME;
			}else {
				this.volume = volume;
			}
			System.out.println("현제 Audio 볼륨 " + this.volume);
		}
	}
	

public class RemoteControlExample {
	public static void main(String[] args) {
		// 각 제조사 전자기기가 완성되어야만 실행코드를 작성할 수 있다.

		
		
		 
		RemoteControl rc;
		rc = new Television();
		rc = new Audio();
		
//		RemoteControl rc = new Television();
//		rc.turnOn();
//		rc.setVolume(100);
//		rc.turnOff();
//		
	}
}


