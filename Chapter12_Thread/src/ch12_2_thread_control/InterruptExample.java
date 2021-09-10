package ch12_2_thread_control;

public class InterruptExample {
	public static void main(String[] args) {
		Thread t = new PrintThread2();
		t.start();
		
		try { Thread.sleep(100);} 
		catch (InterruptedException e ) {}
		
		//스레드를 종료하기위해 InterruptedException을 발생시킨다.
		t.interrupt();
	}
}

//
//class PrintThread2 extends Thread{
//	public void run() {
//		try {
//			while(true) {
//				System.out.println("실행중");
//				
//				//
//				Thread.sleep(1);
//			}
//		}catch (InterruptedException e ) {}
//		System.out.println("자원정리");
//		System.out.println("실행종료");
//	}
//}


class PrintThread2 extends Thread{
	public void run() {
		while(true) {
				System.out.println("실행중");
				if (Thread.interrupted()) {
				break;
			}
		}
		System.out.println("자원정리");
		System.out.println("실행종료");
	}
}