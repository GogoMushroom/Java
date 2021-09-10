package ch14_2_streamLib;

import java.util.*;
import java.io.*;


public class BoardUtil {

	List<Board> list;
	
	public BoardUtil() {
		list = new ArrayList<>();
	
		list.add(new Board(1,"제목1", "내용1", "글쓴이1", new Date()));
		list.add(new Board(2,"제목2", "내용2", "글쓴이2", new Date()));
		list.add(new Board(3,"제목3", "내용3", "글쓴이3", new Date()));
		list.add(new Board(4,"제목4", "내용4", "글쓴이4", new Date()));
		list.add(new Board(5,"제목5", "내용5", "글쓴이5", new Date()));
		
	}
	//Board 클래스 직렬화
	public void write() {
		String path = "C:/Temp/boardClass.db";
		try {
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(list);
			
			oos.flush();
			oos.close();
		}catch (Exception e) {}
		
	}
	
	//Board 클래스 역 직렬화
	public List<Board> read() throws Exception{
		String path = "C:/Temp/boardClass.db";
		try {
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			List<Board> list = (List<Board>)ois.readObject();
			ois.close();
			
		}catch (Exception e) {e.printStackTrace();
	} return list;
	
	}
	
}
