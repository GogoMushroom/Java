package ch07_2_polymorphism;

public class Car {
	//Tire 클래스를 상속을 할지 (is 관계)
	//가지고있을지 (has 관계) 고민을 해봐야 한다 
	
	//필드
	Tire frontLeftTire = new Tire("앞왼쪽",6);
	Tire frontRightTire = new Tire("앞 오른쪽" ,2);
	Tire backLeftTire = new Tire("뒤왼쪽",3);
	Tire backRightTire = new Tire("뒤오른쪽",4);

	//생성자
	//메소드 
	int run() {// int리턴? 
		//tire가 멈추면 (펑크가나면)어디가 멈췄는지에 따라 리턴값이 1~4 가 찍힘
		//아무이상이 없으면 return 0
		System.out.println("자동차가 달립니다.");
		if (frontLeftTire.roll()==false) {stop(); return 1;}
		if (frontRightTire.roll()==false) {stop(); return 2;}
		if (backLeftTire.roll()==false) {stop(); return 3;}
		if (backRightTire.roll()==false) {stop(); return 4;}
		return 0;
	}

	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}



}