package ch13_1_collections;

import java.util.*;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();


		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");

		int size = set.size();
		System.out.println("총 객체수: " + size);


		//반복자를 이용한 루핑	
		Iterator<String> iterator = set.iterator();//반복자 얻기
		while(iterator.hasNext()){//객체 수 만큼 루핑
			String str = iterator.next(); //1개의 객체 가져옴
			System.out.println("\t"+ str);
		}
		iterator = set.iterator();// 작업이 끝나면 초기화하고 끝내기 

		set.remove("JDBC"); //1개의 객체 삭제 
		set.remove("iBATIS");//1개의 객체 삭제 

		System.out.println("총 객체수: " + set.size());  //저장된 객체 수 얻기


		//for문 루핑
		iterator = set.iterator(); //반복자얻기
		for(String element : set) { 
			System.out.println("\t"+ element); //객체수만큼 루핑
		}

		set.clear();  //모든객체 제거하고 비움 
		if( set.isEmpty()) { System.out.println("비어있음");}

	}
}
