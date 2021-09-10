package pactice;
class Inner{
class InstanceInner{
	int iv = 100;
//	static int cv= 100;    //static 선언 불가능 
	final static int CONST = 100; //final static 상수는 허용 
}

static class StaticInner {
	int iv = 200;
	static int cv = 200;    //static 클래스는 static 선언 가능 
}
void myMethod() {
	class LocalInner{
		int iv = 300;
//		static int cv = 300;  //static 선언 불가능 
		final static int CONST = 300; //final static 상수는 허용 
	}
	int i = LocalInner.CONST; //지역 내부클래스의 상수는 메서드 내에서만 사용가능 
}

public static void main(String[] args) {
	System.out.println(InstanceInner.CONST);
	System.out.println(StaticInner.cv);
	
	
}
}