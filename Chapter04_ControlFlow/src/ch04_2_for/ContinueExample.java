package ch04_2_for;

public class ContinueExample {
	public static void main(String[] args) {
		for (int i=1 ; i<=10 ; i++) {
			if (i%2 !=0) {
				continue;	// 홀수가 나오면 프린트로 가지 못하고 다시 for문으로 돌아감 
							// 필터링 
			}
			System.out.println(i);
		}
	}
}