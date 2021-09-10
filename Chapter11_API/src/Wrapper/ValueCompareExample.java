package Wrapper;

public class ValueCompareExample {
	public static void main(String[] args) {
		
		System.out.println("-128~127 초과");
	
		Integer o1 = 300; // 오토박싱
		Integer o2 = 300; //오토박싱 
		
		System.out.println("==결과 "+(o1==o2));
		                              //언박싱
		System.out.println("언박싱 후 == " +(o1.intValue()==o2.intValue()));
		System.out.println("equlals() " + o1.equals(o2));
		System.out.println();
		
		System.out.println("-128~127 범위값");
		
		Integer o3= 10;
		Integer o4= 10;
		System.out.println("==결과 "+(o3==o4));
		System.out.println("언박싱 후 == " +(o3.intValue()==o4.intValue()));
		System.out.println("equlals() " + o3.equals(o4));
		
		
	}
}
