package training;

public class Test6 {
	public static void main(String[] args) {
		/*
		 * �μ��� '���� ���밪' �� ����Ͽ� ����ϴ� �޼ҵ带 �ۼ��ϰ� �����ڵ��ۼ�
		 * ���밪 = ����� �����°� , ū������ �������� ������
		 * �޼����̸� : abs
		 */
		

		abs(7,3);
		abs(-2,9);
		abs(13,3);
		
		
		
		
	}

	public static void abs(int i,int j) {
		if (i>j) {
			System.out.println(i-j);
		}else if(j>i){ 	
			System.out.println(j-i);
	}
}
}
