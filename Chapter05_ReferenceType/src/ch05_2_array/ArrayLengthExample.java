package ch05_2_array;

public class ArrayLengthExample {
	public static void main(String[] args) {

//		int [] scores ;
//		scores = new int[] {83,90,87};
		int[] scores = new int[8];
		
		scores[0] = 34;
		
		
		int sum = 0;

		for(int i=0 ; i < scores.length; i++) {
			sum+= scores[i]	;			
		}

		System.out.println("ÃÑÇÕ:"+ sum);

		double avg = (double)sum / scores.length;
		System.out.println("Æò±Õ:" + avg);
	}
}