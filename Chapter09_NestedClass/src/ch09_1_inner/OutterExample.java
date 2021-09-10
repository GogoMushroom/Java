package ch09_1_inner;

class Outter {
	String field = "Outter-field";
	void method() {
		System.out.println("Outter-method");
	}
	
	
	class Nested{
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
	
	void print() {
		
		System.out.println(this.field);  // 중첩 객체 참조 
		this.method();//this 는 자신을 가리키는 참조지시자 이므로 nested의 field 가리킴 
		
		System.out.println(Outter.this.field);  //바깥 객체 참조 
		Outter.this.method();//this는 자신을 가리키는 참조지시자 이므로 outter에 있는 field를 가리킴 
	}
}
}

public class OutterExample{
	public static void main(String[] args) {
		Outter o = new Outter();
		Outter.Nested n = o.new Nested();
		n.print();
		
	}
}