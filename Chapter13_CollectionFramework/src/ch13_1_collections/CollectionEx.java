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
		
		//���� �����ϴ� �迭 
		
		int[] arr1 = new int[3];
		arr1[0]=1;
		System.out.println(arr1);//arr1�� ������ ��µ� 
		System.out.println(Arrays.toString(arr1));
		System.out.println(arr1[0]);
		
		
		//������ �����ϴ� �迭
		MyClass[] arr2 = new MyClass[3];//MyClass �� 3ĭ= arr2
		arr2[0]= new MyClass();//ù��°�濡 ���� 
		System.out.println(Arrays.toString(arr2));
		System.out.println(arr2[0]);// �ּҰ�
		System.out.println(arr2[1]);// �迭������ϸ� �⺻�� null
		
		
		//�迭�� �Ѱ�....8��8
		
		//Collection �ڷᱸ�� ����
		
		List<String> list1 = new ArrayList<>();
		list1.add("kor");
		list1.add("1");
		
		System.out.println(list1);
		
		//int ���� �⺻�� Ÿ���� �ȵ� int�� ����Ϸ��� classȭ �ðܼ� ����� (wrapper)
		List<Integer> list2 = new ArrayList<>();
		list2.add(new Integer(1)); //�ڽ� 
		list2.add(1); //����ڽ�
		System.out.println(list2);
		System.out.println(list2.get(1)); //��ڽ�
		
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
		System.out.println(set);//�ߺ��ȵ�
	
		Map<Integer,String> map = new HashMap<>();
		map.put(211, "����");
		map.put(201, "����");
		System.out.println(map);
		
	}
}
