package ch06_5_insrance_static;

public class Calaulator{
	
	int speed;
	void run() {
		
	}

	//�ʵ�
	static double pi = 3.14159;

	//������
	//�޼ҵ�
	static int plus (int x, int y) {
		return x+y;
	}
	//static�� �ν��Ͻ� �ʵ带 ����ϸ�ȵ� 
	static int minus(int x, int y) {
		int i = (x - y);
		return i;	
	}


}
