package bit_camp_common;


public class BizThousandOverException extends Exception {//Object클래스를 자동 상속 받듯이 throws로 넘긴 클래스는 Exception을 상속받는다.
	@Override
	public 
	String toString() {
		return "결과값이 1000이 넘습니다. 확인 요망!!";
	}
	
	public String getMessage() {
			return "입력에러";
		}
	
}