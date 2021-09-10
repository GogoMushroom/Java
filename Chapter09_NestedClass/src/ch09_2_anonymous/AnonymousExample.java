package ch09_2_anonymous;

class Person{
	void wake() {
		System.out.println("7�ÿ� �Ͼ�ϴ�.");
	}
}
//class ChildPerson extends Person{
//	void work () {}
//  void wake () {}
//}

class Anonymous {
 
	// �̸��� �ִ� Ŭ������ ���鶧 
	//Person Field = new ChildPerson();
	
	//�ʵ� �ʱⰪ���� ����
	//�θ�Ŭ���� ���� = new �θ�Ŭ���� () {...};
	Person field = new Person() {  // �ʵ尪���� �͸� ��ü ���� 
	//class ChildPerson extends Person	
		
		void work () {System.out.println("����մϴ�");//�ڽİ�ü �޼ҵ� 
		}
		@Override
		void wake() {System.out.println("6�ÿ� �Ͼ�ϴ�."); //��ӹ��� �޼ҵ� 
			work();
		}
	};// �͸� ��ü ���� 


	void method1() {
		//���� ���������� ����
		Person localVar = new Person() { //���� ���������� �͸� ��ü ���� 
			void wolk () {System.out.println("��å�մϴ�");}
			@Override
			void wake() { System.out.println("7�ÿ� �Ͼ�ϴ�.");
				wolk();
			}
		};
		//���ú������
		localVar.wake();
	}
	void method2 (Person person) {
		person.wake();
	}
}

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous a = new Anonymous();
		//�͸� ��ü �ʵ� ��� 
		a.field.wake();
		//�͸� ��ü ���� ���� ��� 
		a.method1();
		//�͸� ��ü �Ű��� ��� 
		a.method2(
			new Person() { //person �� ��ü�� �ν��Ͻ� ������ü�� �����ؾ��� 
				void study() {System.out.println("�����մϴ�.");}
				@Override
				void wake() {System.out.println("8�ÿ� �Ͼ�ϴ�.");
					study();	
				}
			}
		); //�͸� ��ü ���� 
	}
}
