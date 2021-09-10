package ch02_4_console_in_out;

import java.util.Scanner;

public class ScannerExample {
public static void main(String[] args) throws Exception {
	Scanner scanner = new Scanner(System.in); //input데이터를 scanner변수에 저장
	String inputData;
	
	while(true) {
		inputData = scanner.nextLine(); //scanner.nextLine()메소드 = 저장된 데이터를 읽어들임 
		System.out.println("입력된 문자열: \"" + inputData + "\"");
		if (inputData.equals("q")) {
			break;
		}
	}
	
	System.out.println("종료");
}
}
