package ch07_1_inheritance;

public class SupersonicAirplane extends Airplane{
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;

	public int flyMode = NORMAL;

	@Override
	public String toString() {
		return "Child massase";
	}


	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속비행입니다.");
		} else {
			super.fly();   //Airplane 객체의 fly() 메소드 호출 
		}
	}
}


