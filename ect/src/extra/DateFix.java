package extra;

import java.util.Scanner;

public class DateFix {
	Scanner sc = new Scanner(System.in);

	//��߳�¥ ������¥ ���ϱ� 
	
	String GoYear = "yyyy";
	String GoMonth = "MM";
	String GoDay = "dd";
	String BackYear = "yyyy";
	String BackMonth = "MM";
	String BackDay = "dd";
	String GoDate = ("������"+GoYear+"_"+GoMonth+"_"+GoDay);
	String BackDate = ("������"+BackYear+"_"+BackMonth+"_"+BackDay);
	
	
	
	void date() {	
		System.out.println("������ ��߳⵵�� �����ּ���");
		System.out.println(GoYear+"_"+GoMonth+"_"+GoDay);
		GoYear=sc.nextLine();
		
		System.out.println("������ ��߿��� �����ּ���");
		System.out.println(GoYear+"_"+GoMonth+"_"+GoDay);
		GoMonth=sc.nextLine();
		
		System.out.println("������ ������� �����ּ���");
		System.out.println(GoYear+"_"+GoMonth+"_"+GoDay);
		GoDay=sc.nextLine();
		
		System.out.println();
		System.out.println("������ ������");
		System.out.println(GoYear+"_"+GoMonth+"_"+GoDay);
		System.out.println();
		
		System.out.println("������ ��߳⵵�� �����ּ���");
		System.out.println(BackYear+"_"+BackMonth+"_"+BackDay);
		BackYear=sc.nextLine();
		
		System.out.println("������ ��߿��� �����ּ���");
		System.out.println(BackYear+"_"+BackMonth+"_"+BackDay);
		BackMonth=sc.nextLine();
		
		System.out.println("������ ����ϸ� �����ּ���");
		System.out.println(BackYear+"_"+BackMonth+"_"+BackDay);
		BackDay=sc.nextLine();
		
		System.out.println();
		System.out.println("������ ������");
		System.out.println(BackYear+"_"+BackMonth+"_"+BackDay);
		System.out.println();
		
		
		System.out.println("----------------------------------------");
		System.out.println();
		System.out.println("������ ������");
		System.out.println(GoYear+"_"+GoMonth+"_"+GoDay);
		System.out.println();
		System.out.println("������ ������");
		System.out.println(BackYear+"_"+BackMonth+"_"+BackDay);
		System.out.println();
		
	fixDate();
	}
	
	void fixDate() {
	System.out.println("----------------------------------------");
	System.out.print("������ ������\n");
	System.out.print(GoYear+"_"+GoMonth+"_"+GoDay+"\n");
	System.out.print("������ ������\n");
	System.out.print(BackYear+"_"+BackMonth+"_"+BackDay+"\n");
	
	
	}
	
	}
