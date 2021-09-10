package sec01.exam07.pack2;
import sec01.exam07.pack1.*;

public class D extends A {


	public D() {
		super();
		this.field = "value";     // 접근 가능 protected는 패키지가 다를경우 상속시 접근이 가능함
		this.method();
	}
}