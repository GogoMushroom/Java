package ch07_1_inheritance;

public class Computer extends Calculator {
	
	@Override //
	double areaCircle (double r) {
		System.out.println("Computer ��ü�� areaCirccle() ����");
		
		A a1 = new A();
		a1.toString();
		
		System.out.println(a1.toString());
		return Math.PI *r*r;
		
		
	}
}

class A{
	@Override
	public String toString() {
		return "my meassage";
	}

}
