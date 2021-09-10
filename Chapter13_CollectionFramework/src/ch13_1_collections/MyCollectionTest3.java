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
		list.add("��");
		System.out.println(list);
		System.out.println("list[2]�� ��:" + list.get(2));
		System.out.println("size:" + list.size());
		System.out.println("=============================");
		
		list.add("kor");
		list.add("ȫ�浿");
		list.add("a");
		list.add("a");
		
		
		MyListG<Integer> list2 = new MySmartList<>();
		list2.add(new Integer(100));
		list2.add(300); //����ڽ�
		
		
		System.out.println(list2);
		System.out.println("list2[2]�� ��:" + list2.get(2));
		System.out.println("size:" + list2.size());
		System.out.println("=============================");
	
		
		MyListG<Object> list3 = new MySmartList<>();
		list3.add("Hello");
		list3.add(11);
		list3.add(3.14f);
		list3.add('A');//����ڽ� 
		list3.add(new Character('A'));
		list3.add(new MyClass2());//����Ŭ������ list3�� ���� 
		
		
		
		System.out.println(list3);
		System.out.println("list3[2]�� ��:" + list3.get(2));
		System.out.println("size:" + list3.size());
		System.out.println("=============================");
		
	}
}
