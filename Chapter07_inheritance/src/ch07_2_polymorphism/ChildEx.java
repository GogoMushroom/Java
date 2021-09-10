package ch07_2_polymorphism;

class Parent1 {
	//필드
	String p_str = "parent String...";
	//생성자
	//메소드
	void print () {
		System.out.println(p_str);
	}
	
}
class Child1 extends Parent1 {
	//필드
	String c_str = "Child String..." ;
	
	//생성자
	//메소드
	@Override
	
	
	void print() {
		display() ;
	}
	void display () {
		System.out.println("♥");
	}
	void s() {
		System.out.println(p_str);
	}
	
}


public class ChildEx {
	public static void main(String[] args) {
		
		Child1 c = new Child1();
		c.print();
		c.s();
		
	}
}
