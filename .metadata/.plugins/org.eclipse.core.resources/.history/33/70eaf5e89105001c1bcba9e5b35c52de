package Wilderness;

import java.util.Scanner;

class Reservation {
	static String startplace = "QQQ" ;
	static String arrplace ="ZZZ";
	 static void Reserve(){
		
		//예약 프로그램 도시 정하기 
		//선택한 도시에 맞게 startplace 와 arrplace가 기본 주소에서 3글자 공항 주소로바뀜 
		Scanner sc = new Scanner(System.in);
		

		System.out.println("[예약 프로그램]                                           ");	
		System.out.println("                                             ");	
		System.out.println("            출발 도시                                                도착 도시 ");	
		System.out.println("┌───────────────┐         ┌───────────────┐");
		System.out.println("│      "+startplace+"      │  ---->  │      "+arrplace+"      │");    
		System.out.println("└───────────────┘         └───────────────┘");
		System.out.println("		                                                        ");

		System.out.println("출발도시 선택> 1.인천 2.김포");
		System.out.println("---------------------------------------------------------◁");

		String Scity = sc.nextLine();
		if (Scity.equals("1")||Scity.contains("인")) {
			startplace = "ICN";
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("                                             ");	
			System.out.println("            출발 도시                                                도착 도시 ");	
			System.out.println("┌───────────────┐         ┌───────────────┐");
			System.out.println("│      "+startplace+"      │  ---->  │      "+arrplace+"      │");    
			System.out.println("└───────────────┘         └───────────────┘");
			System.out.println("		                                                        ");

			
			System.out.println("도착도시 선택> 1.제주 2.부산");
			System.out.println("---------------------------------------------------------◁");
			String Acity = sc.nextLine();

			if (Acity.equals("1")||Acity.contains("제")) {
				arrplace = "CJU";
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("                                             ");	
				System.out.println("            출발 도시                                                도착 도시 ");	
				System.out.println("┌───────────────┐         ┌───────────────┐");
				System.out.println("│      "+startplace+"      │  ---->  │      "+arrplace+"      │");    
				System.out.println("└───────────────┘         └───────────────┘");
				System.out.println("		                                                        ");
				
			}
			else if (Acity.equals("2")||Acity.contains("부")) {
				arrplace = "PUS";
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("                                             ");	
				System.out.println("            출발 도시                                                도착 도시 ");	
				System.out.println("┌───────────────┐         ┌───────────────┐");
				System.out.println("│      "+startplace+"      │  ---->  │      "+arrplace+"      │");    
				System.out.println("└───────────────┘         └───────────────┘");
				System.out.println("		                                                        ");
			
			}
		}
		if (Scity.equals("2")||Scity.contains("김")) {
			startplace = "GMP";
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("                                             ");	
			System.out.println("            출발 도시                                                도착 도시 ");	
			System.out.println("┌───────────────┐         ┌───────────────┐");
			System.out.println("│      "+startplace+"      │  ---->  │      "+arrplace+"      │");    
			System.out.println("└───────────────┘         └───────────────┘");
			System.out.println("		                                                        ");
			
			System.out.println("도착도시 선택> 1.제주 2.부산");
			System.out.println("---------------------------------------------------------◁");
			String Acity2 = sc.nextLine();
			if (Acity2.equals("1")||Acity2.contains("제")) {

				arrplace = "CJU";
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("                                             ");	
				System.out.println("            출발 도시                                                도착 도시 ");	
				System.out.println("┌───────────────┐         ┌───────────────┐");
				System.out.println("│      "+startplace+"      │  ---->  │      "+arrplace+"      │");    
				System.out.println("└───────────────┘         └───────────────┘");
				System.out.println("		                                                        ");
				
				
				System.out.println("---------------------------------------------------------◁");

			}else if(Acity2.equals("2")||Acity2.contains("부")) {
					
					arrplace = "PUS";
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println("                                             ");	
					System.out.println("            출발 도시                                                도착 도시 ");	
					System.out.println("┌───────────────┐         ┌───────────────┐");
					System.out.println("│      "+startplace+"      │  ---->  │      "+arrplace+"      │");    
					System.out.println("└───────────────┘         └───────────────┘");
					System.out.println("		                                                        ");
				
				}else {
				System.out.println("다시 입력해 주세요");
			}

		
		
		}
		
	
		System.out.println("예약하기->");
		runplane();
}
	static void runplane() {
		SSS2 s = new SSS2();
		s.Plane();
		s.BackPlane();
		s.GBPlane();
		SSS2.runAddExtra();
}
}




