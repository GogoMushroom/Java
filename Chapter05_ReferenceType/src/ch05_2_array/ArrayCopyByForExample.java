package ch05_2_array;



public class ArrayCopyByForExample {
	public static void main(String[] args) {
		int [] oldIntArray = {1,2,3}; //������
		int [] newIntArray = new int[5]; //ū�� ���� ������ �־���

		System.out.println(oldIntArray[0]);
		oldIntArray[0] = 55;
		System.out.println(oldIntArray[0]);

		//�ݵ�� �־�� �Ǵ� ��Ȳ 

		//�� ū �迭�� ���� ���� �迭 ���� 
		//oldIntArray[3]=4;  -> �ε��� ũ�⺸�� Ŀ�� ������
		//

		for (int i = 0 ; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
			System.out.print(newIntArray[i] +" ");
		}
		newIntArray[3]= 4;
		newIntArray[4]= 5;


		
		for(int i = 0 ; i<newIntArray.length; i++) {
			System.out.print(newIntArray[i] + " ");
		}
	}
}
