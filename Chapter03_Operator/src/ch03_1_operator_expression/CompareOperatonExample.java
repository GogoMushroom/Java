package ch03_1_operator_expression;

public class CompareOperatonExample {
	public static void main(String[] args) throws InterruptedException {
		
//		int num1 = 10;
//		int num2 = 10;
////		
////		boolean result1 = (num1 == num2);
////		boolean result2 = (num1 != num2);
////		boolean result3 = (num1 <= num2);
//		
//		System.out.printf("result1: %b\n", num1 == num2);
//		System.out.printf("result2: %b\n", num1 != num2);
//		System.out.printf("result3: %b\n", num1 <= num2);
//		
//		char char1 = 'A';
//		char char2 = 'B';
////		boolean result4 = (char1 < char2);
//		System.out.printf("result4: %b\n", char1 < char2);
//		
		
		
		
		int count = 10;
		while(count != 0) {
			
			Thread.sleep(500); // 0.5ÃÊ ½¬¾îÁÜ 
			
			System.out.println(count--);
		}
		System.out.println("fire!!!");
	}
}
