package ch14_2_streamLib;

import java.io.*;

public class CharacterConvertStrreamExample {
	public static void main(String[] args) throws Exception{
	
		write("���� ��ȯ ��Ʈ���� ����մϴ�.");
		String data = read();
		System.out.println(data);
	
	}
	
	public static void write(String str) throws Exception {
		FileOutputStream fos  = new FileOutputStream("C:/Temp/test1.txt");
		Writer w = new OutputStreamWriter(fos);
		w.write(str);
		w.flush();
		w.close();
		
	}
	public static String read() throws Exception {
	FileInputStream fis = new FileInputStream("C:/Temp/test1.txt");
	Reader r = new InputStreamReader(fis);
	char [] buffer = new char[100];
	int readCharNum = r.read(buffer);
	r.close();
	String data = new String(buffer,0,readCharNum);
	return data;
}
}