package ch07_3_abstract_class;

//�߻�Ŭ���� (�԰�Ŭ����)
abstract class Animal { 
	
	//�ʵ�
	public String kind;
	//������ 
	//�޼ҵ�
	public void breath () {
		System.out.println("���� ���ϴ�.");
	}
	//�߻�޼ҵ� (�̼ӹ޴� �ڽ�Ŭ�������� �������̵��� �����Ѵ�.)
	public abstract void sound();   // �߻�޼ҵ�� �����ΰ� ����� ��ӿ��� �������ָ��
}

class Dog extends Animal { //Animal �߻�Ŭ������ ����ؿ� 
	public Dog() { 
		this.kind = "������";
	}
	@Override
		public void breath() {
			System.out.println("�������� ���� ���ϴ�.");
		}
	@Override
	public void sound() {   //�θ�Ŭ�������� �߻�޼ҵ�� ������ �ȵ��־����ϱ�.
	System.out.println("�۸�");  //�ڽ�Ŭ���������� �ݵ�� ���� ������Ѵ�.
		
	}
}

class Cat extends Animal { //Animal �߻�Ŭ������ ����ؿ� 
	public Cat() { 
		this.kind = "������";
	}
	
	@Override
	public void sound() {   //�θ�Ŭ�������� �߻�޼ҵ�� ������ �ȵ��־����ϱ�.
	System.out.println("�߿�");  //�ڽ�Ŭ���������� �ݵ�� ���� ������Ѵ�.
	}
}


public class AnimalExample {
	public static void main(String[] args) {
		Dog d = new Dog();  //kind = ������
		Cat c = new Cat();
		d.sound();
		c.sound();
		d.breath();
		c.breath();
		System.out.println("----------");
		
		
		//������ �ڵ� Ÿ�Ժ�ȯ
		Animal animal = null;
		animal = new Dog();
		animal.sound();     //�ڵ�Ÿ�Ժ�ȯ �� �����ǵ� �޼ҵ� ȣ�� 
		animal = new Cat();
		animal.sound();		//�ڵ�Ÿ�Ժ�ȯ �� �����ǵ� �޼ҵ� ȣ�� 
		System.out.println("----------");
		
		//�޼ҵ��� ���⼺ 
		animalSound(new Dog());//�ڵ�Ÿ�Ժ�ȯ
		animalSound(new Cat());//�ڵ�Ÿ�Ժ�ȯ
	}
	public static void animalSound(Animal animal) {//animal ���⼺ ...?//�θ�Ÿ�� animal= ��ӹ��� �ڽ�
		animal.sound(); //�� �ڽ�Ŭ�������� ��ӹ��� �߻�޼ҵ带 �������̵��Ѱ� ȣ���� 
	}
}
