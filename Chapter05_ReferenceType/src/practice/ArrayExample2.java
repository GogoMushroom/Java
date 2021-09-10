package practice;

public class ArrayExample2 {
	public static void main(String[] args) {
		//index 범위 : 0~9 
		int [] arr = new int[10]; //길이가 5인 int배열 arr을 생성
		System.out.println("arr.length="+arr.length);

		for(int i=0 ; i<arr.length; i++) {
		// 범위를 잡아줄때 arr.length 를 사용하면 범위 오류가 줄어듬 
			System.out.println("arr[" +i+ "]=" + arr[i]);
		}
	}
}
