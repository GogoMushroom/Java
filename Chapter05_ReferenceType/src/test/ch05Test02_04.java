package test;

public class ch05Test02_04 {
	public static void main(String[] args) {
		//for���� ����ؼ� �־��� �迭�� �׸񿡼� �ִ밪�� ���غ��ÿ� 
		int max = 0;
		int[] array = {1,2,5,8,2}; //����� ���ÿ� �ʱ�ȭ 
		// array[0] = 1;
		// array[1] = 2;
		// array[2] = 5;
		// array[3] = 8;
		// array[4] = 2;
		
		           
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {//array[0]~[4]�� ���ڰ� 0���� ũ�� 
				max = array[i]; // �� ���� max�̴�.
 			}					// ù��°�� max�� 1 �� �ǰ� �ι�°�� 2 3��°�� 5 4��°��8 5��° 2�� 8���� �۱⶧���� �״�� 8�� ���� 
		}
		System.out.println("max:" + max); //max �� 8
	}
}
