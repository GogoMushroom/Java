package practice;

import java.awt.PrintGraphics;

public class MyMath_ {
	public static void main(String[] args) {
		MyMath mm = new 	MyMath();

		long result1 = mm.add(5L ,3L); //add 메서드 호출 
		long result2 = mm.subtrack(5L ,3L);
		long result3 = mm.multiply(5L ,3L);
		double result4 = mm.devide(5L ,3L);


		System.out.println("add int a , int b =" + result1);
		System.out.println("sub int a , int b =" + result2);
		System.out.println("mul int a , int b =" + result3);
		System.out.println("dev int a , int b =" + result4);
	}

}



class MyMath {



	long add (long a , long b) { //add 메서드 호출 
		long result = a+b;
		return result;  // 결과를 돌려줌 
		// return a + b; //한줄로 할 수도 있음
	}
	//메서드는 클래스 영역에만 정의가능 

	long max (long a, long b) {
		if (a>b)
			return a;
		else
			return b;



	}
	long subtrack(long a , long b) { return a-b;}
	long multiply(long a , long b) { return a*b;}
	double devide (double a, double b) {
		return a/b ;
	}

}