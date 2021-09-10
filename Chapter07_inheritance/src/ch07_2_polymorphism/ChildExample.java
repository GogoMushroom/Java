package ch07_2_polymorphism;

public class ChildExample {
	public static void main(String[] args) {
		Child c1 = new Child("쾌활하다"); //parent의 메소드까지 가져온다는 뜻 
		Child c2 = new Child("소심하다");
		
		
		Parent p = c1;//new 연산자를 사용안하고 child의 인스턴스 객체 c를 대입 
		p=c2;         //부모형으로 child를 참조할 수 있다. 
		
		p.method1();
		p.method2();
		//p.method3();
		System.out.println(c1);
	}
}
