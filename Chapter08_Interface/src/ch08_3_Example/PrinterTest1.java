package ch08_3_Example;

public class PrinterTest1 {
	public static void main(String[] args) {
		String myDoc = "This is a report....";
		Printable prn = null;// 참조변수 초기화
	
		
		//삼성 프린터 출력 검사 
		prn = new SPrinterDriver();
		prn.print(myDoc);
		
		//lg 프린터 출력 검사
		prn = new LPrinterDriver();
		prn.print(myDoc);
				
	}
}

//삼성프린터 드라이버 
class SPrinterDriver implements Printable{
	//Printable 를 무조건 구현해줘야함 
	@Override
	public void print (String doc) {
		System.out.println("from 삼성");
		System.out.println(doc);
		
	}
	
}

//lg프린터 드라이버 
class LPrinterDriver implements Printable{
	@Override
	public void print(String doc) {
		System.out.println("from LG");
		System.out.println(doc);
		
		
	}
}