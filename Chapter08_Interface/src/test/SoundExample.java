package test;

interface Soundable{
	String sound();
}


class Cat implements Soundable{
	@Override
	public String sound() {
		return "具克";
	}
	
	class Dog implements Soundable{
		@Override
		public String sound() {
			return "港港";
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


