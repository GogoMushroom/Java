package ch09_1_inner;

public class A3 {
	int field1;
	void method1() {}

	static int field2;
	static void method2() {}

	class B3 {         // ��� �ʵ�� �޼ҵ忡 ������ �� ���� 
		void method () {
			field1 = 10;
			method1();

			field2 = 10;
			method2();
		}
	}
	static class C3 {
		void method() {
			//field1=10;
			//method1();

			field2 = 10;    //�ν��Ͻ� �ʵ� �� �޼ҵ�� ������ �� ���� 
			method2();
		}
	}
}
