package ch06_5_insrance_static;

public class Singleton {
	
	//����ƽ �ʵ�(1�� ��ü�����Ȱ��� ������������)
	private static Singleton singleton = new Singleton();
	
	//private ������
	//������ ȣ�� �ȵǵ��� 
	private Singleton() {}
	
	//�޼ҵ�
	static Singleton getInstance() {
		return singleton;
		
	}

}
