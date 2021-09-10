package socket_programming;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient2 {
	public static void main(String[] args) throws Exception {
		
		Socket s  = new Socket("192.168.0.134" , 8111);
		System.out.println("��������Ϸ�");
		
		//������ ���� 
		OutputStream out = s.getOutputStream();
		DataOutputStream dos = new DataOutputStream(out);
		
		//������ ���� 
		InputStream in = s.getInputStream();
		DataInputStream dis = new DataInputStream(in);
		
		
		
		//Ű����� �Է�
		Scanner sc = new Scanner (System.in);
		
		System.out.println("������ ������ �޼����� �Է����ּ���.");
		
		while (true) {
			System.out.println(">");
			//�Է°��� ��������
			String sendMsg = sc.nextLine();
			dos.writeUTF(sendMsg);
			dos.flush();
			
			String readMsg = dis.readUTF();
			System.out.println("����>" + readMsg);
			
			if (sendMsg.equalsIgnoreCase("exit")) {
				break;
			
				
			}
		}


		dos.close();
		sc.close();
		s.close();  
		
		System.out.println("Ŭ���̾�Ʈ ����");
	}
}

