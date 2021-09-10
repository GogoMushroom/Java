package practice;

public class TvExample2 {
	public static void main(String[] args) {
		Tv t1 = new Tv(); //Tv t1; t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1 channel " +t1.channel);
		System.out.println("t2 channel " +t2.channel);
		
		t1.channel = 7;
		System.out.println("t1 channel " +t1.channel);
		System.out.println("t2 channel " +t2.channel);
		
		t2 = t1; //t1의 값을 t2에 저장 
		System.out.println("t1 channel " +t1.channel);
		System.out.println("t2 channel " +t2.channel);
	}
}
