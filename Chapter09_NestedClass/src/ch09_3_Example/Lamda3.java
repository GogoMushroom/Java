//package ch09_3_Example;
//
//
//interface Readable{
//	void read(String s);
//}
//
//
//public class Lamda3 {
//	public static void main(String[] args) {
//		
////		
////		Readable r1 = new Readable() {//�͸� ��ü�� ���� �� 
////
////			@Override
////			public void read(String s) {
////				System.out.println("\"" + s+ "\"" +"�� (��) �д´�.");
////			}
////		}; 
//		
//		//���ٽ�
//		Readable r1 = 
//            (String s)->{System.out.println("\"" + s+ "\"" +"�� (��) �д´�.");}; 
//            //�Ű�����  -> ������
//			
//		r1.read("What is Lamda?");	
//	}
//}
