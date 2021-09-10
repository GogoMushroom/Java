package ch09_3_Example;
// 특정 메소드에서 지역적으로쓰이는 중첩 클래스
//중첩 먼말인지 못알아먹겟다으아으아

class Papers2{
	private  String contents;
	public Papers2(String s) {
		contents = s;
	}
	
	public Printable getPrinter() {
		
		//클래스를 집어넣음 
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
