package ch15_generics;

public class FruitBox {
	public static void main(String[] args) {
		
		//������� ���� 
		AppleBox ab = new AppleBox();
		
		
		//������ ���� ����
		OrangeBox ob = new OrangeBox();
		
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
