package ch14_1_iostream;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample2 {
	public static void main(String[] args) throws Exception {
		//데이터 출발지를 "C:/Temp/test1.db" 로 하는 바이트 기반 파일입력 시스템 생성
		InputStream is = new FileInputStream("C:/Temp/test1.db");
		
		
		while (true) {
			int data = is.read(); //1byte씩 읽기
			if (data == -1) break; //파일끝에도달 하면 break
			System.out.println(data);
		}
		is.close();//입력스트림을 닫음
	}
}
	