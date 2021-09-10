package ch09_3_Example;

interface Printable2 {
	void print();
}

class Papers3{
	private  String contents;
	public Papers3(String s) {
		contents = s;
	}

	public Printable2 getPrinter() {
		return new Printable2() { //자료형 printable을 리턴 해줌 
			@Override
			public void print() {
				System.out.println(Papers3.this.contents);
			}
		};
	}
}


public class UseAnonymousInner {
	public static void main(String[] args) {
		Papers3 papers = new Papers3("My Doc");
		Printable2 prn  = papers.getPrinter();
		prn.print();
	}
}