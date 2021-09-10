package ch06_5_insrance_static;

public class Singleton {
	
	//스테틱 필드(1개 객체생성된것의 참조변수생성)
	private static Singleton singleton = new Singleton();
	
	//private 생성자
	//생성자 호출 안되도록 
	private Singleton() {}
	
	//메소드
	static Singleton getInstance() {
		return singleton;
		
	}

}
