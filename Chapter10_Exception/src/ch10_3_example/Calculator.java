package ch10_3_example;

class ExceptionExample {
	public static void main(String[] args) throws Exception1000, Exceptionzero, DivzeroException {
		
		Calculator.add(1,3);
		Calculator.sub(5,3);
		Calculator.multi(1,3);
		Calculator.div(1,1);
		
//Calculator
		
	
	}}
public class Calculator{
	
	//���������� x,y���� 1000 �� ������ ����!
	//x+y���� �����̸鿡�� 
	
	 static int add(int a, int b) throws Exception1000, Exceptionzero {
//		int  result = a+b;
//		 
//
//		 if (result>1000) {
//			 throw new Exception1000();
//		 }if (result<0) {
//			 throw new Exceptionzero(); 
//		 }
//		 return result;	
//	 }
			
			 if ((a+b)>1000) {
				 throw new Exception1000();
			 }if ((a+b)<0) {
				 throw new Exceptionzero(); 
			 }
			 return a+b;	
		 }
	
	 
	 //x-y���� �����̸� ����
	 static void sub(double a, double b) throws Exceptionzero{
		 if (a-b<0) {
			 throw new Exceptionzero();
		 }
			System.out.println((double)a-b);
					 
		 }
	 
	 //b���� 0�̸� ����
	 static void multi(int a, int b) {
		
			System.out.println(a*b);
					 
		 }
	 
	 
	 static int div(int a, int b)throws DivzeroException{
		 
		 int result = a/b;
		 if (b == 0) { throw new DivzeroException();
		 }
		 
		 return result;
					 
		 }
}