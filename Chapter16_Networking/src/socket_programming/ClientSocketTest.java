package socket_programming;

import java.net.Socket;

public class ClientSocketTest {
	public static void main(String[] args) {
		
		try { 
			Socket sc= new Socket("localhost",9888);
			System.out.println("����Ǿ����ϴ�." + sc);
			sc.close();
			
		}catch (Exception e) {}
		
	}
}
