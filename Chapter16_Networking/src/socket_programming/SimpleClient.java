package socket_programming;


import java.io.InputStream;
import java.net.Socket;
import java.util.Arrays;

public class SimpleClient {
	public static void main(String[] args) throws Exception {
		
		Socket s  = new Socket("192.168.226.1" , 8888);
		System.out.println("��������Ϸ�");
		
		InputStream in = s.getInputStream();
		byte[ ]buff = new byte[10];
		in.read(buff);
		
		System.out.println(Arrays.toString(buff));
		
		in.close();
		s.close();
		
		System.out.println("Ŭ���̾�Ʈ ����");
	}
}
