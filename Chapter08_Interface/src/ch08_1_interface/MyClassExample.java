package ch08_1_interface;

class MyClass {
//필드
	RemoteControl rc = new Television();
	//생성자
	MyClass() {
		
	}
	
	MyClass(RemoteControl rc){
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	//메소드
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	void methodB() {
		rc= new Television();
		rc.turnOn();
		rc.setVolume(5);		
	}
}

public class MyClassExample {
	public static void main(String[] args) {
		System.out.println("1)----------------");
		
		MyClass mc1 = new MyClass();
		mc1.rc.turnOn();
		mc1.rc.setVolume(4);
		
		System.out.println("2)-----------------");
		
		MyClass mc2 = new MyClass(new Audio());
		
		System.out.println("3)--------------------");
		
		MyClass mc3 = new MyClass();
		mc3.methodA();
		
		System.out.println("4)-------------");
		
		MyClass mc4 = new MyClass();
		mc4.methodB ();
	}
}