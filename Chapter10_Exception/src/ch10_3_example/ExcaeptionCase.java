package ch10_3_example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcaeptionCase { 
	public static void main(String[] args)  {
		// �� ������ ����ڷκ��� �Է¹ޱ�  �� ) 3,4 3/4����������ϰ� 
		//�Է¹��� ���ڿ� ���������� ����Ͻÿ� 
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
			System.out.println("���ڸ� �Է����ּ���");
		}catch (ArithmeticException e) {
			System.out.println("0���� ���� �� ����");
		
		}
		System.out.println("����");
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
//		System.out.println(" ����! Ȯ���ϼ���");
//		}finally {
//			System.out.println("��곡 ");
//			
//		}
//		System.out.println("���α׷� ����");
//		
//	}
//}
