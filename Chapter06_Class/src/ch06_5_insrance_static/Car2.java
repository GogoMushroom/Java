package ch06_5_insrance_static;

public class Car2 {
	//�ν��Ͻ��ʵ� 
	int speed;
	void run() {
		System.out.println(speed +"���� �޸��ϴ�.");
	}
	
	
	public static void main(String[] args) {
		Car2 myCar = new Car2();
		myCar.speed = 60;
		myCar.run();
		
		
	}
}
