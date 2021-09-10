package socket_programming;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer2 {
	public static void main(String[] args) throws Exception {
		
		String str = "^~^";
		
		
		ServerSocket sv = new ServerSocket(8888);
		System.out.println("서버준비완료");
		
		Socket s = sv.accept();
		System.out.println("클라이언트 연결 완료");
		
		//클라이언트ip주소
		System.out.println(s.getInetAddress());
		
		OutputStream out = s.getOutputStream(); 
		DataOutputStream dos = new DataOutputStream(out);
		
		

		dos.writeUTF(str); //인코딩 해서 보낸다는 뜻 ^^
		dos.close();
		out.close();
		
		s.close();
		sv.close();
		
		System.out.println("서버 종료");
		
	}
}
