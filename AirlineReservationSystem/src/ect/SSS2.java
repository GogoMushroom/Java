package ect;

import java.util.Scanner;

public class SSS2 {
	static int price = 0;
	
	Scanner sc = new Scanner(System.in);
	static String Go = "���� �������� �ʾҽ��ϴ�.";
	static String Back = "���� �������� �ʾҽ��ϴ�.";

	//������ �����	
	//����� ������ price �� ����ȴ�.
	//price�� Total Ŭ�������� �� ����ݾ� allPrice�� ��������. 
	public void Plane() {
		try {
		printBox("�����������","	��� 7:00~ ���� 9:00","	��� 10:00~ ���� 13:00","	��� 16:00~ ���� 18:00");
		
		String num=sc.nextLine();
		if(num.equals("1")) {
			Go = "��� 7:00~ ���� 9:00";
			price += 100000;
			
			System.out.println();
			System.out.println("��� 7:00~ ���� 9:00 ���� �̿��մϴ�. ����:"+price+"��");
		}else if (num.equals("2")){
			Go = "��� 10:00~ ���� 13:00";
			price += 110000;
		
			System.out.println();
			System.out.println("��� 7:00~ ���� 9:00 ���� �̿��մϴ�. ����:"+price+"��");
		}else if (num.equals("3")){
			Go = "��� 16:00~ ���� 18:00";
			price += 90000;
			
			System.out.println();
			System.out.println("��� 7:00~ ���� 9:00 ���� �̿��մϴ�. ����:"+price+"��");
		}
		}catch(Exception e) {e.printStackTrace();}
	}
	
	//������ ����� 
	//����� ������ price �� ����ȴ�.
	//price�� Total Ŭ�������� �� ����ݾ� allPrice�� ��������. 
	public void BackPlane() {
		try {
			printBox("�����������","	��� 7:00~ ���� 9:00","	��� 10:00~ ���� 13:00","	��� 16:00~ ���� 18:00");
	
		String num=sc.nextLine();
		if(num.equals("1")) {
			Back = "��� 7:00~ ���� 9:00";
			price += 100000;
			
			System.out.println();
			System.out.println("��� 7:00~ ���� 9:00 ���� �̿��մϴ�. ����:"+price+"��");
		}else if (num.equals("2")){
			Back = "��� 10:00~ ���� 13:00";
			price += 110000;
		
			System.out.println();
			System.out.println("��� 7:00~ ���� 9:00 ���� �̿��մϴ�. ����:"+price+"��");
		}else if (num.equals("3")){
			Back = "��� 16:00~ ���� 18:00";
			price += 90000;
			
			System.out.println();
			System.out.println("��� 7:00~ ���� 9:00 ���� �̿��մϴ�. ����:"+price+"��");
		}
		}catch(Exception e) {e.printStackTrace();}
	}
		
		void GBPlane () {
	
		System.out.println("�̿��Ͻô� ��������\n������ �����"+Go+"\n������ �����"+Back+"�Դϴ�.");
		System.out.println();
		System.out.println("�� �����ݾ��� "+price+"�� �Դϴ�.");
		System.out.println("�߰�����â���� �Ѿ�ϴ�.");
		
		}
		
	
	
		
		 public void printBox(String g,String f1,String f2,String f3) {
			 System.out.println(g);
				System.out.println("time table");
				System.out.println("1.");
				System.out.println("�Ǧ���������������������������������������������������������������������������������������");
				System.out.println("	"+f1+"        ");
				System.out.println("�Ŧ���������������������������������������������������������������������������������������");
				System.out.println("2.");
				System.out.println("�Ǧ���������������������������������������������������������������������������������������");
				System.out.println("	"+f2+" ");
				System.out.println("�Ŧ���������������������������������������������������������������������������������������");
				System.out.println("3.");
				System.out.println("�Ǧ���������������������������������������������������������������������������������������");
				System.out.println("	"+f3+"");
				System.out.println("�Ŧ���������������������������������������������������������������������������������������");
				System.out.println();
				System.out.println("�̿��Ͻ� �������� ������ �ּ���");
				
			 
		 }
	}




	