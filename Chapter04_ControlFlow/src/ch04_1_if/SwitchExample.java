package ch04_1_if;

public class SwitchExample {
	public static void main(String[] args) {

//		int score = 85;
//		char grade; //���� 0 ���� 59 �� ������ �����ϱ� �ʱ�ȭ ���༭ �⺻ ���� ��������� 
		//	char grade = (score > 90) ? 'A' : ((score >  80) ? 'B' : 'C');


		//		if (score >90) {
		//			grade = 'A';
		//		} else if (score >= 80 && score <90) {
		//			grade = 'B';
		//		} else if (score >= 70 && score <80) {
		//			grade = 'C';
		//		} else if (score >= 60 && score <70) {
		//			grade = 'D';		
		//		} else {
		//			grade = 'F';
		//		}
		//		// �ʱ�ȭ������������ else�� �Է����ش�.
		//		System.out.println(grade);


		//switch������ �ٲ㺸��

//		switch(score) {
//		case 100 : 
//		case 99 : 
//		case 98 : 
//		case 97 :
//		case 96 :
//		case 95 :
//		case 94 :	
//			grade='A';
//			break;
//		case 89 :
//		case 88 :
//		case 87 :
//			grade='B';
//			break;
//		}
		
		
		
		int month = 3;
		switch(month) {
		case 12:
		case 1:
		case 2:
			System.out.println("�ܿ��Դϴ�.");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("���Դϴ�.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("�����Դϴ�.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("�����Դϴ�.");
			break;
		}	
				
		}
		
		
	}

