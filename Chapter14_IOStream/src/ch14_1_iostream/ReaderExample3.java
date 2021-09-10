package ch14_1_iostream;


import java.io.FileReader;
import java.io.Reader;

public class ReaderExample3 {
	public static void main(String[] args) throws Exception{


		String path = "C:/Temp/test8.txt";

		Reader rd = new FileReader(path);

		char[] buffer = new char[100];

		while (true) {
			int readCharNum = rd.read(buffer);
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
