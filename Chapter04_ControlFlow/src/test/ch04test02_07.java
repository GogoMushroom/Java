   package test;
import java.util.Scanner;
public class ch04test02_07 {
	public static void main(String[] args) {
		int money=0;
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------");
			System.out.println("1.���� : 2.��� : 3.�ܰ� : 4.����");
			System.out.println("------------------------------");
			System.out.printf("����>");
		
			String num = scanner.nextLine();
			

			if (num == "1"){
				System.out.println("���ݾ�>");
				balance += Integer.parseInt(scanner.nextLine());
			} else if(num == "2") {
				System.out.println("��ݾ�>");
				balance -= Integer.parseInt(scanner.nextLine());	
			} else if (num == "3") {
				System.out.println("�ܰ�>");
			} else 
				break;
		}
				System.out.println("���α׷� ����");
			
				
			
			
//			
//			String num = scanner.nextLine();
//			
//
//			
//			switch (num) {
//			case "1":
//				System.out.printf("���ݾ�>");
//				balance += Integer.parseInt(scanner.nextLine()); 
//				continue;
//			case "2":
//				System.out.printf("��ݾ�>");
//				balance -= Integer.parseInt(scanner.nextLine()); 
//				continue;
//			case "3":
//				System.out.printf("�ܰ�>");
//				System.out.println(money);
//				continue;
//			case "4":
//				System.out.println("\n���α׷� ����");
//				run=false;
//			}
////			break;
//		 
//
//	

	}
}

