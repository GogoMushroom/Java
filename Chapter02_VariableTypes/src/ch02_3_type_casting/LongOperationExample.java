package ch02_3_type_casting;

public class LongOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	result =[long]num1 (+ - * / %) (long)[byte,char,short,int]num2;	
		
		
	byte value1 = 10;
	int value2 = 100;
	long value3 = 1000L;
	
	long result = value1 + value2 + value3;
	
	//���� ���ս��� �������� long �ڷ����� ����� 
	// result = value1 + value2 + value3;
	//        = byte   + int    + long;
	//        = int�� ��ȯ + int   + long:
	//        int+int = int, int+long = long 
	
	System.out.println(result);
	
			
	}

}
