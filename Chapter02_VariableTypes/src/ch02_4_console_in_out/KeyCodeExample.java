package ch02_4_console_in_out;

public class KeyCodeExample {
 public static void main(String[] args) throws Exception {

	 //  Ű����κ��� �Էµ� ������ ������ �����ϰ� ����ϱ�
//	System.in.read();
	 //������int�� �����ϴ°��� ���� ��������
	 //
	 int keyCode;
	 
	 keyCode = System.in.read();
	 System.out.println("keyCode:" + keyCode);

	 keyCode = System.in.read();
	 System.out.println("keyCode:" + keyCode);

	 keyCode = System.in.read();
	 System.out.println("keyCode:" + keyCode);
 	}
}
