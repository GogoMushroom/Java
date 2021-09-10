package ch10_3_example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcaeptionCase { 
	public static void main(String[] args)  {
		// 두 정수를 사용자로부터 입력받기  예 ) 3,4 3/4나누기실행하고 
		//입력받은 숫자와 나누기결과를 출력하시오 
		Scanner sc = new Scanner(System.in);
			
		
		
		
		try {
			System.out.print("a/b...a?>");
			double n1 = sc.nextInt();
			
			System.out.print("a/b...b?>");
			double n2 = sc.nextInt();
			
			if (Double.isInfinite(n1/n2)) {
				throw new ArithmeticException();
			}
			double result = (double)n1/n2;
		System.out.printf("%f/%f=%f\n",n1,n2,result);
		}catch (InputMismatchException e) {
			System.out.println("숫자를 입력해주세요");
		}catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없음");
		
		}
		System.out.println("종료");
	}
	
}

		

//		
//		
//		String a = null;
//		String b = null;
//		
//		
//		try {
//			int v1 = Integer.parseInt(a); 	
//			int v2 = Integer.parseInt(b);
//			int r = v1/v2;
//			
//			System.out.printf("%d/%d=%d",v1,v2,r);
//		}catch (Exception e) {
//		System.out.println(" 오류! 확인하세요");
//		}finally {
//			System.out.println("계산끝 ");
//			
//		}
//		System.out.println("프로그램 종료");
//		
//	}
//}
