package ch10_2_exception_handling;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		
		
		
		try{
		Class clazz = Class.forName("java.lang.String");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
		System.out.println("�������� �ʴ� Ŭ����");
	}
		System.out.println("���α׷�����");
		
}
}