package training;

public class Test03 {
	public static void main(String[] args) {
/*
 * while() , do while();  
 * 1~100��� 
 * 100~1�ⷰ
 * 	
 */
		int num = 1; 
		 
		while (num <=99){
		System.out.println(num++);//99 ���� 1 �� ���ϱ⶧���� ������ ����Ʈ�� ���ڴ� 100
		}
		do {
			System.out.println(num--);
		} while(num > 1);
		
		
		
	}
}

