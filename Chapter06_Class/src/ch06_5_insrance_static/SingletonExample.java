package ch06_5_insrance_static;

public class SingletonExample {
	public static void main(String[] args) {
		//Singleton ob1= new Singleton();
		//Singleton ob2= new Singleton();
		//
		
		
		
		Singleton ob1 = Singleton.getInstance();
		Singleton ob2 = Singleton.getInstance();
		
		if(ob1 == ob2) {
			System.out.println("같은객체입니다.");
			
		}else {
			System.out.println("다른객체입니다.");
		}
				
		
	}
}
