package socket_programming;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
	public static void main(String[] args) throws Exception {
		
		ServerSocket sv = new ServerSocket(8888);
		System.out.println("�����غ�Ϸ�");
		
		Socket s = sv.accept();
		System.out.println("Ŭ���̾�Ʈ ���� �Ϸ�");
		
		System.out.println(s.getInetAddress());
		
		
		byte[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		OutputStream out = s.getOutputStream(); 
		
		out.write(arr);
		out.flush();
		out.close();
		
		s.close();
		sv.close();
		
		System.out.println("���� ����");
		
	}
}
