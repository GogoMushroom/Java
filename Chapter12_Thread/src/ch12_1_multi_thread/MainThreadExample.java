package ch12_1_multi_thread;

public class MainThreadExample {
	public static void main(String[] args) {
		
		/* ��Ƽ�������� ���� 
		 * ���� �����尡 ���� ���μ��� ������ �ڿ� �����ϸ� ����� ����
		 * -����ȭ (synchronization)
		 * -�������� (deadlock)
		 * 
		 */
		
		
		
		Calculator c = new Calculator();
		
		//�͸����� ������ ���� 
		Thread j = new Thread() {
			@Override
			public void run() {
				c.setMemory(100);
			}
		}; 
		j.setName("j's Thread");
		
			Thread p = new Thread(new Runnable() {
				@Override
				public void run() {
					c.setMemory(50);
					
				}
			}); 
			p.setName("p's Thread");
		

			j.start();
			p.start();
		
//		
//		User1 u1 = new User1 ();
//		u1.setCalculator(c);
//		u1.start();
//		
//		User2 u2 = new User2 ();
//		u2.setCalculator(c);
//		u2.start();
	}
}




class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e) {}
		System.out.println(Thread.currentThread().getName()+
				":"+ this.memory);	
		}
	}


//class User1 extends Thread{
//	private Calculator c ;
//	
//	public void setCalculator (Calculator cal) {
//		this.setName("User1");
//		this.c = cal;
//	}
//	public void run() {
//		c.setMemory(100);
//	}
//	
//}
//
//class User2 extends Thread{
//	private Calculator c ;
//	
//	public void setCalculator (Calculator cal) {
//		this.setName("User2");
//		this.c = cal;
//	}
//	public void run() {
//		c.setMemory(50);
//	}
//	
//}
