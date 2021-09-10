package ch08_2_polymorphism;




public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus b = new Bus();
		Taxi t = new Taxi();
		
		

		//vehicle v = new Bus();
		//vehicle v = new Taxi();
		driver.drive(b);
		driver.drive(t);
		
		
	}
}
