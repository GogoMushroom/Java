package ch09_1_inner;

//�ٱ� Ŭ����
class A {
	A() {System.out.println("A��ü�� ������");}


	//�ν��Ͻ� ��� Ŭ���� 
	class B {
		B(){ System.out.println("B��ü�� ������"); }
		int field1;
		//static int field2;
		void method1() {}
		//static void method2(){}
	}

	//���� �ɹ� Ŭ���� 
	static class C {
		C() { System.out.println("C��ü�� ������");}

		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}

	void method() { //�޼ҵ� �ȿ� �ִ°� ���� �޸� �ִٰ� ����� 
		//���� Ŭ���� //���� Ŭ������ ���������� , static ��� �Ұ�
		class D{
			D() {System.out.println("D��ü�� ������");}

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

			//�ν��Ͻ� ��� Ŭ���� ��ü ���� 
			A.B b = a.new B();
			b.field1 =3;
			b.method1();

			//���� ��� Ŭ���� 
			
			A.C c = new A.C(); //Ŭ���� �ܺ��� Ŭ�����̸�.����Ŭ�����̸� 
			c.field1 = 3;
			c.method1();
			
			A.C.field2=3;
			A.C.method2();
			
			//����Ŭ����  ��ü ������ ���� �޼ҵ� ȣ�� 
			
			a.method();
			
		}
	}
			
			




