package ch04_2_for;

public class ContinueExample {
	public static void main(String[] args) {
		for (int i=1 ; i<=10 ; i++) {
			if (i%2 !=0) {
				continue;	// Ȧ���� ������ ����Ʈ�� ���� ���ϰ� �ٽ� for������ ���ư� 
							// ���͸� 
			}
			System.out.println(i);
		}
	}
}