package ect;

import java.util.Scanner;

class Reservation {
	static String startplace = "QQQ" ;
	static String arrplace ="ZZZ";
	static int price = 0;
	Scanner sc = new Scanner(System.in);
	static String Go = "���� �������� �ʾҽ��ϴ�.";
	static String Back = "���� �������� �ʾҽ��ϴ�.";
	static int totalprice = 0;

	
	  void Reserve(){
		
		//���� ���α׷� ���� ���ϱ� 
		//������ ���ÿ� �°� startplace �� arrplace�� �⺻ �ּҿ��� 3���� ���� �ּҷιٲ� 
		
		while (true){
		System.out.println("[���� ���α׷�]                                           ");	
		
		printBox("QQQ","QQQ","��ߵ��� ����> 1.��õ 2.����" );


		String Scity = sc.nextLine();
		
	
		if (Scity.equals("1")||Scity.contains("��")) {
			startplace = "ICN";
			printBox("ICN","QQQ","�������� ����> 1.���� 2.�λ�");
			
			String Acity = sc.nextLine();
			if (Acity.equals("1")||Acity.contains("��")) {
				arrplace = "CJU";
				printBox("ICN","CJU","");break;
				
			}
			else if (Acity.equals("2")||Acity.contains("��")) {
				arrplace = "PUS";
				printBox("ICN","PUS","");break;
			}else {
				System.out.println("�ٽ� �Է��� �ּ���");continue;	}	
			
				
		
		}
		if (Scity.equals("2")||Scity.contains("��")) {
			startplace = "GMP";
			printBox("GMP","QQQ","�������� ����> 1.���� 2.�λ�");
			
			String Acity2 = sc.nextLine();
			if (Acity2.equals("1")||Acity2.contains("��")) {

				arrplace = "CJU";
				printBox("GMP","CJU","");break;
				
			}else if(Acity2.equals("2")||Acity2.contains("��")) {
					
					arrplace = "PUS";
					printBox("GMP","CJU","");break;
			}else {
				System.out.println("�ٽ� �Է��� �ּ���");continue;	}	
			
				
				}else {
				System.out.println("�ٽ� �Է��� �ּ���");continue;
			}
		
		
		}
		
		System.out.println(startplace+ "->" +arrplace);
		System.out.println();
		System.out.println();
		System.out.println("�����ϱ�->");
		
	
}


	//������ �����	
	//����� ������ price �� ����ȴ�.
	//price�� Total Ŭ�������� �� ����ݾ� allPrice�� ��������. 
	public void Plane() {
		try {
		printBox("����������","	��� 7:00~ ���� 9:00","	��� 10:00~ ���� 13:00","	��� 16:00~ ���� 18:00");
		
		String num=sc.nextLine();
		if(num.equals("1")) {
			Go = "��� 7:00~ ���� 9:00";
			price += 100000;
			totalprice+= 100000;
			
			System.out.println();
			System.out.println("��� 7:00~ ���� 9:00 ���� �̿��մϴ�. ����:"+price+"��");
		}else if (num.equals("2")){
			Go = "��� 10:00~ ���� 13:00";
			price += 110000;
			totalprice+= 110000;
			
			System.out.println();
			System.out.println("��� 7:00~ ���� 9:00 ���� �̿��մϴ�. ����:"+price+"��");
		}else if (num.equals("3")){
			Go = "��� 16:00~ ���� 18:00";
			price += 90000;
			totalprice+= 110000;
			System.out.println();
			System.out.println("��� 7:00~ ���� 9:00 ���� �̿��մϴ�. ����:"+price+"��");
		}
		}catch(Exception e) {e.printStackTrace();}
	
	
		try {
			printBox("����������","	��� 7:00~ ���� 9:00","	��� 10:00~ ���� 13:00","	��� 16:00~ ���� 18:00");
	
		String num=sc.nextLine();
		if(num.equals("1")) {
			Back = "��� 7:00~ ���� 9:00";
			price += 100000;
			totalprice+= 100000;
			
			System.out.println();
			System.out.println("��� 7:00~ ���� 9:00 ���� �̿��մϴ�. ����:"+price+"��");
		}else if (num.equals("2")){
			Back = "��� 10:00~ ���� 13:00";
			price += 110000;
			totalprice+= 110000;
		
			System.out.println();
			System.out.println("��� 7:00~ ���� 9:00 ���� �̿��մϴ�. ����:"+price+"��");
		}else if (num.equals("3")){
			Back = "��� 16:00~ ���� 18:00";
			price += 90000;
			totalprice+= 90000;
			
			System.out.println();
			System.out.println("��� 7:00~ ���� 9:00 ���� �̿��մϴ�. ����:"+price+"��");
		}
		}catch(Exception e) {e.printStackTrace();}
		
	}
		
		void GBPlane () {
	
		System.out.println("�̿��Ͻô� ��������\n������ �����"+Go+"\n������ �����"+Back+"�Դϴ�.");
		System.out.println();
		System.out.println("�� �����ݾ��� "+price+"�� �Դϴ�.");
		System.out.println("�߰�����â���� �Ѿ�ϴ�.");
		
		}
		
	
	
		
		 public void printBox(String g,String f1,String f2,String f3) {
			 System.out.println(g);
				System.out.println("time table");
				System.out.println("1.");
				System.out.println("�Ǧ���������������������������������������������������������������������������������������");
				System.out.println("	"+f1+"        ");
				System.out.println("�Ŧ���������������������������������������������������������������������������������������");
				System.out.println("2.");
				System.out.println("�Ǧ���������������������������������������������������������������������������������������");
				System.out.println("	"+f2+" ");
				System.out.println("�Ŧ���������������������������������������������������������������������������������������");
				System.out.println("3.");
				System.out.println("�Ǧ���������������������������������������������������������������������������������������");
				System.out.println("	"+f3+"");
				System.out.println("�Ŧ���������������������������������������������������������������������������������������");
				System.out.println();
				System.out.println("�̿��Ͻ� �������� ������ �ּ���");
				
			 
		 }
		 public void printBox(String startplace,String arrplace ,String city) {

				System.out.println("                                             ");	
				System.out.println("            ��� ����                                                ���� ���� ");	
				System.out.println("����������������������������������         ����������������������������������");
				System.out.println("��      "+startplace+"      ��  ---->  ��      "+arrplace+"      ��");    
				System.out.println("����������������������������������         ����������������������������������");
				System.out.println("		                                                        ");
				System.out.println(city);
				System.out.println("---------------------------------------------------------��");
			}
			
	}




	






