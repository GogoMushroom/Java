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
		System.out.println("�� ��ü��: " + size);


		//�ݺ��ڸ� �̿��� ����	
		Iterator<String> iterator = set.iterator();//�ݺ��� ���
		while(iterator.hasNext()){//��ü �� ��ŭ ����
			String str = iterator.next(); //1���� ��ü ������
			System.out.println("\t"+ str);
		}
		iterator = set.iterator();// �۾��� ������ �ʱ�ȭ�ϰ� ������ 

		set.remove("JDBC"); //1���� ��ü ���� 
		set.remove("iBATIS");//1���� ��ü ���� 

		System.out.println("�� ��ü��: " + set.size());  //����� ��ü �� ���


		//for�� ����
		iterator = set.iterator(); //�ݺ��ھ��
		for(String element : set) { 
			System.out.println("\t"+ element); //��ü����ŭ ����
		}

		set.clear();  //��簴ü �����ϰ� ��� 
		if( set.isEmpty()) { System.out.println("�������");}

	}
}
