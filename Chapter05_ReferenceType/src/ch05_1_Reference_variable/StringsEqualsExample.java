

package ch05_1_Reference_variable;

public class StringsEqualsExample {
	public static void main(String[] args) {
		String str1 = "java";
//			(str)참조타입은 4바이트 안에 주소가담긴다.
//           java 라는 문자열은 힙 영역에 담기고 str은 그 주소를 담고있음 
		String str2 = "java";
//			str2의 java 는 str1 에 찹조되어있는 java와 같다
//			str1과 atr2는 같은 주소를 담고있다. 
		
		System.out.println(str1 == str2 );
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		// 각 객체의 고유값을 알기 위해서 쓰는 함수 = hashCode()
		
		String str3=new String ("java");
//		= new 를 사용해서 직점  String 객체를 생성시킬수도있다. 
//		new = 객체생성연산자
		String str4 = new String ("java");
//		new 연산자로 만들어진 객체는 새로운 연산자로 원래 존재하고있던 java와는 다르다 
//		new 연산자를 이용해 만든 객체 java는 서로 다른주소를 가지고있다.
		System.out.println(str3==str4);
//		서로 다른 주소 , 객체의 번지가 동일한지 
		System.out.println(str3.equals(str4));
//		같은 문자열 , 문자열이 동일한지	
		System.out.println(str2.equals(str4));
//		다른주소, 같은 문자열 
		System.out.println(str1==str4);
//		문자열은 똑같지만 주소는 다름 		
		
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
//		str1 과 str2 는 같은 주소를 가지고있고 12 과 3 그리고 4는 서로 다른 주소를 가지고있다
		
		
//		리터럴로 생성하하면 중복되는 객체가 생성되더라도 메모리가 중복해서 사용되지 않는다 .  		
		
		
	}
}





