package com.libs.collection;

public class MySmartList<E> implements MyListG<E>{


	//필드선언

	//필드
	//요소를 저장할 배열 
	private Object[] elementData;

	//현제 배열의 총 길이 
	private int capacity;

	//늘려 줄 배열의 용량
	private final int amount=3;

	//배열요소의 현제위치
	private int cursor; 

	//생성자
	MySmartList(int amount) {
		this.capacity =amount;
		elementData = new Object[capacity];
		cursor =0;
	}

	public MySmartList() {
		this(3);
	}
	//메소드

	@Override
	public void add(E e) {
		//현제 용량을 위치값이 초과하는지 조건검사
		if (capacity <= cursor) {
			//배열복사수행 
			//새로운 배열 생성 
			Object[]  tempArr = new Object[capacity+amount];
			System.arraycopy(elementData, 0, tempArr, 0, elementData.length);
			//참조 변경 
			elementData= tempArr;

			//배열 용량 업데이트  
			capacity += amount; 

		}
		elementData[cursor++] =e;
	}

	@Override
	public void remove(int idx) {
		// TODO Auto-generated method stub
		//삭제하고자 하는 인덱스가 마지막이면 0 으로 초기화한다.
		if (idx == cursor -1) {
			System.arraycopy(elementData, idx+1, elementData, idx, (cursor-1)- idx);
			//배열의 처리
		}
		//마지막 데이터초기화 
		elementData[cursor -1] =0;

		//현제위치재설정
		cursor--;
	}

	@Override
	public E get(int idx) {
		return (E) elementData[idx];

	}

	@Override
	public int size() {
		return cursor;
	}


	@Override
	public void clear() {
		// TODO Auto-generated method stub
		elementData = new Object[amount];
		capacity = amount;
		cursor = 0;

	}

	//요소 출력
	@Override
	public String toString() {
		String tmp = "";
		for (Object e : elementData) {
			tmp += e + ", ";
		}
		return "[" + tmp + "]";
	}
}