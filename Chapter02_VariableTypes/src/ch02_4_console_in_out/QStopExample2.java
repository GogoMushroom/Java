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
//		keyCode = System.in.read(); //read�� 1����Ʈ�� ���� ���ڿ��� �������� 2byte�̱⶧���� ������   
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
//	System.out.println("���α׷��� ���������� ����Ǿ����ϴ�. ");
//	}
//}

//[ScannerExample]

		Scanner scn = new Scanner(System.in);
		String str = ""; //�ʱ�ȭ 
		
		while(true) {
			System.out.println("��-----------��");
			System.out.println("     �� ��"    );
			System.out.println("��-----------��\n");
			
			str = scn.nextLine();
			System.out.printf("�Է��Ͻ� ���ڿ��� \"%s\" �Դϴ�.\n", str); //%s string  str ��Ʈ�� ���� 
			
			if(str.equalsIgnoreCase("q")) { //.equalsIgnoreCase("q") ��ҹ��� ������ �ʰ� �Է°��� 
				break;
			}
		}
		
		System.out.println("���α׷��� ���������� ����Ǿ����ϴ�.");
		
		scn.close(); //scn �ÿ��ϰ� �ݾ������ 
	} 
}