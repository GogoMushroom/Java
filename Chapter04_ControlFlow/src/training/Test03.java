package training;

public class Test03 {
	public static void main(String[] args) {
/*
 * while() , do while();  
 * 1~100출력 
 * 100~1출럭
 * 	
 */
		int num = 1; 
		 
		while (num <=99){
		System.out.println(num++);//99 에서 1 을 더하기때문에 마지막 프린트된 숫자는 100
		}
		do {
			System.out.println(num--);
		} while(num > 1);
		
		
		
	}
}

