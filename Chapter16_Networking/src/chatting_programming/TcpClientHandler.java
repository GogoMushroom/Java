package chatting_programming;

import java.io.IOException;

/*
 * AppClient 소켓을 이용하여 
 * 서버의 송/수신 기능을 관리한다.
 * 
 */
public class TcpClientHandler implements Runnable {

	@Override
	public void run() {
		try {
			//서버로부터 메세지 수신
			String line = null;
			while(true) {
				line = AppClient.br.readLine();
				if (line != null) {
					System.out.println(line);
				}
			}
			
		}catch (Exception e ) {e.printStackTrace();
		}finally {
			try {
				if (AppClient.Keyboard != null) {AppClient.Keyboard.close();}
				if (AppClient.pw != null) {AppClient.pw.close();}
				if (AppClient.br != null) {AppClient.br.close();}
				if (AppClient.sSock != null) {AppClient.sSock.close();}
				
			}catch (Exception e) {e.printStackTrace();}
		}
	}
}
