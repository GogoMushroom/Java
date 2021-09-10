package method;

public class ControlFlow2 {
	public static void main(String[] args) {
/*
 * "오버로딩" 		
 */		
//		add(1,5);
//		add(11,12);
//		add(55,33);
//		
//		add(1.5 , 3.1);	
//		System.out.println(add(1,5));
		
		
		
	//	int result =add(1,2);
		System.out.println(add(1,2));
		
		
		
	}	                //자료형, 파라미터 갯수에 따라 함수가 구분된다. 그둘이 같으면 리턴형이 다르더라도 같은 함수로 인식 
	public static int add(int i,int j) {
//	int result = i + j;
//	return result;
	return i + j;
	
	}
public static void add(double d, double e) {
	System.out.println(d + e);
	}
//void의 역할은 return 되는 타입이 없음을 의미
//return value;- 리턴 
	//private static void add(int i, int j) {
	//	System.out.println(i + j);		
		
 		
	}



//a = 1;
//b = 5;
//c = a+b;
//System.out.println(c);
//
//a = 11;
//b = 22;
//c = a+b;
//System.out.println(c);
//
//a = 33;
//b = 55;
//c = a+b;
//System.out.println(c);

//add(1,5);
//add(11,22);
//add(33,55);
