package Wildernessr;

import java.util.Properties;
import java.util.Scanner;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class SendEmail {
	public static void mail() throws MessagingException{
		ReservationFix r = new ReservationFix();
		Scanner sc = new Scanner(System.in);

		System.out.println("���� �ּҸ� �Է����ּ���");
		String mailadress = sc.nextLine();
		System.out.println("��� ��ٷ� �ּ���");
		// ���� ���� ����
		String host = "smtp.gmail.com";
		String username = "yoonzi1003@gmail.com";
		String password = "hjhww0801";

		// ���� ����
		String recipient = mailadress;
		String subject = "�װ� ���� ���� �Դϴ�.";
		String body = "==============================\n"+r.totalPlaneInfo()+"\n==============================";

		//properties ����
		Properties props = new Properties();
		props.put("mail.smtps.auth", "true");
		// ���� ����
		Session session = Session.getDefaultInstance(props);
		MimeMessage msg = new MimeMessage(session);

		// ���� ����
		msg.setSubject(subject);
		msg.setText(body);
		msg.setFrom(new InternetAddress(username));
		msg.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient));

		// �߼� ó��
		Transport transport = session.getTransport("smtps");
		transport.connect(host, username, password);
		transport.sendMessage(msg, msg.getAllRecipients());
		transport.close();    

		System.out.println("�߼��� �Ϸ����ϴ�.");
	}



}
