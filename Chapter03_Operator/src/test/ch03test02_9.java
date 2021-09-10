package test;
import java.util.Scanner;

public class ch03test02_9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		
		System.out.println("첫 번째 수:");
		double num1 = Double.parseDouble(scanner.nextLine());
		
		System.out.println("두 번째 수:");
		double num2 = Double.parseDouble(scanner.nextLine());
		
		System.out.println("------------");
		
		if(num2 == 0 || num2== 0.0) {
			System.out.println("결과 : 무한대" );
		} else {
			System.out.println("결과 :" +num1/num2);
		}
		
		
		
		
//		String num1 = scanner.nextLine();
//		String num2 = scanner.nextLine();
//		
//		double number1 = Double.parseDouble(num1);
//		double number2 = Double.parseDouble(num2);
//
//		System.out.printf("결과 : %d",number1/number2);
		
		
	}

}
