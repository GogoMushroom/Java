package ch14_1_iostream;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {
	public static void main(String[] args) throws Exception {
		//������ ������� "C:/Temp/test2.db" �� �ϴ� ����Ʈ ��� �����Է� �ý��� ����
		InputStream is = new FileInputStream("C:/Temp/test2.db");

		byte[]buffer = new byte[100]; //���� 100¥�� �迭 ����
 
		while (true) {
			int readByteNum = is.read(buffer); //�迭���̸�ŭ �б�
			if (readByteNum == -1) break; //���ϳ������� �ϸ� break
			for(int i=0; i<readByteNum;i++) {//���� ����Ʈ����ŭ �ݺ��ϸ鼭 
				System.out.println(buffer[i]); //�迭�� ���屭 ����Ʈ ���
			}
		}
		is.close();//�Է½�Ʈ���� ����
	}
}
