package ch06_1_oop;

public class CarExample {
	public static void main(String[] args) {

		//��ü ����
		Car mycar = new Car ("�����","ī�Ϲ�","���");
		Car secondcar = new Car ("����","�ƹݶ�","ȸ��","����");
		//Car Ŭ������ ����ϸ� ���� ������ ������ ���� �� ����
		//Ŭ������ ������Ұ� �ٸ��� �ٸ� Ŭ������ 

		// public Car(){}
		//
		//�ʱ�ȭ(�Ƚ�µ� �˾Ƽ� ����)

		//�ʵ尪 �б�
		System.out.println("����ȸ��:" +mycar.company);
		System.out.println("�𵨸�:" +mycar.model);
		System.out.println("����:" + mycar.color);
		System.out.println("�ְ�ӵ�:" + mycar.maxSpeed);
		System.out.println("�����ӵ�" + mycar.Speed);
		System.out.println();
		System.out.println("����ȸ��:" +secondcar.company);
		System.out.println("�𵨸�:" +secondcar.model);
		System.out.println("����:" + secondcar.color);
		System.out.println("�ְ�ӵ�:" + secondcar.maxSpeed);
		System.out.println("�����ӵ�:" + secondcar.Speed);
		System.out.println("����:" + secondcar.engine);
		System.out.println();
		
		
		//�ʵ尪 ���� 
		mycar.Speed = 60;
		System.out.println("������ �ӵ�:"+mycar.Speed);
	
		
	
	}
}
