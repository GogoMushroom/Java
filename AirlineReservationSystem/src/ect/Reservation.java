package ect;

import java.util.Scanner;

class Reservation {
	static String startplace = "QQQ" ;
	static String arrplace ="ZZZ";
	static int price = 0;
	Scanner sc = new Scanner(System.in);
	static String Go = "아직 정해지지 않았습니다.";
	static String Back = "아직 정해지지 않았습니다.";
	static int totalprice = 0;

	
	  void Reserve(){
		
		//예약 프로그램 도시 정하기 
		//선택한 도시에 맞게 startplace 와 arrplace가 기본 주소에서 3글자 공항 주소로바뀜 
		
		while (true){
		System.out.println("[예약 프로그램]                                           ");	
		
		printBox("QQQ","QQQ","출발도시 선택> 1.인천 2.김포" );


		String Scity = sc.nextLine();
		
	
		if (Scity.equals("1")||Scity.contains("인")) {
			startplace = "ICN";
			printBox("ICN","QQQ","도착도시 선택> 1.제주 2.부산");
			
			String Acity = sc.nextLine();
			if (Acity.equals("1")||Acity.contains("제")) {
				arrplace = "CJU";
				printBox("ICN","CJU","");break;
				
			}
			else if (Acity.equals("2")||Acity.contains("부")) {
				arrplace = "PUS";
				printBox("ICN","PUS","");break;
			}else {
				System.out.println("다시 입력해 주세요");continue;	}	
			
				
		
		}
		if (Scity.equals("2")||Scity.contains("김")) {
			startplace = "GMP";
			printBox("GMP","QQQ","도착도시 선택> 1.제주 2.부산");
			
			String Acity2 = sc.nextLine();
			if (Acity2.equals("1")||Acity2.contains("제")) {

				arrplace = "CJU";
				printBox("GMP","CJU","");break;
				
			}else if(Acity2.equals("2")||Acity2.contains("부")) {
					
					arrplace = "PUS";
					printBox("GMP","CJU","");break;
			}else {
				System.out.println("다시 입력해 주세요");continue;	}	
			
				
				}else {
				System.out.println("다시 입력해 주세요");continue;
			}
		
		
		}
		
		System.out.println(startplace+ "->" +arrplace);
		System.out.println();
		System.out.println();
		System.out.println("예약하기->");
		
	
}


	//가는편 비행기	
	//비행기 가격은 price 에 저장된다.
	//price는 Total 클래스에서 총 결재금액 allPrice에 더해진다. 
	public void Plane() {
		try {
		printBox("가는편비행기","	출발 7:00~ 도착 9:00","	출발 10:00~ 도착 13:00","	출발 16:00~ 도착 18:00");
		
		String num=sc.nextLine();
		if(num.equals("1")) {
			Go = "출발 7:00~ 도착 9:00";
			price += 100000;
			totalprice+= 100000;
			
			System.out.println();
			System.out.println("출발 7:00~ 도착 9:00 편을 이용합니다. 가격:"+price+"원");
		}else if (num.equals("2")){
			Go = "출발 10:00~ 도착 13:00";
			price += 110000;
			totalprice+= 110000;
			
			System.out.println();
			System.out.println("출발 7:00~ 도착 9:00 편을 이용합니다. 가격:"+price+"원");
		}else if (num.equals("3")){
			Go = "출발 16:00~ 도착 18:00";
			price += 90000;
			totalprice+= 110000;
			System.out.println();
			System.out.println("출발 7:00~ 도착 9:00 편을 이용합니다. 가격:"+price+"원");
		}
		}catch(Exception e) {e.printStackTrace();}
	
	
		try {
			printBox("오는편비행기","	출발 7:00~ 도착 9:00","	출발 10:00~ 도착 13:00","	출발 16:00~ 도착 18:00");
	
		String num=sc.nextLine();
		if(num.equals("1")) {
			Back = "출발 7:00~ 도착 9:00";
			price += 100000;
			totalprice+= 100000;
			
			System.out.println();
			System.out.println("출발 7:00~ 도착 9:00 편을 이용합니다. 가격:"+price+"원");
		}else if (num.equals("2")){
			Back = "출발 10:00~ 도착 13:00";
			price += 110000;
			totalprice+= 110000;
		
			System.out.println();
			System.out.println("출발 7:00~ 도착 9:00 편을 이용합니다. 가격:"+price+"원");
		}else if (num.equals("3")){
			Back = "출발 16:00~ 도착 18:00";
			price += 90000;
			totalprice+= 90000;
			
			System.out.println();
			System.out.println("출발 7:00~ 도착 9:00 편을 이용합니다. 가격:"+price+"원");
		}
		}catch(Exception e) {e.printStackTrace();}
		
	}
		
		void GBPlane () {
	
		System.out.println("이용하시는 비행편은\n가는편 비행기"+Go+"\n오는편 비행기"+Back+"입니다.");
		System.out.println();
		System.out.println("총 결제금액은 "+price+"원 입니다.");
		System.out.println("추가결제창으로 넘어갑니다.");
		
		}
		
	
	
		
		 public void printBox(String g,String f1,String f2,String f3) {
			 System.out.println(g);
				System.out.println("time table");
				System.out.println("1.");
				System.out.println("┎━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┒");
				System.out.println("	"+f1+"        ");
				System.out.println("┖━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┚");
				System.out.println("2.");
				System.out.println("┎━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┒");
				System.out.println("	"+f2+" ");
				System.out.println("┖━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┚");
				System.out.println("3.");
				System.out.println("┎━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┒");
				System.out.println("	"+f3+"");
				System.out.println("┖━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┚");
				System.out.println();
				System.out.println("이용하실 비행편을 선택해 주세요");
				
			 
		 }
		 public void printBox(String startplace,String arrplace ,String city) {

				System.out.println("                                             ");	
				System.out.println("            출발 도시                                                도착 도시 ");	
				System.out.println("┌───────────────┐         ┌───────────────┐");
				System.out.println("│      "+startplace+"      │  ---->  │      "+arrplace+"      │");    
				System.out.println("└───────────────┘         └───────────────┘");
				System.out.println("		                                                        ");
				System.out.println(city);
				System.out.println("---------------------------------------------------------◁");
			}
			
	}




	






