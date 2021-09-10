package ch12_3_example;

//�����Ŭ���� 
class Withdrawer implements Runnable{
	
	Account a =new Account();
	
	
	@Override
	public void run() {
		//����ϱ�
		while(a.getBalance() > 0) {
			//100�� ,200�� ,300���� ���Ƿ� ���
			int money = (int)(Math.random()*3+1)*100;
			a.withdraw(money);
			System.out.println("�����ܰ�:"+ a.getBalance());
		} 
			
		
	}
}

public class AccountExample {
	public static void main(String[] args) {
		
		/*
		 * ����ϴ����� ����ȭ(��Ƽ����������)
		 */
		Runnable withdrawer = new Withdrawer();
		
		Thread jWorker = new Thread(withdrawer);
		Thread yWorker = new Thread(withdrawer);
		
		jWorker.start();
		yWorker.start();
		
	}
}
