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
			System.out.println("�����Ӻ����Դϴ�.");
		} else {
			super.fly();   //Airplane ��ü�� fly() �޼ҵ� ȣ�� 
		}
	}
}

