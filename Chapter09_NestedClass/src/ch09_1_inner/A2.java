package ch09_1_inner;

//Ŭ���� A2
public class A2 {

	//�ν��Ͻ��ʵ� 
	B2 field1 = new B2();
	C2 field2 = new C2();
	
	//�ν��Ͻ� �ʵ� Ŭ���� B2
	class B2 {}
	//�ν��Ͻ� �ʵ� Ŭ���� C2
	static class C2 {}
	
	
	//����ƽ�ʵ�
	//static B2 field3 = new B2;//static�� �ν��Ͻ� ������ ����� �� ���� 
	static C2 field4 = new C2();
	
	//�ν��Ͻ��޼ҵ�
	void method1() {
		B2 var1 = new B2();
		C2 var2 = new C2();
	}
	//����ƽ�޼ҵ�
	static void method2() {
		//B2 var1 = new B2();
		C2 var2 = new C2();
	}

	

}