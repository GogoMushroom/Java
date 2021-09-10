package ch02_4_console_in_out;

import java.io.IOException;
import java.util.Scanner;

public class QStopExample2 {
public static void main(String[] args) throws Exception {
////	int keyCode;
//	
//	boolean working = true;
//	int keyCode;
//	while(working) {
//		try {
//		keyCode = System.in.read(); //read는 1바이트만 읽음 문자열을 읽을때는 2byte이기때문에 못밁음   
//		System.out.printf("keyCode: %d\n" , keyCode);
//		if(keyCode == 'q' || keyCode == 'Q') {
//			working = false;
//		}
//		
//		}catch (IOException e) {
//		
//			e.printStackTrace();
//		}
//	}
//	
//	System.out.println("프로그램이 정상적으로 종료되었습니다. ");
//	}
//}

//[ScannerExample]

		Scanner scn = new Scanner(System.in);
		String str = ""; //초기화 
		
		while(true) {
			System.out.println("♥-----------♥");
			System.out.println("     메 뉴"    );
			System.out.println("♥-----------♥\n");
			
			str = scn.nextLine();
			System.out.printf("입력하신 문자열은 \"%s\" 입니다.\n", str); //%s string  str 스트링 변수 
			
			if(str.equalsIgnoreCase("q")) { //.equalsIgnoreCase("q") 대소문자 가리지 않고 입력가능 
				break;
			}
		}
		
		System.out.println("프로그램이 정상적으로 종료되었습니다.");
		
		scn.close(); //scn 시용하고 닫아줘야함 
	} 
}