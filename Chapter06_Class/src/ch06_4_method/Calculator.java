package ch06_4_method;

public class Calculator {

	public void /*���ϰ��� ����*/powerOn() {
		System.out.println("������ �մϴ�");
		
	}

	public int/*���ϰ��� int��*/plus(int i, int j) {
		return i+j;
		
		
	}

	public void powerOff() {
		System.out.println("������ ���ϴ�.");
	}

	public double/*���ϰ��� double*/devide(int i, int j) {
		if(j ==0 ) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		return (double)i/j;
	
}
}
