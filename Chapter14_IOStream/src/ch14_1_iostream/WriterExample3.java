package ch14_1_iostream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample3 {
	public static void main(String[] args) throws IOException {
		Writer writer = new FileWriter("C:/Temp/test10.txt");
		

		String str = "ABCDEF";
		
		
		writer.write(str ,0,2); //�迭�� 0�� �ε������� 2�� ���
	
		writer.flush();
		writer.close();
				
		
	}
}
