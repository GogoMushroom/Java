package ch07_2_polymorphism;

class Parent1 {
	//�ʵ�
	String p_str = "parent String...";
	//������
	//�޼ҵ�
	void print () {
		System.out.println(p_str);
	}
	
}
class Child1 extends Parent1 {
	//�ʵ�
	String c_str = "Child String..." ;
	
	//������
	//�޼ҵ�
	@Override
	
	
	void print() {
		display() ;
	}
	void display () {
		System.out.println("��");
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
