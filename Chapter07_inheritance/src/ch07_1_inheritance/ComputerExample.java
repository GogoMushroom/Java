package ch07_1_inheritance;

public class ComputerExample {
	public static void main(String[] args) {
		int r = 10;
		
		Calculator cc = new Calculator();
		System.out.println("원면적 " + cc.areaCircle(r));
		System.out.println();
		
		Computer cp = new Computer();
		System.out.println("원면적 " + cp.areaCircle(r));
		
	 
	}
}
