package socket_programming;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EcoServer {
	public static void main(String[] args) throws Exception {


		ServerSocket sv = new ServerSocket(8111);
		System.out.println("�����غ�Ϸ�");

		Socket s = sv.accept();
		System.out.println("Ŭ���̾�Ʈ ���� �Ϸ�");

		//Ŭ���̾�Ʈip�ּ�
		System.out.println(s.getInetAddress());

		//����ڰ� �Է��Ѱ� ��������

		InputStream in = s.getInputStream();
		DataInputStream dis = new DataInputStream(in);

		

		while (true) {
			//�Է��Ѱ� UTF�ΰ�����
			String userMsg = dis.readUTF();
			System.out.println("����� �޼���"+ userMsg);
			
			if (userMsg.equalsIgnoreCase("exit")) break;
		}

		//		
		//		OutputStream out = s.getOutputStream(); 
		//		DataOutputStream dos = new DataOutputStream(out);
		//		


		dis.close();
		in.close();

		s.close();
		sv.close();

		System.out.println("���� ����");

	}
}
