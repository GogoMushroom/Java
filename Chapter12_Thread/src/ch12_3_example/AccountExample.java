package ch12_3_example;

//출금자클래스 
class Withdrawer implements Runnable{
	
	Account a =new Account();
	
	
	@Override
	public void run() {
		//출금하기
		while(a.getBalance() > 0) {
			//100원 ,200원 ,300원중 임의로 출금
			int money = (int)(Math.random()*3+1)*100;
			a.withdraw(money);
			System.out.println("현제잔고:"+ a.getBalance());
		} 
			
		
	}
}

public class AccountExample {
	public static void main(String[] args) {
		
		/*
		 * 출금하는일을 병렬화(멀티스레딩구성)
		 */
		Runnable withdrawer = new Withdrawer();
		
		Thread jWorker = new Thread(withdrawer);
		Thread yWorker = new Thread(withdrawer);
		
		jWorker.start();
		yWorker.start();
		
	}
}
