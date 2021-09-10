package practice;

import java.util.Arrays;

public class ArrayExample4 {
	public static void main(String[] args) {
		int[] iArr1 = new int [10];
		int[] iArr2 = new int [10];
//		int[] iArr3 = new int []{100,95,80,70,60}; 둘다가능
		int[] iArr3 = {100,95,80,70,60};
		char[] chArr = {'a','b','c','d'};
		
		
		for (int i=0 ; i< iArr1.length; i++) {
			iArr1[i] = i + 1; //1~10 숫자를 순서대로 배열 
			//	i 는 0~9 i+1 = 1 ....i+9 = 10			
		}
		for (int i=0 ; i< iArr2.length; i++) {
			iArr2[i] = (int)(Math.random()*10) + 1;
// iArr에 저장된[i]의 숫자 = 렌덤한 숫자 0부터 9까지의 수 +1
		}
		// 배열에 저장된 숫자를 출력한다.
		for(int i=0; i < iArr1.length; i++) {
			System.out.print(iArr1[i]+ ",");
		}
		System.out.println();
		
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3);
		System.out.println(chArr);
		}
		
	}

