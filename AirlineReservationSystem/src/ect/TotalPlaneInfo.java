package ect;

public class TotalPlaneInfo {
	Example e = 
	
	
	
	String DateInfo = ("������ ��¥"+.GoDate+"/n������ ��¥"+df.BackDate);
	String ResInfo = (Reservation.startplace +"->"+ Reservation.arrplace+"\n");
	String SSSInfo = ("���������� :"+Reservation.Go+"\n"+"���������� :"+Reservation.Back+"\n");
	String ExtraInfo =("�⳻�� :"+AddExtra.Food+"\n�߰� ��ȭ�� :"+AddExtra.Baggage+"\n"); 
	String SeatUpInfo = ("�¼� ���׷��̵�:"+AddExtra.SeatUp+"\n");
	
	String totalInfo = (DateInfo+ResInfo+SSSInfo+ExtraInfo+SeatUpInfo);
			
	void total() {
		
		System.out.println();
		System.out.println();
		System.out.println();
	System.out.println(totalInfo);
}
}