package ch09_3_Example;


interface Readable{
	void read(String s);
}


public class Lamda4 {
	public static void main(String[] args) {
		
		//람다식
		Readable r1 = 
            (s)->{System.out.println("\"" + s+ "\"" +"을 (를) 읽는다.");}; 
            //매개변수  -> 구현부
			
		r1.read("What is Lamda?");	
	}
}

