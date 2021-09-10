package ch07_2_polymorphism;

public class Parent {
	//필드
	String Charactor ;
	//생성자
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

