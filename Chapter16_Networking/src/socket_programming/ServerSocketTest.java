package socket_programming;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketTest {
	public static void main(String[] args) {
		
		
		try {
			ServerSocket sS = new ServerSocket(9998);
			
			System.out.println("클라이언트 연결 대기중...");
			Socket clientSocket = sS.accept(); //클라이언트 연결 대기 상태가 됨
			
			System.out.println("-->");
			System.out.println("연결되었습니다." + clientSocket);
			
			clientSocket.close();
			sS.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
