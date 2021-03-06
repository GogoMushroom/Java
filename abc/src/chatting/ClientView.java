package chatting;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClientView extends JFrame {
	JLabel statusLabel;

	JTextArea area;

	JTextField textField;

	JButton sendBtn;

	public ClientView() {
		super("채팅 프로그램");
		setLayout(null);
		area = new JTextArea();
		area.setLineWrap(true);

		JScrollPane scrPane = new JScrollPane(area);

		scrPane.setPreferredSize(new Dimension(400, 300));

		textField = new JTextField();
		sendBtn = new JButton("전송");

		statusLabel = new JLabel("온라인 접속 상태");

		statusLabel.setBounds(20, 10, 200, 30);

		area.setBounds(80, 40, 300, 600);
		textField.setBounds(80, 700, 200, 40);
		sendBtn.setBounds(300, 700, 80, 40);

		add(scrPane);
		add(area);
		add(textField);
		add(sendBtn);

		setSize(1200, 800);
		setLocation(100, 0);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}