package chatting;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReadThread extends Thread {
	// 클라이언트단은 받기만 하면 된다.

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
				System.out.println("서버로 부터 받은 메시지 " + str);
				s.client.area.append(str + "\n");
//				s.client.area
				
				Thread.sleep(300);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}