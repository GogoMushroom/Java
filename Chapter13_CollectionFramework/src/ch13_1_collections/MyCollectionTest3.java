package ch13_1_collections;

import com.libs.collection.MyListG;
import com.libs.collection.MySmartList;

class MyClass2{
	
}


public class MyCollectionTest3{
	public static void main(String[] args) {
		
		
		MyListG<String> list = new MySmartList<>();
 		
		
		list.add("1");
		list.add("3");
		list.add("★");
		System.out.println(list);
		System.out.println("list[2]의 값:" + list.get(2));
		System.out.println("size:" + list.size());
		System.out.println("=============================");
		
		list.add("kor");
		list.add("홍길동");
		list.add("a");
		list.add("a");
		
		
		MyListG<Integer> list2 = new MySmartList<>();
		list2.add(new Integer(100));
		list2.add(300); //오토박싱
		
		
		System.out.println(list2);
		System.out.println("list2[2]의 값:" + list2.get(2));
		System.out.println("size:" + list2.size());
		System.out.println("=============================");
	
		
		MyListG<Object> list3 = new MySmartList<>();
		list3.add("Hello");
		list3.add(11);
		list3.add(3.14f);
		list3.add('A');//오토박싱 
		list3.add(new Character('A'));
		list3.add(new MyClass2());//마이클래스를 list3에 저장 
		
		
		
		System.out.println(list3);
		System.out.println("list3[2]의 값:" + list3.get(2));
		System.out.println("size:" + list3.size());
		System.out.println("=============================");
		
	}
}
