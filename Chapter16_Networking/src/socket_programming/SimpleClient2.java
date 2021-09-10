package socket_programming;


import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class SimpleClient2 {
	public static void main(String[] args) throws Exception {
		
		Socket s  = new Socket("192.168.226.1" , 8888);
		System.out.println("서버연결완료");
		
		InputStream in = s.getInputStream();
		DataInputStream dis = new DataInputStream(in);
		
	
		String message = dis.readUTF();
		System.out.println("------받은 메세지------\n|\t"+message+"\t  |\n-------------------");
		
		
		dis.close();
		s.close();  
		
		System.out.println("클라이언트 종료");
	}
}
