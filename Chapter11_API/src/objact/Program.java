package objact;

import bit_camp_common.BizNegativeNumberException;
import bit_camp_common.BizThousandOverException;
import bit_camp_common.Calculator;


class MyClass{
	
}


public class Program {
	public static void main(String[] args) {		
	
		
		Object o1 = new MyClass();
		
		int var = 1;
		System.out.println(var);
		
		Integer var2 = new Integer("1");
		System.out.println(var2.intValue());
		
		

		try {
			Calculator.add(10000, 0);
		} catch (BizThousandOverException e){
			System.out.println(e.toString());
		}catch(BizNegativeNumberException e ) {
			System.out.println(e.toString());

		}
	}
}