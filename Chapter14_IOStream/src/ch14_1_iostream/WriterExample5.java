package ch14_1_iostream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample5 {
	public static void main(String[] args) throws IOException {
		Writer writer = new FileWriter("C:/Temp/test9.txt");
		

		char [] array = {'A','B','C','D','E'};
		
		
		writer.write(array,1,3); //배열의 1번 인덱스부터 3개 출력
	
		writer.flush();
		writer.close();
				
		
	}
}
