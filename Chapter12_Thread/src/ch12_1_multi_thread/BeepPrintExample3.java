package ch12_1_multi_thread;

class Tesk1 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}
}
class Tesk2 implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub

	}
}




public class BeepPrintExample3 {
	public static void main(String[] args) {

		//	Thread th1 = new Thread(new Tesk1);
		//	Thread th2 = new Thread(new Tesk2);

//익명 객체 사용하는 법 		
		Thread th1 = new Thread() {
			@Override
			public void run() {
				
			}
		};
		Thread th2 = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub

			}
		});
		
		th1.start();
		th2.start();
	}
}
