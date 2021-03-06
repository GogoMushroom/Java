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
	
	//서버 ip주소 
	
	public static String sAddr = null;
	
	//클라이언트 id
	private String id = null;
	
	/*
	 * 어플리케이션 초기화 
	 */
	@Override
	public void init() {
		super.init();
	}
	
	
	
	/*
	 * 어플리케이션 실행
	 */
	@Override
	public void start() {
		
		System.out.println(TcpApplication.timeStamp());
		System.out.println("TCP/IP 클라이언트프로그램 시작합니다.");
		System.out.println("CLIENT START>>>");
		
		try {
			//1.서버연결
			System.out.println(TcpApplication.timeStamp()
					+ "서버에 연결중...");
			
			sSock = new Socket(TcpApplication.IP,TcpApplication.PORT);
			sAddr = sSock.getInetAddress().getHostAddress();
			System.out.println(TcpApplication.timeStamp() +sAddr +"<- connected");
			
			// 1. 송신 스트림 얻기
			pw =new PrintWriter(
				new OutputStreamWriter(
				sSock.getOutputStream())); 

						//2. 수신 스트림 얻기
			br = new BufferedReader(
				 new InputStreamReader(
				 sSock.getInputStream()));
			
			//2.3 키보드 수신 스트림 얻기
			Keyboard = new BufferedReader(
						new InputStreamReader(System.in));
			
			
			//3.클라이언트의 id를 전송한다 
			System.out.println("아이디 입력 > ");
			id = Keyboard.readLine();
			pw.println(id);
			pw.flush();
			
			//4.접속한 서버의 데이터 수신을 담당할 스레드를 생성하여 실행 
			Thread thread = new Thread(new TcpClientHandler());
			thread.start();
			
			
			//5.키보드전달
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

	
	
	
	

