package ch06_4_method;

public class Car2Example {
	public static void main(String[] args) {
		Car2 myCar = new Car2();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.printf("�����ӵ� : %d km/h\n",speed);		
	}
}
