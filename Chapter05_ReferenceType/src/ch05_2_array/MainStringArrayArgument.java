package ch05_2_array;

public class MainStringArrayArgument {
	public static void main(String[] args) {//{kor v1.01 //args = {"kor", "v1.01"}
// ����� Ư�� ���ǿ� ���� ������ ����ϰ� ���� ��
		String version = ""; //���������� ����
		if(args != null) { //null�� �ƴҰ��
			version = args[0]; //���������� ù��°��
			if(version.equals("kor")) { // ���� ����  kor�Ͻ�  // kor�� ��� ���°ɱ�?
				System.out.println("�ȳ��ϼ���~" + args[0]);
		}else {//�ƴϸ�
			System.out.println("Hello" +args[1]);
			
		}
	}
		
		
	}
}
