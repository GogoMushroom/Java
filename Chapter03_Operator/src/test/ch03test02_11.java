package test;
import java.util.Scanner;
public class ch03test02_11 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("���̵�");
		String name = scanner.nextLine();

		System.out.println("�н�����");
		String strPassword = scanner.nextLine();

		if(name.equals("java")){
			
			if (strPassword.equals("12345"))	{ 
				
/*
 *  equals�� == �� ������ 
 *  == �� �ּҰ��� ���ϰ� equals�� ������ü�� ���Ѵ�. 
 *  ���ڿ��� ���Ҷ��� equals�� ����ؾ��ϰ� 
 *  == �� ����Ϸ��� int�� ����������
 *  
 *  				
 */

				System.out.println("�α��� ����");

			} else {
				System.out.println("�α��� ���� : �н����尡 Ʋ��");
			}
	
	} else {        
		System.out.println("�α��� ���� : ���̵� �������� ����");
	}
}
}


