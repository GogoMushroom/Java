package practice;

import java.util.Arrays;

public class ArrayExample3 {
	public static void main(String[] args) {
		int [] iArr = {100,95,80,70,60};
		//iArr.length = 5
		System.out.println(iArr);
		//[I@15db9742 �� ��µ� i=int @=��ġ 15db9742=�ּ�
		// �迭 ���� ��µ����� ���� 
		char[] chArr = {'a','b','c','d'};
		System.out.println(chArr); 
		//abcd �� ������ �ȴ� 
		//ĳ���� �迭�� ��쿡�� ����� ���ڸ� ������ش�
		
		//�迭�� ��Ҹ� �ϳ��� ����ϰ� ������ for���� ����ؾ��� 
		
		for (int i=0 ; i<iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		// Arrays Ŭ������ toString�޼ҵ带 ����ϸ� ���ٷ� ���� ����� �� �ִ�.
		//import �־���� ctrl + shift + o
		System.out.println(Arrays.toString(iArr));
		
		
		
		
		
	}
}
