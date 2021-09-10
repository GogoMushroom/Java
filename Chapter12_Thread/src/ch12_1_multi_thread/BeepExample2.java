package ch12_1_multi_thread;

public class BeepExample2 {
	public static void main(String[] args) {
		Runnable b = new BeepTesk();
		Thread t = new Thread(b);
		t.start();
		
		for (int i=0; i<5;i++) {
			System.out.println("гн");
			try{Thread.sleep(500);} catch(Exception e) {}
		
		}
	}
}
