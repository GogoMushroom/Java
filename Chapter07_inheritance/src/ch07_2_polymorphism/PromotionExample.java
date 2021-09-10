package ch07_2_polymorphism;

class A{}

class B extends A {}
class C extends A {}

class D extends B {}
class E extends C {}


public class PromotionExample {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b; //A타입의 a1 = b; 
		//a1 과 b는 다른 타입 이지만 B가 A를 상속받았기때문에 자동타입변환이 될 수 있다.
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
		//B b3 = e;
		//C c2 = d;
	}
}
