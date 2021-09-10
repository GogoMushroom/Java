package ch06_5_insrance_static;

public class Calaulator{
	
	int speed;
	void run() {
		
	}

	//필드
	static double pi = 3.14159;

	//생성자
	//메소드
	static int plus (int x, int y) {
		return x+y;
	}
	//static은 인스턴스 필드를 사용하면안됨 
	static int minus(int x, int y) {
		int i = (x - y);
		return i;	
	}


}
