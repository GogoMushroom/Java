package ch08_3_Example;
interface NewPrintable {
	void print (String doc);//�߻�޼ҵ� ���� ���� �ݵ�� �������̵� �ؾ���  
	
	default void printCMYK(String doc) {//�޼ҵ� ���� �������̵� �ص��ǰ� ���ص��� 
	}
}

//������ ��� ������ 
class OldDriver implements NewPrintable{
	@Override
	public void print(String doc) {
		System.out.println("�Ｚ ����̹� ��� ������");
		System.out.println(doc+"\n");
		
	}
	//default void printCMYK �� �� �������̵� ���ص���
}


//���ο� �÷� ������
class NewDriver implements NewPrintable{
	@Override
	public void print(String doc) {
		// TODO Auto-generated method stub
		System.out.println("�Ｚ ����̹� ��� ������");
		System.out.println(doc+"\n");
	}
	
	//���⼭�� �� ����� �ʿ��ϴϱ� �������̵� ���� 
	@Override
	public void printCMYK(String doc) {
		System.out.println("�Ｚ ����̹� �÷� ������");
		System.out.println(doc+"\n");
	}
}


public class PrinterTest4 {
	public static void main(String[] args) {
		
		String myDoc = "This is a report....";
		NewPrintable prn;
		
		prn = new OldDriver();
		prn.print(myDoc);
		
		prn = new NewDriver();
		prn.printCMYK(myDoc);
		prn.print(myDoc);

		
	}
}
