package ch08_3_Example;

public class PrinterTest1 {
	public static void main(String[] args) {
		String myDoc = "This is a report....";
		Printable prn = null;// �������� �ʱ�ȭ
	
		
		//�Ｚ ������ ��� �˻� 
		prn = new SPrinterDriver();
		prn.print(myDoc);
		
		//lg ������ ��� �˻�
		prn = new LPrinterDriver();
		prn.print(myDoc);
				
	}
}

//�Ｚ������ ����̹� 
class SPrinterDriver implements Printable{
	//Printable �� ������ ����������� 
	@Override
	public void print (String doc) {
		System.out.println("from �Ｚ");
		System.out.println(doc);
		
	}
	
}

//lg������ ����̹� 
class LPrinterDriver implements Printable{
	@Override
	public void print(String doc) {
		System.out.println("from LG");
		System.out.println(doc);
		
		
	}
}