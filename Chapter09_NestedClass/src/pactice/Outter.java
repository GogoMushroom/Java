package pactice;

public class Outter {

	private  int outerIv = 0;
	static int outerCv = 0;
	
	class  InstanceInner{
		int liv = outerIv;  //1.외부 클래스의 private 멤버를 내부 클래스에서 사용가능 
		int liv2 = outerCv;
	}
	
	static class  StaticInner{
		//스테틱 클래스는 외부클래스의 인스턴스 멤버에 접근할 수 없다.
		//int siv = outerIv; 
		static int scv = outerCv;
	}
	
	void myMethod() {//지역변수 메서드 종료와 함꼐 소멸되기 때문에 상수만 가능 
		
		//int lv - 0;// 변수는 안됨 
		final int LV = 0; //상수는 됨 
		
		class LocalInner{ //2.지역 내부 클래스를 감싸고 있는 메서드의 상수만 사용가능 
			int liv = outerIv;
			int liv2 = outerCv;
			
			//int liv3 = lv; // 에러
			int liv4 = LV; 
			
		}
	}
	
}
