package wilderness;

import java.util.Scanner;

public class Date {
	Scanner sc = new Scanner(System.in);

	//출발날짜 도착날짜 정하기 
	
	String GoYear = "yyyy";
	String GoMonth = "MM";
	String GoDay = "dd";
	String BackYear = "yyyy";
	String BackMonth = "MM";
	String BackDay = "dd";
	
	
	void date() {	
	System.out.println("가는편 출발년도를 정해주세요");
	System.out.println(GoYear+"_"+GoMonth+"_"+GoDay);
	GoYear=sc.nextLine();
	
	System.out.println("가는편 출발월을 정해주세요");
	System.out.println(GoYear+"_"+GoMonth+"_"+GoDay);
	GoMonth=sc.nextLine();
	
	System.out.println("가는편 출발일을 정해주세요");
	System.out.println(GoYear+"_"+GoMonth+"_"+GoDay);
	GoDay=sc.nextLine();
	
	System.out.println();
	System.out.println("가는편 츨발일");
	System.out.println(GoYear+"_"+GoMonth+"_"+GoDay);
	System.out.println();
	
	System.out.println("오는편 출발년도를 정해주세요");
	System.out.println(BackYear+"_"+BackMonth+"_"+BackDay);
	BackYear=sc.nextLine();
	
	System.out.println("오는편 출발월를 정해주세요");
	System.out.println(BackYear+"_"+BackMonth+"_"+BackDay);
	BackMonth=sc.nextLine();
	
	System.out.println("오는편 출발일를 정해주세요");
	System.out.println(BackYear+"_"+BackMonth+"_"+BackDay);
	BackDay=sc.nextLine();
	
	System.out.println();
	System.out.println("오는편 츨발일");
	System.out.println(BackYear+"_"+BackMonth+"_"+BackDay);
	System.out.println();
	
	
	System.out.println("----------------------------------------");
	System.out.println();
	System.out.println("가는편 츨발일");
	System.out.println(GoYear+"_"+GoMonth+"_"+GoDay);
	System.out.println();
	System.out.println("오는편 츨발일");
	System.out.println(BackYear+"_"+BackMonth+"_"+BackDay);
	System.out.println();
	
	
	
	}
}
