package ch15_generics;

public class FruitBox {
	public static void main(String[] args) {
		
		//사과상자 생성 
		AppleBox ab = new AppleBox();
		
		
		//오렌지 상자 생성
		OrangeBox ob = new OrangeBox();
		
		// 상자에 과일 담기 
		ab.set(new Apple());
		ob.set(new Orange());
		
		
		//상자에서 과일 까내기 
		Apple ap = ab.get();
		Orange or = ob.get();
		
		System.out.println(ap);
		System.out.println(ap.toString());
		System.out.println(or);
		
		
	}
}
