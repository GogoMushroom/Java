package test;

public class ch05Test02_04 {
	public static void main(String[] args) {
		//for문을 사용해서 주어진 배열의 항목에서 최대값을 구해보시오 
		int max = 0;
		int[] array = {1,2,5,8,2}; //선언과 동시에 초기화 
		// array[0] = 1;
		// array[1] = 2;
		// array[2] = 5;
		// array[3] = 8;
		// array[4] = 2;
		
		           
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {//array[0]~[4]의 숫자가 0보다 크면 
				max = array[i]; // 그 수는 max이다.
 			}					// 첫번째는 max는 1 이 되고 두번째는 2 3번째는 5 4번째는8 5번째 2는 8보다 작기때문에 그대로 8이 유지 
		}
		System.out.println("max:" + max); //max 는 8
	}
}
