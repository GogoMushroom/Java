package training;

public class ArrayMinMaxExample {
	public static void main(String[] args) {
		/*
		 * int 형 1차원 배열을 매개변수로 전달받아서 배열에 저장된
		 * 최대값, 최소값을 찾아서 반환하는 메서드를 각각 다음의형태로 구현하시오
		 * public static int minValue(int[]arr) : 최소값 반환
		 * public static int maxValue(int[]arr) : 최대값 반환
		 * 
		 */
		
// 어떤 1차원 배열 선언, 구현된 메서드 call해서 사용하는 	코드
		int [] arr = {1,3,65,6,54,-77,-98};
		System.out.println("최소값:" + minValue(arr));
		System.out.println("최대값:" + maxValue(arr));
		int min = arr[0];
		int max = arr[0];
	}
	public static int minValue(int[] ar) {
		int min = ar[0];
	
		for (int i=1; i<ar.length ; i++ ) {
		 if (ar[i] < min) {
			 min = ar[i];
			 
		 }
		}
		return min;
	}
	public static int maxValue(int[] ar) {
		int max = ar[0];
	
		for (int i=1; i<ar.length ; i++ ) {  
		 if (ar[i] > max ) {
  		 max = ar[i];
		
	}
}
		return max;
	}
}
