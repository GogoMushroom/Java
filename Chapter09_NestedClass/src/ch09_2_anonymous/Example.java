package ch09_2_anonymous;


class Animal{
	void sound () { System.out.println("~");}
}
//
////class Dog extends Animal{
////	@Override
////	void sound() {
////		System.out.println("�۸�~");}
////	void run() {
////		System.out.println("�Ĵٴ�~");}
////}
//
//class Cat extends Animal{
//	@Override
//	void sound() {
//	System.out.println("�߿�");}
//	void jump() {
//		for(int i=0; i<2; i++  )
//			if (Math.random()*10 >5);{
//				System.out.println("�����Ѵ´�");}
//			}
//}
//
//class Fish extends Animal{
//	@Override
//	void sound() {
//	System.out.println("����");}
//	void swim () { System.out.println("���ģ��.");}
//}

public class Example {
	public static void main(String[] args) {
		Animal a = new Animal() {
			//Dog Ŭ������ ������ �ʰ� ���⿡ �ٷ� �̸����� ����
			//���⼭ ���̷�Ʈ�� �����ؼ� �� �� ���� 
			void run() { System.out.println("�Ĵٴ�~");}	
			@Override
			void sound() { System.out.println("�۸�~");
			run();
			}

		};
		a.sound(); //���⼭�����
		//�� a.run(); �� �ȵ�?
		
		
		
		//���⼭�� ���� �����°���
		a = new Animal() { //���⿡ ����� Ŭ������ �̸� ���� �ۼ�
			void swim() {System.out.println("������ Ĩ�ϴ�");}
			@Override
			void sound() {System.out.println("oO0");
			swim();
			}
		};
		a.sound();

	}
}

