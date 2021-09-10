package practice;

import java.util.Arrays;

public class ArrayExample3 {
	public static void main(String[] args) {
		int [] iArr = {100,95,80,70,60};
		//iArr.length = 5
		System.out.println(iArr);
		//[I@15db9742 가 출력됨 i=int @=위치 15db9742=주소
		// 배열 값이 출력되지는 않음 
		char[] chArr = {'a','b','c','d'};
		System.out.println(chArr); 
		//abcd 가 츨력이 된다 
		//캐릭터 배열인 경우에만 저장된 문자를 출력해준다
		
		//배열의 요소를 하나싹 출력하고 싶으면 for문을 사용해야함 
		
		for (int i=0 ; i<iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		// Arrays 클래스의 toString메소드를 사용하면 한줄로 쉽게 출력할 수 있다.
		//import 있어야함 ctrl + shift + o
		System.out.println(Arrays.toString(iArr));
		
		
		
		
		
	}
}
