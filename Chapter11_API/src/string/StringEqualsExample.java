package string;

public class StringEqualsExample {
	public static void main(String[] args) {
		String s1= new String("�Ź�ö");
		String s2= "�Ź�ö";

		if (s1 ==s2) {
			System.out.println("������ü����");
		} else {
			System.out.println("�ٸ���ü����");
		}

		if (s1.equals(s2)) {
			System.out.println("�������ڿ�");
		} else {
			System.out.println("�ٸ����ڿ�");
		}
	}

}

