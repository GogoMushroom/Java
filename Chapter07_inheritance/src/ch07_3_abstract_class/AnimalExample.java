package ch07_3_abstract_class;

//추상클래스 (규격클래스)
abstract class Animal { 
	
	//필드
	public String kind;
	//생성자 
	//메소드
	public void breath () {
		System.out.println("숨을 숩니다.");
	}
	//추상메소드 (싱속받는 자식클래스에서 오버라이딩을 강제한다.)
	public abstract void sound();   // 추상메소드라 구현부가 없어도됨 상속에서 구현해주면됨
}

class Dog extends Animal { //Animal 추상클래스를 상속해옴 
	public Dog() { 
		this.kind = "포유류";
	}
	@Override
		public void breath() {
			System.out.println("강아지가 숨을 쉽니다.");
		}
	@Override
	public void sound() {   //부모클래스에서 추상메소드는 구현이 안되있었으니까.
	System.out.println("멍멍");  //자식클래스에서는 반드시 구현 해줘야한다.
		
	}
}

class Cat extends Animal { //Animal 추상클래스를 상속해옴 
	public Cat() { 
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {   //부모클래스에서 추상메소드는 구현이 안되있었으니까.
	System.out.println("야옹");  //자식클래스에서는 반드시 구현 해줘야한다.
	}
}


public class AnimalExample {
	public static void main(String[] args) {
		Dog d = new Dog();  //kind = 포유류
		Cat c = new Cat();
		d.sound();
		c.sound();
		d.breath();
		c.breath();
		System.out.println("----------");
		
		
		//변수의 자동 타입변환
		Animal animal = null;
		animal = new Dog();
		animal.sound();     //자동타입변환 및 재정의된 메소드 호출 
		animal = new Cat();
		animal.sound();		//자동타입변환 및 재정의된 메소드 호출 
		System.out.println("----------");
		
		//메소드의 다향성 
		animalSound(new Dog());//자동타입변환
		animalSound(new Cat());//자동타입변환
	}
	public static void animalSound(Animal animal) {//animal 다향성 ...?//부모타입 animal= 상속받은 자식
		animal.sound(); //각 자식클래스에서 상속받은 추상메소드를 오버라이딩한걸 호출함 
	}
}
