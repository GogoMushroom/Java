package ch07_2_polymorphism;

public class Bus extends Vehicle{ //is 관계 상속관계 상속받아서 사용
@Override //오버라이드 재정의!!
	public void run() {
	System.out.println("버스가 달립니다.");
}
}
