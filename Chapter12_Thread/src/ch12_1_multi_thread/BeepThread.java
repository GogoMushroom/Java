package ch12_1_multi_thread;

import java.awt.Toolkit;

public class BeepThread extends Thread {
	@Override
	public void run() {
		Toolkit t = Toolkit.getDefaultToolkit() ;
		for(int i=0;i<5;i++) {
			t.beep();
			try {Thread.sleep(500);} catch (Exception e) {}
		}
	}
}
