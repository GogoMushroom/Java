package ch07_2_polymorphism;

public class CarExample {
	public static void main(String[] args) {
		Car c = new Car();
		
		for(int i =1; i<=15; i++) {
			int problemLocation = c.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("case1");
				System.out.println("앞 왼쪽 HankookTire로 교체");
			c.frontLeftTire = new HankookTire("앞왼쪽", 5);
			//자동타입변환이 일어남!!!
			//class의 frontLeftTire에  HankookTire넣을 수 있음
			
			break;
			case 2:
				System.out.println("case2");
				System.out.println("앞 오른쪽 KumhoTire로 교체");
			c.frontRightTire = new KumhoTire("앞오른쪽", 3);
			break;
			case 3:
				System.out.println("뒤 왼쪽 HankookTire로 교체");
			c.backLeftTire = new HankookTire("뒤왼쪽", 4);
			break;
			case 4:
				System.out.println("뒤 오른쪽 KumhoTire로 교체");
			c.backRightTire = new KumhoTire("뒤오른쪽", 7);
			break;
			}
			System.out.printf("---------------------------");
		}
	}
}
