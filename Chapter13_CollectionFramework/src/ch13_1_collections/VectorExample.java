package ch13_1_collections;

import java.util.*;

public class VectorExample {
	public static void main(String[] args) {
		
		List<Board> list = new Vector<>();

		list.add(new Board ("����1","����1","�۾���1"));//�ν��Ͻ��� ����!!! new �ؾ��� 
		list.add(new Board ("����2","����2","�۾���2"));
		list.add(new Board ("����3","����3","�۾���3"));
		list.add(new Board ("����4","����4","�۾���4"));
		list.add(new Board ("����5","����5","�۾���5"));

		
		System.out.println(list);
		System.out.println(list.get(2));
		
		//���� 3 ����
		list.remove(2);
		
		//���� 5 ����
		list.remove(3);

		for(int i =0; i<list.size(); i++) {
			
			//Board ��ü ��������
			Board b = list.get(i);
			System.out.println(b.subject+"\t" +b.content + "\t" +b.writer);
		}
	}
}


class Board{
	String subject;
	String content;
	String writer;

	public Board(String subject,String content,String writer) {
		this.subject= subject;
		this.content =content;
		this.writer = writer;
	}

}