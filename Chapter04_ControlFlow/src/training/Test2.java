package training;

public class Test2 {
	public static void main(String[] args) {
		//		
		//		int n = 24;
		//		if (n >= 0 && n< 10) {
		//			System.out.println("0 �̻� 10 �̸��� ��");
		//		}
		//		else if (n >= 10 && n< 20) {
		//			System.out.println("10 �̻� 20 �̸��� ��");
		//		}
		//		else if (n >= 20 && n< 30) {
		//			System.out.println("20 �̻� 30 �̸��� ��");
		//		}
		//		else {
		//			System.out.println("���� Ȥ�� 30 �̻��� ��");
		//		}
		//	}
		//}

		int n = (int)(Math.random()*100);//������ 1 ������ �Ҽ������� *100 = 1~100�� ����
		System.out.println(n);		

		int num = n/10;
		System.out.println(num); //100�� 10���� ������ ���� 0~10



		switch(num) {
		case 0: 
			System.out.println("0 �̻� 10 �̸��� ��");
			break;
		case 1: 
			System.out.println("10 �̻� 20 �̸��� ��");
			break;
		case 2: 
			System.out.println("20 �̻� 30 �̸��� ��");
			break;
		default:
			System.out.println("���� Ȥ�� 30 �̻��� ��");
			
		//����ġ���� ���������� �������ϱ⶧���� ���������� �������� ã��-> ���� �ڸ� ���ڰ� ���� 
		// ���� 1~100�� ���� ���ڸ� 10���� ������ �� ������ ���� ���� 
		/*ex) 5 = 0.5 ,  10 = 1  , 49 = 4
		 * 1 = 10~19 , 2 = 20~29 , 3 = 30~39  
		 * 	���������� �ϳ��� ���̽��� ���� ����ġ ���� ����ϸ� �ȴ� ^-^
		 */
			
			
			
		}
	}
}



