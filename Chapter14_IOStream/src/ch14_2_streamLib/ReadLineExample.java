package ch14_2_streamLib;

import java.io.FileReader;
import java.io.*;

public class ReadLineExample {
	public static void main(String[] args) {

		try {
			Reader r = new FileReader( //문자기반 입력 스트림 얻기
					//"language.txt"의 경로를 가져오는거임
					ReadLineExample.class.getResource("language.txt").getPath());
			BufferedReader br = new BufferedReader(r);//br 보조스트림 연결 

			while (true) {
				String data = br.readLine(); //라인단위 문자열을 읽고 리턴 
				if(data==null) break; // 파일끝에 도달한 경우 
				System.out.println(data);
			}
			br.close();
		}catch(Exception e) {}	
	}
}
