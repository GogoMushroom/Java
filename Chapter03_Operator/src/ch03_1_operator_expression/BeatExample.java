package ch03_1_operator_expression;

public class BeatExample {
	public static void main(String[] args) {
		
		int a = 9;
		int b = 11;
		
//		String str = "71";
//		int num = Integer.parseInt(str);
		
		
//		1001 -> 9 
//		1011 -> 11
//	&	           &연산 둘다 1이여야지 1 나머지는 전부 0 		
//		1001 -> 9 
//  ||             |연산 둘중 하나라도 1 이면 1 둘다 0이면 0
//		1011 -> 11
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
		
		//toBinaryString 2진수 출력으로 확인하면서 or 연산하기
		

		System.out.println("10진수:" + (a & b));
		System.out.println("10진수:" + (a | b));
	
		//                            9의 비트와 11의 비트를  &연산 
		//                            9의 비트와 11의 비트를  |연산 
		
		System.out.println("3<<2:" + (3<<2));
		/*
		 *  3이라는 숫자의 비트열을 왼쪽으로 2비트 옮겨라
		 *  3의 비트 = 11  
		 *  두칸 옮기면 = 1100 (옮기고 남은 자리는 0 으로 채워짐)
		 *  1100 = 12
		 *    
		 */
		System.out.println("128>>5:" + (128>>5));
		/*
		 *  128이라는 숫자의 비트를 오른쪽으로 5칸 옯겨라
		 *  128의 비트  1000000
		 *  5칸 옮기면 10
		 *  10 = 4 
		 */
		
	}
}
