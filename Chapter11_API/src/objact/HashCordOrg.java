package objact;

public class HashCordOrg {

	public static void main(String[] args) {
		
		String str1 = new String("abc");
		String str2 = new String("abc"); // new 하면 계속 새거가생성됨
		
		
		String str3 = "Hello";
		String str4 = "Hello";  // 리터럴로 선언하면 같은 값을 가진 변수에 같은 위치에 저장되있는걸 넣음
		
		
		System.out.println(str1 == str2); // 서로 주소값이 다름 !!
		System.out.println(str1.equals(str2)); // 써있는 값이 같음 
		System.out.println("abc"=="abc"); //문자열 상수가 같음  
		
		
		/*
		 * String class 는 문자열의 내용이 같으면 , 동일한 해시코드를 반환하도록 오버라이딩 되어있다.
		 */
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		/*
		 * Object 클래스의 hashcode() 와 동일, 객체의 주소값으로 해시코드를 생성
		 */
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		
		
	}
	
	
}
