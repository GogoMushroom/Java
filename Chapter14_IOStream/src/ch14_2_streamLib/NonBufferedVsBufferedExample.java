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

		String originalFilePath1 =   // 기본 스트림 생성
				NonBufferedVsBufferedExample.class.getResource("originalFile1.png").getPath();
		//C:\Dev211\Studyjava\Chapter14_IOStream\bin\ch14_2_streamLib 지금 주소는 요기
		
		
		String targetFilePath1 = "C:/Temp/targetFile1.jpg";
		FileInputStream fis = new FileInputStream(originalFilePath1);
		FileOutputStream fos = new FileOutputStream(targetFilePath1);

		
		String originalFilePath2 = 	//버퍼 보조 스트림 연결
				NonBufferedVsBufferedExample.class.getResource("originalFile2.png").getPath();
		//C:\Dev211\Studyjava\Chapter14_IOStream\bin\ch14_2_streamLib
		
		
		String targetFilePath2 = "C:/Temp/targetFile2.jpg";
		FileInputStream fis2 = new FileInputStream(originalFilePath2);
		FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);

		long nonBufferTime = copy(fis,fos); //fis, fos 를 이용한 복사시간 측정 
		System.out.println("버퍼를 사용하지 않았을 때:\t"+nonBufferTime+ "ns");

		long BufferTime = copy(fis,fos);
		System.out.println("버퍼를 사용했을때:\t\t"+BufferTime+ "ns");

		fis.close();
		fos.close();
		bis.close();
		bos.close();
	}

	static int data = -1;
	public static long copy (InputStream is , OutputStream os ) throws Exception {
		long start = System.nanoTime(); //시작시간저장
		while (true) { // 파일복사 워ㄴ본파일에서 읽은 1byte를 타깃 파일로 바로 출력
			data = is.read();
			if (data == -1)break;
			os.write(data);
		}
		os.flush();
		long end = System.nanoTime();//끝 시간 저장
		return (end-start); //복사에 걸린시간 저장 
	}
}
