package ch08_2_polymorphism;

public class Driver {


	public void drive(Vehicle v) {
		if (v instanceof Bus) {
			Bus b = (Bus) v;
			b.checkFare();
		}
		v.run();
	}


}
