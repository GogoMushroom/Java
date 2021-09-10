package ch05_2_array;

public class ArrayInArrayExample {
	public static void main(String[] args) {

		int[][] mathScores = new int [2][3]; //2행 3열 //2차원 배열의 생성 
		for (int i=0; i<mathScores.length; i++) { //i안에는 0 이나 1 (행,가로의 갯수) 이 옴 
			for (int k=0; k<mathScores[i].length; k++) { // k 안에는 0,1,2 (열, 세로의 갯수)이 옴
				// i 랑 k는 내가 지금 선언한거 행을 i 열을 k로 할 거라는 뜻
				// .length  = 행의 길이
				System.out.printf("mathScores[%d][%d]=%d\n", i,k,mathScores[i][k]);
				// int형 이여서 초기값0 이 들어있음 만들기만 하고 아직 초기화를 안했으니까.
			}
		}
		System.out.println();

		int[][] englishScores = new int [2][]; // 계단식  행의 길이가 열마다 가변적일때 //2차원 배열의 생성 
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
			};//2차원 배열의 생성과 함께 초기화 
	for(int i=0 ; i<javaScores.length; i++) {
		for(int k=0 ; k<javaScores[i].length; k++) {
			System.out.println("javaScores["+i+"]["+k+"]=" + javaScores[i][k]);
		}
	}
}
}
