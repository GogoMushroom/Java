package ch05_2_array;

public class ArrayCreateByValueListExample2 {
	public static void main(String[] args) {

		int [] scores;
		scores = new int [] {83,90,87};
		int sum1 = 0;
		for (int i=0; i<3; i++) {
			sum1 += scores[i];
		}

		System.out.println("총합: " + sum1);

//		int [] arr = new int[] {83,90,87};
//		int sum2 = add ( arr );
		
		

		int sum2 = add ( new int[] {83,90,87} );//add메소드는 int값을 리턴해줘야함 add메소드 만들어서 콜하기
		//       = add ( int 83,90,87의 주소 )
		//배열도 참조타입의 변수 
		//
		System.out.println("총합: "+ sum2);
		System.out.println();}
		

//	}
//	add(3,7);
//	public static int add(int a, int b) {
//	// int a 에는 3을 할당하고 int b 에는 7을 할당한다. 
//	}
//	
	
	
	public static int add(int[] scores) { //score 참조변수 , 참조변수에는 주소값이 저장됨 , 주소값을 리턴해줌
//							[] scores = 배열의 참조변수 , new int[] {83,90,87} 의 시작주소임!!							
		int sum = 0;
//		for(int i =0 ; i<30; i++) {
		for(int i =0 ; i<scores.length; i++) {
			sum +=scores[i];
		}
		return sum;
	}
// add 메소드 = 0부터 i의 길이 보다 작은숫자의 순서의 값을 scores 에 더해준다.
	
}
