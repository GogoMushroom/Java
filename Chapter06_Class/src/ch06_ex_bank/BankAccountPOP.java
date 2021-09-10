package ch06_ex_bank;
/*
 * 은행계좌 구현 클래스 
 */
 class BankAccount1{
	String name;
	int balance;
	int number;
	int ssn;
}
public class BankAccountPOP {

	static int balance; //클래스내의 인스턴스 필드
	//static = new 하지 않아도 메모리 생성이 됨
	public static void main(String[] args) { 

		BankAccount1 myAcc = new BankAccount1();
		
		myAcc.name="김자바";
		
		//계좌 초기화
		int balance = 0;

		//계좌 입금   
		//->계좌입금하기(동작으로만들어줌)
		deposit(10000);
		
		//계좌 출금
		//->계좌출금하기
		withdraw(3000);

		//계좌 잔고 출력
		//->계좌 잔고 출력하기
		checkBalance();
		
		withdraw(1000);
		deposit(30000);
		checkBalance();
		
	}

	private static void checkBalance() {
		System.out.println("잔고" + balance);

		
	}

	private static void withdraw(int withdrawAmount) {
		balance = balance - withdrawAmount;

	}

	private static void deposit(int depositAmount) {
		//private static 은 맴버변수에서는 안써도됨
		balance = balance + depositAmount;

	}
}
