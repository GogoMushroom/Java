package math;

import java.awt.RadialGradientPaint;
import java.util.Random;

public class MathRandomExample {
	public static void main(String[] args) {
		
		Random r = new Random();
		System.out.println(r.nextInt(6)+1);
		
		int num = (int)(Math.random()*6) +1;
		System.out.println("주사위값" + num);
	}
}
