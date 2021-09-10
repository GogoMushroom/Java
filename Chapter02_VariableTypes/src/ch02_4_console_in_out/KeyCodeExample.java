package ch02_4_console_in_out;

public class KeyCodeExample {
 public static void main(String[] args) throws Exception {

	 //  키보드로부터 입력된 내용을 변수에 저장하고 출력하기
//	System.in.read();
	 //정수는int로 선언하는것이 제일 안정적임
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
