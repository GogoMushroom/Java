package ch03_1_operator_expression;

public class test20 {
	public static void main(String[] args) {
		
		int num1 = 0, num2 =0;
		boolean result;
		
		//num1 += 10
		//num1 = num1 + 10
		
		result = ((num1 += 10) < 0 && (num2 += 10) > 0);
		System.out.printf("num1=%d, num2=%d\n", num1, num2);
		/*
		 * (num1 += 10) < 0    0+=10 = 10  < 0   = false ---> num2 �������ʿ���� false
		 * (num2 += 10) > 0) = �տ���false�� ���Ա⶧���� ���������ʴ´� num2 = 0
		 * 
		 * num1 = 10 , num2 = 0
		 */
		
		result = ((num1 += 10) > 0 || (num2 += 10) > 0);
		System.out.printf("num1=%d, num2=%d\n", num1, num2);
		/*
		 * (num1 += 10) > 0  10+10 = 20 > 0  =true ----> num2 �� ��������ʰ� �ٷ� true �� ��
		 * (num2 += 10) > 0 = �տ��� true �� ���Ա⶧���� ���������ʴ´�.
		 * 
		 * num1 = 20 , num2 = 0
		 */
		
	}
}
