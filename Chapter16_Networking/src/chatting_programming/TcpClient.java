package chatting_programming;

import java.util.Scanner;

import com.framework.TcpApplication;

public class TcpClient {
	public static void main(String[] args) {
		
		for (int i=0; i<15 ; i++) {
			System.out.println("");
		}
		
		
		showMenu();
		
		Scanner scanner = new Scanner(System.in);  
		System.out.printf("            > ");
		int select = scanner.nextInt();
		
		switch (select) {
		case 1:
			System.out.println("      1-> start         \n");
			System.out.println();
			break;
		case 0:
			System.out.println();
			System.exit(0);
			
		}
		
		
		/*
		 * TCP/IP ���ø����̼� ����
		 */
		TcpApplication app = new AppClient();
		
		//���� �ʱ�ȭ 
		app.init();
		
		//���ø����̼� ����
		app.start();
		
		scanner.close();
		
	}
	
	public static void showMenu() {
        System.out.printf("                                      \n");
        System.out.printf("          �����������������������������\n");
        System.out.printf("                                      \n");
        System.out.printf("            [Client version 1.0.1��]   \n");
        System.out.printf("                                      \n");
        System.out.printf("          �����������������������������\n");
        System.out.printf("                                      \n");
        System.out.printf("                                      \n");
        System.out.printf("                                      \n");
        
        System.out.printf("          1 �� Start                   \n");
        System.out.printf("          0 �� End                     \n");
        System.out.printf("                                      \n");
        System.out.printf("                                      \n");
    	
	}
	
}