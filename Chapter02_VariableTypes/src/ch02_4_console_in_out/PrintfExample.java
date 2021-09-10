package ch02_4_console_in_out;

public class PrintfExample {

	public static void main(String[] args) {
		
		//System.out.printf("나타내고자 하는 문자를 그대로 적어주면됨");

		System.out.printf("이름:%s\n","허자바\n");
		
		//%d 데시멀 %x 헥사
		System.out.printf("나이:%d\n", 27 );
		System.out.printf("나이:%x\n", 27 );
		System.out.println("나이:" + 27);
		//println 보다 더 간단함
		System.out.printf("신장:%e\n", 158.7 );
		//%e 지수표현법 
	
		// %x , %s , %d ,% f  
		
		
		
		System.out.printf("이름은 %s 나이는 %d살 입니다.\n", "허자바" ,27 );
		
		int value = 123;
		System.out.printf("상품의 가격: %d원\n", value);
		System.out.printf("상품의 가격: %6d원\n", value);
		System.out.printf("상품의 가격: %-6d원\n", value);
		System.out.printf("상품의 가격: %06d원\n", value);
		// 왼쪽 오른쪽 정렬 ,앞자리 채우기
				
		
		double area = 3.141592 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이: %010.2f\n", 10 , area);
		//                             10=전체 10자리 , .2 소수둘째자리 표시 
		System.out.printf("반지름이 %d인 원의 넓이: %f\n", 10 , area);
		
		
		
		
		
		
		
	}
}
