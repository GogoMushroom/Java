package ch14_2_streamLib;

import java.io.*;

public class DataInputOutputStreamExample {
	public static void main(String[] args) throws Exception{
		
		//����
		FileOutputStream fos = new FileOutputStream("C:/Temp/primitive.db");
		DataOutputStream dos = new DataOutputStream(fos);
		
		//DataOutputStream �� �ڷ����� �о �����Ϳ� �־��� 
		
		st1 s1= new st1();
		
		dos.writeUTF("ȫ�浿");
		dos.writeDouble(95.5);
		dos.writeInt(1);
		
		dos.writeUTF("���ڹ�");
		dos.writeDouble(90.3);
		dos.writeInt(2);
		
		dos.writeUTF(s1.name);
		dos.writeDouble(s1.score);
		dos.writeInt(s1.order);
		
		dos.flush();
		dos.close();
		
		//�б�
		FileInputStream fis = new FileInputStream("C:/Temp/primitive.db");
		DataInputStream dis = new DataInputStream(fis);
		
		//������ ������ 
		for(int i=0; i<3; i++) {
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			System.out.println("�̸�:"+name+"\t����:"+score+"\t ��ȣ:"+order);
		}
		dis.close();
		
	}
}

interface student{
	String name ="";
	Double score =0.0;
	int order =0;
	
}

class st1 implements student{
	String name ="����";
	Double score =99.9;
	int order =3;
}
