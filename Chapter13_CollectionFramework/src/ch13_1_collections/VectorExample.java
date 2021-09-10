package ch13_1_collections;

import java.util.*;

public class VectorExample {
	public static void main(String[] args) {
		
		List<Board> list = new Vector<>();

		list.add(new Board ("제목1","내용1","글쓴이1"));//인스턴스가 저장!!! new 해야함 
		list.add(new Board ("제목2","내용2","글쓴이2"));
		list.add(new Board ("제목3","내용3","글쓴이3"));
		list.add(new Board ("제목4","내용4","글쓴이4"));
		list.add(new Board ("제목5","내용5","글쓴이5"));

		
		System.out.println(list);
		System.out.println(list.get(2));
		
		//제목 3 삭제
		list.remove(2);
		
		//제목 5 삭제
		list.remove(3);

		for(int i =0; i<list.size(); i++) {
			
			//Board 객체 가져오기
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