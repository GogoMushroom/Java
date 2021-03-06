package chatting;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientController {
	public ClientController() {
		InetSocketAddress sockAddress = new InetSocketAddress("localhost", 9000);

		Socket socket = new Socket();

		Singleton s = Singleton.getInstance();

		s.client.sendBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
//				JOptionPane.showConfirmDialog(null, "test");
				if (!s.client.textField.getText().equals("")) {
					PrintWriter writer;
					try {
						writer = new PrintWriter(socket.getOutputStream());
						System.out.println("전송 문자열: ");
						String msg = s.client.textField.getText() + "\n";
//						s.client.area.append(msg);
						writer.println(msg);
						writer.flush();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}
			}
		});
		try {
			socket.connect(sockAddress, 10000);
			InetAddress inetAdddress;
			if ((inetAdddress = socket.getInetAddress()) != null) {
				s.client.textField.setText("서버 연결 성공 :" + inetAdddress);
			} else {
				s.client.textField.setText("서버 연결 실패");
			}
			new ReadThread(socket).start();

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}