package pactice;

class AAA{
	int i = 100;
	BBB b = new BBB();

class BBB{ // BBB�� AAA�ȿ����� ����
	void method () {
//		AAA a = new AAA();
//		System.out.println(a.i);
		System.out.println(i);//��ü�������� �ܺ� Ŭ������ �ɹ� ���� ���� 
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
