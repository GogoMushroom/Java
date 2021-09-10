package ch08_3_Example;
interface NewPrintable {
	void print (String doc);//추상메소드 구현 안함 반드시 오버라이딩 해야함  
	
	default void printCMYK(String doc) {//메소드 구현 오버라이딩 해도되고 안해도됨 
	}
}

//기존의 흑백 프린터 
class OldDriver implements NewPrintable{
	@Override
	public void print(String doc) {
		System.out.println("삼성 드라이버 흑백 프린팅");
		System.out.println(doc+"\n");
		
	}
	//default void printCMYK 는 꼭 오버라이딩 안해도됨
}


//새로운 컬러 프린터
class NewDriver implements NewPrintable{
	@Override
	public void print(String doc) {
		// TODO Auto-generated method stub
		System.out.println("삼성 드라이버 흑백 프린팅");
		System.out.println(doc+"\n");
	}
	
	//여기서는 이 기능이 필요하니까 오버라이딩 해줌 
	@Override
	public void printCMYK(String doc) {
		System.out.println("삼성 드라이버 컬러 프린팅");
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
