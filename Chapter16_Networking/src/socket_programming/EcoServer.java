package socket_programming;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EcoServer {
	public static void main(String[] args) throws Exception {


		ServerSocket sv = new ServerSocket(8111);
		System.out.println("서버준비완료");

		Socket s = sv.accept();
		System.out.println("클라이언트 연결 완료");

		//클라이언트ip주소
		System.out.println(s.getInetAddress());

		//사용자가 입력한걸 가져오기

		InputStream in = s.getInputStream();
		DataInputStream dis = new DataInputStream(in);

		

		while (true) {
			//입력한거 UTF로가져옴
			String userMsg = dis.readUTF();
			System.out.println("사용자 메세지"+ userMsg);
			
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

		System.out.println("서버 종료");

	}
}
