package practice;

public class MyMathExample {
	public static void main(String[] args) {
		System.out.println(MyMath2.add(200L, 100L));
		//클래스 메서드 호출 클래스이름.메서드이름(지역변수 ...) 객체생성없이 호춣 가능
		MyMath2 mm = new MyMath2(); // 인스턴스 생성 
		mm.a = 200L;
		mm.b = 100L	;	
		//                 잠조변수 		
		System.out.println(mm.add()); // 인스턴스 메서드 호출
		// 잠조변수.메소드이름 (); 
		
	}
}
