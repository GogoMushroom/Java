package Test;

import java.util.Scanner;
//��ĳ�� ���� import�� ���� �ܺ� Ŭ���� ȣ��
public class ch02test02 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//scanner ��ü ���� System.in �Է��� ���� ����Ʈ ������ �д´�.
		
		System.out.println("ù��° ��:");
		String strNum1 = scanner.nextLine();
		//nexyLine() �޼ҵ�� ���ڿ� ��ü�� �Է¹��� 

		System.out.println("�ι�° ��:");
		String strNum2 = scanner.nextLine();
				
		int num1 = Integer.parseInt(strNum1);
		// num1 �� ���ڿ��̱� ������ int������ �ٲپ���
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		//int ������ ���� int1 �� 2�� ��� 
		System.out.println("�������:" + result);
		
				
				
	}
	
}
