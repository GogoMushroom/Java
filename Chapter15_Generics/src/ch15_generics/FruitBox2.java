package ch15_generics;

import java.util.ArrayList;

public class FruitBox2 {
	public static void main(String[] args) {
		
		//ArrayList�ȿ� String �� �ƴ� � �ڷ��� �̶� ���� �� ����!!
		ArrayList<String> list = new ArrayList<>();
		
		
		//���� 2�� ����
		Box<Apple> ab = new Box<Apple>();
		Box<Orange> ob = new Box<Orange>();
		

		// ���ڿ� ���� ��� 
		ab.set(new Apple());
		ob.set(new Orange());

		
				
		//���ڿ��� ���� ��� 
		Apple ap = ab.get();
		Orange or = ob.get();
		
		System.out.println(ap);
		System.out.println(ap.toString());
		System.out.println(or);
		
		
	}
}
