package ch14_1_iostream;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample2 {
	public static void main(String[] args) throws Exception {
		//������ ������� "C:/Temp/test1.db" �� �ϴ� ����Ʈ ��� �����Է� �ý��� ����
		InputStream is = new FileInputStream("C:/Temp/test1.db");
		
		
		while (true) {
			int data = is.read(); //1byte�� �б�
			if (data == -1) break; //���ϳ������� �ϸ� break
			System.out.println(data);
		}
		is.close();//�Է½�Ʈ���� ����
	}
}
	