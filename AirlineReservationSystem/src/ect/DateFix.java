package ect;

import java.util.Scanner;





public class DateFix {

	private Scanner sc = new Scanner(System.in);

	//��߳�¥ ������¥ ���ϱ� 
	
	String Date = "yyyy_MM_dd";
	String GoDate = "";
	String BackDate = "";
	
	
	
	void date() {	
	
		System.out.println("������ ������� �����ּ���");
		System.out.println(Date);
		GoDate=sc.nextLine();
		
		System.out.println();
		System.out.println("������ ������");
		System.out.println(GoDate);
		System.out.println();
		
		
		System.out.println("������ ����ϸ� �����ּ���");
		System.out.println(Date);
		BackDate=sc.nextLine();
		
		System.out.println();
		System.out.println("������ ������");
		System.out.println(BackDate);
		System.out.println();
		System.out.println("----------------------------------------");
		System.out.print("������ ������\n");
		System.out.print(GoDate+"\n");
		System.out.print("������ ������\n");
		System.out.print(BackDate+"\n");
		
		

		
	
	
	}
	
	void fixDate() {
	System.out.println("----------------------------------------");
	System.out.print("������ ������\n");
	System.out.print(GoDate+"\n");
	System.out.print("������ ������\n");
	System.out.print(BackDate+"\n");
	
	
	}
	
	}

