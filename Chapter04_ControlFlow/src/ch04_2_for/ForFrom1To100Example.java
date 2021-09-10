package ch04_2_for;

public class ForFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0;
		//for문의 초기화식에서 변수i 선언 
		for(int i = 1; i<=100 ; i++ ) {
			sum += i;
		}
		System.out.println("1~100의 합:" + sum );
	}
}
