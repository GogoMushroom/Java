package ftp_programming;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

/*[���� ���� ���α׷���]
 * 1. Ŭ���̾�Ʈ�� Ư���� ���ϸ��� ������ ��û�Ѵ�.
 * 2. ������ Ŭ���̾�Ʈ�� ��û�� ������ ã�´�.
 * 3. ��û�� ������ ã���� ���� ( ���ҽ�������) ���� �����͸� �о� ���δ�.
 * 4. �о� �� ������ �����͸� Ŭ���̾�Ʈ���� �����Ѵ�.
 * 5. Ŭ���̾�Ʈ�� ���� ������ ������ ȭ�鿡 ����ϰ� �����Ѵ�.
 *  
 */

public class FTPServer {

	private static final int PORT = 8888;
	public static void main(String[] args) {

		System.out.println();

		//�ʵ� 
		//����½�Ʈ�� 
		InputStream in = null;//�ʱ�ȭ 
		OutputStream out = null;
		DataInputStream din = null;
		DataOutputStream dout = null;
		FileInputStream fin = null;

		//����
		ServerSocket serverSoc = null;
		Socket 		 clientSoc = null;

		//ȣ��Ʈ�ּ� 	
		String 		clientAddr = null;

		/*
		 * Ŭ���̾�Ʈ ���� ��� �� ���ϻ���
		 * ���� / �۽� 
		 */
		try {
			serverSoc = new ServerSocket(PORT);
			System.out.println(timeStamp() + "Ŭ���̾�Ʈ ������ ������Դϴ�.");
			System.out.println();

			//���� ����
			clientSoc = serverSoc.accept();

			//���� 
			clientAddr = clientSoc.getInetAddress().getHostName();
			System.out.println(timeStamp() + clientAddr + " <- connected");

			// ���� (in) : Ŭ���̾�Ʈ�� ���� ���� �� 
			//�⺻ �Է½�Ʈ������ ��ǲ�������� �����ϰ� ���⼭ �ڷ����� ���ü��ִ� ��Ʈ���� ����
			in = clientSoc.getInputStream();
			din = new DataInputStream(in);


			// �۽�(out) : �����ҽ����� �� ������ Ŭ���̾�Ʈ���� ����
			out = clientSoc.getOutputStream();
			dout = new DataOutputStream(out);


			//�ܰ�1. ����ڰ� ���� ������ �ʿ�� �ϴ��� �ľ� 
			String fileName = din.readUTF();

			//�ܰ�2. ���� �����͸� ã�Ƴ��� �����͸� �д´�.
			//������ �о���� ��Ʈ�� = FileInputStream
			fin = new FileInputStream("resources\\"+fileName);

			//�ܰ�3. ���� �����͸� �а� �����͸� ������.
			System.out.println("������ ������ ��....");
			System.out.println();
			while (true) {
				//�б�
				int data = fin.read();
				if (data == -1) break;//���� Ȥ�� ���� ���� �����ϸ� -1 �� �� 

				//����
				dout.write(data);

			}


		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (din != null) {din.close();}
				if (dout != null) {dout.close();}
				if (clientSoc != null) {clientSoc.close();}
				if (serverSoc != null) {serverSoc.close();}

			} catch (IOException e) {e.printStackTrace();}
		}
		System.out.println("�������� ���񽺸� ���� �մϴ�.");
	}


	/*
	 * ���� �ð��� �������ִ� �޼ҵ� 
	 * ��ȯŸ�� : String
	 */
	private static String timeStamp() {
		SimpleDateFormat format = new  SimpleDateFormat("[hh:mm:ss]");
		return format.format(new Date());
	}

}
