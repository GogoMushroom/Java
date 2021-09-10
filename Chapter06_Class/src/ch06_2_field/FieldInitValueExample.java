package ch06_2_field;

class FieldInitValue{
	byte byteField;
	short shortField;
	int intField;
	long longField;
	
	boolean booleanField;
	char charField;
	
	float floatField;
	double doubleField;
	
	int[] arrField;
	String referanceField;
	
	
	
} //편의상 라이브러리와 실행을 동시에 만듬 



public class FieldInitValueExample {
	public static void main(String[] args) {
		FieldInitValue fiv =new FieldInitValue(); //new 연산자로 만들어줌 
		System.out.println("fiv.byteField="+ fiv.byteField);
		System.out.println("fiv.shortField=" + fiv.shortField);
		System.out.println("fiv.intField=" + fiv.intField);
		System.out.println("fiv.longField=" + fiv.longField);
		
		System.out.println("fiv.booleanField=" + fiv.booleanField);
		System.out.println("fiv.charField=" + fiv.charField); //아무것도 안찍힘 
		
		System.out.println("fiv.floatField=" + fiv.floatField);
		System.out.println("fiv.doubleField=" + fiv.doubleField);
	
		System.out.println("fiv.arrField=" + fiv.arrField);
		System.out.println("fiv.referanceField=" + fiv.referanceField);
		
		System.out.println("fiv.longField=" + fiv.longField);
		System.out.println("fiv.longField=" + fiv.longField);
		
	}
	
	
}
