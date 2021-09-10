package Wilderness;

import java.util.Scanner;

public class PaymentTest {
	public static void main(String[] args) {
		Payment pay = new ImplementsClass(); 
		ImplementsClass im = new ImplementsClass();
		Scanner sc = new Scanner(System.in);
		CustomerSign custSign = new CustomerSign();
		
		while (true) {
			custSign.customerInformation();
			im.paymentFirstView();
			switch (sc.nextLine()) {
			case "1":
				pay.card();
				break;
			case "2":
				pay.account();
				break;
			default:
				System.out.println("다시 입력해주세요");
				continue;
			}
			return;
		}
	}
}
//카드결제 때 필요한게 항공권 정보, 가격, 
//무통장입금 때 필요한거 탑승자 정보
