package ect;

import java.util.Scanner;

public class AddExtra {

   static String Food = "������ �ʾҽ��ϴ�." ;
   static String Baggage = "������ �ʾҽ��ϴ�." ;

	
	static String SeatUp= "�¼��� ���׷��̵� ���� �ʽ��ϴ�.";
	static int seatPrice =0 ;
	
	
   private Scanner sc = new Scanner(System.in);

   
   static int addPrice  = 0;
   
//   System.out.println("�Ȧ�����������������������������������������������������Gwangya AirLine��������������������������������������������������������"); 
//   System.out.println("�Ʀ�������������������������������������������������������������������������������������������������������������������������������������������");   
   
   //�⳻�� �߰�
   //�⳻���� �߰��ϸ� ���� addPrice�� ����ȴ� 
   //addPrice �� Total Ŭ�������� �� ����ݾ� allPrice�� ��������.
   public void addFood()   {
      try {
      System.out.println("�⳻���� �߰��մϴ�.");
         
      printBox("   1.> �Ϲݽ�  |2.> ��̽� |3.> ������ |4.> �Ҷ��� |5.> ��ǽ�|6.>�߰������ʴ´�.");
      System.out.printf("���� >");
      String num2 =sc.nextLine();
      
      if(num2.equals("1")||num2.contains("�Ϲ�")) {
         Food = "�Ϲݽ�";
         printBox("                 �Ϲݽ��� �߰��մϴ�  price : 10000��");
         addPrice += 10000;
         
         
      }else if(num2.equals("2")||num2.contains("���")) {
         Food = "��̽�";
         printBox("		��̽��� �߰��մϴ�  price : 8000��");
      
         addPrice += 8000;
         
      }else if(num2.equals("3")||num2.contains("����")) {
         Food = "������";
         printBox("         �������� �߰��մϴ�  price : 11000��");
       
         addPrice += 11000;
         
      }else if(num2.equals("4")||num2.contains("�Ҷ�")) {
         Food = "�Ҷ���";
         printBox("         �Ҷ����� �߰��մϴ�  price : 9000��");
         
         addPrice += 9000;
         
      }else if(num2.equals("5")||num2.contains("���")) {
         Food = "��ǽ�";
         printBox("         ��ǽ��� �߰��մϴ�  price : 8000��");
       
         addPrice += 8000;
      }else {
         Food = "�⳻�� �߰� ����";
         printBox(">�߰����� �ʴ´�.");
       
      
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
      System.out.println("��ȭ���� �߰� �մϴ�.");
      printBox("      1. �߰� ��ȭ�� 10kg |2. �߰� ��ȭ�� 15kg |3. �������� �ʴ´�.");
      
     
      
      String num3 =sc.nextLine();
      if(num3.equals("1")||num3.contains("10")) {
         Baggage = "�߰� ��ȭ�� 10kg" ;
         printBox("      �߰���ȭ�� 10kg�� �߰��մϴ�. price : 50000��");
        
         addPrice += 50000;
      }else if(num3.equals("2")||num3.contains("15")) {
         Baggage = "�߰� ��ȭ�� 15kg" ;
         printBox("      �߰���ȭ�� 15kg�� �߰��մϴ�. price : 70000��");
        
         addPrice += 70000;
      }else{
         Baggage = "�߰� ��ȭ�� ����" ;
         System.out.println(">��ȭ���� �߰����� �ʽ��ϴ�.");
      }
      
   }catch(Exception e) {e.printStackTrace();}
      
   }
    
   public void totaladd()   {   
   System.out.println();
   System.out.println();
   System.out.println();
   System.out.println("��								��");
   System.out.println("   			�߰������ "+addPrice+ "�� �Դϴ�.");
   System.out.println("��								��");
   System.out.println();
   
   
}
   
		
		
		//��Ʈ ���׷��̵� 
		///��Ʈ ���׷��̵� ������ seatPrice �� ����ȴ�.
		// seatPrice�� Total Ŭ�������� �� ����ݾ� allPrice�� ��������. 
		public void upSeat() {
			
			printBox("                 �¼��� ���׷��̵� �Ͻðڽ��ϴ�?");
			
			System.out.println("> 1.����Ͻ� ���׷��̵� | 2.��� ");
			
			
			String num = sc.nextLine();
			if (num.equals("1")) {
				SeatUp= "�¼��� ���׷��̵� �߽��ϴ�.";
				printBox("                 �¼��� ����Ͻ��� ���׷��̵� �Ǿ����ϴ�. price : 50000��");
				
				seatPrice += 50000;
				
			}else {
				printBox("                 �¼��� ���׷��̵� ���� �ʽ��ϴ�.");
			
				
			}
	System.out.println(">�߰��� ��� :" + seatPrice);	

	}
		void total() {
			TotalPlaneInfo t = new TotalPlaneInfo();
			t.total();
		
		}
		
	

   public void printBox(String msg) {
      System.out.println("�Ȧ������������������������������������������������������������    AirLine������������������������������������������������������������"); 
      System.out.println();
      System.out.println(msg);
      System.out.println();
      System.out.println("�Ʀ�������������������������������������������������������������������������������������������������������������������������������������������");
   }
   
 
}
