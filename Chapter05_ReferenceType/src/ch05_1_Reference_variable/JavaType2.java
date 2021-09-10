package ch05_1_Reference_variable;

public class JavaType2 {
	public static void main(String[] args) {
		
		int iv = 10;
		double dv = 10.0;
		
		System.out.println(iv);
		System.out.println(dv);
		
		//1차원 배열 생성 
		
		
		//int arr =   int 형 변수 선언
		int [] ar0 = new int [2];  //int형 1차원 배열 선언 
		int [] ar1 = new int [3];
		int [] ar2 = new int [2];
		
		ar1[2]=3;//---> 1차원배열에서 넣어준 값 
		
		 for (int i=0 ; i<ar1.length; i++) {
			 
		 }
		 
		
		System.out.println(ar0);
		System.out.println(ar1);
		System.out.println(ar2);
		
		//int 형 1차원 3개 를 가지고있는 2차원 배열생성
		
		int[][] arrs= new int [3][]; //2차원 배열 선언 
		arrs[0] = ar0;
		arrs[1] = ar1;
		arrs[2] = ar2;
//		arrs[1][2] = 3; 
		for (int i=0;i<arrs.length; i++) {
			for (int j=0; j<arrs[i].length; j++) {
				
				
				System.out.print(arrs[i][j]+",");
			}
			}
		System.out.println();
		for(int[] elements :arrs) {
			for(int e : elements) {
				System.out.print(e+",");
			}
		}
		
		}
		
	//	int [][] arrs ={ar0,ar1,ar2};
		
		
		
		
		
		
 		
		
	}
	
	

