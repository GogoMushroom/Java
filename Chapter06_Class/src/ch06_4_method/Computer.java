package ch06_4_method;

public class Computer {
	
		int [] intList; //���������� ������ arraysum������
		int sum() {
			return arraySum(this.intList);
		}

		int sum1(int[] arrs) {
			return arraySum(arrs);
		}
		int sum2(int...values) {
			return arraySum(values);
		}
				
				
	
//	int sum1(int[] values) { //������ ����ɶ� ���̴� int���� �־��� values�� ���� �������ذ���
//				// int[] �� ����� ���� �������� 
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
