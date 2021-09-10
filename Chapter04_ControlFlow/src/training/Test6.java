package training;

public class Test6 {
	public static void main(String[] args) {
		/*
		 * 두수의 '차의 절대값' 을 계산하여 출력하는 메소드를 작성하고 실행코드작성
		 * 절대값 = 양수만 나오는거 , 큰수에서 작은수를 빼야함
		 * 메서드이름 : abs
		 */
		

		abs(7,3);
		abs(-2,9);
		abs(13,3);
		
		
		
		
	}

	public static void abs(int i,int j) {
		if (i>j) {
			System.out.println(i-j);
		}else if(j>i){ 	
			System.out.println(j-i);
	}
}
}
