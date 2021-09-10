package ch12_1_multi_thread;

import java.awt.Toolkit;

public class BeepPrintExample1 {

	public static void main(String[] args) {

		Toolkit t = Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++) {
			t.beep();
			try {Thread.sleep(500);} catch (Exception e) {}
		}
		for (int i=0; i<5;i++) {
			System.out.println("гн");
			try{Thread.sleep(500);} catch(Exception e) {}
		}
	}
}
