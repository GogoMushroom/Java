package ch14_1_iostream;


import java.io.FileReader;
import java.io.Reader;

public class ReaderExample {
	public static void main(String[] args) throws Exception{
		
	
	String path = "C:/Temp/test7.txt";

	Reader rd = new FileReader(path);
	
	while (true) {
		int data = rd.read();
		if (data==-1)break;
		
		System.out.println((char)data);
	}
	rd.close();
}
}
