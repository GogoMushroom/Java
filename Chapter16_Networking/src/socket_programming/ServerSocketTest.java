package socket_programming;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketTest {
	public static void main(String[] args) {
		
		
		try {
			ServerSocket sS = new ServerSocket(9998);
			
			System.out.println("Ŭ���̾�Ʈ ���� �����...");
			Socket clientSocket = sS.accept(); //Ŭ���̾�Ʈ ���� ��� ���°� ��
			
			System.out.println("-->");
			System.out.println("����Ǿ����ϴ�." + clientSocket);
			
			clientSocket.close();
			sS.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
