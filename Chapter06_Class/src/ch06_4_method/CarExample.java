package ch06_4_method;

public class CarExample {
	public static void main(String[] args) throws InterruptedException {
	
		Car myCar = new Car();
		
		myCar.setGas(5); //car�� setGas()�޼ҵ� ȣ�� 
		
		boolean gasState = myCar.isLeftGas(); //Car�� isLeftGas()�޼ҵ� ȣ�� 
		if(gasState) {
			System.out.println("����մϴ�.");
			myCar.run(); //Car�� run() �޼ҵ� ȣ�� 
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("������ ������ �ʿ䰡 �����ϴ�.");
			
		} else {
			System.out.println("������ �����Ͻÿ�.");
		}
	}
}
