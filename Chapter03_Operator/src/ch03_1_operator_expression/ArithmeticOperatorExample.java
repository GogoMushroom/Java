package ch03_1_operator_expression;

public class ArithmeticOperatorExample {
	public static void main(String[] args) {

		int v1 = 5; 
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println("result=" + result1);

		int result2 = v1 - v2;
		System.out.println("result=" + result2);

		int result3 = v1 * v2;
		System.out.println("result=" + result3);
		
		int result4 = v1 / v2;
		System.out.println("result=" + result4);
		// 5������2�� ���� 2.5 ������ ���� �Ѵ� int�� ����Ǿ��⶧���� ����ȯ�� �Ͼ�� �ʰ� 
		//������ 2������ ǥ���̵ȴ�.
		
		
		int result5 = v1 % v2;
		System.out.println("result=" + result5);
		//%�����ڴ� ������ ���� ���� �˷��ִ� �������̴� 5%2�� ����� 1  ���� ���� -1 �� ����ŭ�� �� ������ �ִ�
		//ex) 9�� 4 �� ������ ���� �� �ִ� ���� 0,1,2,3 �߿� �ϳ�  
		
		double result6 = (double) v1 / v2;
		System.out.println("result=" + result6);
		
	}
}

