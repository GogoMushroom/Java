package ch13_1_collections;

import com.libs.collection.MyIntList;
import com.libs.collection.MyList;
import com.libs.collection.MySmartList;

public class MyCollectionTest2{
	public static void main(String[] args) {
		
		
		
		
		//자료구조이름
		MyIntList list = new MyIntList(3);
		
		list.add(1);
		list.add(3);
		list.add(5);
		
		
		//ArrayIndexOutOfBoundsException 해결하기
		list.add(7);
	
		//삭제 해결하기
		//[1,3,5]-> [1,5]
		list.remove(2);
		
		// |0|0|0| 
		list.clear();
		
		
		System.out.println(list);
		System.out.println("list[2]의 값:" + list.get(2));
		System.out.println("size:" + list.size());
		System.out.println("=============================");
		System.out.println(list);
	}
}
