package practice;

public class ArrayExample {
	public static void main(String[] args) {
////		int [] score; // 1. 배열score을 선언(참조변수)
////		score = new int[5]; // 2. 배열을 생성 (int 저장공간 x5)
////		
//		int []score = new int[5]; //선언과 생성을 한번에
//		score[3] = 100;
//		System.out.println("score[0]=" + score[0]);
//		System.out.println("score[1]=" + score[1]);
//		System.out.println("score[2]=" + score[2]);
//		System.out.println("score[3]=" + score[3]);
//		System.out.println("score[4]=" + score[4]);
//			
//		
//		int value = score[3];
//		System.out.println(value);
//	}
//}
		int [] score = new int[6];
		for ( int i=0 ; i <6; i++)
			System.out.println(score[i]);
	}
}