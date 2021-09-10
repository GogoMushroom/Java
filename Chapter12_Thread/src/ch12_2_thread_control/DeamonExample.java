package ch12_2_thread_control;

public class DeamonExample {
	public static void main(String[] args) {
		
		AutoSaver a = new AutoSaver(30);
		//데몬 스레드 설정 
		a.setDaemon(true);
		
		if (a.isDaemon()) {
			a.start();
		}
		
	System.out.println("스레드 수 : " + Thread.activeCount());
	
	
	try { Thread.sleep(5*1000);}
	catch (Exception e) {}
	
	a.print();
	
	System.out.println(Thread.currentThread().getName()+"종료");
	}
}
