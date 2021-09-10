package ch12_2_thread_control;

public class InterruptExample {
	public static void main(String[] args) {
		Thread t = new PrintThread2();
		t.start();
		
		try { Thread.sleep(100);} 
		catch (InterruptedException e ) {}
		
		//�����带 �����ϱ����� InterruptedException�� �߻���Ų��.
		t.interrupt();
	}
}

//
//class PrintThread2 extends Thread{
//	public void run() {
//		try {
//			while(true) {
//				System.out.println("������");
//				
//				//
//				Thread.sleep(1);
//			}
//		}catch (InterruptedException e ) {}
//		System.out.println("�ڿ�����");
//		System.out.println("��������");
//	}
//}


class PrintThread2 extends Thread{
	public void run() {
		while(true) {
				System.out.println("������");
				if (Thread.interrupted()) {
				break;
			}
		}
		System.out.println("�ڿ�����");
		System.out.println("��������");
	}
}