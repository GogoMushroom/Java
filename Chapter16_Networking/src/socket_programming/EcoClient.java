package socket_programming;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class EcoClient {
	public static void main(String[] args) throws Exception {
		
		Socket s  = new Socket("192.168.0.134" , 8111);
		System.out.println("��������Ϸ�");
		
		OutputStream out = s.getOutputStream();
		DataOutputStream dos = new DataOutputStream(out);
		
		//Ű����� �Է�
		Scanner sc = new Scanner (System.in);
		
		System.out.println("������ ������ �޼����� �Է����ּ���.");
		
		while (true) {
			System.out.println(">");
			//�Է°��� ��������
			String msg = sc.nextLine();
			dos.writeUTF(msg);
			dos.flush();
		
			if (msg.equalsIgnoreCase("exit")) {
				break;
			}
		}

//		InputStream in = s.getInputStream();
//		DataInputStream dis = new DataInputStream(in);
//		
	
		dos.close();
		sc.close();
		s.close();  
		
		System.out.println("Ŭ���̾�Ʈ ����");
	}
}

