package wilderness;

import java.util.Scanner;

public class Date {
	Scanner sc = new Scanner(System.in);

	//��߳�¥ ������¥ ���ϱ� 
	
	String GoYear = "yyyy";
	String GoMonth = "MM";
	String GoDay = "dd";
	String BackYear = "yyyy";
	String BackMonth = "MM";
	String BackDay = "dd";
	
	
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
	
	
	
	}
}