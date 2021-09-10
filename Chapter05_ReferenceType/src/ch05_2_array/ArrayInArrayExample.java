package ch05_2_array;

public class ArrayInArrayExample {
	public static void main(String[] args) {

		int[][] mathScores = new int [2][3]; //2�� 3�� //2���� �迭�� ���� 
		for (int i=0; i<mathScores.length; i++) { //i�ȿ��� 0 �̳� 1 (��,������ ����) �� �� 
			for (int k=0; k<mathScores[i].length; k++) { // k �ȿ��� 0,1,2 (��, ������ ����)�� ��
				// i �� k�� ���� ���� �����Ѱ� ���� i ���� k�� �� �Ŷ�� ��
				// .length  = ���� ����
				System.out.printf("mathScores[%d][%d]=%d\n", i,k,mathScores[i][k]);
				// int�� �̿��� �ʱⰪ0 �� ������� ����⸸ �ϰ� ���� �ʱ�ȭ�� �������ϱ�.
			}
		}
		System.out.println();

		int[][] englishScores = new int [2][]; // ��ܽ�  ���� ���̰� ������ �������϶� //2���� �迭�� ���� 
 		englishScores[0] = new int[2]; //[][]
		englishScores[1] = new int[3]; //[][][]
		for(int i=0 ; i<englishScores.length; i++) {
			for(int k=0 ; k<englishScores[i].length; k++) {
				System.out.println("englishScores["+i+"]["+k+"]=" + englishScores[i][k]);
			}
		}
	System.out.println();

	int[][] javaScores = {
			{95,80},
			{90,96,80}
			};//2���� �迭�� ������ �Բ� �ʱ�ȭ 
	for(int i=0 ; i<javaScores.length; i++) {
		for(int k=0 ; k<javaScores[i].length; k++) {
			System.out.println("javaScores["+i+"]["+k+"]=" + javaScores[i][k]);
		}
	}
}
}
