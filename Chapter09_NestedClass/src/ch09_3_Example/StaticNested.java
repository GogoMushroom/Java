package ch09_3_Example;


class OuterClass{  //��øŬ���� 2�� ���� 
	private static int num = 0; 

	static class Nasted1{//Ŭ���� �ȿ� ����� ���� ���� static �ٿ���
	void add(int n) {num+=n;}
}
	static class Nasted2{
		int getNum() {return num;}
	}
}

public class StaticNested {
	public static void main(String[] args) {
		
		//�� Ŭ���� ���� �������� �ʿ䰡 ���� �ֳĸ� static�̶�
		
		OuterClass.Nasted1 nst1 = new OuterClass.Nasted1();
		nst1.add(5);
		
		OuterClass.Nasted2 nst2 = new OuterClass.Nasted2();
		System.out.println(nst2.getNum());
		
		
		
		
	}
}
