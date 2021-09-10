package ch02_4_console_in_out;

public class ContinueKeyCodeReadExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		int keyCord;

		// while 조건에 대한 반복문 for 횟수에 대한 반복문
		// while 조건이 만족될대까지 무한 반복
		while (true) {
			keyCord = System.in.read();
			if (keyCord == 113) {

				break;
			}
			
				System.out.println(keyCord);			

			}
		System.out.println("종료");
		}
	}

