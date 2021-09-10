package ch02_3_type_casting;

public class OperationsPromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//byte byteValue3 = byteValue1 + byteValue2;
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		//char charValue3 = charValue1 + charValue2;
		int intValue2 =charValue1 + charValue2;
		System.out.println("유니코드=" + intValue2);
		System.out.println("출력문자=" + (char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
 			
		int intValue5 = 10;
		//int intvalue6 = 10 /4.0 :
		double doubleValue = intValue5 /4.0;
		System.out.println(doubleValue);
		
		int x = 1;
		int y = 2;
		double result = (double) x / y;
		System.out.println(result);
		
		
		
//		//2.5 가 나와야되는데 2가 나옴 (정수값만 나옴)
//		int result = 10 / 4;
//		double result = 10 /4;
//		//연산값(2)이 더블로 형변환되는거기때문에 답이 2.0 이 나옴 
//		double result = (double)10 /4;
//		//int 10 또는 4 혹은 둘다 를 double 로 바꿔주면 더블 연산값인 2.5로 계산이됨
//		
//		/*성적입력관리시스템 
//		 * 총점 sum
//		 * 평균 avg = sum / 학생수;
//		 * 
//		 * 더블 선언해줘서 소수점 안 잘리게 하기 
//		 */
		
//		System.out.println(result);
		
	}

}
