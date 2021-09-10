package sec06.exam03.package2;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();

		//잘못된 주소 변경 
		myCar.setSpeed(-50);

		System.out.println("현제속도"+ myCar.getSpeed());

		//올바른 주소 변경 
		myCar.setSpeed(60);

		//멈춤 
		if (myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("현제속도"+ myCar.getSpeed());	
	}
}
