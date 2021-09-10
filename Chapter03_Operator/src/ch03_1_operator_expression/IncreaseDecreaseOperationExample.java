package ch03_1_operator_expression;

public class IncreaseDecreaseOperationExample {
	public static void main(String[] args) {
		 
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("---------------");
		x++;  //10 + 1
		++x;  //1 + 11  = 12
 		System.out.println("x="+ x);
		
		System.out.println("---------------");
		y--;  //10 - 1
		--y;  // -1 + 9 = 8
		System.out.println("y="+ y);
		
		System.out.println("-----------------");
		z = x++;  //맨 나중에 연산해야함 
		System.out.println("z=" +z);   //z=12
		System.out.println("x=" +x);   //맨 마지막으로 후위연산+1 해줌 x=13
		
		System.out.println("-----------------");
		z = ++x;
		System.out.println("z=" +z);	// 전위수식은 계산 전에 더해줌 z = 14
		System.out.println("x=" +x);	// x = 14
										//y = 8
		System.out.println("------------------");
		z = ++x + y++;  				//z = 1+14 + 8 마지막으로 모든연산이 끝난후 y에 후위연산 1 더해줌 
		System.out.println("z=" +z);	//z = 23
		System.out.println("x=" +x);	//x = 15
		System.out.println("y=" +y);	//y 8+1 마지막으로 1을 더해줌 
	}
}	
	
