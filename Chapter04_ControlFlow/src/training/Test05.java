package training;

public class Test05 {
	public static void main(String[] args) {
		/*
		 * �ڿ��� 1���� ���� ��� Ȧ���� �������� �� ���� ����
		 * 1000�� �Ѿ����? 1000�� �Ѿ ���� ��?	
		 */

		int i =1;
		int sum = 0;

		while (true) { //while�� ���ǽ��̾ƴ϶� true�� ����
		//Ȧ������ 
		if (i % 2 != 0) {//==�� ���� !=�� �ٸ���
			sum += i;
		//����1000�� �Ѵ� ���� 
		if(sum > 1000) {
			System.out.println("1���� "+i+"�� ���� �� �� ���� 1000 �� �ѽ��ϴ�.  ����" +sum);
			break; //�ݺ����� ��������(if �� ���������°žƴ�)
		}
		}
		i++;
		}
	}
}
		
