package ch02_3_type_casting;

public class PrimitiveAndStringConversionExample {
	public static void main(String[] args) {
//		int value1 = Integer.parseInt("10");
//		double value2 = Double.parseDouble("3.14");
//		boolean value3 = Boolean.parseBoolean("true");
//		
//		System.out.println("value1:" + value1);
//		System.out.println("value2:" + value2);
//		System.out.println("value3:" + value3);
//		
//		String str1 = String.valueOf(10);
//		String str2 = String.valueOf(3.14);
//		String str3 = String.valueOf(true);
//		
//		System.out.println("str1:"+str1);
//		System.out.println("str2:"+str2);
//		System.out.println("str3:"+str3);
		
		
//		문자열------> 숫자
//		문자열<------ 숫자 

//		숫자 <--------문자열
		int value = Integer.parseInt("123456") + 1; //123457

//		믄자열<--------숫자
		String str = Integer.toString(value) + "8"; //1234578
		str = String.valueOf(100) + 1;
//                          "100" + 1;
//							문자열   +	숫자1
//                          결과 : 문자열 1001  		
		System.out.println(str);
	}
}
