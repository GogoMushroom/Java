package ch06_4_method;

public class Computer {
	
		int [] intList; //참조변수를 가지고 arraysum을돌림
		int sum() {
			return arraySum(this.intList);
		}

		int sum1(int[] arrs) {
			return arraySum(arrs);
		}
		int sum2(int...values) {
			return arraySum(values);
		}
				
				
	
//	int sum1(int[] values) { //변수가 선언될때 쓰이는 int형을 넣어줌 values는 내가 지정해준거임
//				// int[] 에 저장된 값을 가져오기 
//		int sum = 0;
//		for (int i=0; i<values.length; i++) {
//			sum += values[i];
//		}
//		return sum;
//	}
//	
//	int sum2(int ... values) {
//		int sum = 0;
//		for (int i=0; i<values.length; i++) {
//			sum += values[i];
//		}
//		return sum;
//	}
	
	int arraySum(int[] ars) {
		int sum = 0;
		for (int i=0; i<ars.length; i++) {
			sum += ars[i];
		}
		return sum;
	}
	
}
