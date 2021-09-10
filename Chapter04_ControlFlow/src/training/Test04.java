package training;

public class Test04 {
	public static void main(String[] args) {
		/*
		 * 1000이하 자연수중에서 2의배수이자 7의 배수인 수를 출력,
		 * 그 수들의 총 합을 출력 
		 * while 문 이용
		 */


		int i = 1;
		int sum = 0;

		while(i<=1000){
			if((i % 2) == 0 && (i % 7) == 0) {
				System.out.println(i);
				sum += i;		
			}	
			i++;
		}
		System.out.println(sum);
		if (i)
	}
}
