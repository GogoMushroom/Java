package ch09_3_Example;


interface Readable{
	void read(String s);
}


public class Lamda4 {
	public static void main(String[] args) {
		
		//���ٽ�
		Readable r1 = 
            (s)->{System.out.println("\"" + s+ "\"" +"�� (��) �д´�.");}; 
            //�Ű�����  -> ������
			
		r1.read("What is Lamda?");	
	}
}

