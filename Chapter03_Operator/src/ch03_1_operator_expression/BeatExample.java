package ch03_1_operator_expression;

public class BeatExample {
	public static void main(String[] args) {
		
		int a = 9;
		int b = 11;
		
//		String str = "71";
//		int num = Integer.parseInt(str);
		
		
//		1001 -> 9 
//		1011 -> 11
//	&	           &���� �Ѵ� 1�̿����� 1 �������� ���� 0 		
//		1001 -> 9 
//  ||             |���� ���� �ϳ��� 1 �̸� 1 �Ѵ� 0�̸� 0
//		1011 -> 11
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
		
		//toBinaryString 2���� ������� Ȯ���ϸ鼭 or �����ϱ�
		

		System.out.println("10����:" + (a & b));
		System.out.println("10����:" + (a | b));
	
		//                            9�� ��Ʈ�� 11�� ��Ʈ��  &���� 
		//                            9�� ��Ʈ�� 11�� ��Ʈ��  |���� 
		
		System.out.println("3<<2:" + (3<<2));
		/*
		 *  3�̶�� ������ ��Ʈ���� �������� 2��Ʈ �Űܶ�
		 *  3�� ��Ʈ = 11  
		 *  ��ĭ �ű�� = 1100 (�ű�� ���� �ڸ��� 0 ���� ä����)
		 *  1100 = 12
		 *    
		 */
		System.out.println("128>>5:" + (128>>5));
		/*
		 *  128�̶�� ������ ��Ʈ�� ���������� 5ĭ ���ܶ�
		 *  128�� ��Ʈ  1000000
		 *  5ĭ �ű�� 10
		 *  10 = 4 
		 */
		
	}
}
