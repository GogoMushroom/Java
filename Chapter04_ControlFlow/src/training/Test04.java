package training;

public class Test04 {
	public static void main(String[] args) {
		/*
		 * 1000���� �ڿ����߿��� 2�ǹ������ 7�� ����� ���� ���,
		 * �� ������ �� ���� ��� 
		 * while �� �̿�
		 */


		int i = 1;
		int sum = 0;

		while(i<=1000){
			if((i % 2) == 0 && (i % 7) == 0) {
				System.out.println(i);
				sum += i;		
			}	
			i++;
		}
		System.out.println(sum);
		if (i)
	}
}
