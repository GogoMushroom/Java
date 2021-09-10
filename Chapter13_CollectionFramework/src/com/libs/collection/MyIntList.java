package com.libs.collection;
/*
 * 라이브러리에 대한 내용 적기
 */

public class MyIntList {

	//필드
	//요소를 저장할 배열 
	private int[] arr;
	
	//현제 배열의 총 길이 
	private int capacity;
	
	//늘려 줄 배열의 용량
	private final int amount;
	
	
	//배열요소의 현제위치
	private int cursor; 
	
	//생성자
	public MyIntList(int amount) {
		this.amount = amount;
		this.capacity = this.amount;
		this.arr = new int[capacity];
		cursor =0;
	}
	
	
	//메소드
	
	//요소추가 
	public void add(int num) { 
		//현제 용량을 위치값이 초과하는지 조건검사
	if (capacity <= cursor) {
		//배열복사수행 
		//새로운 배열 생성 
		int[]  tempArr = new int[capacity+amount];
		//요소복사
//		for (int i =0 ; i<arr.length;i++) {
//			tempArr[i]= arr[i];
//		}
		System.arraycopy(arr, 0, tempArr, 0, arr.length);
		//참조 변경 
		arr= tempArr;
		
		//배열 용량 업데이트  
		capacity += amount; 
		
		
	}
		arr[cursor++]  = num; 
	}
	
	//요소얻기
	public int get(int idx) {
		return arr[idx];
	} 
    //요소개수 
	public int size() {
		return cursor;
	}
	
	
	//요소 출력
	@Override
	public String toString() {
		String tmp = "";
		for (int i : arr) {
			tmp += i + ", ";
		}
		return "[" + tmp + "]";
	}

	//요소삭제
	public void remove(int idx) {
		//삭제하고자 하는 인덱스가 마지막이면 0 으로 초기화한다.
		if (idx == cursor -1) {
		System.arraycopy(arr, idx+1, arr, idx, (cursor-1)- idx);
			//배열의 처리
		}
		//마지막 데이터초기화 
			arr[cursor -1] =0;
		
		//현제위치재설정
		cursor--;
	}

	//요소초기화
	public void clear() {
		arr = new int[amount];
		capacity = amount;
		cursor = 0;
		
		
	}
}
