package ch04_2_for;

public class ForPrintFromTo10Example {
	public static void main(String[] args) {
//초기화식이 필요없을때에는 생략가능 ( ;i<=10; i++ ) {
		for (int i=1; i<=10; i++) { //i는 1일때 10이 되기전까지 1씩 더한 값을 출력해라 
			System.out.println(i);
		}
	}
}
