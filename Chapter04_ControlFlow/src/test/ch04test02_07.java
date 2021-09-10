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
			System.out.println("1.예금 : 2.출금 : 3.잔고 : 4.종료");
			System.out.println("------------------------------");
			System.out.printf("선택>");
		
			String num = scanner.nextLine();
			

			if (num == "1"){
				System.out.println("예금액>");
				balance += Integer.parseInt(scanner.nextLine());
			} else if(num == "2") {
				System.out.println("출금액>");
				balance -= Integer.parseInt(scanner.nextLine());	
			} else if (num == "3") {
				System.out.println("잔고>");
			} else 
				break;
		}
				System.out.println("프로그램 종료");
			
				
			
			
//			
//			String num = scanner.nextLine();
//			
//
//			
//			switch (num) {
//			case "1":
//				System.out.printf("예금액>");
//				balance += Integer.parseInt(scanner.nextLine()); 
//				continue;
//			case "2":
//				System.out.printf("출금액>");
//				balance -= Integer.parseInt(scanner.nextLine()); 
//				continue;
//			case "3":
//				System.out.printf("잔고>");
//				System.out.println(money);
//				continue;
//			case "4":
//				System.out.println("\n프로그램 종료");
//				run=false;
//			}
////			break;
//		 
//
//	

	}
}

