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
		z = x++;  //�� ���߿� �����ؾ��� 
		System.out.println("z=" +z);   //z=12
		System.out.println("x=" +x);   //�� ���������� ��������+1 ���� x=13
		
		System.out.println("-----------------");
		z = ++x;
		System.out.println("z=" +z);	// ���������� ��� ���� ������ z = 14
		System.out.println("x=" +x);	// x = 14
										//y = 8
		System.out.println("------------------");
		z = ++x + y++;  				//z = 1+14 + 8 ���������� ��翬���� ������ y�� �������� 1 ������ 
		System.out.println("z=" +z);	//z = 23
		System.out.println("x=" +x);	//x = 15
		System.out.println("y=" +y);	//y 8+1 ���������� 1�� ������ 
	}
}	
	
