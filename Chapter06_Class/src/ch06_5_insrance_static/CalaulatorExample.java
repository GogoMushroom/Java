package ch06_5_insrance_static;

public class CalaulatorExample{

	
	
	public static void main(String[] args) {

		Calaulator c = new Calaulator();
		
		
		
		int i = c.speed;//인스턴스 필드를 사용하려면 호출해주고 사용해여함  
		
		
		double return1 = 10 * 10 * Calaulator.pi;
		int result2 = Calaulator.plus(10, 5);
		int result3 = Calaulator.minus(10, 5);

	}
}

