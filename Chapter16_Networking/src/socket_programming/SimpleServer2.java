package socket_programming;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer2 {
	public static void main(String[] args) throws Exception {
		
		String str = "^~^";
		
		
		ServerSocket sv = new ServerSocket(8888);
		System.out.println("�����غ�Ϸ�");
		
		Socket s = sv.accept();
		System.out.println("Ŭ���̾�Ʈ ���� �Ϸ�");
		
		//Ŭ���̾�Ʈip�ּ�
		System.out.println(s.getInetAddress());
		
		OutputStream out = s.getOutputStream(); 
		DataOutputStream dos = new DataOutputStream(out);
		
		

		dos.writeUTF(str); //���ڵ� �ؼ� �����ٴ� �� ^^
		dos.close();
		out.close();
		
		s.close();
		sv.close();
		
		System.out.println("���� ����");
		
	}
}
