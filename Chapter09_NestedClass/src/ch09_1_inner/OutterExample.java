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
		
		System.out.println(this.field);  // ��ø ��ü ���� 
		this.method();//this �� �ڽ��� ����Ű�� ���������� �̹Ƿ� nested�� field ����Ŵ 
		
		System.out.println(Outter.this.field);  //�ٱ� ��ü ���� 
		Outter.this.method();//this�� �ڽ��� ����Ű�� ���������� �̹Ƿ� outter�� �ִ� field�� ����Ŵ 
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