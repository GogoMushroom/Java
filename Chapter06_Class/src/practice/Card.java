package practice;

	

public class Card {
	

	public static void main(String[] args) {
	
	System.out.printf("Cardb.width =" + Cardb.width);
	System.out.println();
	System.out.printf("Cardb.height =" + Cardb.heigth);
	
	Cardb c1 = new Cardb();
	c1.kind = "하트";
	c1.number = 10;
 	
	Cardb c2 = new Cardb();
	c2.kind = "스페이드";
	c2.number = 9;
	
	
	System.out.println();
	System.out.println("c1"+c1.kind+c1.number);
	System.out.println("c2"+c2.kind+c2.number);
	
	
	
	
	}
}
class Cardb {
		String kind;
		int number;
		static int width = 100;
		static int heigth = 250;
		

}