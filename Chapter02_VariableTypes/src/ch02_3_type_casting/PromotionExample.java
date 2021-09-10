package ch02_3_type_casting;

public class PromotionExample {
	public static void main(String[] args) {
		
		
		//자동 타입 변환(묵시적)
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("inValue: " + intValue);

		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드:" + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue:" + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue:" + floatValue);
		
		floatValue = 100.5F;
		double doubelValue = floatValue;
		System.out.println("doubleValue:" + doubelValue);
		
		
				
				
				
	}
}
