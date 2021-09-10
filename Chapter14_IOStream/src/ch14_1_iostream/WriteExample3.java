package ch14_1_iostream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample3 {
	public static void main(String[] args) throws IOException {
		
		
		String path = "C:/Temp/test2.db";
		OutputStream os = new FileOutputStream (path);
	
		byte[] array = {10,20,30};
		
		os.write(array);
		
		os.flush();
		os.close();
		
		
	}
}
