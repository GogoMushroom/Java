package string;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "¾È³çÇÏ¼¼¿ä";

		byte[] byte1 = str.getBytes();
		System.out.println("byte1.length:" + byte1.length);
		String str1 = new String (byte1);
		System.out.println("byte1->String:" + str1);

		try {
			byte[] byte2 = str.getBytes("EUC-KR");
			System.out.println("byte2.length:" + byte2.length);
			String str2 = new String (byte1,"EUC-KR");
			System.out.println("byte2->String:" + str2);


			byte[] byte3 = str.getBytes("UTF-8");
			System.out.println("byte3.length:" + byte3.length);
			String str3 = new String (byte3,"UTF-8");
			System.out.println("byte3->String:" + str3);

		}catch(UnsupportedOperationException e) {
			e.printStackTrace();
		}
	}
}
