package ch10_1_exception_class;
class Person {}
public class NullPointerExceptionExample {


	public static void main(String[] args) {
		
		String data1;
		String data2 = null;
		String data3 = "";
		String data4 = " ";

		try {
			
			System.out.println(data3.length());

		} catch (NullPointerException e) {
			System.out.println("NullPointerException �߻�");
			System.out.println("e.toString()"+ e.toString());
			System.out.println("e.getMessage()" + e.getMessage());
			System.out.println("e.printStackTrace();");
			e.printStackTrace();
			
	  	}catch (Exception e) {
		e.printStackTrace();
		System.out.println("���� ���!");
		}
		
		
		System.out.println("���α׷�����");
	}		


	

}
