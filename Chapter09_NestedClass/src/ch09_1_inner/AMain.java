package ch09_1_inner;

//바깥 클래스
class A {
	A() {System.out.println("A객체가 생성됨");}


	//인스턴스 멤버 클래스 
	class B {
		B(){ System.out.println("B객체가 생성됨"); }
		int field1;
		//static int field2;
		void method1() {}
		//static void method2(){}
	}

	//정적 맴버 클래스 
	static class C {
		C() { System.out.println("C객체가 생성됨");}

		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}

	void method() { //메소드 안에 있는건 스텍 메모리 있다가 사라짐 
		//로컬 클래스 //로컬 클래스는 접근제한자 , static 사용 불가
		class D{
			D() {System.out.println("D객체가 생성됨");}

			int field1;
			//static int field2;
			void method1() {}
			//static void method2(){}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	
	}
	}


	
	
	
	public class AMain {
		public static void main(String[] args) {
			A a = new A();

			//인스턴스 멤버 클래스 객체 생성 
			A.B b = a.new B();
			b.field1 =3;
			b.method1();

			//정적 멤버 클래스 
			
			A.C c = new A.C(); //클래스 외부의 클래스이름.내부클래스이름 
			c.field1 = 3;
			c.method1();
			
			A.C.field2=3;
			A.C.method2();
			
			//로컬클래스  객체 생성을 위한 메소드 호출 
			
			a.method();
			
		}
	}
			
			




