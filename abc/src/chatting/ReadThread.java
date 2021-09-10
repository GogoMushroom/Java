package chatting;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReadThread extends Thread {
	// Ŭ���̾�Ʈ���� �ޱ⸸ �ϸ� �ȴ�.

	Socket socket;

	public ReadThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		super.run();
		while (true) {
			try {
				BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

				Singleton s = Singleton.getInstance();
				String str = reader.readLine();
				System.out.println("������ ���� ���� �޽��� " + str);
				s.client.area.append(str + "\n");
//				s.client.area
				
				Thread.sleep(300);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}