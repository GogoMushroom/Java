package ch14_2_streamLib;

import java.util.*;
import java.io.*;


public class BoardUtil {

	List<Board> list;
	
	public BoardUtil() {
		list = new ArrayList<>();
	
		list.add(new Board(1,"����1", "����1", "�۾���1", new Date()));
		list.add(new Board(2,"����2", "����2", "�۾���2", new Date()));
		list.add(new Board(3,"����3", "����3", "�۾���3", new Date()));
		list.add(new Board(4,"����4", "����4", "�۾���4", new Date()));
		list.add(new Board(5,"����5", "����5", "�۾���5", new Date()));
		
	}
	//Board Ŭ���� ����ȭ
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
	
	//Board Ŭ���� �� ����ȭ
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