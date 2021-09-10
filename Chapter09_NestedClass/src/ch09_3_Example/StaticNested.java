package ch09_3_Example;


class OuterClass{  //중첩클래스 2개 가짐 
	private static int num = 0; 

	static class Nasted1{//클랴스 안에 멤버로 있을 떄만 static 붙여줌
	void add(int n) {num+=n;}
}
	static class Nasted2{
		int getNum() {return num;}
	}
}

public class StaticNested {
	public static void main(String[] args) {
		
		//밖 클래스 먼저 생성해줄 필요가 없음 왜냐면 static이라
		
		OuterClass.Nasted1 nst1 = new OuterClass.Nasted1();
		nst1.add(5);
		
		OuterClass.Nasted2 nst2 = new OuterClass.Nasted2();
		System.out.println(nst2.getNum());
		
		
		
		
	}
}
