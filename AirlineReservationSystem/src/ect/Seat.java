package ect;

import java.util.Scanner;

public class Seat {
	Scanner sc = new Scanner (System.in);
	
	
	static String SeatUp= "�¼��� ���׷��̵� ���� �ʽ��ϴ�.";
	static int seatPrice =0 ;
	
	
	
	
	//��Ʈ ���׷��̵� 
	///��Ʈ ���׷��̵� ������ seatPrice �� ����ȴ�.
	// seatPrice�� Total Ŭ�������� �� ����ݾ� allPrice�� ��������. 
	public void upSeat() {
		
		System.out.println("�¼��� ���׷��̵� �Ͻðڽ��ϴ�?");
		
		System.out.println("1.����Ͻ� ���׷��̵� | 2.��� ");
		
		
		String num = sc.nextLine();
		if (num.equals("1")) {
			SeatUp= "�¼��� ���׷��̵� �߽��ϴ�.";
			System.out.println("�˼��� ����Ͻ��� ���׷��̵� �Ǿ����ϴ�. price : 50000��");
			seatPrice += 50000;
			
		}else {
			System.out.println("�¼��� ���׷��̵� ���� �ʽ��ϴ�.");
			
		}
System.out.println("�߰��� ��� :" + seatPrice);	

}
	static void total() {
		TotalPlaneInfo t = new TotalPlaneInfo();
		t.total();
		
		TotalPlanePrice tp = new TotalPlanePrice();
		tp.totalPP();
	}
	
}