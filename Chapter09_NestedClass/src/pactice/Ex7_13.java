package pactice;

public class Ex7_13 {
	class InstanceInner{}
	static class StaticInner{}
	
	InstanceInner iv = new InstanceInner(); //�ν��Ͻ� ������� ���ٰ���
	StaticInner cv = new StaticInner(); //static ������� ���ٰ��� 
	//StaticInner cvi = new InstanceInner(); //static�� �ν��Ͻ��� ���� �Ұ� 
	
	static void staticMethod() {
		//InstanceInner obj1 = new InstanceInner(); //static ����� �ν��Ͻ� ����� ���� �Ұ�
		StaticInner obj2 = new StaticInner(); //����ƽ ��� ����ƽ��� ���� 
		
		Ex7_13 outer = new Ex7_13(); //�ν��Ͻ�Ŭ������ �ܺ� Ŭ������ �ռ� �����ؾ� ��밡�� 
		InstanceInner obj1 = outer.new InstanceInner();//�䷸�� ���
	}
	void instaneMathod() {//�ν��Ͻ��޼��� ������ �ν��Ͻ� ����ƽ �Ѵ� ���� 
	InstanceInner obj1 = new InstanceInner();
	StaticInner obj2 = new StaticInner();
	//LocalInner lv = new LocalInner();//���� ���� Ŭ������ �ܺο��� ���� �Ұ� 
	
	}
	void myMethod () { //���� ���� Ŭ���� 
		class LocalInner{} 
		LocalInner lv = new LocalInner();	
	}	
}
