package chatting_programming;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import com.framework.TcpApplication;

public class AppClient extends TcpApplication{

	public static PrintWriter pw = null;
	public static BufferedReader Keyboard = null;
	public static BufferedReader br = null;
	public static Socket sSock = null;
	
	//���� ip�ּ� 
	
	public static String sAddr = null;
	
	//Ŭ���̾�Ʈ id
	private String id = null;
	
	/*
	 * ���ø����̼� �ʱ�ȭ 
	 */
	@Override
	public void init() {
		super.init();
	}
	
	
	
	/*
	 * ���ø����̼� ����
	 */
	@Override
	public void start() {
		
		System.out.println(TcpApplication.timeStamp());
		System.out.println("TCP/IP Ŭ���̾�Ʈ���α׷� �����մϴ�.");
		System.out.println("CLIENT START>>>");
		
		try {
			//1.��������
			System.out.println(TcpApplication.timeStamp()
					+ "������ ������...");
			
			sSock = new Socket(TcpApplication.IP,TcpApplication.PORT);
			sAddr = sSock.getInetAddress().getHostAddress();
			System.out.println(TcpApplication.timeStamp() +sAddr +"<- connected");
			
			// 1. �۽� ��Ʈ�� ���
			pw =new PrintWriter(
				new OutputStreamWriter(
				sSock.getOutputStream())); 

						//2. ���� ��Ʈ�� ���
			br = new BufferedReader(
				 new InputStreamReader(
				 sSock.getInputStream()));
			
			//2.3 Ű���� ���� ��Ʈ�� ���
			Keyboard = new BufferedReader(
						new InputStreamReader(System.in));
			
			
			//3.Ŭ���̾�Ʈ�� id�� �����Ѵ� 
			System.out.println("���̵� �Է� > ");
			id = Keyboard.readLine();
			pw.println(id);
			pw.flush();
			
			//4.������ ������ ������ ������ ����� �����带 �����Ͽ� ���� 
			Thread thread = new Thread(new TcpClientHandler());
			thread.start();
			
			
			//5.Ű��������
			String line = null;
			while((line = Keyboard.readLine())!=null) {
				pw.println(line);
				pw.flush();
				if ( line.equalsIgnoreCase("/quit")) {
					break;}
			}
		
		}catch(IOException e) {e.printStackTrace();}
		}
	}

	
	
	
	

