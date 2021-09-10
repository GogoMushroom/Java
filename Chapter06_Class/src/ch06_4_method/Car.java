package ch06_4_method;

public class Car {
//필드
	int gas;
	
	
//생성자
	//안써주면 컴파일 할때 기본 생성자 생성해줌 
//메소드 
		void setGas(int gas) { //리턴값이 없음 void
			this.gas =  gas;
		}
		
		boolean isLeftGas() { //boolean 리턴값이 f or t 
			if (gas ==0) {
				System.out.println("gas가 없습니다.");
				return false; //false를 리턴
		 	}
			System.out.println("gas가 있습니다.");
			return true;
		}
		void run () {
			while(true) {
				if (gas > 0) {
					System.out.println("달립니다.(gas잔량:"+gas+")");
					gas--; // 주행시 가스 차감 -1
					
				} else {
					System.out.printf("멈춥니다.(gas잔량:%d)\n",gas);
					return; //메소드 실행 종료
				}
			}
		}
	
}
