package ch04_2_for;

public class ForMultiplicationTabExample {
	public static void main(String[] args) {
		//		for (int m=2; m<=9; m++) {  //¹Ù±ùÂÊ for¹®
		//			System.out.println("***" + m + "´Ü ***");
		//			for (int n=1; n<=9; n++) {  //ÁßÃ¸ for¹® 
		//				System.out.println(m + "x" + n + "=" + (m+n));
		//			}
		//		}
		//	}
		//}

		for (int i=1; i<10 ; i++) { //´Ü Ãâ·Â
			for (int j=1; j<10 ; j++) { //9¹ø *j++
				System.out.printf("%d x %d = %d\n", i,j,i*j);
//				System.out.printf("%d x %d = %d\t", i,j,i*j);	// \t ÁÙ¹Ù²ÞÇÏÁö¾Ê°í ¶ç¾î¾²±â 	
			} 
			System.out.println();   // ÇÑÁÙ ¶ç±â
//			System.out.printf("****%d´Ü****\n" , i);   // ÇÑÁÙ ¶ç±â
		}		
	}		
}