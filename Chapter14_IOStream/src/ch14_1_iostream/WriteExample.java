package ch14_1_iostream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
	public static void main(String[] args) throws IOException {
		
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		String path = "C:/Temp/test1.db";
		OutputStream os = new FileOutputStream (path);
	

		os.write(a);
		os.write(b);
		os.write(c);
		
		os.flush();
		os.close();
		
		
	}
}
