package ch07_2_polymorphism;

public class Parent {
	//�ʵ�
	String Charactor ;
	//������
	public Parent (String charactor) {
		this.Charactor = charactor; 
	}
	
	public void method1() {
		System.out.println("parent method2 ()");
	}
	
	public void method2() {
		System.out.println("parent method2 ()");
		
	}
	public void act() {
		System.out.println(Charactor);
	}
	
}

