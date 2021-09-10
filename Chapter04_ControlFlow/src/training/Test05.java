package training;

public class Test05 {
	public static void main(String[] args) {
		/*
		 * 자연수 1부터 시작 모든 홀수를 더했을때 그 값이 언제
		 * 1000을 넘어서는지? 1000을 넘어선 값은 얼마?	
		 */

		int i =1;
		int sum = 0;

		while (true) { //while에 조건식이아니라 true를 넣음
		//홀수조건 
		if (i % 2 != 0) {//==은 같다 !=는 다르다
			sum += i;
		//합이1000이 넘는 조건 
		if(sum > 1000) {
			System.out.println("1부터 "+i+"을 더할 때 총 합이 1000 을 넘습니다.  총합" +sum);
			break; //반복문을 빠져나감(if 문 빠져나가는거아님)
		}
		}
		i++;
		}
	}
}
		
