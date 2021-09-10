package ch14_2_streamLib;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class NonBufferedVsBufferedExample {
	public static void main(String[] args) throws Exception {

		String originalFilePath1 =   // �⺻ ��Ʈ�� ����
				NonBufferedVsBufferedExample.class.getResource("originalFile1.png").getPath();
		//C:\Dev211\Studyjava\Chapter14_IOStream\bin\ch14_2_streamLib ���� �ּҴ� ���
		
		
		String targetFilePath1 = "C:/Temp/targetFile1.jpg";
		FileInputStream fis = new FileInputStream(originalFilePath1);
		FileOutputStream fos = new FileOutputStream(targetFilePath1);

		
		String originalFilePath2 = 	//���� ���� ��Ʈ�� ����
				NonBufferedVsBufferedExample.class.getResource("originalFile2.png").getPath();
		//C:\Dev211\Studyjava\Chapter14_IOStream\bin\ch14_2_streamLib
		
		
		String targetFilePath2 = "C:/Temp/targetFile2.jpg";
		FileInputStream fis2 = new FileInputStream(originalFilePath2);
		FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);

		long nonBufferTime = copy(fis,fos); //fis, fos �� �̿��� ����ð� ���� 
		System.out.println("���۸� ������� �ʾ��� ��:\t"+nonBufferTime+ "ns");

		long BufferTime = copy(fis,fos);
		System.out.println("���۸� ���������:\t\t"+BufferTime+ "ns");

		fis.close();
		fos.close();
		bis.close();
		bos.close();
	}

	static int data = -1;
	public static long copy (InputStream is , OutputStream os ) throws Exception {
		long start = System.nanoTime(); //���۽ð�����
		while (true) { // ���Ϻ��� ���������Ͽ��� ���� 1byte�� Ÿ�� ���Ϸ� �ٷ� ���
			data = is.read();
			if (data == -1)break;
			os.write(data);
		}
		os.flush();
		long end = System.nanoTime();//�� �ð� ����
		return (end-start); //���翡 �ɸ��ð� ���� 
	}
}
