package ch04_2_for;

public class ForMultiplicationTabExample {
	public static void main(String[] args) {
		//		for (int m=2; m<=9; m++) {  //�ٱ��� for��
		//			System.out.println("***" + m + "�� ***");
		//			for (int n=1; n<=9; n++) {  //��ø for�� 
		//				System.out.println(m + "x" + n + "=" + (m+n));
		//			}
		//		}
		//	}
		//}

		for (int i=1; i<10 ; i++) { //�� ���
			for (int j=1; j<10 ; j++) { //9�� *j++
				System.out.printf("%d x %d = %d\n", i,j,i*j);
//				System.out.printf("%d x %d = %d\t", i,j,i*j);	// \t �ٹٲ������ʰ� ���� 	
			} 
			System.out.println();   // ���� ���
//			System.out.printf("****%d��****\n" , i);   // ���� ���
		}		
	}		
}