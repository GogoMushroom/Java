package ect;

import java.util.Scanner;

public class SSS2 {
	static int price = 0;
	
	Scanner sc = new Scanner(System.in);
	static String Go = "아직 정해지지 않았습니다.";
	static String Back = "아직 정해지지 않았습니다.";

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
			
			System.out.println();
			System.out.println("출발 7:00~ 도착 9:00 편을 이용합니다. 가격:"+price+"원");
		}else if (num.equals("2")){
			Go = "출발 10:00~ 도착 13:00";
			price += 110000;
		
			System.out.println();
			System.out.println("출발 7:00~ 도착 9:00 편을 이용합니다. 가격:"+price+"원");
		}else if (num.equals("3")){
			Go = "출발 16:00~ 도착 18:00";
			price += 90000;
			
			System.out.println();
			System.out.println("출발 7:00~ 도착 9:00 편을 이용합니다. 가격:"+price+"원");
		}
		}catch(Exception e) {e.printStackTrace();}
	}
	
	//오는편 비행기 
	//비행기 가격은 price 에 저장된다.
	//price는 Total 클래스에서 총 결재금액 allPrice에 더해진다. 
	public void BackPlane() {
		try {
			printBox("오는편비행기","	출발 7:00~ 도착 9:00","	출발 10:00~ 도착 13:00","	출발 16:00~ 도착 18:00");
	
		String num=sc.nextLine();
		if(num.equals("1")) {
			Back = "출발 7:00~ 도착 9:00";
			price += 100000;
			
			System.out.println();
			System.out.println("출발 7:00~ 도착 9:00 편을 이용합니다. 가격:"+price+"원");
		}else if (num.equals("2")){
			Back = "출발 10:00~ 도착 13:00";
			price += 110000;
		
			System.out.println();
			System.out.println("출발 7:00~ 도착 9:00 편을 이용합니다. 가격:"+price+"원");
		}else if (num.equals("3")){
			Back = "출발 16:00~ 도착 18:00";
			price += 90000;
			
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
	}




	
