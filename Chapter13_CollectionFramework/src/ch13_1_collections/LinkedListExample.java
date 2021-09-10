package ch13_1_collections;

import java.util.*;

public class LinkedListExample {
	public static void main(String[] args) {

		/*[LinkedList] implements List
		 * 
		 * ArrayList는 내부배열에 객체를 저장해서 관리하지만 
		 * LinkedList는 인접 참조를 링크해서 체인처럼 관리 
		 * 특정 인덱스의 객체를 삽입/삭제시 앞 뒤 링크만 변경되고
		 * 나머지 링크는 불변 (배열복사 불필요)
		 * 따라서 끝에서부터 순차적으로 추가/삭제하는 경우 ArrayList가 더 빠르고 
		 * 중간에 추가/삭제할경우 LinkedList 가 더 빠르다.
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
		System.out.println("ArrayList  걸린시간:" + (endTime-startTime) +"ns");

		startTime = System.nanoTime();

		for(int i =0; i<10000 ; i++){
			list2.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간:" + (endTime-startTime) +"ns");	

	}
}
