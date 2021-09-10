package ch08_3_Example;



class SP1Driver implements Printable{
	@Override
	public void print(String doc) {
		System.out.println("from SP1Driver");
		System.out.println(doc+"\n");
		
		
	}
}
class LP1Driver implements Printable{
	@Override
	public void print(String doc) {
		System.out.println("from LP1Driver");
		System.out.println(doc+"\n");
		
	}
}


public class PrinterTest2 {
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
}
