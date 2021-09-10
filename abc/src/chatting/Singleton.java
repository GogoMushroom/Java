package chatting;
public class Singleton {
	private static Singleton s = null;
	
	ClientView client = new ClientView();	
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(s == null) {
			s = new Singleton();
		}
		return s;
	}
	
}