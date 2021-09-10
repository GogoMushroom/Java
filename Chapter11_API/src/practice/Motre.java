package practice;

public class Motre {
	public static void main(String[] args) {

		
		double x = 0;
		double y = 0;
		double d = 0;
		double n = 10000000;

		for (int i = 0; i <n; i++) {
			x=Math.random();
			y=Math.random();
			if ((Math.pow(x,2.0))+(Math.pow(y,2.0))<1d) {
				d++;

			}
		}
		double pi = (double)4*d/n;
		System.out.println(d);
		System.out.println(pi);
		
	}
}
