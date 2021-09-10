package system;

class Car{}


public class CalssExample {
	public static void main(String[] args) {
		
		
		Class clazz = Car.class;
		
		//Class clazz = Class.forName("sec01.exam08.Car");
//		
//		Car c = new Car();
//		Class clazz = c.getClass();
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage().getName());
	}
}
