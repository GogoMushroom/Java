package ch12_2_thread_control;

public class DeamonExample {
	public static void main(String[] args) {
		
		AutoSaver a = new AutoSaver(30);
		//���� ������ ���� 
		a.setDaemon(true);
		
		if (a.isDaemon()) {
			a.start();
		}
		
	System.out.println("������ �� : " + Thread.activeCount());
	
	
	try { Thread.sleep(5*1000);}
	catch (Exception e) {}
	
	a.print();
	
	System.out.println(Thread.currentThread().getName()+"����");
	}
}
