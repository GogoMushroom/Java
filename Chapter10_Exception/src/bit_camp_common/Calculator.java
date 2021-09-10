package bit_camp_common;



public class Calculator {

	// 업무적으로 x+y 값은 1000을 넘으면 에러!! 음수여도 에러!!
	public static int add(int x, int y) throws BizThousandOverException, BizNegativeNumberException {// throws로 던지는 클래스 이름은 상황에 맞게 만들어서 쓰면 되지 머
																			                         // throws가 복수인 이유는 예외를 여러개 던지기 가능
		if (x + y > 1000) {
			throw new BizThousandOverException();
		}
		if (x + y < 0) {
			throw new BizNegativeNumberException();
		}
		return x + y;
	}
	
	//업무적으로 x-y값이 음수이면 에러!
	public static int sub(int x, int y) throws BizNegativeNumberException {
		if(x-y<0) {
			throw new BizNegativeNumberException();
		}
		return x - y;
	}
	
	public static int multi(int x, int y) {
		return x * y;
	}
	
	//업무적으로 y가 값이 0이면 에러
	public static int div(int x, int y) throws BizDivideByZeroException{
		if(y == 0) {
			throw new BizDivideByZeroException();
		}
		return x / y;
	}
}

