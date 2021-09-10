package pactice;

public class Ex7_13 {
	class InstanceInner{}
	static class StaticInner{}
	
	InstanceInner iv = new InstanceInner(); //인스턴스 멤버끼리 접근가능
	StaticInner cv = new StaticInner(); //static 멤버끼리 접근가능 
	//StaticInner cvi = new InstanceInner(); //static은 인스턴스에 접근 불가 
	
	static void staticMethod() {
		//InstanceInner obj1 = new InstanceInner(); //static 멤버는 인스턴스 멤버에 접근 불가
		StaticInner obj2 = new StaticInner(); //스테틱 멤버 스테틱멤버 가능 
		
		Ex7_13 outer = new Ex7_13(); //인스턴스클래스는 외부 클래스를 먼서 생성해야 사용가능 
		InstanceInner obj1 = outer.new InstanceInner();//요렇게 사용
	}
	void instaneMathod() {//인스턴스메서드 에서는 인스턴스 스테틱 둘다 가능 
	InstanceInner obj1 = new InstanceInner();
	StaticInner obj2 = new StaticInner();
	//LocalInner lv = new LocalInner();//지녁 내부 클래스는 외부에서 접근 불가 
	
	}
	void myMethod () { //지역 내부 클래스 
		class LocalInner{} 
		LocalInner lv = new LocalInner();	
	}	
}
