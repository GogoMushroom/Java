package ch05_1_Reference_variable;

public class JavaType {
	public static void main(String[] args) {
		
		
		
		int i = 33;
		System.out.println(i); //33
		
		
		
		String[] strs = {"korea","fighting"};
		System.out.println(strs);//[Ljava.lang.String;@15db9742
		//@15db9742=주소 인덱스를 지정해주지 않아서 주소값이 찍힘 
		
		System.out.println(strs[0]);
		System.out.println(strs[1]);
		//인덱스를 지정해줘서 그에 맞는 값이 나옴 
		
		
		
		
		
	}
}
