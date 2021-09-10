package training;

public class Test2 {
	public static void main(String[] args) {
		//		
		//		int n = 24;
		//		if (n >= 0 && n< 10) {
		//			System.out.println("0 이상 10 미만의 수");
		//		}
		//		else if (n >= 10 && n< 20) {
		//			System.out.println("10 이상 20 미만의 수");
		//		}
		//		else if (n >= 20 && n< 30) {
		//			System.out.println("20 이상 30 미만의 수");
		//		}
		//		else {
		//			System.out.println("음수 혹은 30 이상의 수");
		//		}
		//	}
		//}

		int n = (int)(Math.random()*100);//렌덤은 1 이하의 소수점숫자 *100 = 1~100의 범위
		System.out.println(n);		

		int num = n/10;
		System.out.println(num); //100을 10으로 나눠줌 범위 0~10



		switch(num) {
		case 0: 
			System.out.println("0 이상 10 미만의 수");
			break;
		case 1: 
			System.out.println("10 이상 20 미만의 수");
			break;
		case 2: 
			System.out.println("20 이상 30 미만의 수");
			break;
		default:
			System.out.println("음수 혹은 30 이상의 수");
			
		//스위치문은 범위조건을 잡지못하기때문에 범위조건의 공통점을 찾음-> 십의 자리 숫자가 같음 
		// 범위 1~100의 렌덤 숫자를 10으로 나눠준 후 정수의 값을 구함 
		/*ex) 5 = 0.5 ,  10 = 1  , 49 = 4
		 * 1 = 10~19 , 2 = 20~29 , 3 = 30~39  
		 * 	범위조건을 하나의 케이스로 만들어서 스위치 문을 사용하면 된당 ^-^
		 */
			
			
			
		}
	}
}



