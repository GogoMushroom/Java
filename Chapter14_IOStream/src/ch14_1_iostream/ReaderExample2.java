package ch14_1_iostream;


import java.io.FileReader;
import java.io.Reader;

public class ReaderExample2 {
	public static void main(String[] args) throws Exception{


		String path = "C:/Temp/test9.txt";

		Reader rd = new FileReader(path);

		char[] buffer = new char[5];

		while (true) {
			int readCharNum = rd.read(buffer,2,3);
			System.out.println(readCharNum);
 
			if (readCharNum==-1)break;
			System.out.println(readCharNum);

			for (int i=0; i<readCharNum; i++) {
				System.out.println(buffer[i]);
			}
		}
		rd.close();
	}
}
