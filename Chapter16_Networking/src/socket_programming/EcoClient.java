package socket_programming;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class EcoClient {
	public static void main(String[] args) throws Exception {
		
		Socket s  = new Socket("192.168.0.134" , 8111);
		System.out.println("서버연결완료");
		
		OutputStream out = s.getOutputStream();
		DataOutputStream dos = new DataOutputStream(out);
		
		//키보드로 입력
		Scanner sc = new Scanner (System.in);
		
		System.out.println("서버로 전송할 메세지를 입력해주세요.");
		
		while (true) {
			System.out.println(">");
			//입력값을 내보내기
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
		
		System.out.println("클라이언트 종료");
	}
}

