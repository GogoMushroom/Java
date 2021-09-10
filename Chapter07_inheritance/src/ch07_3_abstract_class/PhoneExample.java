package ch07_3_abstract_class;

abstract class Phone{
	//�ʵ� 
	public String owner;
	//������
	public Phone (String owner) {
		this.owner = owner;
	}
	//�޼ҵ� 
	public void turnOn() {
		System.out.println("�� ������ �մϴ�.");
	}
	public void turnOff() {
		System.out.println("�� ������ ���ϴ�.");
	}
}

class SmartPhone extends Phone {
	//������
	public SmartPhone(String owner) {
		super(owner);
	}
	//�޼ҵ�
	public void InternetSearch() {
		System.out.println("���ͳ� �˻��� �մϴ�.");
	}
}



public class PhoneExample {
	public static void main(String[] args) {
		//Phone p = new Phone();

		SmartPhone sp = new SmartPhone("ȫ�浿");

		sp.turnOn();
		sp.InternetSearch();
		sp.turnOff();

	}

}
