package objact;

class Value{
	int value;
	
	@Override
	public boolean equals(Object obj) {
				
//		if (this.value == ((Value)obj).value) {
//			return true;
//		}else {
//			return false;
//		}
//		
		return (this.value == ((Value)obj).value) ? true: false;
	}
		
	
	public Value (int value) {
		this.value = value;
	}
}


public class ObjectOrg {
	public static void main(String[] args) {
		
		Value v1 = new Value(701021);
		Value v2 = new Value(701021);
		
		System.out.println(v1 instanceof Value); //true	
		System.out.println(v2 instanceof Value); //true
		
		System.out.println(v1); // 위 아래 같은뜻 
		System.out.println(v1.toString()); // 위 아래 같은뜻 
		System.out.println(v2); //v1과v2는 같은 값을 가지고있지만 다른 주소에 저장되있음 
		System.out.println(v2.toString()); // 위 아래 같은뜻 
		
		
		System.out.println(v1==v2); // 위 아래 같은뜻 
		
		System.out.println(System.identityHashCode(v1));
		System.out.println(System.identityHashCode(v2));
		
		System.out.println(v1.hashCode());
		System.out.println(v2.hashCode());
		
		System.out.println(v1.equals(v2));	
		
	}
}
