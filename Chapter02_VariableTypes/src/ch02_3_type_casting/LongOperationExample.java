package ch02_3_type_casting;

public class LongOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	result =[long]num1 (+ - * / %) (long)[byte,char,short,int]num2;	
		
		
	byte value1 = 10;
	int value2 = 100;
	long value3 = 1000L;
	
	long result = value1 + value2 + value3;
	
	//계산시 값손실이 없으려면 long 자료형을 써야함 
	// result = value1 + value2 + value3;
	//        = byte   + int    + long;
	//        = int로 변환 + int   + long:
	//        int+int = int, int+long = long 
	
	System.out.println(result);
	
			
	}

}
