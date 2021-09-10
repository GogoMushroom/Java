package ch14_1_iostream;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {
	public static void main(String[] args) throws Exception {
		//데이터 출발지를 "C:/Temp/test2.db" 로 하는 바이트 기반 파일입력 시스템 생성
		InputStream is = new FileInputStream("C:/Temp/test2.db");

		byte[]buffer = new byte[100]; //길이 100짜리 배열 생성
 
		while (true) {
			int readByteNum = is.read(buffer); //배열길이만큼 읽기
			if (readByteNum == -1) break; //파일끝에도달 하면 break
			for(int i=0; i<readByteNum;i++) {//읽은 바이트수만큼 반복하면서 
				System.out.println(buffer[i]); //배열에 저장괸 바이트 출력
			}
		}
		is.close();//입력스트림을 닫음
	}
}
