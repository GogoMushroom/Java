package Wrapper;

public class ValueCompareExample {
	public static void main(String[] args) {
		
		System.out.println("-128~127 �ʰ�");
	
		Integer o1 = 300; // ����ڽ�
		Integer o2 = 300; //����ڽ� 
		
		System.out.println("==��� "+(o1==o2));
		                              //��ڽ�
		System.out.println("��ڽ� �� == " +(o1.intValue()==o2.intValue()));
		System.out.println("equlals() " + o1.equals(o2));
		System.out.println();
		
		System.out.println("-128~127 ������");
		
		Integer o3= 10;
		Integer o4= 10;
		System.out.println("==��� "+(o3==o4));
		System.out.println("��ڽ� �� == " +(o3.intValue()==o4.intValue()));
		System.out.println("equlals() " + o3.equals(o4));
		
		
	}
}
