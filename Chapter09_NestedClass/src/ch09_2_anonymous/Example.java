package ch09_2_anonymous;


class Animal{
	void sound () { System.out.println("~");}
}
//
////class Dog extends Animal{
////	@Override
////	void sound() {
////		System.out.println("멍멍~");}
////	void run() {
////		System.out.println("후다닥~");}
////}
//
//class Cat extends Animal{
//	@Override
//	void sound() {
//	System.out.println("야옹");}
//	void jump() {
//		for(int i=0; i<2; i++  )
//			if (Math.random()*10 >5);{
//				System.out.println("담을넘는다");}
//			}
//}
//
//class Fish extends Animal{
//	@Override
//	void sound() {
//	System.out.println("뻐끔");}
//	void swim () { System.out.println("헤엄친다.");}
//}

public class Example {
	public static void main(String[] args) {
		Animal a = new Animal() {
			//Dog 클래스를 만들지 않고 여기에 바로 이름없이 써줌
			//여기서 다이렉트로 정의해서 쓸 수 있음 
			void run() { System.out.println("후다닥~");}	
			@Override
			void sound() { System.out.println("멍멍~");
			run();
			}

		};
		a.sound(); //여기서실행됨
		//왜 a.run(); 은 안됨?
		
		
		
		//여기서만 쓰고 버리는거임
		a = new Animal() { //여기에 물고기 클래스를 이름 없이 작성
			void swim() {System.out.println("헤험을 칩니다");}
			@Override
			void sound() {System.out.println("oO0");
			swim();
			}
		};
		a.sound();

	}
}

