package ch07_2_polymorphism;

public class CarExample {
	public static void main(String[] args) {
		Car c = new Car();
		
		for(int i =1; i<=15; i++) {
			int problemLocation = c.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("case1");
				System.out.println("�� ���� HankookTire�� ��ü");
			c.frontLeftTire = new HankookTire("�տ���", 5);
			//�ڵ�Ÿ�Ժ�ȯ�� �Ͼ!!!
			//class�� frontLeftTire��  HankookTire���� �� ����
			
			break;
			case 2:
				System.out.println("case2");
				System.out.println("�� ������ KumhoTire�� ��ü");
			c.frontRightTire = new KumhoTire("�տ�����", 3);
			break;
			case 3:
				System.out.println("�� ���� HankookTire�� ��ü");
			c.backLeftTire = new HankookTire("�ڿ���", 4);
			break;
			case 4:
				System.out.println("�� ������ KumhoTire�� ��ü");
			c.backRightTire = new KumhoTire("�ڿ�����", 7);
			break;
			}
			System.out.printf("---------------------------");
		}
	}
}
