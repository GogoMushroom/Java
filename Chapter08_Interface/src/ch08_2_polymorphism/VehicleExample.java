package ch08_2_polymorphism;

public class VehicleExample {
	public static void main(String[] args) {
		
		Driver d = new Driver();
		
		Bus b = new Bus();
		Taxi t = new Taxi();
		
		d.drive(b);
		d.drive(t);
	}
	}
//		Vehicle v = new Bus();
//		
//		v.run();
//		//vehicle,checjfare();
//		
//		Bus b = (Bus) v;
//	b.run();
//	b.checkFare();
//	
//	}
//}
