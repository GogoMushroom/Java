package wilderness;

import java.util.Scanner;

public class AddExtra {

	static String Food = "������ �ʾҽ��ϴ�." ;
	static String Baggage = "������ �ʾҽ��ϴ�." ;

	public Scanner sc = new Scanner(System.in);

	
	static int addPrice  = 0;
	
//	System.out.println("�Ȧ�����������������������������������������������������Gwangya AirLine��������������������������������������������������������"); 
//	System.out.println("�Ʀ�������������������������������������������������������������������������������������������������������������������������������������������");	
	
	//�⳻�� �߰�
	//�⳻���� �߰��ϸ� ���� addPrice�� ����ȴ� 
	//addPrice �� Total Ŭ�������� �� ����ݾ� allPrice�� ��������.
	public void addFood()	{
		try {
		System.out.println("�⳻���� �߰��մϴ�.");
			
		System.out.println("�Ȧ������������������������������������������������������������    AirLine������������������������������������������������������������"); 
		System.out.println();
		System.out.println("   1.> �Ϲݽ�  |2.> ��̽� |3.> ������ |4.> �Ҷ��� |5.> ��ǽ�|6.>�߰������ʴ´�.");
		System.out.println();
		System.out.println("�Ʀ�������������������������������������������������������������������������������������������������������������������������������������������");
		System.out.printf("���� >");
		
		

		
		
		String num2 =sc.nextLine();
		
		if(num2.equals("1")||num2.contains("�Ϲ�")) {
			Food = "�Ϲݽ�";
			System.out.println("�Ȧ������������������������������������������������������������    AirLine������������������������������������������������������������"); 
			System.out.println();
			System.out.println("		           �Ϲݽ��� �߰��մϴ�  price : 10000��");
			System.out.println();
			System.out.println("�Ʀ�������������������������������������������������������������������������������������������������������������������������������������������");
			addPrice += 10000;
			
			
		}else if(num2.equals("2")||num2.contains("���")) {
			Food = "��̽�";
			System.out.println("�Ȧ������������������������������������������������������������    AirLine������������������������������������������������������������");
			System.out.println();
			System.out.println("			��̽��� �߰��մϴ�  price : 8000��");
			System.out.println();
			System.out.println("�Ʀ�������������������������������������������������������������������������������������������������������������������������������������������");
			addPrice += 8000;
			
		}else if(num2.equals("3")||num2.contains("����")) {
			Food = "������";
			System.out.println("�Ȧ������������������������������������������������������������    AirLine������������������������������������������������������������"); 
			System.out.println();
			System.out.println("			�������� �߰��մϴ�  price : 11000��");
			System.out.println();
			System.out.println("�Ʀ�������������������������������������������������������������������������������������������������������������������������������������������");
			addPrice += 11000;
			
		}else if(num2.equals("4")||num2.contains("�Ҷ�")) {
			Food = "�Ҷ���";
			System.out.println("�Ȧ������������������������������������������������������������    AirLine������������������������������������������������������������"); 
			System.out.println();
			System.out.println("			�Ҷ����� �߰��մϴ�  price : 9000��");
			System.out.println();
			System.out.println("�Ʀ�������������������������������������������������������������������������������������������������������������������������������������������");
			addPrice += 9000;
			
		}else if(num2.equals("5")||num2.contains("���")) {
			Food = "��ǽ�";
			System.out.println("�Ȧ������������������������������������������������������������    AirLine������������������������������������������������������������");
			System.out.println();
			System.out.println("			��ǽ��� �߰��մϴ�  price : 8000��");
			System.out.println();
			System.out.println("�Ʀ�������������������������������������������������������������������������������������������������������������������������������������������");
			addPrice += 8000;
		}else {
			Food = "�⳻�� �߰� ����";
			System.out.println(">�߰����� �ʴ´�.");
		
			}
	
	}catch(Exception e) {e.printStackTrace();}
	}
		

	public void addBaggage()	{
		try {
			System.out.println();
			System.out.println();
		System.out.println("NEXT");
		System.out.println();
		System.out.println();
		System.out.println("��ȭ���� �߰� �մϴ�.");
		System.out.println("�Ȧ������������������������������������������������������������    AirLine������������������������������������������������������������");
		System.out.println();
		System.out.println("		1. �߰� ��ȭ�� 10kg |2. �߰� ��ȭ�� 15kg |3. �������� �ʴ´�.");
		System.out.println();
		System.out.println("�Ʀ�������������������������������������������������������������������������������������������������������������������������������������������");

		
		String num3 =sc.nextLine();
		if(num3.equals("1")||num3.contains("10")) {
			Baggage = "�߰� ��ȭ�� 10kg" ;
			System.out.println("�Ȧ������������������������������������������������������������    AirLine������������������������������������������������������������");
			System.out.println();
			System.out.println("		�߰���ȭ�� 10kg�� �߰��մϴ�. price : 50000��");
			System.out.println();
			System.out.println("�Ʀ�������������������������������������������������������������������������������������������������������������������������������������������");
			addPrice += 50000;
		}else if(num3.equals("2")||num3.contains("15")) {
			Baggage = "�߰� ��ȭ�� 15kg" ;
			System.out.println("�Ȧ������������������������������������������������������������    AirLine������������������������������������������������������������");
			System.out.println();
			System.out.println("		�߰���ȭ�� 15kg�� �߰��մϴ�. price : 70000��");
			System.out.println();
			System.out.println("�Ʀ�������������������������������������������������������������������������������������������������������������������������������������������");
			addPrice += 70000;
		}else{
			Baggage = "�߰� ��ȭ�� ����" ;
			System.out.println(">��ȭ���� �߰����� �ʽ��ϴ�.");
		}
		
	}catch(Exception e) {e.printStackTrace();}
	}
	
	
	public void total()	{	
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println("��				��");
	System.out.println("	�߰������ "+addPrice+ "�� �Դϴ�.");
	System.out.println("��				��");
	System.out.println();
	
	
}
	static void runSeat() {
		Seat st = new Seat();
		st.upSeat();
		Seat.total();
}
	
}

