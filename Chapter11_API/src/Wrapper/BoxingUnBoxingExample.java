package Wrapper;

public class BoxingUnBoxingExample {
	public static void main(String[] args) {
		//�ڽ� 
		
		Integer o1 = new Integer(100);
		Integer o2 = new Integer("200");
		Integer o3 = Integer.valueOf("300");
		
		//��ڽ� 
		
		int value1 = o1.intValue();
		int value2 = o2.intValue();
		int value3 = o3.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
	}
}
