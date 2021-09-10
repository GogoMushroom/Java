package ch02_1_variable;

public class VariableExchangeExample {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x:" + x + ", y:" + y);
		
		int temp = x;
		//temp 임시로 만들어 놓은 빈 통 
		x = y;
		y = temp;
		System.out.println("x:" + x + ", y:" + y);
				
	}

}
