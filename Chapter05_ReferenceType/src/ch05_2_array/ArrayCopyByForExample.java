package ch05_2_array;



public class ArrayCopyByForExample {
	public static void main(String[] args) {
		int [] oldIntArray = {1,2,3}; //작은거
		int [] newIntArray = new int[5]; //큰거 만들어서 작은걸 넣어줌

		System.out.println(oldIntArray[0]);
		oldIntArray[0] = 55;
		System.out.println(oldIntArray[0]);

		//반드시 넣어야 되는 상황 

		//더 큰 배열을 만들어서 이전 배열 복사 
		//oldIntArray[3]=4;  -> 인덱스 크기보다 커서 오류남
		//

		for (int i = 0 ; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
			System.out.print(newIntArray[i] +" ");
		}
		newIntArray[3]= 4;
		newIntArray[4]= 5;


		
		for(int i = 0 ; i<newIntArray.length; i++) {
			System.out.print(newIntArray[i] + " ");
		}
	}
}
