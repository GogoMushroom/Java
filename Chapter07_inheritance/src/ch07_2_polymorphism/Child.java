package ch07_2_polymorphism;

public class Child extends Parent{
	@Override
	public void method2() {
		System.out.println("Child method2()");
	}
	
	private void method3() {
		System.out.println("Child method()");
	}
	public Child(String charactor) {
		super (charactor);
	}
	@Override
	public void act() {
		super.act();

	}
}
