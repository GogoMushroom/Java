package ch09_3_Example;
// Ư�� �޼ҵ忡�� ���������ξ��̴� ��ø Ŭ����
//��ø �ո����� ���˾Ƹ԰ٴ���������

class Papers2{
	private  String contents;
	public Papers2(String s) {
		contents = s;
	}
	
	public Printable getPrinter() {
		
		//Ŭ������ ������� 
		 class Printer implements Printable{
			@Override
			public void print() {

				System.out.println(Papers2.this.contents);
			}
		}
		//------------------
		
//		 Printer prn = new Printer();
//		 return prn;
		return new Printer();
	}

}

public class UseLocalinner {
	public static void main(String[] args) {
		Papers papers = new Papers("My Doc");
		Printable prn  = papers.getPrinter();
		prn.print();
	}
}
