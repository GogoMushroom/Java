package ch02_3_type_casting;

public class CastingExample {
	public static void main(String[] args) {
// ����(�����)��ȯ 
// :~ �ؼ��ϴ� ����� ��ȯ 		
// ���� ����ȯ�� �Ѵٴ°��� ���� ��Ʈ�� ū ��Ʈ�� ���������� ��°� ������ ���ս��� �� �� ���� 
//		System.out.println((char)65);
		
		
//		int iv = 127;
//		iv = 1000000;
//		byte bv = (byte)iv;
//		
//		System.out.println(bv);
//		
////		(char)<----int.....long....
//		
//		double dv = 3.14;
//		iv = (int)dv;
//			
//		System.out.println(iv);
//		
//		
//		
//		int number = (int)"123456_1234567";
//		
//		System.out.println("123456_1234567");
//		
		
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
		
		
	}
}
