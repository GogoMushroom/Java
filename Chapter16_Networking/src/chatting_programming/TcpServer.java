package chatting_programming;

import java.util.Scanner;

import com.framework.TcpApplication;

public class TcpServer {
	public static void main(String[] args) {
		for(int i=0; i<15; i++) {
			System.out.println("");
		}
		
		Scanner scanner = new Scanner(System.in);
		
		showMenu();
		
		for(int i=0; i<15; i++) {
			System.out.println("");
		}
		
		System.out.printf("            > ");
		int select = scanner.nextInt();
		
		switch (select) {
		case 1:
			System.out.println("      1-> start         ");
			System.out.println();
			break;
		case 0:
			System.out.println("����");
			System.exit(0);
			
		}
		
		
		/*
		 * TCP/IP ���ø����̼� ����
		 */
		TcpApplication app = new AppServer();
		
		//���� �ʱ�ȭ 
		app.init();
		
		//���ø����̼� ����
		app.start();
		
	}
	
	public static void showMenu() {
        System.out.printf("                                      \n");
        System.out.printf("          �����������������������������\n");
        System.out.printf("                                      \n");
        System.out.printf("            [SERVER version 1.0.1��]   \n");
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