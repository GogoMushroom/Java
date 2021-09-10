package pactice;

public class Ex7_17 {
	
//					조상이름 		클래스내용{}
	Object iv = new Object () {void method() {} }; //익명 클래스  
	//Ex7_17$1.class 내부클래스 이기때문에 외부 클래스 이름이 따라온다
	static Object cv = new Object() { void method() {} }; //익명 클래스 
	
	void MyMethod() {
		Object lv = new Object() {void method(){}};
	}
}
