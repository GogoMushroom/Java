package com.libs.collection;
/*
 * ���̺귯���� ���� ���� ����
 */

public class MyIntList {

	//�ʵ�
	//��Ҹ� ������ �迭 
	private int[] arr;
	
	//���� �迭�� �� ���� 
	private int capacity;
	
	//�÷� �� �迭�� �뷮
	private final int amount;
	
	
	//�迭����� ������ġ
	private int cursor; 
	
	//������
	public MyIntList(int amount) {
		this.amount = amount;
		this.capacity = this.amount;
		this.arr = new int[capacity];
		cursor =0;
	}
	
	
	//�޼ҵ�
	
	//����߰� 
	public void add(int num) { 
		//���� �뷮�� ��ġ���� �ʰ��ϴ��� ���ǰ˻�
	if (capacity <= cursor) {
		//�迭������� 
		//���ο� �迭 ���� 
		int[]  tempArr = new int[capacity+amount];
		//��Һ���
//		for (int i =0 ; i<arr.length;i++) {
//			tempArr[i]= arr[i];
//		}
		System.arraycopy(arr, 0, tempArr, 0, arr.length);
		//���� ���� 
		arr= tempArr;
		
		//�迭 �뷮 ������Ʈ  
		capacity += amount; 
		
		
	}
		arr[cursor++]  = num; 
	}
	
	//��Ҿ��
	public int get(int idx) {
		return arr[idx];
	} 
    //��Ұ��� 
	public int size() {
		return cursor;
	}
	
	
	//��� ���
	@Override
	public String toString() {
		String tmp = "";
		for (int i : arr) {
			tmp += i + ", ";
		}
		return "[" + tmp + "]";
	}

	//��һ���
	public void remove(int idx) {
		//�����ϰ��� �ϴ� �ε����� �������̸� 0 ���� �ʱ�ȭ�Ѵ�.
		if (idx == cursor -1) {
		System.arraycopy(arr, idx+1, arr, idx, (cursor-1)- idx);
			//�迭�� ó��
		}
		//������ �������ʱ�ȭ 
			arr[cursor -1] =0;
		
		//������ġ�缳��
		cursor--;
	}

	//����ʱ�ȭ
	public void clear() {
		arr = new int[amount];
		capacity = amount;
		cursor = 0;
		
		
	}
}
