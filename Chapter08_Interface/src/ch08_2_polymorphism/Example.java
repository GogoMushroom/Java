package ch08_2_polymorphism;

interface  InterfaceA {
	public void methodA();
}
interface  InterfaceB {
	public void methodB();
}
interface  InterfaceC extends InterfaceA, InterfaceB{
//	public void methodA();
//	public void methodB();
	public void methodC ();
}

class ImplementationC implements InterfaceC {
	@Override
	public void methodA() {
		System.out.println("ImplementationC-methodA() 실행");
		
	}
	@Override
	public void methodB() {
		System.out.println("ImplementationC-methodB() 실행");	
		
	}
	@Override
	public void methodC() {
		System.out.println("ImplementationC-methodC() 실행");	
	}
	
}

public class Example {
	public static void main(String[] args) {
		
		ImplementationC impl = new ImplementationC();
		
		
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println();
		
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
		
		
	}
}
