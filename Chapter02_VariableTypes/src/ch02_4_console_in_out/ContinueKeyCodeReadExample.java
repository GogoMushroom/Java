package ch02_4_console_in_out;

public class ContinueKeyCodeReadExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		int keyCord;

		// while ���ǿ� ���� �ݺ��� for Ƚ���� ���� �ݺ���
		// while ������ �����ɴ���� ���� �ݺ�
		while (true) {
			keyCord = System.in.read();
			if (keyCord == 113) {

				break;
			}
			
				System.out.println(keyCord);			

			}
		System.out.println("����");
		}
	}

