package ch14_2_streamLib;

import java.io.*;

public class DataInputOutputStreamExample {
	public static void main(String[] args) throws Exception{
		
		//쓰기
		FileOutputStream fos = new FileOutputStream("C:/Temp/primitive.db");
		DataOutputStream dos = new DataOutputStream(fos);
		
		//DataOutputStream 각 자료형을 읽어서 데이터에 넣어줌 
		
		st1 s1= new st1();
		
		dos.writeUTF("홍길동");
		dos.writeDouble(95.5);
		dos.writeInt(1);
		
		dos.writeUTF("김자바");
		dos.writeDouble(90.3);
		dos.writeInt(2);
		
		dos.writeUTF(s1.name);
		dos.writeDouble(s1.score);
		dos.writeInt(s1.order);
		
		dos.flush();
		dos.close();
		
		//읽기
		FileInputStream fis = new FileInputStream("C:/Temp/primitive.db");
		DataInputStream dis = new DataInputStream(fis);
		
		//스팩을 정리함 
		for(int i=0; i<3; i++) {
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			System.out.println("이름:"+name+"\t점수:"+score+"\t 번호:"+order);
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
	String name ="지윤";
	Double score =99.9;
	int order =3;
}
