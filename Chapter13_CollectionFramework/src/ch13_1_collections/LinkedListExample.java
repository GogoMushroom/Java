package ch13_1_collections;

import java.util.*;

public class LinkedListExample {
	public static void main(String[] args) {

		/*[LinkedList] implements List
		 * 
		 * ArrayList�� ���ι迭�� ��ü�� �����ؼ� ���������� 
		 * LinkedList�� ���� ������ ��ũ�ؼ� ü��ó�� ���� 
		 * Ư�� �ε����� ��ü�� ����/������ �� �� ��ũ�� ����ǰ�
		 * ������ ��ũ�� �Һ� (�迭���� ���ʿ�)
		 * ���� ���������� ���������� �߰�/�����ϴ� ��� ArrayList�� �� ������ 
		 * �߰��� �߰�/�����Ұ�� LinkedList �� �� ������.
		 */
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();

		long startTime;
		long endTime;

		startTime = System.nanoTime();
		for(int i =0; i<10000 ; i++){
			list1.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList  �ɸ��ð�:" + (endTime-startTime) +"ns");

		startTime = System.nanoTime();

		for(int i =0; i<10000 ; i++){
			list2.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList �ɸ��ð�:" + (endTime-startTime) +"ns");	

	}
}
