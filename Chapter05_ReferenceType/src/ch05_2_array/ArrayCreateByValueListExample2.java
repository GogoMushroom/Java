package ch05_2_array;

public class ArrayCreateByValueListExample2 {
	public static void main(String[] args) {

		int [] scores;
		scores = new int [] {83,90,87};
		int sum1 = 0;
		for (int i=0; i<3; i++) {
			sum1 += scores[i];
		}

		System.out.println("����: " + sum1);

//		int [] arr = new int[] {83,90,87};
//		int sum2 = add ( arr );
		
		

		int sum2 = add ( new int[] {83,90,87} );//add�޼ҵ�� int���� ����������� add�޼ҵ� ���� ���ϱ�
		//       = add ( int 83,90,87�� �ּ� )
		//�迭�� ����Ÿ���� ���� 
		//
		System.out.println("����: "+ sum2);
		System.out.println();}
		

//	}
//	add(3,7);
//	public static int add(int a, int b) {
//	// int a ���� 3�� �Ҵ��ϰ� int b ���� 7�� �Ҵ��Ѵ�. 
//	}
//	
	
	
	public static int add(int[] scores) { //score �������� , ������������ �ּҰ��� ����� , �ּҰ��� ��������
//							[] scores = �迭�� �������� , new int[] {83,90,87} �� �����ּ���!!							
		int sum = 0;
//		for(int i =0 ; i<30; i++) {
		for(int i =0 ; i<scores.length; i++) {
			sum +=scores[i];
		}
		return sum;
	}
// add �޼ҵ� = 0���� i�� ���� ���� ���������� ������ ���� scores �� �����ش�.
	
}
