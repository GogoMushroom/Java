package ch08_2_polymorphism;

public class Bus implements Vehicle {
@Override
public void run() {
	System.out.println("버스가달린다");
	
}

public void checkFare() {
	System.out.println("승차요금체크");
	
}
}
