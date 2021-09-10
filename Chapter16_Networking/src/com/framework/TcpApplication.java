package com.framework;

import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;


/*
 * ���������� ������ �о���
 * 
 */
public abstract class TcpApplication {

	
	
	
	/*
	 *���ø����̼ǿ� �ʿ��� �ʵ� ����  
	 */
	public static String IP;
	public static int PORT;
	public static String CONFIG = "config/applicationtext.ini";

	/*
	 * ���ø����̼� �ʱ�ȭ  
	 */
	public void init() {
		//���������ͷκ��� �ʿ��� �׸��� ���� 
		Properties settings = new Properties();

		try {
			settings.load(new FileInputStream(CONFIG));
			IP = settings.getProperty("IP");
			PORT = Integer.parseInt(settings.getProperty("PORT"));

			System.out.println("IPAddress : "+ IP);
			System.out.println("Port      : "+ PORT);

			System.out.println(TcpApplication.timeStamp() );

		}catch (Exception e) {
			System.out.println("�������� (applicationtext.ini)�� ã�� �� �����ϴ�.");
			System.out.println("���α׷��� �����մϴ�.");
			System.exit(0);
		}


	}
	/*
	 * ����Ŭ�������� �ݵ�� �������̵��� �߻�޼���
	 */
	public abstract void start();

	public static String timeStamp() {
		SimpleDateFormat format = new  SimpleDateFormat("[hh:mm:ss]");
		return format.format(new Date());


	}
}

