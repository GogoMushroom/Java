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
		
		Parentt parent = new Childd(); // 자동타입변환 
		
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		
		//강제 형변환 되었기때문에 parent안에있는것만 사용가능 98//		parent.field2 = "data2"
//		parent.method3();		
		
		
		
		Childd child = (Childd)parent; 
		//강제 형변환 Childd는 parentt 타입이지만 childd 로 현변환해줌 
		
		child.feild2 = "yy";
		child.method2();
		
		System.out.println(child.feild2);
				
		
		
	}
}
