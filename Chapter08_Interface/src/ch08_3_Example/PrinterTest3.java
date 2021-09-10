package ch08_3_Example;

interface ColorPrintable extends Printable{
	void printCMYK(String doc);

}

class SP9900CDriver implements ColorPrintable{
	@Override
	public void printCMYK(String doc) {
		System.out.println("�÷�����Ʈ ���");
		System.out.println("�ＺSP9900CDriver ColorPrintable ");
		System.out.println(doc);
	}

	@Override
	public void print(String doc) {
		System.out.println("����Ʈ ���");
		System.out.println("�ＺSP9900CDriver Printable" );

	}

}
//���ο� Į�� ����Ʈ �߰�
public class PrinterTest3 implements ColorPrintable{
	public static void main(String[] args) {
		
	String myDoc = "This is a report....";
	Printable prn = null;// �������� �ʱ�ȭ

	//�Ｚ ������ ��� �˻� 
	prn = new SP1Driver();
	prn.print(myDoc);
	//���� ������ ��� �˻� 
	prn = new LP1Driver();
	prn.print(myDoc);

}

	@Override
	public void print(String doc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printCMYK(String doc) {
		// TODO Auto-generated method stub
		
	}
}
