package Test;

import java.util.Scanner;
//스캐너 사용시 import를 통해 외부 클래스 호출
public class ch02test02 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//scanner 객체 생성 System.in 입력한 값을 바이트 단위로 읽는다.
		
		System.out.println("첫번째 수:");
		String strNum1 = scanner.nextLine();
		//nexyLine() 메소드는 문자열 전체를 입력받음 

		System.out.println("두번째 수:");
		String strNum2 = scanner.nextLine();
				
		int num1 = Integer.parseInt(strNum1);
		// num1 은 문자열이기 때문에 int형으로 바꾸어줌
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		//int 형으로 변한 int1 과 2를 계산 
		System.out.println("덧샘결과:" + result);
		
				
				
	}
	
}
