package com.libs.collection;
/*
 * 자료구조구현을 위한 메고드 규격을 정의한 인터페이스 작성 
 */
public interface MyListG<E> {
//인터페이스로 만들기 
//추상 메소드가 들어가있음 
	public abstract void add(E element);
	public abstract E get(int idx);
	public abstract int size();
	public abstract void remove (int idx);
	public abstract void clear();
	
	
}
                    