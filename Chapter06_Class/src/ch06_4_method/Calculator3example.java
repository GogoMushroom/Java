package ch06_4_method;

public class Calculator3example {
	public static void main(String[] args) {
		
		Calculator3 cal = new Calculator3();
		
		double result1 = cal.areaRectangle(10);
		
		double result2 = cal.areaRectangle(10,20);
		
		//°á°ú
		System.out.println(result1);
		System.out.println(result2);
	}
}
