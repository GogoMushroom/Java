package ch15_generics;
/*
 * 오렌지를 담는 상자
 */
public class OrangeBox {
	private Orange or;

	//오렌지를 담는다.
	public void set(Orange a) {
		or= a; 
	}
	
	//오렌지를 꺼낸다
	public Orange get() {
		return or;
	}
}
