package chatting_programming;

import java.io.IOException;

/*
 * AppClient ������ �̿��Ͽ� 
 * ������ ��/���� ����� �����Ѵ�.
 * 
 */
public class TcpClientHandler implements Runnable {

	@Override
	public void run() {
		try {
			//�����κ��� �޼��� ����
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
