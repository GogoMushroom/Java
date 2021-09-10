package ch13_3_example;

import java.util.*;

public class LottoExample {
	
	//필드
	
	static final int MAX = 45;
	static final int COUNT = 6;
	

	public static void main(String[] args) {
		
		/*
		 * [로또번호 생성기}
		 * 중복저장되지않는 HashSet 이용
		 */
		
		//번호생성? MATH.random()
		//set 자료구조에 담기 
		
		Set<Integer> set = new HashSet<>(COUNT);
		
		int n = 0;
		while(set.size()<COUNT) { //6개가 되면 빠져나옴 
			n++;
			set.add((int)(Math.random()* MAX)+1 ); //1부터 45까지 랜덤 숫자를 set.add에 넣음
		}
		
		List<Integer> lotto = new LinkedList<>(set);
		
		Collections.sort(lotto);
		
		System.out.println(lotto+" "+n+"회"); //set읗 쓰면 중복검사를 할 필요가 없음 
		
	}
}
