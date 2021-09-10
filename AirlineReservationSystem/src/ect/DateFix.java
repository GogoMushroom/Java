package ect;

import java.util.Scanner;





public class DateFix {

	private Scanner sc = new Scanner(System.in);

	//출발날짜 도착날짜 정하기 
	
	String Date = "yyyy_MM_dd";
	String GoDate = "";
	String BackDate = "";
	
	
	
	void date() {	
	
		System.out.println("가는편 출발일을 정해주세요");
		System.out.println(Date);
		GoDate=sc.nextLine();
		
		System.out.println();
		System.out.println("가는편 츨발일");
		System.out.println(GoDate);
		System.out.println();
		
		
		System.out.println("오는편 출발일를 정해주세요");
		System.out.println(Date);
		BackDate=sc.nextLine();
		
		System.out.println();
		System.out.println("오는편 츨발일");
		System.out.println(BackDate);
		System.out.println();
		System.out.println("----------------------------------------");
		System.out.print("가는편 츨발일\n");
		System.out.print(GoDate+"\n");
		System.out.print("오는편 츨발일\n");
		System.out.print(BackDate+"\n");
		
		

		
	
	
	}
	
	void fixDate() {
	System.out.println("----------------------------------------");
	System.out.print("가는편 츨발일\n");
	System.out.print(GoDate+"\n");
	System.out.print("오는편 츨발일\n");
	System.out.print(BackDate+"\n");
	
	
	}
	
	}

