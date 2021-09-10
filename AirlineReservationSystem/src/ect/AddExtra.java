package ect;

import java.util.Scanner;

public class AddExtra {

   static String Food = "고르지 않았습니다." ;
   static String Baggage = "고르지 않았습니다." ;

	
	static String SeatUp= "좌석을 업그레이드 하지 않습니다.";
	static int seatPrice =0 ;
	
	
   private Scanner sc = new Scanner(System.in);

   
   static int addPrice  = 0;
   
//   System.out.println("┍━━━━━━━━━━━━━━━━━━━━━━━━━━━Gwangya AirLine━━━━━━━━━━━━━━━━━━━━━━━━━━━┑"); 
//   System.out.println("┕━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┙");   
   
   //기내식 추가
   //기내식을 추가하면 값이 addPrice에 저장된다 
   //addPrice 는 Total 클래스에서 총 결재금액 allPrice에 더해진다.
   public void addFood()   {
      try {
      System.out.println("기내식을 추가합니다.");
         
      printBox("   1.> 일반식  |2.> 어린이식 |3.> 저염식 |4.> 할랄식 |5.> 비건식|6.>추가하지않는다.");
      System.out.printf("선택 >");
      String num2 =sc.nextLine();
      
      if(num2.equals("1")||num2.contains("일반")) {
         Food = "일반식";
         printBox("                 일반식을 추가합니다  price : 10000원");
         addPrice += 10000;
         
         
      }else if(num2.equals("2")||num2.contains("어린이")) {
         Food = "어린이식";
         printBox("		어린이식을 추가합니다  price : 8000원");
      
         addPrice += 8000;
         
      }else if(num2.equals("3")||num2.contains("저염")) {
         Food = "저염식";
         printBox("         저염식을 추가합니다  price : 11000원");
       
         addPrice += 11000;
         
      }else if(num2.equals("4")||num2.contains("할랄")) {
         Food = "할랄식";
         printBox("         할랄식을 추가합니다  price : 9000원");
         
         addPrice += 9000;
         
      }else if(num2.equals("5")||num2.contains("비건")) {
         Food = "비건식";
         printBox("         비건식을 추가합니다  price : 8000원");
       
         addPrice += 8000;
      }else {
         Food = "기내식 추가 없음";
         printBox(">추가하지 않는다.");
       
      
         }
   
   }catch(Exception e) {e.printStackTrace();}
      
      
   }
      

   public void addBaggage()   {
      try {
         System.out.println();
         System.out.println();
      System.out.println("NEXT");
      System.out.println();
      System.out.println();
      System.out.println("수화물을 추가 합니다.");
      printBox("      1. 추가 수화물 10kg |2. 추가 수화물 15kg |3. 선택하지 않는다.");
      
     
      
      String num3 =sc.nextLine();
      if(num3.equals("1")||num3.contains("10")) {
         Baggage = "추가 수화물 10kg" ;
         printBox("      추가수화물 10kg을 추가합니다. price : 50000원");
        
         addPrice += 50000;
      }else if(num3.equals("2")||num3.contains("15")) {
         Baggage = "추가 수화물 15kg" ;
         printBox("      추가수화물 15kg을 추가합니다. price : 70000원");
        
         addPrice += 70000;
      }else{
         Baggage = "추가 수화물 없음" ;
         System.out.println(">수화물을 추가하지 않습니다.");
      }
      
   }catch(Exception e) {e.printStackTrace();}
      
   }
    
   public void totaladd()   {   
   System.out.println();
   System.out.println();
   System.out.println();
   System.out.println("┌								┐");
   System.out.println("   			추가요금은 "+addPrice+ "원 입니다.");
   System.out.println("└								┘");
   System.out.println();
   
   
}
   
		
		
		//시트 업그레이드 
		///시트 업그레이드 가격은 seatPrice 에 저장된다.
		// seatPrice는 Total 클래스에서 총 결재금액 allPrice에 더해진다. 
		public void upSeat() {
			
			printBox("                 좌석을 업그레이드 하시겠습니다?");
			
			System.out.println("> 1.비즈니스 업그레이드 | 2.취소 ");
			
			
			String num = sc.nextLine();
			if (num.equals("1")) {
				SeatUp= "좌석을 업그레이드 했습니다.";
				printBox("                 좌석이 비즈니스로 업그레이드 되었습니다. price : 50000원");
				
				seatPrice += 50000;
				
			}else {
				printBox("                 좌석을 업그레이드 하지 않습니다.");
			
				
			}
	System.out.println(">추가된 요금 :" + seatPrice);	

	}
		void total() {
			TotalPlaneInfo t = new TotalPlaneInfo();
			t.total();
		
		}
		
	

   public void printBox(String msg) {
      System.out.println("┍━━━━━━━━━━━━━━━━━━━━━━━━━━━━━廣野    AirLine━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┑"); 
      System.out.println();
      System.out.println(msg);
      System.out.println();
      System.out.println("┕━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┙");
   }
   
 
}

