package test;

interface Soundable{
	String sound();
}


class Cat implements Soundable{
	@Override
	public String sound() {
		return "�߿�";
	}
	
	class Dog implements Soundable{
		@Override
		public String sound() {
			return "�۸�";
		}
		
	
	
	
}



public class SoundExample {
	private static void printsSound (Soundable s) {
		System.out.println(s.sound());
	}
	public static void main(String[] args) {
		printsSound(new Cat());
		printsSound(new Dog());
		
	}
}


