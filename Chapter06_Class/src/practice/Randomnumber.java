package practice;

public class Randomnumber {
	public static void main(String[] args) {
		//50�� �ݺ�
	
		for (int i = 0 ; i < 50 ; i++) {
			int var  = (int)(Math.random()*100) +1;
			
			
			//¦���Ǻ�
			if (var %2 ==0) {
				System.out.println(var+",");
			}
				
			
		}	
	}
}
