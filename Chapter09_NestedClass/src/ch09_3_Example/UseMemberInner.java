package ch09_3_Example;

interface Printable {
	void print();
}


class Papers{
	private  String contents;
	public Papers(String s) {
		contents = s;
	}
	
	public Printable getPrinter() {
		return new Printer();
	}
	
	private class Printer implements Printable{
	String contents;
		@Override
		public void print() {
			// TODO Auto-generated method stub
			System.out.println(Papers.this.contents);
		}
	}
}


public class UseMemberInner {
	public static void main(String[] args) {
		Papers p = new Papers ("Documents : i am happy");
		Printable prn = p.getPrinter();
		prn.print();
	}
}
