package ch14_2_streamLib;

import java.io.FileReader;
import java.io.*;

public class ReadLineExample {
	public static void main(String[] args) {

		try {
			Reader r = new FileReader( //���ڱ�� �Է� ��Ʈ�� ���
					//"language.txt"�� ��θ� �������°���
					ReadLineExample.class.getResource("language.txt").getPath());
			BufferedReader br = new BufferedReader(r);//br ������Ʈ�� ���� 

			while (true) {
				String data = br.readLine(); //���δ��� ���ڿ��� �а� ���� 
				if(data==null) break; // ���ϳ��� ������ ��� 
				System.out.println(data);
			}
			br.close();
		}catch(Exception e) {}	
	}
}
