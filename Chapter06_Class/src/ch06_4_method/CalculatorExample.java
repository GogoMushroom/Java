package ch06_4_method;

class Util{

	public void calcExec() {
		
		Calculator myCalc = new Calculator(); // Calculator class를 가져와서 사용한다. 

		//계산기 켜기 
		myCalc.powerOn();
		
		//계산하기
		int var1 = myCalc.plus(8, 8) ;
		System.out.println(var1);
		
		//계산기끄기
		myCalc.powerOff();
		
		double var2= myCalc.devide(10, 1);
		System.out.println(var2);
		
		byte x=10; //매개값의 타입과 매개변수의 타입이 달라도 byte는 int타입으로 자동변환된다.
		byte y=4;   // byte는 값손실이 일어나지 읺기 때문에 컴파일 에러가 나지 않음 double형은 값손실이 일어나서 오류기 남 
		double var3= myCalc.devide(x, y);
		System.out.println(var3);
		
		
	}
	
	
}

public class CalculatorExample {
	//calculator class를 사용할꺼임 
	public static void main(String[] args) {
		
		Util util = new Util();
		util.calcExec();
		
	}
}
