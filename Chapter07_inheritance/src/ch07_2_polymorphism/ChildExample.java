package ch07_2_polymorphism;

public class ChildExample {
	public static void main(String[] args) {
		Child c1 = new Child("��Ȱ�ϴ�"); //parent�� �޼ҵ���� �����´ٴ� �� 
		Child c2 = new Child("�ҽ��ϴ�");
		
		
		Parent p = c1;//new �����ڸ� �����ϰ� child�� �ν��Ͻ� ��ü c�� ���� 
		p=c2;         //�θ������� child�� ������ �� �ִ�. 
		
		p.method1();
		p.method2();
		//p.method3();
		System.out.println(c1);
	}
}
