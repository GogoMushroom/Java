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
	
		// ���� ���� ����
		
		String host = "smtp.gmail.com";
		System.out.println("������ �Է��� �ּ���(GMAIL)");
		String username = sc.nextLine();
		System.out.println("��й�ȣ�� �Է��� �ּ���");
		String password = sc.nextLine();

		// ���� ����
		String recipient = mailadress;
		String subject = "�װ� ���� ���� �Դϴ�.";
		int size = 0;

        String body = "";
        FileInputStream input = null;
        try{
            // ȭ�鿡 ǥ���ϰ��� �ϴ� ������ �����Ѵ�.
            File file = new File("C:\\Temp\\Q&A.txt");
             
            // FileInputStream �� File object�� ������ �μ��� ���� �� �ִ�.         
            input = new FileInputStream(file);
            int i = 0;
            while((i = input.read()) != -1) {
            	 byte[ ] readBuffer = new byte[ input.available( ) ];
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try{
                // ������ InputStream Object�� �ݾ��ش�.
                input.close();
            } catch(IOException io) {}
        }	
        
        System.out.println("body2============" + body);



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
