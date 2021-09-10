package ch13_1_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

class MyClass {}
public class CollectionEx {
	public static void main(String[] args) {
		
		//값을 저장하는 배열 
		
		int[] arr1 = new int[3];
		arr1[0]=1;
		System.out.println(arr1);//arr1의 번지가 출력됨 
		System.out.println(Arrays.toString(arr1));
		System.out.println(arr1[0]);
		
		
		//번지를 저장하는 배열
		MyClass[] arr2 = new MyClass[3];//MyClass 방 3칸= arr2
		arr2[0]= new MyClass();//첫번째방에 넣음 
		System.out.println(Arrays.toString(arr2));
		System.out.println(arr2[0]);// 주소값
		System.out.println(arr2[1]);// 배열저장안하면 기본값 null
		
		
		//배열의 한계....8ㅅ8
		
		//Collection 자료구조 등장
		
		List<String> list1 = new ArrayList<>();
		list1.add("kor");
		list1.add("1");
		
		System.out.println(list1);
		
		//int 같은 기본형 타입은 안됨 int를 사용하려면 class화 시겨서 써야함 (wrapper)
		List<Integer> list2 = new ArrayList<>();
		list2.add(new Integer(1)); //박싱 
		list2.add(1); //오토박싱
		System.out.println(list2);
		System.out.println(list2.get(1)); //언박싱
		
		List<Character> list3 =new Vector<>();
		list3.add('e');
		list3.add('f');
		System.out.println(list3);
		
		List<Float> list4 =new LinkedList<>();
		list4.add(0.1f); list4.add(1.1f);
		System.out.println(list4);

		List<Double> list5 = new LinkedList<>();
		list5.add(0.1);
		list5.add(0.1);
		list5.add(0.1);
		System.out.println(list5);
		
		Set<Double> set = new HashSet<>();
		set.add(0.1);
		set.add(0.1);
		set.add(0.1);
		System.out.println(set);//중복안됨
	
		Map<Integer,String> map = new HashMap<>();
		map.put(211, "강남");
		map.put(201, "종로");
		System.out.println(map);
		
	}
}
