package ch02_3_type_casting;

public class CastingExample {
	public static void main(String[] args) {
// 강제(명시적)변환 
// :~ 해석하는 방법을 변환 		
// 강제 형변환을 한다는것은 작은 비트에 큰 비트를 강제적으로 담는것 오류나 값손실이 날 수 있음 
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
