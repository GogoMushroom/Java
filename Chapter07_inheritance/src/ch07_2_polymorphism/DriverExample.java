package ch07_2_polymorphism;

public class DriverExample {
	public static void main(String[] args) {
		  
		Driver d= new Driver(); //드라이버 객체 만듬 
		
		Bus bus = new Bus(); //버스 객체 만듬 
		//vehicle 형을 상속받은 bus 자료형의 객체 생성
		Taxi taxi = new Taxi(); //택시 객체 만듬 
		
		d.drive(bus); //drive 는 Vehicle 자료형을 사용해줘야 하는데  bus 는 Bus 자료형임 
		// 하지만 Bus는 Vehicle을 상속받은 클래스 이기 때문에 Vehicle대신 Bus 자료형을 사용해도된다. 
		//d.drive((Vehicle)new b()); 이랑같은말임
		d.drive(taxi);
		
		
		
		Vehicle v = new Bus();
	}
}
