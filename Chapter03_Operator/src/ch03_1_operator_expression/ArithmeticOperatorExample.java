package ch03_1_operator_expression;

public class ArithmeticOperatorExample {
	public static void main(String[] args) {

		int v1 = 5; 
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println("result=" + result1);

		int result2 = v1 - v2;
		System.out.println("result=" + result2);

		int result3 = v1 * v2;
		System.out.println("result=" + result3);
		
		int result4 = v1 / v2;
		System.out.println("result=" + result4);
		// 5나누기2의 값은 2.5 이지만 형이 둘다 int로 선언되었기때문에 형변환이 일어나지 않고 
		//정수인 2까지만 표현이된다.
		
		
		int result5 = v1 % v2;
		System.out.println("result=" + result5);
		//%연산자는 나누고 남은 수를 알려주는 연산자이다 5%2의 결과는 1  나눈 숫자 -1 의 값만큼의 몫 종류가 있다
		//ex) 9를 4 로 나눌시 나올 수 있는 값은 0,1,2,3 중에 하나  
		
		double result6 = (double) v1 / v2;
		System.out.println("result=" + result6);
		
	}
}

