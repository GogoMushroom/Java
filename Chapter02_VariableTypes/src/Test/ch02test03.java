package Test;

import java.util.Scanner;
//외부에서 읽어오기
public class ch02test03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		//객체 생성하기
		System.out.println("[필수 정보 입력]");
		System.out.println("1. 이름:");
		String name = scanner.nextLine();
		// 외부에서 String 입력받기
		System.out.println("2. 주민번호 앞 6자리:");
		String id = scanner.nextLine();
		// 외부에서 String 입력받기
		System.out.println("3. 전화번호:");
		String tell = scanner.nextLine();
		// 외부에서 String 입력받기
		
		
		System.out.println("[입력한 내용]");
		System.out.println(name);
		System.out.println(id);
		System.out.println(tell);
		
		
		
		
		
		
	}

}
