package string;

import java.io.IOException;

public class KeyboardToStringExample {
	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];//���� ����Ʈ�� �����ϱ� ���� �迭 ���� 
		
		
		try {
		System.out.println("�Է�:");
		int readByteNo = System.in.read(bytes);//�迭�� ���� ����Ʈ�� �����ϰ� ���� ����Ʈ ���� ����
		
		String str = new String(bytes , 0 , readByteNo-2);//�迭�� ���ڿ��� ��ȯ //-2�� \r�� \n�� ���ڿ��� ���� �ʿ䰡 ���� ����
		System.out.println(str);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
