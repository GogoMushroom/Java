package training;

public class ArrayMinMaxExample {
	public static void main(String[] args) {
		/*
		 * int �� 1���� �迭�� �Ű������� ���޹޾Ƽ� �迭�� �����
		 * �ִ밪, �ּҰ��� ã�Ƽ� ��ȯ�ϴ� �޼��带 ���� ���������·� �����Ͻÿ�
		 * public static int minValue(int[]arr) : �ּҰ� ��ȯ
		 * public static int maxValue(int[]arr) : �ִ밪 ��ȯ
		 * 
		 */
		
// � 1���� �迭 ����, ������ �޼��� call�ؼ� ����ϴ� 	�ڵ�
		int [] arr = {1,3,65,6,54,-77,-98};
		System.out.println("�ּҰ�:" + minValue(arr));
		System.out.println("�ִ밪:" + maxValue(arr));
		int min = arr[0];
		int max = arr[0];
	}
	public static int minValue(int[] ar) {
		int min = ar[0];
	
		for (int i=1; i<ar.length ; i++ ) {
		 if (ar[i] < min) {
			 min = ar[i];
			 
		 }
		}
		return min;
	}
	public static int maxValue(int[] ar) {
		int max = ar[0];
	
		for (int i=1; i<ar.length ; i++ ) {  
		 if (ar[i] > max ) {
  		 max = ar[i];
		
	}
}
		return max;
	}
}
