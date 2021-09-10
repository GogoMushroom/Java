package ch06_5_insrance_static;

public class Car {
	
	//필드
	String model;
	int speed;
	
	
	//생성자
	Car(String model) {
		this.model = model;
	}
	//메소드
	void setSpeed( int speed) {
		this.speed = speed;
	}
		
	void run() {
		for (int i = 0; i < 5; i++) {
			this.setSpeed((i+1)*10);
			System.out.printf("%s가달립니다. 시속%dkm/h\n",this.model,this.speed);
				
	}
	}
}
