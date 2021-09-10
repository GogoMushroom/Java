package ch15_generics;

import java.util.ArrayList;

public class FruitBox2 {
	public static void main(String[] args) {
		
		//ArrayList안에 String 이 아닌 어떤 자료형 이라도 들어올 수 있음!!
		ArrayList<String> list = new ArrayList<>();
		
		
		//상자 2개 생성
		Box<Apple> ab = new Box<Apple>();
		Box<Orange> ob = new Box<Orange>();
		

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
