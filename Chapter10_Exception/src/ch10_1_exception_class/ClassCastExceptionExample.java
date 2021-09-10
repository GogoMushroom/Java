package ch10_1_exception_class;

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}



public class ClassCastExceptionExample {
	public static void main(String[] args) {
		Dog d = new Dog();
		changeDog(d);
		
		Cat c = new Cat();
		changeDog(c);
	}
	
public static void changeDog(Animal a) {
	if (a instanceof Dog) {
		Dog d = (Dog)a;
		System.out.println("Dog타입변환");
	} else {
		System.out.println("Dog타입이 아닙니다.");
	}
	
	
	
}
		
	
}
