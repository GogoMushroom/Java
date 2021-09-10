package ch10_3_example;

class Exception1000 extends Exception{
@Override
public String toString() {
	
	return "결과값이 1000을 넘습니다";}
@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "입력에러";
	}

}
class Exceptionzero extends Exception{
	@Override
	public String toString() {
		
		return "결과값이 음수 입니다";}
}
class DivzeroException extends Exception{
	@Override
	public String toString() {
		
		return "0으로 나눌 수 없습니다";}
}


public class Excaption {
	public static void main(String[] args) {
		
		
	try {
		System.out.println(Calculator.add(1,1000));
		System.out.println(Calculator.div(1,0));
	} catch (Exception1000 e) {
		 System.out.println(e.toString());
		 System.out.println(e.getMessage());
		//System.out.println("에러! 결과값이 1000이넘습니다.");
	} catch (Exceptionzero e) {
		System.out.println(e.toString());
		//System.out.println("에러! 결과값이 음수 입니다.");
	} catch (DivzeroException e) {
		System.out.println(e.toString());
	}
	//마지막에 무조건 들리는 곳 
	finally {
		System.out.println("입력값을 확인하세요");
	
	
}
	System.out.println("프로그램 정상 종료");
	}}

