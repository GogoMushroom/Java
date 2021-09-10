package ch09_1_inner;

//클래스 A2
public class A2 {

	//인스턴스필드 
	B2 field1 = new B2();
	C2 field2 = new C2();
	
	//인스턴스 필드 클래스 B2
	class B2 {}
	//인스턴스 필드 클래스 C2
	static class C2 {}
	
	
	//스테틱필드
	//static B2 field3 = new B2;//static은 인스턴스 변수를 사용할 수 없음 
	static C2 field4 = new C2();
	
	//인스턴스메소드
	void method1() {
		B2 var1 = new B2();
		C2 var2 = new C2();
	}
	//스테틱메소드
	static void method2() {
		//B2 var1 = new B2();
		C2 var2 = new C2();
	}

	

}