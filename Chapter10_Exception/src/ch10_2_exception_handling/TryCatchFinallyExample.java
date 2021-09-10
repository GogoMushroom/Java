package ch10_2_exception_handling;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		
		
		
		try{
		Class clazz = Class.forName("java.lang.String");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
		System.out.println("존재하지 않는 클래스");
	}
		System.out.println("프로그램종료");
		
}
}