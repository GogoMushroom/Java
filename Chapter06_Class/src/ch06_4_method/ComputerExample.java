package ch06_4_method;

public class ComputerExample {
	public static void main(String[] args) {
	
		Computer myCom = new Computer();
		
		myCom.intList = new int[] {11,22,33}; 
		System.out.println(myCom.sum());//
		
		
		int[] values1  = {1,2,3};
		//                       �ּҰ��� �־���
		int result1 = myCom.sum1(values1);//�� �迭�� �������ִ� ���� �� �� �� �����Ͻÿ� 
		System.out.println("result1:" + result1);

		System.out.println("result1:" + myCom.sum1(values1));
		//�̷��� �ᵵ �� 

		int result2 = myCom.sum1(new int [] {1,2,3,4,5}); //���� �����ϴ� �������� ����� ���⼭�� �� �� �ֿ� 
		System.out.println("myCom.sum1(new[]{}):" + result2);
		
		int result3 = myCom.sum2(1,2,3);
		System.out.println("myCom.sum2(int...values):" + result3);

		int result4 = myCom.sum2(1,2,3,4,5);
		System.out.println("result4:" + result4);
		
		int result5=myCom.sum2(new int[] {1,2,3,5,6,7,9,998} );
		System.out.println(result5);
				
	}
}
