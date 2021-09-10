package pactice;

class AAA{
	int i = 100;
	BBB b = new BBB();

class BBB{ // BBB는 AAA안에서만 쓴다
	void method () {
//		AAA a = new AAA();
//		System.out.println(a.i);
		System.out.println(i);//객체생성없이 외부 클래스의 맴버 접근 가능 
	}
}
}	

//class CCC{
//	BBB b = new BBB();
//}


public class InnerTest {
	public static void main(String[] args) {
	AAA a = new AAA();
	a.b.method();
	
	
	//	BBB b = new BBB();
//	b.method();
}
}
