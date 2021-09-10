package ch06_4_method;

public class ComputerExample {
	public static void main(String[] args) {
	
		Computer myCom = new Computer();
		
		myCom.intList = new int[] {11,22,33}; 
		System.out.println(myCom.sum());//
		
		
		int[] values1  = {1,2,3};
		//                       주소값을 넣어줌
		int result1 = myCom.sum1(values1);//각 배열이 가지고있는 값의 총 합 을 리턴하시오 
		System.out.println("result1:" + result1);

		System.out.println("result1:" + myCom.sum1(values1));
		//이렇게 써도 됨 

		int result2 = myCom.sum1(new int [] {1,2,3,4,5}); //변수 선언하는 여러가지 방법을 역기서도 쓸 수 있움 
		System.out.println("myCom.sum1(new[]{}):" + result2);
		
		int result3 = myCom.sum2(1,2,3);
		System.out.println("myCom.sum2(int...values):" + result3);

		int result4 = myCom.sum2(1,2,3,4,5);
		System.out.println("result4:" + result4);
		
		int result5=myCom.sum2(new int[] {1,2,3,5,6,7,9,998} );
		System.out.println(result5);
				
	}
}
