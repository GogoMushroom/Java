package com.libs.collection;
/*
 * �ڷᱸ�������� ���� �ް�� �԰��� ������ �������̽� �ۼ� 
 */
public interface MyListG<E> {
//�������̽��� ����� 
//�߻� �޼ҵ尡 ������ 
	public abstract void add(E element);
	public abstract E get(int idx);
	public abstract int size();
	public abstract void remove (int idx);
	public abstract void clear();
	
	
}
                    