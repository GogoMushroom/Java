package socket_programming;


import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class SimpleClient2 {
	public static void main(String[] args) throws Exception {
		
		Socket s  = new Socket("192.168.226.1" , 8888);
		System.out.println("��������Ϸ�");
		
		InputStream in = s.getInputStream();
		DataInputStream dis = new DataInputStream(in);
		
	
		String message = dis.readUTF();
		System.out.println("------���� �޼���------\n|\t"+message+"\t  |\n-------------------");
		
		
		dis.close();
		s.close();  
		
		System.out.println("Ŭ���̾�Ʈ ����");
	}
}
