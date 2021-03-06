package ect;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
 class SendEmail2 {
	 void mail() throws MessagingException, IOException{
		
		
	

		Scanner sc = new Scanner(System.in);

		
		String mailadress ="yoonzi1003@gmail.com";
	
		// 메일 관련 정보
		
		String host = "smtp.gmail.com";
		System.out.println("메일을 입력해 주세요(GMAIL)");
		String username = sc.nextLine();
		System.out.println("비밀번호를 입력해 주세요");
		String password = sc.nextLine();

		// 메일 내용
		String recipient = mailadress;
		String subject = "항공 예약 정보 입니다.";
		int size = 0;

        String body = "";
        FileInputStream input = null;
        try{
            // 화면에 표시하고자 하는 파일을 선택한다.
            File file = new File("C:\\Temp\\Q&A.txt");
             
            // FileInputStream 는 File object를 생성자 인수로 받을 수 있다.         
            input = new FileInputStream(file);
            int i = 0;
            while((i = input.read()) != -1) {
            	 byte[ ] readBuffer = new byte[ input.available( ) ];
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try{
                // 생성된 InputStream Object를 닫아준다.
                input.close();
            } catch(IOException io) {}
        }	
        
        System.out.println("body2============" + body);



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

