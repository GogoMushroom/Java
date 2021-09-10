package com.libs.collection;

public class MySmartList<E> implements MyListG<E>{


	//�ʵ弱��

	//�ʵ�
	//��Ҹ� ������ �迭 
	private Object[] elementData;

	//���� �迭�� �� ���� 
	private int capacity;

	//�÷� �� �迭�� �뷮
	private final int amount=3;

	//�迭����� ������ġ
	private int cursor; 

	//������
	MySmartList(int amount) {
		this.capacity =amount;
		elementData = new Object[capacity];
		cursor =0;
	}

	public MySmartList() {
		this(3);
	}
	//�޼ҵ�

	@Override
	public void add(E e) {
		//���� �뷮�� ��ġ���� �ʰ��ϴ��� ���ǰ˻�
		if (capacity <= cursor) {
			//�迭������� 
			//���ο� �迭 ���� 
			Object[]  tempArr = new Object[capacity+amount];
			System.arraycopy(elementData, 0, tempArr, 0, elementData.length);
			//���� ���� 
			elementData= tempArr;

			//�迭 �뷮 ������Ʈ  
			capacity += amount; 

		}
		elementData[cursor++] =e;
	}

	@Override
	public void remove(int idx) {
		// TODO Auto-generated method stub
		//�����ϰ��� �ϴ� �ε����� �������̸� 0 ���� �ʱ�ȭ�Ѵ�.
		if (idx == cursor -1) {
			System.arraycopy(elementData, idx+1, elementData, idx, (cursor-1)- idx);
			//�迭�� ó��
		}
		//������ �������ʱ�ȭ 
		elementData[cursor -1] =0;

		//������ġ�缳��
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

	//��� ���
	@Override
	public String toString() {
		String tmp = "";
		for (Object e : elementData) {
			tmp += e + ", ";
		}
		return "[" + tmp + "]";
	}
}