package ftp_programming;

import java.io.BufferedReader;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;


public class FileClient {
	
	public static final String IP = "localhost";
	//public static final String IP = "127.0.0.1";
	public static final int PORT = 10001;
	
	public static void main(String[] args) throws Exception{
		
		Socket socket = new Socket(IP,PORT);
		
		InputStream in = socket.getInputStream();
		InputStreamReader inr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(inr);
		
		DataInputStream din = new DataInputStream(in);
		FileOutputStream fout = null;
		
		while (true) {
			//파일 이름 수신
			String strline = br.readLine();
			String strlen = br.readLine();
			
			if (strline==null) break;
			System.out.println(strline + " 파일 수신중...");
			System.out.println("파일 크기:" + strlen + ")");
			
			String path = "C:/Temp/Download/" + strline;
			fout = new FileOutputStream(path);
			
			int cnt =0;
			for(int i=0; i<Integer.parseInt(strlen); i++) {
				//파일수신
				int data = din.read();
				//파일쓰기
				fout.write(data);
				
				if (cnt % 3000==0) {
					System.out.println("■");
					cnt++;
				}
			}
			System.out.println("완료\n");
		}
		fout.close();
		din.close();
		br.close();
		socket.close();
		
		System.out.println();
		System.out.println(" 파일 요청 프로그램을 종료합니다.");
		
	}

}
