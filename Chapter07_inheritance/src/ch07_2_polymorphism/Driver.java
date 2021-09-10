package ch07_2_polymorphism;

public class Driver {
	public void drive (Vehicle v) { //has 소유관계 필드에서 사용한다 
		v.run();       //Vehicle 자료형을 사용해줘야함
	}
}
