package test;

public class ch04test02_03 {
	public static void main(String[] args) {
		while (true){ 
			//while 문 조건을 만족할때까지 반복
		int num1 = (int)(Math.random()*6)+1;
		int num2 = (int)(Math.random()*6)+1;

		System.out.printf("(%d,%d)\n" ,num1,num2);

		int add = num1+num2;
		if (add == 5) {
			break; 
		}
	}
	}
}


