package ch07_1_inheritance;

public class Cellphone {
	//�ʵ�
	
	String model;
	String color;
	
	//������
	Cellphone(){
	System.out.println("�θ������ call");
	}
	
	//�޼ҵ�
	void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
	void bell() {
		System.out.println("���� �︳�ϴ�.");
	}
	void sendVoice(String message) {
		System.out.println("��:" + message);
	}
	void recieveVoice(String message) {
		System.out.println("����:" + message);
	}
	void hangUp() {
		System.out.println("��ȭ�� �����ϴ�.");
	}
	
}
