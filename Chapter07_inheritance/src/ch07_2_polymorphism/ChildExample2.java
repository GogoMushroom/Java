package ch07_2_polymorphism;



class Parentt {
	String field1;
	void method1 () {
		System.out.println("Parents= method1()");
	}
	void method2 () {
		System.out.println("Parents= method2()");
	}
}
class Childd extends Parentt{
	String feild2;
	void method() {
		System.out.println("Child method3");
	}
}


public class ChildExample2 {
	public static void main(String[] args) {
		
		Parentt parent = new Childd(); // �ڵ�Ÿ�Ժ�ȯ 
		
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		
		//���� ����ȯ �Ǿ��⶧���� parent�ȿ��ִ°͸� ��밡�� 98//		parent.field2 = "data2"
//		parent.method3();		
		
		
		
		Childd child = (Childd)parent; 
		//���� ����ȯ Childd�� parentt Ÿ�������� childd �� ����ȯ���� 
		
		child.feild2 = "yy";
		child.method2();
		
		System.out.println(child.feild2);
				
		
		
	}
}
