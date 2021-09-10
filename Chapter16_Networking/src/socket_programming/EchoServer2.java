package socket_programming;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer2 {
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

		// �Է��ϴ� ��Ʈ��
		OutputStream out = s.getOutputStream(); 
		DataOutputStream dos = new DataOutputStream(out);


		while (true) {
			//�Է��Ѱ� UTF�ΰ�����
			String userMsg = dis.readUTF();
			System.out.println("����� �޼���"+ userMsg);

			if (userMsg.equalsIgnoreCase("exit")) break;
			
			//�����޼����� �ٽ� ���� 
			dos.writeUTF(userMsg);
			dos.flush();
			//
			
		
		}

		dis.close();
		in.close();

		s.close();
		sv.close();

		System.out.println("���� ����");

	}
}
