package pactice;

public class Ex7_17 {
	
//					�����̸� 		Ŭ��������{}
	Object iv = new Object () {void method() {} }; //�͸� Ŭ����  
	//Ex7_17$1.class ����Ŭ���� �̱⶧���� �ܺ� Ŭ���� �̸��� ����´�
	static Object cv = new Object() { void method() {} }; //�͸� Ŭ���� 
	
	void MyMethod() {
		Object lv = new Object() {void method(){}};
	}
}
