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
	
	
	
} //���ǻ� ���̺귯���� ������ ���ÿ� ���� 



public class FieldInitValueExample {
	public static void main(String[] args) {
		FieldInitValue fiv =new FieldInitValue(); //new �����ڷ� ������� 
		System.out.println("fiv.byteField="+ fiv.byteField);
		System.out.println("fiv.shortField=" + fiv.shortField);
		System.out.println("fiv.intField=" + fiv.intField);
		System.out.println("fiv.longField=" + fiv.longField);
		
		System.out.println("fiv.booleanField=" + fiv.booleanField);
		System.out.println("fiv.charField=" + fiv.charField); //�ƹ��͵� ������ 
		
		System.out.println("fiv.floatField=" + fiv.floatField);
		System.out.println("fiv.doubleField=" + fiv.doubleField);
	
		System.out.println("fiv.arrField=" + fiv.arrField);
		System.out.println("fiv.referanceField=" + fiv.referanceField);
		
		System.out.println("fiv.longField=" + fiv.longField);
		System.out.println("fiv.longField=" + fiv.longField);
		
	}
	
	
}
