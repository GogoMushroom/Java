package test;
import java.util.Scanner;

public class ch03test02_9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		
		System.out.println("ù ��° ��:");
		double num1 = Double.parseDouble(scanner.nextLine());
		
		System.out.println("�� ��° ��:");
		double num2 = Double.parseDouble(scanner.nextLine());
		
		System.out.println("------------");
		
		if(num2 == 0 || num2== 0.0) {
			System.out.println("��� : ���Ѵ�" );
		} else {
			System.out.println("��� :" +num1/num2);
		}
		
		
		
		
//		String num1 = scanner.nextLine();
//		String num2 = scanner.nextLine();
//		
//		double number1 = Double.parseDouble(num1);
//		double number2 = Double.parseDouble(num2);
//
//		System.out.printf("��� : %d",number1/number2);
		
		
	}

}
