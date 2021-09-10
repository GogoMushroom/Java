package practice;

class TvExample {
	public static void main(String[] args) {
		Tv t;//Tv 인스턴스를 참조하기 위한 변수t선언 //인스턴스 =객체  ->객체생성
		t= new Tv();//Tv 인스턴스 생성					 ->객체생성
		t.channel = 7;//Tv 인스턴스의 멤버변수 channel 의 값을7호          ->객체사용(변수사용)
		t.channelDown(); // Tv 인스턴스 메소드 channelDown 을 호출   ->객체사용(메소드사용)
		System.out.println("현재체널은" + t.channel + "입니다.");
	}
}
class Tv {
	// Tv의 속성 멤버변수
	String color;
	boolean power;
	int channel;
	
	//Tv의 기능 메소드 
	void power() {power =! power;}
	void channelUp() {++channel;}
 	void channelDown() {--channel;}
}
