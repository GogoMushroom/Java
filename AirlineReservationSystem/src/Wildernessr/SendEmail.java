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

		System.out.println("메일 주소를 입력해주세요");
		String mailadress = sc.nextLine();
		System.out.println("잠시 기다려 주세요");
		// 메일 관련 정보
		String host = "smtp.gmail.com";
		String username = "yoonzi1003@gmail.com";
		String password = "hjhww0801";

		// 메일 내용
		String recipient = mailadress;
		String subject = "항공 예약 정보 입니다.";
		String body = "==============================\n"+r.totalPlaneInfo()+"\n==============================";

		//properties 설정
		Properties props = new Properties();
		props.put("mail.smtps.auth", "true");
		// 메일 세션
		Session session = Session.getDefaultInstance(props);
		MimeMessage msg = new MimeMessage(session);

		// 메일 관련
		msg.setSubject(subject);
		msg.setText(body);
		msg.setFrom(new InternetAddress(username));
		msg.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient));

		// 발송 처리
		Transport transport = session.getTransport("smtps");
		transport.connect(host, username, password);
		transport.sendMessage(msg, msg.getAllRecipients());
		transport.close();    

		System.out.println("발송이 완료됬습니다.");
	}



}

