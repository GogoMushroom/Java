package ch08_3_Example;

interface ColorPrintable extends Printable{
	void printCMYK(String doc);

}

class SP9900CDriver implements ColorPrintable{
	@Override
	public void printCMYK(String doc) {
		System.out.println("컬러프린트 출력");
		System.out.println("삼성SP9900CDriver ColorPrintable ");
		System.out.println(doc);
	}

	@Override
	public void print(String doc) {
		System.out.println("프린트 출력");
		System.out.println("삼성SP9900CDriver Printable" );

	}

}
//새로운 칼라 프린트 추가
public class PrinterTest3 implements ColorPrintable{
	public static void main(String[] args) {
		
	String myDoc = "This is a report....";
	Printable prn = null;// 참조변수 초기화

	//삼성 프린터 출력 검사 
	prn = new SP1Driver();
	prn.print(myDoc);
	//엘지 프린터 출력 검사 
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
