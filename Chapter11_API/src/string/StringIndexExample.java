package string;


//indexOf if���� ���ǽĿ��� Ư�� ���ڿ��� ���ԵǾ��ִ��� ���ο� ���� �����ڵ带 �޸��Ҷ� ���
//-1�� �����ϸ� Ư�� ���ڿ��� ���ԵǾ� ���� �ʴ� �� �� 

public class StringIndexExample {
	public static void main(String[] args) {
		String subject = "�ڹ����α׷���";
		
		int location = subject.indexOf("���α׷���");
		System.out.println(location);;
		
		if (subject.indexOf("�ڹ�")!=-1) {
			System.out.println("�ڹ� ���� å");
		} else {
			System.out.println("�ڹ� ���� å �ƴ�");
		}
		
	}
}
